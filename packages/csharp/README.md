# Cvent.SDK

Developer-friendly & type-safe Csharp SDK specifically catered to leverage *Cvent.SDK* API.

<!-- Start Summary [summary] -->
## Summary

Cvent REST APIs: # Introduction
The Cvent API Platform is built around REST. We aim to provide intuitive endpoints that can be easily
discovered to help leverage the Cvent platform for your event needs. The RESTful APIs outlined here
use JSON-encoded request and response format, along with HTTP codes, to convey processing status of
requests received. The Cvent resources are protected using OAuth2.

# Getting Started

If you're new to the Cvent API Platform, start by reading our
[Developer Quickstart](/docs/rest-api/tutorials/developer-quickstart) guide. This will
give you an overview of how to authenticate and make requests using our APIs.

## Authentication

The Cvent REST API uses [OAuth2](https://oauth.net/2/) to authorize requests to the platform. The client
credentials authorization flow is supported.

<a name="oauth2-auth-code-planner-admin"></a>

Authorization code flow is only supported for planner users with the administrator role in Cvent. Developer users
cannot use authorization code flow.

<!-- ReDoc-Inject: <security-definitions> -->

Here's an example of using client credential flow to authorize. You'll supply your application's id and secret to
make a [Token](#operation/oauth2Token) request.

```bash
curl --location --request POST '{hostName}/{version}/oauth2/token' \
--header 'Content-Type: application/x-www-form-urlencoded' \
--header 'Authorization: Basic {api_credentials}' \
--data-urlencode 'grant_type=client_credentials' \
--data-urlencode 'client_id={client_id}'
```

| Key               | Description                                          | Value                                                                                                        |
| :---------------- | :--------------------------------------------------- | :----------------------------------------------------------------------------------------------------------- |
| {hostName}        | https://api-platform.cvent.com                       | Location if you're account is in the North American datacenter                                               |
|                   | https://api-platform-eur.cvent.com                   | Location if you're account is in the European data center.                                                   |
| {version}         | ea                                                   | The version of the API you're using. Only `ea` is currently supported.                                       |
| {api_credentials} | {client_id}:{client_secret} in base64 encoded format | Supply your client id & client credentials in a base 64 encoded format.                                      |
| {client_id}       | Retrieved from your application                      | Your application's client id.                                                                                |
| {client_secret}   | Retrieved from your application                      | Your application's client secret.                                                                            |

On a successful call, you'll receive the following response:

```json
{
  "access_token": "{accessToken}",
  "expires_in": 3600,
  "token_type": "Bearer"
}
```

This bearer token is valid for 3600 seconds (60 minutes) and must be used in subsequent calls.

## Endpoints

Endpoints start with `hostName` and `version`.

The `hostname` will depend on the region that your Cvent account is hosted in. Please see the table
below to identify which hostname you should be using.

| Region        |	Hostname                           |
|:--------------|:-----------------------------------|
| North America	| https://api-platform.cvent.com     |
| Europe        | https://api-platform-eur.cvent.com |

The current `version` of the Cvent API is `ea`.

## Rate Limits

Cvent APIs enforce rate limits to ensure platform stability. Your limits depend on your tier: Free,
Standard, or Premium.

<br />

### Usage Tiers

| Tier     | Daily Calls | Calls per Second | Max Burst |
| -------- | ----------- | ---------------- | --------- |
| Free     | 1,000       | 2                | 1         |
| Standard | 15,000      | 10               | 10        |
| Premium  | 500,000     | 25               | 25        |

- **Daily calls** define how many requests you can make in a 24-hour period. Quota
  resets at 12 midnight (+0 GMT).
- **Calls per second** define how many requests you can make in a 1-second window.
- **Max Burst** defines how many requests you can make at once.

If you are unsure what usage tier applies to your account, you can check via
[Get Current Usage Tier](#operation/getUsageTier).

Please note that these limits may change as the Cvent API Platform evolves.

<br />

### Handling Rate Limits

Sometimes, you may exceed your rate limits. When this happens, the API will return a `429 Too Many Requests`. See
[handling rate limits](/docs/rest-api/guides/handling-rate-limits) for best practices on how to handle this.

## Pagination

Some APIs use pagination to manage records. Each page of records has a token associated to identify it.

If an API uses pagination, you’ll find up to three tokens in the response:
- **currentToken**: Describes the token of the current page.
- **nextToken**: Provides a token for the next page of records, if one exists.
- **previousToken**: Provides a token for the previous page of records, if one exists. Not all APIs will return
  this token.

You specify which page of records to view via the `token` parameter in your API call. To navigate through pages,
take the `nextToken` or `previousToken` value and pass it to your next call’s `token` parameter to get the
respective page of records. For example, if you made this request:

```bash
curl -X GET {hostname}/{version}/contacts?limit=100 \
-H 'Accept: application/json' \
-H 'Authorization: Bearer {accessToken}'
```

The response contains a paging array where you'll find the token information.

```json
{
  "paging": {
    "currentToken": "90c5f062-76ad-4ea4-aa53-00eb698d9262",
    "nextToken": "3b2359a7-4583-40ed-8afd-67e5f15373d3",
    "limit": 100,
    "totalCount": 102,
    "_links": {...}
  },
  "data": [...]
}
```

Take the `nextToken` and use it in the `token` parameter on your subsequent call.

```bash
curl -X GET {hostname}/{version}/contacts?limit=100&token=3b2359a7-4583-40ed-8afd-67e5f15373d3 \
-H 'Accept: application/json' \
-H 'Authorization: Bearer {accessToken}'
```

When the response doesn’t contain a `nextToken` field, you’ve reached the last page. Occasionally, you might
encounter an empty page at the end of results. This typically happens when the results were evenly divisible.
Ensure your client code handles the possibility of receiving an empty data array when using the `nextToken`.

## Filtering

Use filters to narrow down results. The filter follows the pattern
`filter='field' comparisonType 'value'`. The value can be enclosed with single
quotes (') or double quotes (").

```bash
GET {hostName}/{version}/contacts?filter=lastName eq 'Smith'
````

To correctly pass a single quote in the filter's value, use double quotes around
the string.

```bash
GET {hostName}/{version}/contacts?filter=lastName eq "O'Keenan"
```

To correctly pass a double quote in the filter's value, use double quotes around
the string and add an escape character `\` to each quote that is part of the
string.

```bash
GET {hostName}/{version}/events?filter=eventName eq "\"Yearly\" Conference"
```

## Versioning

Change is inevitable in API development. Planning for it is crucial. We track
both backward-compatible and backward-incompatible changes.

<br />

### Backward Compatible Changes

Backward compatible changes will be made often and are intended to avoid
any adverse impact on our customers. It is highly advisable that when reading
JSON payloads from Cvent, you are able to handle "unknown" attributes that
can be added over time. We consider the following changes backward-compatible:

- Adding new resources
- Adding new optional request parameters to existing operations
- Adding new attributes to requests or responses
- Changing the length or format (not type) of resource identifiers. For example, an ID can change from
  "1234/1234" to "1234::1234".
- Increasing the length of string fields

<br />

### Backward Incompatible Changes

Backward-incompatible changes are made infrequently, however, they can be
disruptive to consumers. Due to this, our APIs are versioned to avoid
disruptions to customers. We leverage a URI-based versioning scheme,
which means that a version value is included in the Cvent API URL.
When breaking changes occur, a new version of the API is made available
while the existing version is deprecated but remains available for a
limited period of time. We consider the following backward-incompatible changes:

- Adding a new required parameter (query string param or payload attribute)
- Deleting API resources
- Deleting any attribute from API responses
- Changing the data type on any parameter or attribute

## Standards
As you begin working with our APIs, it's essential to be aware of standards around
country codes, time formats, and other important details that ensure smooth integration.
Learn more about our [API Standards](/docs/rest-api/reference/api-standards)


For more information about the API: [Cvent Developer Documentation](https://developers.cvent.com/docs)
<!-- End Summary [summary] -->

<!-- Start Table of Contents [toc] -->
## Table of Contents
<!-- $toc-max-depth=2 -->
* [Cvent.SDK](#cventsdk)
* [Getting Started](#getting-started)
  * [Authentication](#authentication)
  * [Endpoints](#endpoints)
  * [Rate Limits](#rate-limits)
  * [Pagination](#pagination)
  * [Filtering](#filtering)
  * [Versioning](#versioning)
  * [Standards](#standards)
  * [SDK Installation](#sdk-installation)
  * [SDK Example Usage](#sdk-example-usage)
  * [Authentication](#authentication-1)
  * [Available Resources and Operations](#available-resources-and-operations)
  * [Pagination](#pagination-1)
  * [Error Handling](#error-handling)
  * [Server Selection](#server-selection)
  * [Custom HTTP Client](#custom-http-client)
  * [License](#license)
* [Development](#development)
  * [Maturity](#maturity)
  * [Contributions](#contributions)

<!-- End Table of Contents [toc] -->

<!-- Start SDK Installation [installation] -->
## SDK Installation

### NuGet

To add the [NuGet](https://www.nuget.org/) package to a .NET project:
```bash
dotnet add package Cvent.SDK
```

### Locally

To add a reference to a local instance of the SDK in a .NET project:
```bash
dotnet add reference src/Cvent/SDK/Cvent.SDK.csproj
```
<!-- End SDK Installation [installation] -->

<!-- Start SDK Example Usage [usage] -->
## SDK Example Usage

### Example

```csharp
using Cvent.SDK;
using Cvent.SDK.Models.Components;
using Cvent.SDK.Models.Requests;

var sdk = new CventSDK(security: new Security() {
    OAuth2ClientCredentials = new SchemeOAuth2ClientCredentials() {
        ClientID = "<YOUR_CLIENT_ID_HERE>",
        ClientSecret = "<YOUR_CLIENT_SECRET_HERE>",
        TokenURL = "<YOUR_TOKEN_URL_HERE>",
        Scopes = "<YOUR_SCOPES_HERE>",
    },
});

GetAccountUserGroupsRequest req = new GetAccountUserGroupsRequest() {
    Token = "1a2b3c4d5e6f7g8h9i10j11k",
    Filter = "name eq 'My User Group'",
};

GetAccountUserGroupsResponse? res = await sdk.Users.GetAccountUserGroupsAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```
<!-- End SDK Example Usage [usage] -->

<!-- Start Authentication [security] -->
## Authentication

### Per-Client Security Schemes

This SDK supports the following security schemes globally:

| Name                      | Type   | Scheme       |
| ------------------------- | ------ | ------------ |
| `OAuth2ClientCredentials` | oauth2 | OAuth2 token |
| `OAuth2AuthorizationCode` | oauth2 | OAuth2 token |

You can set the security parameters through the `security` optional parameter when initializing the SDK client instance. The selected scheme will be used by default to authenticate with the API for all operations that support it. For example:
```csharp
using Cvent.SDK;
using Cvent.SDK.Models.Components;
using Cvent.SDK.Models.Requests;

var sdk = new CventSDK(security: new Security() {
    OAuth2ClientCredentials = new SchemeOAuth2ClientCredentials() {
        ClientID = "<YOUR_CLIENT_ID_HERE>",
        ClientSecret = "<YOUR_CLIENT_SECRET_HERE>",
        TokenURL = "<YOUR_TOKEN_URL_HERE>",
        Scopes = "<YOUR_SCOPES_HERE>",
    },
});

GetAccountUserGroupsRequest req = new GetAccountUserGroupsRequest() {
    Token = "1a2b3c4d5e6f7g8h9i10j11k",
    Filter = "name eq 'My User Group'",
};

GetAccountUserGroupsResponse? res = await sdk.Users.GetAccountUserGroupsAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Per-Operation Security Schemes

Some operations in this SDK require the security scheme to be specified at the request level. For example:
```csharp
using Cvent.SDK;
using Cvent.SDK.Models.Requests;

var sdk = new CventSDK();

Oauth2TokenRequest req = new Oauth2TokenRequest() {
    GrantType = GrantType.ClientCredentials,
    ClientId = "djc98u3jiedmi283eu928",
    Scope = "event/events:read event/attendees:read",
    RedirectUri = "https://example.com/redirect",
    RefreshToken = "dn43ud8uj32nk2je",
    Code = "AUTHORIZATION_CODE",
};

var res = await sdk.Authentication.Oauth2TokenAsync(
    security: new Oauth2TokenSecurity() {
        Username = "",
        Password = "",
    },
    request: req
);

// handle response
```
<!-- End Authentication [security] -->

<!-- Start Available Resources and Operations [operations] -->
## Available Resources and Operations

<details open>
<summary>Available methods</summary>

### [Appointments](docs/sdks/appointments/README.md)

* [ListAppointmentAttendees](docs/sdks/appointments/README.md#listappointmentattendees) - List Appt Attendees
* [GetAppointmentAttendeeById](docs/sdks/appointments/README.md#getappointmentattendeebyid) - Get Appt Attendee
* [ListAvailability](docs/sdks/appointments/README.md#listavailability) - List Availability
* [GetAvailabilityById](docs/sdks/appointments/README.md#getavailabilitybyid) - Get Availability
* [ListAppointmentEvents](docs/sdks/appointments/README.md#listappointmentevents) - List Appt Events
* [GetAppointmentEventById](docs/sdks/appointments/README.md#getappointmenteventbyid) - Get Appt Event
* [ListAvailableTimes](docs/sdks/appointments/README.md#listavailabletimes) - List Available Times
* [ListAppointmentTypes](docs/sdks/appointments/README.md#listappointmenttypes) - List Appointment Types
* [CreateAppointment](docs/sdks/appointments/README.md#createappointment) - Create Appointment
* [UpdateAppointment](docs/sdks/appointments/README.md#updateappointment) - Update Appointments
* [CancelAppointment](docs/sdks/appointments/README.md#cancelappointment) - Cancel Appointment
* [ListLocations](docs/sdks/appointments/README.md#listlocations) - List Locations
* [ListMeetingInterests](docs/sdks/appointments/README.md#listmeetinginterests) - List Interests
* [GetMeetingInterestById](docs/sdks/appointments/README.md#getmeetinginterestbyid) - Get Interest
* [ListAppointments](docs/sdks/appointments/README.md#listappointments) - List Appointments
* [GetAppointmentById](docs/sdks/appointments/README.md#getappointmentbyid) - Get Appointment

### [AttendeeActivities](docs/sdks/attendeeactivities/README.md)

* [ListAttendeeActivities](docs/sdks/attendeeactivities/README.md#listattendeeactivities) - List Activities
* [CreateAttendeeActivity](docs/sdks/attendeeactivities/README.md#createattendeeactivity) - Add External Activity
* [ListExternalAttendeeActivitiesMetadata](docs/sdks/attendeeactivities/README.md#listexternalattendeeactivitiesmetadata) - List Ext. Activities Metadata
* [CreateExternalAttendeeActivityMetadata](docs/sdks/attendeeactivities/README.md#createexternalattendeeactivitymetadata) - Add Ext. Activities Metadata
* [DeleteExternalAttendeeActivityMetadata](docs/sdks/attendeeactivities/README.md#deleteexternalattendeeactivitymetadata) - Delete Ext Activities Metadata
* [UpdateExternalAttendeeActivityMetadata](docs/sdks/attendeeactivities/README.md#updateexternalattendeeactivitymetadata) - Update Ext Activities Metadata

### [AttendeeInsights](docs/sdks/attendeeinsights/README.md)

* [ListAttendeeInsights](docs/sdks/attendeeinsights/README.md#listattendeeinsights) - List Engagement Scores
* [GetAttendeeInsightsById](docs/sdks/attendeeinsights/README.md#getattendeeinsightsbyid) - Get Engagement Score
* [GetScores](docs/sdks/attendeeinsights/README.md#getscores) - Get Scores
* [GetStats](docs/sdks/attendeeinsights/README.md#getstats) - Get Stats

### [AttendeeMessages](docs/sdks/attendeemessages/README.md)

* [GetAttendeeMessagesMembers](docs/sdks/attendeemessages/README.md#getattendeemessagesmembers) - Get Messaging Members

### [Attendees](docs/sdks/attendees/README.md)

* [ListDurations](docs/sdks/attendees/README.md#listdurations) - List Attendance Duration
* [CreateAttendee](docs/sdks/attendees/README.md#createattendee) - Add Attendees
* [ListAttendees](docs/sdks/attendees/README.md#listattendees) - List Attendees
* [ListAttendeesPostFilter](docs/sdks/attendees/README.md#listattendeespostfilter) - List Attendees
* [GetAttendeeById](docs/sdks/attendees/README.md#getattendeebyid) - Get Attendee
* [UpdateAttendee](docs/sdks/attendees/README.md#updateattendee) - Update Attendee
* [UpdateInternalInfoAnswers](docs/sdks/attendees/README.md#updateinternalinfoanswers) - Update Internal Information
* [PostBadge](docs/sdks/attendees/README.md#postbadge) - Create Badge
* [GetBadge](docs/sdks/attendees/README.md#getbadge) - Get Badge
* [GetBadgesPostFilters](docs/sdks/attendees/README.md#getbadgespostfilters) - Get Badges
* [UpdateBadge](docs/sdks/attendees/README.md#updatebadge) - Update Badge

### [AudienceSegments](docs/sdks/audiencesegments/README.md)

* [DisassociateAttendeeFromAudienceSegments](docs/sdks/audiencesegments/README.md#disassociateattendeefromaudiencesegments) - Delete Attendee Associations
* [CreateAudienceSegment](docs/sdks/audiencesegments/README.md#createaudiencesegment) - Create Audience Segment
* [ListAudienceSegments](docs/sdks/audiencesegments/README.md#listaudiencesegments) - List Audience Segments
* [ListAudienceSegmentsPostFilter](docs/sdks/audiencesegments/README.md#listaudiencesegmentspostfilter) - List Audience Segments
* [GetAudienceSegmentById](docs/sdks/audiencesegments/README.md#getaudiencesegmentbyid) - Get Audience Segment
* [UpdateAudienceSegment](docs/sdks/audiencesegments/README.md#updateaudiencesegment) - Update Audience Segment
* [DeleteAudienceSegment](docs/sdks/audiencesegments/README.md#deleteaudiencesegment) - Delete Audience Segment
* [ListSegmentAssociatedAttendees](docs/sdks/audiencesegments/README.md#listsegmentassociatedattendees) - List Associated Attendees
* [AssociateAttendeeToSegment](docs/sdks/audiencesegments/README.md#associateattendeetosegment) - Associate Attendee to Segment
* [DisassociateAttendeeFromAudienceSegment](docs/sdks/audiencesegments/README.md#disassociateattendeefromaudiencesegment) - Disassociate Attendee

### [Authentication](docs/sdks/authentication/README.md)

* [Oauth2Authorize](docs/sdks/authentication/README.md#oauth2authorize) - Authorize
* [Oauth2Token](docs/sdks/authentication/README.md#oauth2token) - Token
* [ValidateToken](docs/sdks/authentication/README.md#validatetoken) - Validate Token

### [BadgePrintJob](docs/sdks/badgeprintjob/README.md)

* [CreateBadgePrintJob](docs/sdks/badgeprintjob/README.md#createbadgeprintjob) - Create Badge Print Job
* [GetEventBadgePrintJobs](docs/sdks/badgeprintjob/README.md#geteventbadgeprintjobs) - List Badge Print Jobs
* [GetBadgePrintJob](docs/sdks/badgeprintjob/README.md#getbadgeprintjob) - Get Badge Print Job

### [BadgePrinterPools](docs/sdks/badgeprinterpools/README.md)

* [GetBadgePrinterPools](docs/sdks/badgeprinterpools/README.md#getbadgeprinterpools) - List Badge Printer Pools
* [GetBadgePrinterPool](docs/sdks/badgeprinterpools/README.md#getbadgeprinterpool) - Get Badge Printer Pool

### [Budget](docs/sdks/budget/README.md)

* [GetAccountBudgetItems](docs/sdks/budget/README.md#getaccountbudgetitems) - List Budget Items
* [GetCards](docs/sdks/budget/README.md#getcards) - List Cards
* [GetCardTransactions](docs/sdks/budget/README.md#getcardtransactions) - List Card Transactions
* [CreateCardTransaction](docs/sdks/budget/README.md#createcardtransaction) - Create Card Transaction
* [DeleteCardTransaction](docs/sdks/budget/README.md#deletecardtransaction) - Delete Card Transaction
* [UpdateCardTransaction](docs/sdks/budget/README.md#updatecardtransaction) - Update Card Transaction
* [GetCurrencyConversionRate](docs/sdks/budget/README.md#getcurrencyconversionrate) - List Currency Conversion Rates
* [CreateCurrencyConversionRate](docs/sdks/budget/README.md#createcurrencyconversionrate) - Create Conversion Rate
* [UpdateCurrencyConversionRate](docs/sdks/budget/README.md#updatecurrencyconversionrate) - Update Conversion Rate
* [DeleteCurrencyConversionRate](docs/sdks/budget/README.md#deletecurrencyconversionrate) - Delete Conversion Rate
* [GetBudgetItems](docs/sdks/budget/README.md#getbudgetitems) - List Event Budget Items
* [CreateBudgetItem](docs/sdks/budget/README.md#createbudgetitem) - Create Budget Item
* [GetBudgetAllocations](docs/sdks/budget/README.md#getbudgetallocations) - List Budget Allocations
* [UpdateBudgetItem](docs/sdks/budget/README.md#updatebudgetitem) - Update Budget Item
* [UpdateBudgetAllocations](docs/sdks/budget/README.md#updatebudgetallocations) - Update Budget Allocations
* [DeleteBudgetAllocations](docs/sdks/budget/README.md#deletebudgetallocations) - Delete  Budget Allocations
* [CreatePayment](docs/sdks/budget/README.md#createpayment) - Create Budget Payment
* [UpdatePayment](docs/sdks/budget/README.md#updatepayment) - Update Budget Payment
* [DeletePayment](docs/sdks/budget/README.md#deletepayment) - Delete Budget Payment
* [AnswerBudgetCustomField](docs/sdks/budget/README.md#answerbudgetcustomfield) - Update Budget Cstm Fld Answers
* [GetPayments](docs/sdks/budget/README.md#getpayments) - List Budget Payments
* [AttachInvoiceToPayment](docs/sdks/budget/README.md#attachinvoicetopayment) - Assign Invoice To Payment
* [GetEventBudgetTotals](docs/sdks/budget/README.md#geteventbudgettotals) - List Budget Totals

### [Bulk](docs/sdks/bulk/README.md)

* [CreateBulkJob](docs/sdks/bulk/README.md#createbulkjob) - Create Bulk Job
* [GetBulkJobById](docs/sdks/bulk/README.md#getbulkjobbyid) - Get Bulk Job
* [CancelBulkJob](docs/sdks/bulk/README.md#cancelbulkjob) - Cancel Bulk Job
* [UploadBulkJobData](docs/sdks/bulk/README.md#uploadbulkjobdata) - Upload Bulk Job Data
* [ListBulkJobResult](docs/sdks/bulk/README.md#listbulkjobresult) - List Bulk Job Result
* [RunBulkJob](docs/sdks/bulk/README.md#runbulkjob) - Run Bulk Job

### [Campaigns](docs/sdks/campaigns/README.md)

* [GetCampaigns](docs/sdks/campaigns/README.md#getcampaigns) - List eMarketing Campaigns
* [GetEmailTemplates](docs/sdks/campaigns/README.md#getemailtemplates) - List Email Templates
* [SendEMarketingEmails](docs/sdks/campaigns/README.md#sendemarketingemails) - Send Email To Recipients
* [GetEmarketingEmailStatus](docs/sdks/campaigns/README.md#getemarketingemailstatus) - List Emarketing Email Status

### [CardTokens](docs/sdks/cardtokens/README.md)

* [CreateCardTokens](docs/sdks/cardtokens/README.md#createcardtokens) - Create a Credit Card Token

### [Compliance](docs/sdks/compliance/README.md)

* [GetConfiguration](docs/sdks/compliance/README.md#getconfiguration) - Get Communication Config

* [UpdateConfiguration](docs/sdks/compliance/README.md#updateconfiguration) - Update Communication Config

* [GetCommunicationLogMessages](docs/sdks/compliance/README.md#getcommunicationlogmessages) - List Communication

* [FilterCommunicationLogMessages](docs/sdks/compliance/README.md#filtercommunicationlogmessages) - List Communication


### [Contacts](docs/sdks/contacts/README.md)

* [CreateContactGroup](docs/sdks/contacts/README.md#createcontactgroup) - Create Contact Group
* [ListContactGroups](docs/sdks/contacts/README.md#listcontactgroups) - List Contact Groups
* [GetContactGroupById](docs/sdks/contacts/README.md#getcontactgroupbyid) - Get Contact Group
* [UpdateContactGroup](docs/sdks/contacts/README.md#updatecontactgroup) - Update Contact Group
* [DeleteContactGroup](docs/sdks/contacts/README.md#deletecontactgroup) - Delete Contact Group
* [GetContactIdsByContactGroup](docs/sdks/contacts/README.md#getcontactidsbycontactgroup) - Get Ids in Contact Group
* [AddContactToContactGroup](docs/sdks/contacts/README.md#addcontacttocontactgroup) - Add Contact To Group
* [RemoveContactFromContactGroup](docs/sdks/contacts/README.md#removecontactfromcontactgroup) - Remove Contact From Group
* [ListContactTypes](docs/sdks/contacts/README.md#listcontacttypes) - List Contact Types
* [ListContacts](docs/sdks/contacts/README.md#listcontacts) - List Contacts
* [UpdateContacts](docs/sdks/contacts/README.md#updatecontacts) - Update Contacts
* [PatchContacts](docs/sdks/contacts/README.md#patchcontacts) - Patch Contacts
* [CreateContacts](docs/sdks/contacts/README.md#createcontacts) - Create Contacts
* [ListContactsPostFilters](docs/sdks/contacts/README.md#listcontactspostfilters) - List Contacts
* [GetContactObfuscationStatusById](docs/sdks/contacts/README.md#getcontactobfuscationstatusbyid) - Get Obfuscation Status
* [GetChangeHistoryForASpecificContact](docs/sdks/contacts/README.md#getchangehistoryforaspecificcontact) - Get Contact Change History
* [GetContactById](docs/sdks/contacts/README.md#getcontactbyid) - Get Contact
* [UpdateContactById](docs/sdks/contacts/README.md#updatecontactbyid) - Update Contact
* [PatchContactById](docs/sdks/contacts/README.md#patchcontactbyid) - Patch Contact
* [DeleteContactById](docs/sdks/contacts/README.md#deletecontactbyid) - Delete Contact
* [UpdateContactCustomFieldAnswers](docs/sdks/contacts/README.md#updatecontactcustomfieldanswers) - Update Custom Field Answers
* [MergeContacts](docs/sdks/contacts/README.md#mergecontacts) - Merge Contacts
* [ObfuscateContactById](docs/sdks/contacts/README.md#obfuscatecontactbyid) - Obfuscate a Contact
* [DeleteContactProfileImage](docs/sdks/contacts/README.md#deletecontactprofileimage) - Delete Contact Profile Picture
* [AssignContactProfileImage](docs/sdks/contacts/README.md#assigncontactprofileimage) - Assign Contact Profile Picture
* [GetContactRelationshipsById](docs/sdks/contacts/README.md#getcontactrelationshipsbyid) - Get Related Contact Ids
* [CreateContactRelationship](docs/sdks/contacts/README.md#createcontactrelationship) - Add Contact Relationship
* [DeleteContactRelationship](docs/sdks/contacts/README.md#deletecontactrelationship) - Delete Contact Relationship

### [CustomFields](docs/sdks/customfields/README.md)

* [ListCustomFields](docs/sdks/customfields/README.md#listcustomfields) - List Custom Fields
* [CreateCustomField](docs/sdks/customfields/README.md#createcustomfield) - Create Custom Field
* [UpdateCustomField](docs/sdks/customfields/README.md#updatecustomfield) - Update Custom Field
* [GetCustomField](docs/sdks/customfields/README.md#getcustomfield) - Get Custom Field
* [UpdateCustomFieldAdvancedLogic](docs/sdks/customfields/README.md#updatecustomfieldadvancedlogic) - Update Advanced Logic
* [CreateCustomFieldTranslation](docs/sdks/customfields/README.md#createcustomfieldtranslation) - Create Custom Fld. Translation
* [UpdateCustomFieldTranslation](docs/sdks/customfields/README.md#updatecustomfieldtranslation) - Update Custom Fld. Translation

### [Discounts](docs/sdks/discounts/README.md)

* [ListEventDiscounts](docs/sdks/discounts/README.md#listeventdiscounts) - List Event Discounts
* [CreateEventDiscount](docs/sdks/discounts/README.md#createeventdiscount) - Create Event Discount
* [ListDiscountedAgendaItems](docs/sdks/discounts/README.md#listdiscountedagendaitems) - List Discounted Agenda Items
* [UpdateEventDiscount](docs/sdks/discounts/README.md#updateeventdiscount) - Update Event Discount
* [LinkAgendaItemToDiscount](docs/sdks/discounts/README.md#linkagendaitemtodiscount) - Link Agenda Item to Discount
* [UnlinkAgendaItemFromDiscount](docs/sdks/discounts/README.md#unlinkagendaitemfromdiscount) - Unlink Agenda Item Discount

### [Emails](docs/sdks/emails/README.md)

* [GetBounceDetails](docs/sdks/emails/README.md#getbouncedetails) - List Email Bounces
* [GetEmailsHistory](docs/sdks/emails/README.md#getemailshistory) - Get Emails History Data
* [~~GetEmailStatus~~](docs/sdks/emails/README.md#getemailstatus) - List Email Status :warning: **Deprecated**

### [EventCredits](docs/sdks/eventcredits/README.md)

* [GetAttendeeCredits](docs/sdks/eventcredits/README.md#getattendeecredits) - List Attendee Event Credits

### [EventFeatures](docs/sdks/eventfeatures/README.md)

* [GetEventFeatures](docs/sdks/eventfeatures/README.md#geteventfeatures) - List Event Features
* [UpdateEventFeatures](docs/sdks/eventfeatures/README.md#updateeventfeatures) - Update Event Feature
* [LaunchEventFeatures](docs/sdks/eventfeatures/README.md#launcheventfeatures) - Launch Event Feature
* [ListEventWeblinks](docs/sdks/eventfeatures/README.md#listeventweblinks) - List Event Weblinks

### [EventRole](docs/sdks/eventrole/README.md)

* [ListEventRoleAssignment](docs/sdks/eventrole/README.md#listeventroleassignment) - List Event Role Assignments

### [EventTravel](docs/sdks/eventtravel/README.md)

* [GetAirActualDetail](docs/sdks/eventtravel/README.md#getairactualdetail) - Get Air Actual
* [GetAirRequests](docs/sdks/eventtravel/README.md#getairrequests) - Get Air Requests
* [GetHotelRequests](docs/sdks/eventtravel/README.md#gethotelrequests) - Get Hotel Requests
* [GetHousingReservationRequests](docs/sdks/eventtravel/README.md#gethousingreservationrequests) - Get Housing Requests

### [Events](docs/sdks/events/README.md)

* [ListAdmissionItems](docs/sdks/events/README.md#listadmissionitems) - List Admission Items
* [ListAdmissionItemsPostFilters](docs/sdks/events/README.md#listadmissionitemspostfilters) - List Admission Items
* [GetEventQuestions](docs/sdks/events/README.md#geteventquestions) - List Event Questions
* [GetChoicesForQuestion](docs/sdks/events/README.md#getchoicesforquestion) - Get Question Choices
* [GetEvents](docs/sdks/events/README.md#getevents) - List Events
* [CreateEventAsync](docs/sdks/events/README.md#createeventasync) - Create Event Async
* [GetEventAsyncStatus](docs/sdks/events/README.md#geteventasyncstatus) - Get Event Async Status
* [GetEventCopyStatus](docs/sdks/events/README.md#geteventcopystatus) - Get Event Copy Status
* [SendEventEmails](docs/sdks/events/README.md#sendeventemails) - Send Email To Attendees
* [GetEventEmailStatus](docs/sdks/events/README.md#geteventemailstatus) - List Event Email Status
* [GetEventsPostFilters](docs/sdks/events/README.md#geteventspostfilters) - List Events
* [GetEventById](docs/sdks/events/README.md#geteventbyid) - Get Event
* [UpdateEvent](docs/sdks/events/README.md#updateevent) - Update Event
* [EventCheckIn](docs/sdks/events/README.md#eventcheckin) - Event Check-In
* [DeleteEventCheckIn](docs/sdks/events/README.md#deleteeventcheckin) - Remove Check-In
* [CopyEvent](docs/sdks/events/README.md#copyevent) - Copy Event
* [AnswerEventCustomField](docs/sdks/events/README.md#answereventcustomfield) - Event Custom Field Answers
* [ListDonationItems](docs/sdks/events/README.md#listdonationitems) - List Donation Items
* [ListDonationItemsPostFilter](docs/sdks/events/README.md#listdonationitemspostfilter) - List Donation Items
* [ListEventEmails](docs/sdks/events/README.md#listeventemails) - List Event Emails
* [ListFeeItems](docs/sdks/events/README.md#listfeeitems) - List Fee Items
* [GetInvitationList](docs/sdks/events/README.md#getinvitationlist) - List Invitation Lists
* [GetOrders](docs/sdks/events/README.md#getorders) - List Orders
* [GetOrderItems](docs/sdks/events/README.md#getorderitems) - List Order Items
* [AssociateDiscountCodeToOrderItem](docs/sdks/events/README.md#associatediscountcodetoorderitem) - Assign Discount to Order Item
* [ListQuantityItems](docs/sdks/events/README.md#listquantityitems) - List Quantity Items
* [ListQuantityItemsPostFilter](docs/sdks/events/README.md#listquantityitemspostfilter) - List Quantity Items
* [ListRegistrationPaths](docs/sdks/events/README.md#listregistrationpaths) - List Registration Paths
* [ListRegistrationTypes](docs/sdks/events/README.md#listregistrationtypes) - List Registration Types
* [UpdateRegistrationType](docs/sdks/events/README.md#updateregistrationtype) - Update Event Registration Type
* [GetTransactions](docs/sdks/events/README.md#gettransactions) - List Transactions
* [PostTransactions](docs/sdks/events/README.md#posttransactions) - Create Transactions
* [GetTransactionItems](docs/sdks/events/README.md#gettransactionitems) - List Transaction Items
* [ListEventUserGroups](docs/sdks/events/README.md#listeventusergroups) - List Event User Groups
* [AssociateEventUserGroup](docs/sdks/events/README.md#associateeventusergroup) - Associate User Group to Event
* [DisassociateEventUserGroup](docs/sdks/events/README.md#disassociateeventusergroup) - Disassociate Group from Event
* [UpdateQuantityItemRegistrationForAttendee](docs/sdks/events/README.md#updatequantityitemregistrationforattendee) - Update Quantity Item
* [ListSessionsAttendance](docs/sdks/events/README.md#listsessionsattendance) - Session Attendance
* [ListSessionsEnrollment](docs/sdks/events/README.md#listsessionsenrollment) - List Session Registrants
* [ListSessionsEnrollmentPostFilter](docs/sdks/events/README.md#listsessionsenrollmentpostfilter) - List Session Registrants
* [DeleteSessionAttendance](docs/sdks/events/README.md#deletesessionattendance) - Del Session Check-in
* [SessionCheckIn](docs/sdks/events/README.md#sessioncheckin) - Session Check-In
* [UpdateSessionCheckIn](docs/sdks/events/README.md#updatesessioncheckin) - Update Session Check-In
* [CreateSessionEnrollment](docs/sdks/events/README.md#createsessionenrollment) - Create Session Registration
* [DeleteSessionEnrollment](docs/sdks/events/README.md#deletesessionenrollment) - Delete Session Registration

### [EventsPlusHub](docs/sdks/eventsplushub/README.md)

* [ListHubs](docs/sdks/eventsplushub/README.md#listhubs) - List Events+ Hubs
* [GetHubMembers](docs/sdks/eventsplushub/README.md#gethubmembers) - Get Events+ Hub Members

### [Exhibitor](docs/sdks/exhibitor/README.md)

* [GetExhibitorCategories](docs/sdks/exhibitor/README.md#getexhibitorcategories) - List Exhibitor Categories
* [CreateExhibitorCategory](docs/sdks/exhibitor/README.md#createexhibitorcategory) - Create Exhibitor Category
* [UpdateExhibitorCategory](docs/sdks/exhibitor/README.md#updateexhibitorcategory) - Update Exhibitor Category
* [DeleteExhibitorCategory](docs/sdks/exhibitor/README.md#deleteexhibitorcategory) - Delete Exhibitor Category
* [UpdateExhibitorCategoryBanner](docs/sdks/exhibitor/README.md#updateexhibitorcategorybanner) - Assign Banner to Category
* [DeleteExhibitorCategoryImage](docs/sdks/exhibitor/README.md#deleteexhibitorcategoryimage) - Delete Banner from Category
* [ListExhibitors](docs/sdks/exhibitor/README.md#listexhibitors) - List Category's Exhibitors
* [AddExhibitorToExhibitorCategory](docs/sdks/exhibitor/README.md#addexhibitortoexhibitorcategory) - Assign Exhibitor to Category
* [RemoveExhibitorFromExhibitorCategory](docs/sdks/exhibitor/README.md#removeexhibitorfromexhibitorcategory) - Delete Exhibitor from Category
* [GetExhibitorQuestions](docs/sdks/exhibitor/README.md#getexhibitorquestions) - List Exhibitor Questions
* [GetExhibitors](docs/sdks/exhibitor/README.md#getexhibitors) - List Exhibitors
* [CreateExhibitor](docs/sdks/exhibitor/README.md#createexhibitor) - Create Exhibitor
* [GetExhibitor](docs/sdks/exhibitor/README.md#getexhibitor) - Get Exhibitor
* [UpdateExhibitor](docs/sdks/exhibitor/README.md#updateexhibitor) - Update Exhibitor
* [DeleteExhibitor](docs/sdks/exhibitor/README.md#deleteexhibitor) - Delete Exhibitor
* [UpdateExhibitorBanner](docs/sdks/exhibitor/README.md#updateexhibitorbanner) - Assign Exhibitor Banner Image
* [DeleteExhibitorBanner](docs/sdks/exhibitor/README.md#deleteexhibitorbanner) - Delete Exhibitor Banner Image
* [GetExhibitorAnswers](docs/sdks/exhibitor/README.md#getexhibitoranswers) - List Exhibitor Answers
* [UpdateExhibitorAnswers](docs/sdks/exhibitor/README.md#updateexhibitoranswers) - Update Exhibitor Answers
* [ListExhibitorCategories](docs/sdks/exhibitor/README.md#listexhibitorcategories) - List Exhibitor's Categories
* [UpdateExhibitorLogo](docs/sdks/exhibitor/README.md#updateexhibitorlogo) - Assign Exhibitor Logo Image
* [DeleteExhibitorLogo](docs/sdks/exhibitor/README.md#deleteexhibitorlogo) - Delete Exhibitor Logo Image
* [GetLeadQualificationQuestions](docs/sdks/exhibitor/README.md#getleadqualificationquestions) - List Qualification Questions
* [PostRegistrationPack](docs/sdks/exhibitor/README.md#postregistrationpack) - Create Registration Pack
* [GetExhibitorRegistrationPacks](docs/sdks/exhibitor/README.md#getexhibitorregistrationpacks) - List Registration Packs
* [GetRegistrationPack](docs/sdks/exhibitor/README.md#getregistrationpack) - Get Registration Pack
* [UpdateRegistrationPack](docs/sdks/exhibitor/README.md#updateregistrationpack) - Update Registration Pack
* [DeleteRegistrationPack](docs/sdks/exhibitor/README.md#deleteregistrationpack) - Delete Registration Pack
* [GetSponsorshipLevels](docs/sdks/exhibitor/README.md#getsponsorshiplevels) - List Sponsorship Levels
* [GetSponsorshipLevel](docs/sdks/exhibitor/README.md#getsponsorshiplevel) - Get Sponsorship Level

### [ExhibitorContent](docs/sdks/exhibitorcontent/README.md)

* [ListExhibitorFiles](docs/sdks/exhibitorcontent/README.md#listexhibitorfiles) - List Exhibitor Files
* [GetExhibitorFile](docs/sdks/exhibitorcontent/README.md#getexhibitorfile) - Get Exhibitor File
* [UpdateExhibitorFile](docs/sdks/exhibitorcontent/README.md#updateexhibitorfile) - Associate Exhibitor File
* [DisassociateExhibitorFile](docs/sdks/exhibitorcontent/README.md#disassociateexhibitorfile) - Disassociate Exhibitor File
* [ListExhibitorWeblinks](docs/sdks/exhibitorcontent/README.md#listexhibitorweblinks) - List Exhibitor Weblinks
* [CreateExhibitorWeblink](docs/sdks/exhibitorcontent/README.md#createexhibitorweblink) - Create Exhibitor Weblink
* [GetExhibitorWeblink](docs/sdks/exhibitorcontent/README.md#getexhibitorweblink) - Get Exhibitor Weblink
* [UpdateExhibitorWeblink](docs/sdks/exhibitorcontent/README.md#updateexhibitorweblink) - Update Exhibitor Weblink
* [DeleteExhibitorWeblink](docs/sdks/exhibitorcontent/README.md#deleteexhibitorweblink) - Delete Exhibitor Weblink

### [ExhibitorTeam](docs/sdks/exhibitorteam/README.md)

* [ListExhibitorAdmins](docs/sdks/exhibitorteam/README.md#listexhibitoradmins) - List Exhibitor Admins
* [PostExhibitorAdmin](docs/sdks/exhibitorteam/README.md#postexhibitoradmin) - Create Exhibitor Admin
* [GetExhibitorAdmin](docs/sdks/exhibitorteam/README.md#getexhibitoradmin) - Get Exhibitor Admin
* [UpdateExhibitorAdmin](docs/sdks/exhibitorteam/README.md#updateexhibitoradmin) - Update Exhibitor Admin
* [ListBoothStaff](docs/sdks/exhibitorteam/README.md#listboothstaff) - List Booth Staff
* [AssociateBoothStaff](docs/sdks/exhibitorteam/README.md#associateboothstaff) - Create Booth Staff
* [GetBoothStaff](docs/sdks/exhibitorteam/README.md#getboothstaff) - Get Booth Staff member
* [DeleteBoothStaff](docs/sdks/exhibitorteam/README.md#deleteboothstaff) - Delete Booth Staff member

### [File](docs/sdks/file/README.md)

* [UploadFile](docs/sdks/file/README.md#uploadfile) - Upload a File
* [GetFile](docs/sdks/file/README.md#getfile) - Get File Location

### [Hooks](docs/sdks/hooks/README.md)

* [ListContactHooks](docs/sdks/hooks/README.md#listcontacthooks) - List Contact Hooks
* [CreateContactHook](docs/sdks/hooks/README.md#createcontacthook) - Create Contact Hook
* [UpdateContactHook](docs/sdks/hooks/README.md#updatecontacthook) - Update Contact Hook
* [DeleteContactHook](docs/sdks/hooks/README.md#deletecontacthook) - Delete Contact Hook

### [Housing](docs/sdks/housing/README.md)

* [CreateConnection](docs/sdks/housing/README.md#createconnection) - Create Connection
* [GetHousingEventsSummaries](docs/sdks/housing/README.md#gethousingeventssummaries) - Get Housing Events Summaries
* [GetHousingEventInfo](docs/sdks/housing/README.md#gethousingeventinfo) - Get Housing Event Info
* [GetHousingEventHotels](docs/sdks/housing/README.md#gethousingeventhotels) - Get Housing Event Hotels
* [GetHousingEventHotel](docs/sdks/housing/README.md#gethousingeventhotel) - Get Housing Event Hotel
* [GetHousingEventHotelAvailability](docs/sdks/housing/README.md#gethousingeventhotelavailability) - Get Event Hotel Availability
* [GetHousingEventRoomTypes](docs/sdks/housing/README.md#gethousingeventroomtypes) - Get Housing Event Room Types
* [GetRoomTypeDetails](docs/sdks/housing/README.md#getroomtypedetails) - Get Room Type Details
* [GetRoomTypeInventory](docs/sdks/housing/README.md#getroomtypeinventory) - Get Room Type Inventory
* [GetHousingEventInventory](docs/sdks/housing/README.md#gethousingeventinventory) - Get Housing Event Inventory
* [GetHousingEventReservations](docs/sdks/housing/README.md#gethousingeventreservations) - Get Housing Event Reservations
* [CreateReservationRequest](docs/sdks/housing/README.md#createreservationrequest) - Create Reservation Request
* [GetReservationRequest](docs/sdks/housing/README.md#getreservationrequest) - Get Reservation Request
* [UpdateReservationRequest](docs/sdks/housing/README.md#updatereservationrequest) - Update Reservation Request
* [CancelReservationRequest](docs/sdks/housing/README.md#cancelreservationrequest) - Cancel Reservation Request
* [LinkReservation](docs/sdks/housing/README.md#linkreservation) - Link Reservation
* [UnlinkReservation](docs/sdks/housing/README.md#unlinkreservation) - Unlink Reservation
* [CreateReservation](docs/sdks/housing/README.md#createreservation) - Create Reservation
* [GetReservation](docs/sdks/housing/README.md#getreservation) - Get Reservation
* [CancelReservation](docs/sdks/housing/README.md#cancelreservation) - Cancel Reservation
* [UpdateReservationSync](docs/sdks/housing/README.md#updatereservationsync) - Update Reservation

### [HousingHotels](docs/sdks/housinghotels/README.md)

* [UpdateHotelRoomRates](docs/sdks/housinghotels/README.md#updatehotelroomrates) - Update Hotel Room Rates

### [Leads](docs/sdks/leads/README.md)

* [GetEliteratureRequests](docs/sdks/leads/README.md#geteliteraturerequests) - List E-literature Requests
* [GetLeadQualificationAnswers](docs/sdks/leads/README.md#getleadqualificationanswers) - List Qualification Answers
* [GetLeads](docs/sdks/leads/README.md#getleads) - List Leads
* [GetLeadsPostFiltersData](docs/sdks/leads/README.md#getleadspostfiltersdata) - List Leads

### [MeetingRequest](docs/sdks/meetingrequest/README.md)

* [GetMeetingRequestByEventId](docs/sdks/meetingrequest/README.md#getmeetingrequestbyeventid) - Get MR by Event ID
* [ListMRF](docs/sdks/meetingrequest/README.md#listmrf) - List MR Forms
* [GetMRFById](docs/sdks/meetingrequest/README.md#getmrfbyid) - Get MR Form
* [CreateMeetingRequest](docs/sdks/meetingrequest/README.md#createmeetingrequest) - Create MR (Bulk)
* [UpdateMeetingRequest](docs/sdks/meetingrequest/README.md#updatemeetingrequest) - Update MR (Bulk)
* [ListMeetingRequest](docs/sdks/meetingrequest/README.md#listmeetingrequest) - List MR
* [GetMeetingRequestById](docs/sdks/meetingrequest/README.md#getmeetingrequestbyid) - Get MR
* [ListMeetingRequestDocuments](docs/sdks/meetingrequest/README.md#listmeetingrequestdocuments) - List MR Documents

### [ProcessForm](docs/sdks/processform/README.md)

* [ListProcessFormSubmission](docs/sdks/processform/README.md#listprocessformsubmission) - List Process Form Submissions

### [ProposalDraft](docs/sdks/proposaldraft/README.md)

* [CreateProposalDraft](docs/sdks/proposaldraft/README.md#createproposaldraft) - Beta - Create Proposal Draft

### [Seating](docs/sdks/seating/README.md)

* [ListSeating](docs/sdks/seating/README.md#listseating) - List Seating
* [GetEventTableAssignments](docs/sdks/seating/README.md#geteventtableassignments) - List All Seating Assignments
* [GetSeating](docs/sdks/seating/README.md#getseating) - Get Seating
* [GetTableAssignment](docs/sdks/seating/README.md#gettableassignment) - List Seating Assignments
* [ListTables](docs/sdks/seating/README.md#listtables) - List Tables
* [GetTable](docs/sdks/seating/README.md#gettable) - Get Table
* [ListSeats](docs/sdks/seating/README.md#listseats) - List Seats
* [GetSeat](docs/sdks/seating/README.md#getseat) - Get Seat

### [Sessions](docs/sdks/sessions/README.md)

* [GetSessionLocation](docs/sdks/sessions/README.md#getsessionlocation) - List Session Locations
* [AddSessionLocation](docs/sdks/sessions/README.md#addsessionlocation) - Add Session Location
* [CreateProgramItem](docs/sdks/sessions/README.md#createprogramitem) - Create Program Item
* [ListProgramItems](docs/sdks/sessions/README.md#listprogramitems) - List Program Items
* [FilterProgramItemDocuments](docs/sdks/sessions/README.md#filterprogramitemdocuments) - Filter Program Item Documents
* [ListProgramItemsPostFilters](docs/sdks/sessions/README.md#listprogramitemspostfilters) - List Program Items
* [UpdateProgramItem](docs/sdks/sessions/README.md#updateprogramitem) - Update Program Item
* [DeleteProgramItem](docs/sdks/sessions/README.md#deleteprogramitem) - Delete Session Program Item
* [~~GetProgramItemDocuments~~](docs/sdks/sessions/README.md#getprogramitemdocuments) - Get Program Item Documents :warning: **Deprecated**
* [RelateProgramItemToSessionDocument](docs/sdks/sessions/README.md#relateprogramitemtosessiondocument) - Add Program Item Document
* [GetProgramItemSessionDocument](docs/sdks/sessions/README.md#getprogramitemsessiondocument) - Get Program Item Document
* [DeleteProgramItemSessionDocument](docs/sdks/sessions/README.md#deleteprogramitemsessiondocument) - Delete Program Item Document
* [ListSessionsCategories](docs/sdks/sessions/README.md#listsessionscategories) - List Session Categories
* [CreateSessionCategory](docs/sdks/sessions/README.md#createsessioncategory) - Create Session Categories
* [GetSessionSegments](docs/sdks/sessions/README.md#getsessionsegments) - Get Session Segments
* [ListSessions](docs/sdks/sessions/README.md#listsessions) - List Sessions
* [CreateSession](docs/sdks/sessions/README.md#createsession) - Create Session
* [ListSessionsPostFilters](docs/sdks/sessions/README.md#listsessionspostfilters) - List Sessions
* [GetSessionById](docs/sdks/sessions/README.md#getsessionbyid) - Get Session
* [UpdateSession](docs/sdks/sessions/README.md#updatesession) - Update Session
* [DeleteSession](docs/sdks/sessions/README.md#deletesession) - Delete Session
* [UpdateSessionCustomFieldAnswers](docs/sdks/sessions/README.md#updatesessioncustomfieldanswers) - Update Custom Field Answers
* [ListSessionDocs](docs/sdks/sessions/README.md#listsessiondocs) - List Session Documents
* [GetSessionDoc](docs/sdks/sessions/README.md#getsessiondoc) - Get Session Document
* [AddSessionDoc](docs/sdks/sessions/README.md#addsessiondoc) - Add Document To Session
* [DeleteSessionDocument](docs/sdks/sessions/README.md#deletesessiondocument) - Delete Document from Session
* [ListSessionSpeakers](docs/sdks/sessions/README.md#listsessionspeakers) - List Session's Speakers
* [AddSpeakerToSession](docs/sdks/sessions/README.md#addspeakertosession) - Assign Speaker to Session
* [RemoveSpeakerFromSession](docs/sdks/sessions/README.md#removespeakerfromsession) - Delete Speaker From Session

### [Signatures](docs/sdks/signatures/README.md)

* [GetSignatures](docs/sdks/signatures/README.md#getsignatures) - List Signatures

### [Speakers](docs/sdks/speakers/README.md)

* [GetSessionProgramSpeakers](docs/sdks/speakers/README.md#getsessionprogramspeakers) - Get Session Program Speakers
* [ListSessionProgramSpeakersPostFilters](docs/sdks/speakers/README.md#listsessionprogramspeakerspostfilters) - List Session Program Speakers
* [CreateSessionProgramSpeaker](docs/sdks/speakers/README.md#createsessionprogramspeaker) - Add Session Program Speaker
* [GetSessionProgramSpeaker](docs/sdks/speakers/README.md#getsessionprogramspeaker) - Get Session Program Speaker
* [DeleteSessionProgramSpeaker](docs/sdks/speakers/README.md#deletesessionprogramspeaker) - Delete Session Program Speaker
* [ListSpeakersCategories](docs/sdks/speakers/README.md#listspeakerscategories) - List Speakers Categories
* [AddSpeakerCategory](docs/sdks/speakers/README.md#addspeakercategory) - Create Speaker Category
* [ListSpeakers](docs/sdks/speakers/README.md#listspeakers) - List Speakers
* [CreateSpeaker](docs/sdks/speakers/README.md#createspeaker) - Create Speaker
* [ListSpeakersPostFilter](docs/sdks/speakers/README.md#listspeakerspostfilter) - List Speakers
* [UpdateSpeaker](docs/sdks/speakers/README.md#updatespeaker) - Update Speaker
* [DeleteSpeaker](docs/sdks/speakers/README.md#deletespeaker) - Delete Speaker
* [ListSpeakerDocs](docs/sdks/speakers/README.md#listspeakerdocs) - List Speaker's Documents
* [GetSpeakerDoc](docs/sdks/speakers/README.md#getspeakerdoc) - Get a document for a speaker
* [AddSpeakerDoc](docs/sdks/speakers/README.md#addspeakerdoc) - Add Document To Speaker
* [DeleteSpeakerDocument](docs/sdks/speakers/README.md#deletespeakerdocument) - Delete Document From Speaker
* [DeleteSpeakerProfileImage](docs/sdks/speakers/README.md#deletespeakerprofileimage) - Delete Speaker Profile Picture
* [AssignSpeakerProfileImage](docs/sdks/speakers/README.md#assignspeakerprofileimage) - Assign Speaker Profile Picture
* [ListSpeakerSessions](docs/sdks/speakers/README.md#listspeakersessions) - List Speaker's Sessions

### [Surveys](docs/sdks/surveys/README.md)

* [GetAllEventSurveyResponses](docs/sdks/surveys/README.md#getalleventsurveyresponses) - List All Event Responses
* [GetEventSurveys](docs/sdks/surveys/README.md#geteventsurveys) - List Event Surveys
* [GetEventSurveyQuestions](docs/sdks/surveys/README.md#geteventsurveyquestions) - List Event Survey Questions
* [GetEventSurveyRespondents](docs/sdks/surveys/README.md#geteventsurveyrespondents) - List Event Survey Respondents
* [CreateEventSurveyRespondent](docs/sdks/surveys/README.md#createeventsurveyrespondent) - Create Event Survey Respondent
* [UpdateEventSurveyRespondent](docs/sdks/surveys/README.md#updateeventsurveyrespondent) - Update Event Survey Respondent
* [CreateEventSurveyResponses](docs/sdks/surveys/README.md#createeventsurveyresponses) - Create Event Survey Responses
* [GetEventSurveyResponses](docs/sdks/surveys/README.md#geteventsurveyresponses) - List Event Survey Responses
* [GetLargeChoices](docs/sdks/surveys/README.md#getlargechoices) - List Large Choices
* [GetQuestions](docs/sdks/surveys/README.md#getquestions) - List Questions
* [GetRespondents](docs/sdks/surveys/README.md#getrespondents) - List Respondents
* [GetResponses](docs/sdks/surveys/README.md#getresponses) - List Responses
* [GetStandardSurveys](docs/sdks/surveys/README.md#getstandardsurveys) - List Standalone Surveys
* [GetStandardSurveyResponses](docs/sdks/surveys/README.md#getstandardsurveyresponses) - List Stdl. Survey Responses
* [GetStandardSurveyEmailTemplates](docs/sdks/surveys/README.md#getstandardsurveyemailtemplates) - List Stdl. Survey Email Templ.
* [GetStandardSurveyQuestions](docs/sdks/surveys/README.md#getstandardsurveyquestions) - List Stdl. Survey Questions
* [GetStandardSurveyRespondents](docs/sdks/surveys/README.md#getstandardsurveyrespondents) - List Stdl. Survey Respondents
* [CreateStandardSurveyRespondent](docs/sdks/surveys/README.md#createstandardsurveyrespondent) - Create Stdl. Survey Respondent
* [UpdateStandardSurveyRespondent](docs/sdks/surveys/README.md#updatestandardsurveyrespondent) - Update Stdl. Survey Respondent
* [SendStandardSurveyEmail](docs/sdks/surveys/README.md#sendstandardsurveyemail) - Send Standalone Survey Email
* [CreateStandardSurveyResponses](docs/sdks/surveys/README.md#createstandardsurveyresponses) - Create Stdl. Survey Responses
* [UpdateStandardSurveyResponses](docs/sdks/surveys/README.md#updatestandardsurveyresponses) - Update Stdl. Survey Responses
* [GetSurvey](docs/sdks/surveys/README.md#getsurvey) - List Surveys

### [TravelAccounts](docs/sdks/travelaccounts/README.md)

* [ListTravelAccounts](docs/sdks/travelaccounts/README.md#listtravelaccounts) - List Travel Accounts
* [ListSupplierAccounts](docs/sdks/travelaccounts/README.md#listsupplieraccounts) - List Supplier Accounts
* [GetTravelAccount](docs/sdks/travelaccounts/README.md#gettravelaccount) - Get Travel Account
* [GetSupplierAccount](docs/sdks/travelaccounts/README.md#getsupplieraccount) - Get Supplier Account

### [TravelRFPs](docs/sdks/travelrfps/README.md)

* [ListTravelPrograms](docs/sdks/travelrfps/README.md#listtravelprograms) - List Travel Programs
* [ListTravelProgramsQuestions](docs/sdks/travelrfps/README.md#listtravelprogramsquestions) - List Travel Programs Questions
* [GetTravelProgram](docs/sdks/travelrfps/README.md#gettravelprogram) - Get Travel Program
* [ListTravelProgramQuestions](docs/sdks/travelrfps/README.md#listtravelprogramquestions) - List Travel Program Questions
* [GetTravelProgramQuestion](docs/sdks/travelrfps/README.md#gettravelprogramquestion) - Get Travel Program Question
* [ListTravelProposals](docs/sdks/travelrfps/README.md#listtravelproposals) - List Travel Proposals
* [ListTravelProposalBids](docs/sdks/travelrfps/README.md#listtravelproposalbids) - List Travel Proposal Bids
* [GetTravelProposalBid](docs/sdks/travelrfps/README.md#gettravelproposalbid) - Get Travel Proposal Bid
* [GetTravelProposal](docs/sdks/travelrfps/README.md#gettravelproposal) - Get Travel Proposal

### [TravelSuppliers](docs/sdks/travelsuppliers/README.md)

* [PropertyApiListBrands](docs/sdks/travelsuppliers/README.md#propertyapilistbrands) - List Supplier Brands
* [PropertyApiGetBrand](docs/sdks/travelsuppliers/README.md#propertyapigetbrand) - Get Supplier Brand
* [PropertyApiListChains](docs/sdks/travelsuppliers/README.md#propertyapilistchains) - List Supplier Chains
* [PropertyApiGetChain](docs/sdks/travelsuppliers/README.md#propertyapigetchain) - Get Supplier Chain
* [PropertyApiListProperties](docs/sdks/travelsuppliers/README.md#propertyapilistproperties) - List Supplier Properties
* [PropertyApiGetProperty](docs/sdks/travelsuppliers/README.md#propertyapigetproperty) - Get Supplier Property
* [BtApiGetPropertyRooms](docs/sdks/travelsuppliers/README.md#btapigetpropertyrooms) - List Supplier Property Rooms
* [PropertyApiGetPropertyRoom](docs/sdks/travelsuppliers/README.md#propertyapigetpropertyroom) - Get Supplier Property Room

### [Usage](docs/sdks/usage/README.md)

* [GetUsage](docs/sdks/usage/README.md#getusage) - Get Current Usage
* [GetUsageTier](docs/sdks/usage/README.md#getusagetier) - Get Current Usage Tier

### [UserSCIM](docs/sdks/userscim/README.md)

* [GetUserGroups](docs/sdks/userscim/README.md#getusergroups) - Get SCIM Groups
* [GetResourceTypes](docs/sdks/userscim/README.md#getresourcetypes) - List Resource Types
* [GetResourceType](docs/sdks/userscim/README.md#getresourcetype) - Get Resource Type
* [GetSchemas](docs/sdks/userscim/README.md#getschemas) - List Schemas
* [GetSchema](docs/sdks/userscim/README.md#getschema) - Get Schema
* [GetServiceProviderConfig](docs/sdks/userscim/README.md#getserviceproviderconfig) - Get Service Provider Config
* [CreateUser](docs/sdks/userscim/README.md#createuser) - Create User
* [ListUsers](docs/sdks/userscim/README.md#listusers) - List Users
* [GetUser](docs/sdks/userscim/README.md#getuser) - Get User
* [UpdateUser](docs/sdks/userscim/README.md#updateuser) - Update User
* [DeleteUser](docs/sdks/userscim/README.md#deleteuser) - Delete User

### [Users](docs/sdks/users/README.md)

* [GetAccountUserGroups](docs/sdks/users/README.md#getaccountusergroups) - List Account User Groups
* [CreateAccountUserGroup](docs/sdks/users/README.md#createaccountusergroup) - Create Account User Group
* [GetAccountUserGroup](docs/sdks/users/README.md#getaccountusergroup) - Get Account User Group
* [UpdateAccountUserGroup](docs/sdks/users/README.md#updateaccountusergroup) - Update Account User Group
* [DeleteAccountUserGroup](docs/sdks/users/README.md#deleteaccountusergroup) - Delete Account User Group
* [AddUserToAccountUserGroup](docs/sdks/users/README.md#addusertoaccountusergroup) - Associate User to Group
* [DeleteUserFromAccountUserGroup](docs/sdks/users/README.md#deleteuserfromaccountusergroup) - Delete User from Group

### [Video](docs/sdks/video/README.md)

* [ListVideos](docs/sdks/video/README.md#listvideos) - List Videos
* [GetVideoViews](docs/sdks/video/README.md#getvideoviews) - List Video Views
* [ListAudioTracks](docs/sdks/video/README.md#listaudiotracks) - List Audio Tracks
* [ListVideoRenditions](docs/sdks/video/README.md#listvideorenditions) - List Video Renditions
* [CreateTextTrack](docs/sdks/video/README.md#createtexttrack) - Create Text Track
* [ListVideoTextTracks](docs/sdks/video/README.md#listvideotexttracks) - List Text Tracks
* [UpdateTextTrack](docs/sdks/video/README.md#updatetexttrack) - Update Text Track

### [Webcasts](docs/sdks/webcasts/README.md)

* [CreateWebcast](docs/sdks/webcasts/README.md#createwebcast) - Create Webcast
* [ListWebcasts](docs/sdks/webcasts/README.md#listwebcasts) - List Webcasts
* [ListAttendeeLinks](docs/sdks/webcasts/README.md#listattendeelinks) - List Attendee Links
* [ListPlayers](docs/sdks/webcasts/README.md#listplayers) - List Players
* [GetWebcastById](docs/sdks/webcasts/README.md#getwebcastbyid) - Get Webcast
* [DeleteWebcast](docs/sdks/webcasts/README.md#deletewebcast) - Delete Webcast
* [UpdateWebcast](docs/sdks/webcasts/README.md#updatewebcast) - Update Webcast
* [CreateAttendeeLinks](docs/sdks/webcasts/README.md#createattendeelinks) - Create Attendee Link
* [UpdateAttendeeLinks](docs/sdks/webcasts/README.md#updateattendeelinks) - Update Attendee Link
* [~~ListWebcastAttendeeLinks~~](docs/sdks/webcasts/README.md#listwebcastattendeelinks) - List Attendee Links :warning: **Deprecated**
* [DeleteAttendeeLink](docs/sdks/webcasts/README.md#deleteattendeelink) - Delete Attendee Link

</details>
<!-- End Available Resources and Operations [operations] -->

<!-- Start Pagination [pagination] -->
## Pagination

Some of the endpoints in this SDK support pagination. To use pagination, you make your SDK calls as usual, but the
returned response object will have a `Next` method that can be called to pull down the next group of results. If the
return value of `Next` is `null`, then there are no more pages to be fetched.

Here's an example of one such pagination call:
```csharp
using Cvent.SDK;
using Cvent.SDK.Models.Components;
using Cvent.SDK.Models.Requests;

var sdk = new CventSDK(security: new Security() {
    OAuth2ClientCredentials = new SchemeOAuth2ClientCredentials() {
        ClientID = "<YOUR_CLIENT_ID_HERE>",
        ClientSecret = "<YOUR_CLIENT_SECRET_HERE>",
        TokenURL = "<YOUR_TOKEN_URL_HERE>",
        Scopes = "<YOUR_SCOPES_HERE>",
    },
});

GetAccountUserGroupsRequest req = new GetAccountUserGroupsRequest() {
    Token = "1a2b3c4d5e6f7g8h9i10j11k",
    Filter = "name eq 'My User Group'",
};

GetAccountUserGroupsResponse? res = await sdk.Users.GetAccountUserGroupsAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```
<!-- End Pagination [pagination] -->

<!-- Start Error Handling [errors] -->
## Error Handling

[`CventSDKException`](./src/Cvent/SDK/Models/Errors/CventSDKException.cs) is the base exception class for all HTTP error responses. It has the following properties:

| Property      | Type                  | Description           |
|---------------|-----------------------|-----------------------|
| `Message`     | *string*              | Error message         |
| `Request`     | *HttpRequestMessage*  | HTTP request object   |
| `Response`    | *HttpResponseMessage* | HTTP response object  |

Some exceptions in this SDK include an additional `Payload` field, which will contain deserialized custom error data when present. Possible exceptions are listed in the [Error Classes](#error-classes) section.

### Example

```csharp
using Cvent.SDK;
using Cvent.SDK.Models.Components;
using Cvent.SDK.Models.Errors;
using Cvent.SDK.Models.Requests;

var sdk = new CventSDK(security: new Security() {
    OAuth2ClientCredentials = new SchemeOAuth2ClientCredentials() {
        ClientID = "<YOUR_CLIENT_ID_HERE>",
        ClientSecret = "<YOUR_CLIENT_SECRET_HERE>",
        TokenURL = "<YOUR_TOKEN_URL_HERE>",
        Scopes = "<YOUR_SCOPES_HERE>",
    },
});

try
{
    GetAccountUserGroupsRequest req = new GetAccountUserGroupsRequest() {
        Token = "1a2b3c4d5e6f7g8h9i10j11k",
        Filter = "name eq 'My User Group'",
    };

    GetAccountUserGroupsResponse? res = await sdk.Users.GetAccountUserGroupsAsync(req);

    while(res != null)
    {
        // handle items

        res = await res.Next!();
    }
}
catch (CventSDKException ex)  // all SDK exceptions inherit from CventSDKException
{
    // ex.ToString() provides a detailed error message
    System.Console.WriteLine(ex);

    // Base exception fields
    HttpRequestMessage request = ex.Request;
    HttpResponseMessage response = ex.Response;
    var statusCode = (int)response.StatusCode;
    var responseBody = ex.Body;

    if (ex is Models.Errors.ErrorResponse) // different exceptions may be thrown depending on the method
    {
        // Check error data fields
        Models.Errors.ErrorResponsePayload payload = ex.Payload;
        long Code = payload.Code;
        string Message = payload.Message;
        // ...
    }

    // An underlying cause may be provided
    if (ex.InnerException != null)
    {
        Exception cause = ex.InnerException;
    }
}
catch (System.Net.Http.HttpRequestException ex)
{
    // Check ex.InnerException for Network connectivity errors
}
```

### Error Classes

**Primary exceptions:**
* [`CventSDKException`](./src/Cvent/SDK/Models/Errors/CventSDKException.cs): The base class for HTTP error responses.
  * [`ErrorResponse`](./src/Cvent/SDK/Models/Errors/ErrorResponse.cs): Represents an error response with additional details of cascading error messages. *

<details><summary>Less common exceptions (4)</summary>

* [`System.Net.Http.HttpRequestException`](https://learn.microsoft.com/en-us/dotnet/api/system.net.http.httprequestexception): Network connectivity error. For more details about the underlying cause, inspect the `ex.InnerException`.

* Inheriting from [`CventSDKException`](./src/Cvent/SDK/Models/Errors/CventSDKException.cs):
  * [`ErrorResponseJson20`](./src/Cvent/SDK/Models/Errors/ErrorResponseJson20.cs): The error response. Applicable to 11 of 423 methods.*
  * [`BadRequestException`](./src/Cvent/SDK/Models/Errors/BadRequestException.cs): A bad token response. Status code `400`. Applicable to 1 of 423 methods.*
  * [`ResponseValidationError`](./src/Cvent/SDK/Models/Errors/ResponseValidationError.cs): Thrown when the response data could not be deserialized into the expected type.
</details>

\* Refer to the [relevant documentation](#available-resources-and-operations) to determine whether an exception applies to a specific operation.
<!-- End Error Handling [errors] -->

<!-- Start Server Selection [server] -->
## Server Selection

### Select Server by Index

You can override the default server globally by passing a server index to the `serverIndex: int` optional parameter when initializing the SDK client instance. The selected server will then be used as the default on the operations that use it. This table lists the indexes associated with the available servers:

| #   | Server                                  | Description |
| --- | --------------------------------------- | ----------- |
| 0   | `https://api-platform-eur.cvent.com/ea` |             |
| 1   | `https://api-platform.cvent.com/ea`     |             |

#### Example

```csharp
using Cvent.SDK;
using Cvent.SDK.Models.Components;
using Cvent.SDK.Models.Requests;

var sdk = new CventSDK(
    serverIndex: 0,
    security: new Security() {
        OAuth2ClientCredentials = new SchemeOAuth2ClientCredentials() {
            ClientID = "<YOUR_CLIENT_ID_HERE>",
            ClientSecret = "<YOUR_CLIENT_SECRET_HERE>",
            TokenURL = "<YOUR_TOKEN_URL_HERE>",
            Scopes = "<YOUR_SCOPES_HERE>",
        },
    }
);

GetAccountUserGroupsRequest req = new GetAccountUserGroupsRequest() {
    Token = "1a2b3c4d5e6f7g8h9i10j11k",
    Filter = "name eq 'My User Group'",
};

GetAccountUserGroupsResponse? res = await sdk.Users.GetAccountUserGroupsAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Override Server URL Per-Client

The default server can also be overridden globally by passing a URL to the `serverUrl: string` optional parameter when initializing the SDK client instance. For example:
```csharp
using Cvent.SDK;
using Cvent.SDK.Models.Components;
using Cvent.SDK.Models.Requests;

var sdk = new CventSDK(
    serverUrl: "https://api-platform.cvent.com/ea",
    security: new Security() {
        OAuth2ClientCredentials = new SchemeOAuth2ClientCredentials() {
            ClientID = "<YOUR_CLIENT_ID_HERE>",
            ClientSecret = "<YOUR_CLIENT_SECRET_HERE>",
            TokenURL = "<YOUR_TOKEN_URL_HERE>",
            Scopes = "<YOUR_SCOPES_HERE>",
        },
    }
);

GetAccountUserGroupsRequest req = new GetAccountUserGroupsRequest() {
    Token = "1a2b3c4d5e6f7g8h9i10j11k",
    Filter = "name eq 'My User Group'",
};

GetAccountUserGroupsResponse? res = await sdk.Users.GetAccountUserGroupsAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Override Server URL Per-Operation

The server URL can also be overridden on a per-operation basis, provided a server list was specified for the operation. For example:
```csharp
using Cvent.SDK;
using Cvent.SDK.Models.Components;

var sdk = new CventSDK(security: new Security() {
    OAuth2ClientCredentials = new SchemeOAuth2ClientCredentials() {
        ClientID = "<YOUR_CLIENT_ID_HERE>",
        ClientSecret = "<YOUR_CLIENT_SECRET_HERE>",
        TokenURL = "<YOUR_TOKEN_URL_HERE>",
        Scopes = "<YOUR_SCOPES_HERE>",
    },
});

CardTokenRequest req = new CardTokenRequest() {
    CreditCard = new CreditCardRequestJson() {
        AccountHolderName = "John Doe",
        ExpMonth = 11,
        ExpYear = 2026,
        Cvv = "123",
        AddressLine1 = "123 Main Street",
        AddressLine2 = "First Floor",
        AddressLine3 = "Apt 101",
        AddressCity = "McLean",
        AddressStateProvince = "VA",
        AddressPostalCode = "12345",
        AddressCountry = "USA",
        AddressCountryAlpha2 = "US",
        ContactPhone = "910-999-9999",
        Email = "jdoe@example.com",
        Number = "4111111111111111",
    },
};

var res = await sdk.CardTokens.CreateCardTokensAsync(
    request: req,
    serverUrl: "https://secure-ecommerce.api-platform.cvent.com/ea"
);

// handle response
```
<!-- End Server Selection [server] -->

<!-- Start Custom HTTP Client [http-client] -->
## Custom HTTP Client

The C# SDK makes API calls using an `ISpeakeasyHttpClient` that wraps the native
[HttpClient](https://docs.microsoft.com/en-us/dotnet/api/system.net.http.httpclient). This
client provides the ability to attach hooks around the request lifecycle that can be used to modify the request or handle
errors and response.

The `ISpeakeasyHttpClient` interface allows you to either use the default `SpeakeasyHttpClient` that comes with the SDK,
or provide your own custom implementation with customized configuration such as custom message handlers, timeouts,
connection pooling, and other HTTP client settings.

The following example shows how to create a custom HTTP client with request modification and error handling:

```csharp
using Cvent.SDK;
using Cvent.SDK.Utils;
using System.Net.Http;
using System.Threading;
using System.Threading.Tasks;

// Create a custom HTTP client
public class CustomHttpClient : ISpeakeasyHttpClient
{
    private readonly ISpeakeasyHttpClient _defaultClient;

    public CustomHttpClient()
    {
        _defaultClient = new SpeakeasyHttpClient();
    }

    public async Task<HttpResponseMessage> SendAsync(HttpRequestMessage request, CancellationToken? cancellationToken = null)
    {
        // Add custom header and timeout
        request.Headers.Add("x-custom-header", "custom value");
        request.Headers.Add("x-request-timeout", "30");

        try
        {
            var response = await _defaultClient.SendAsync(request, cancellationToken);
            // Log successful response
            Console.WriteLine($"Request successful: {response.StatusCode}");
            return response;
        }
        catch (Exception error)
        {
            // Log error
            Console.WriteLine($"Request failed: {error.Message}");
            throw;
        }
    }

    public void Dispose()
    {
        _httpClient?.Dispose();
        _defaultClient?.Dispose();
    }
}

// Use the custom HTTP client with the SDK
var customHttpClient = new CustomHttpClient();
var sdk = new CventSDK(client: customHttpClient);
```

<details>
<summary>You can also provide a completely custom HTTP client with your own configuration:</summary>

```csharp
using Cvent.SDK.Utils;
using System.Net.Http;
using System.Threading;
using System.Threading.Tasks;

// Custom HTTP client with custom configuration
public class AdvancedHttpClient : ISpeakeasyHttpClient
{
    private readonly HttpClient _httpClient;

    public AdvancedHttpClient()
    {
        var handler = new HttpClientHandler()
        {
            MaxConnectionsPerServer = 10,
            // ServerCertificateCustomValidationCallback = customCertValidation, // Custom SSL validation if needed
        };

        _httpClient = new HttpClient(handler)
        {
            Timeout = TimeSpan.FromSeconds(30)
        };
    }

    public async Task<HttpResponseMessage> SendAsync(HttpRequestMessage request, CancellationToken? cancellationToken = null)
    {
        return await _httpClient.SendAsync(request, cancellationToken ?? CancellationToken.None);
    }

    public void Dispose()
    {
        _httpClient?.Dispose();
    }
}

var sdk = CventSDK.Builder()
    .WithClient(new AdvancedHttpClient())
    .Build();
```
</details>

<details>
<summary>For simple debugging, you can enable request/response logging by implementing a custom client:</summary>

```csharp
public class LoggingHttpClient : ISpeakeasyHttpClient
{
    private readonly ISpeakeasyHttpClient _innerClient;

    public LoggingHttpClient(ISpeakeasyHttpClient innerClient = null)
    {
        _innerClient = innerClient ?? new SpeakeasyHttpClient();
    }

    public async Task<HttpResponseMessage> SendAsync(HttpRequestMessage request, CancellationToken? cancellationToken = null)
    {
        // Log request
        Console.WriteLine($"Sending {request.Method} request to {request.RequestUri}");

        var response = await _innerClient.SendAsync(request, cancellationToken);

        // Log response
        Console.WriteLine($"Received {response.StatusCode} response");

        return response;
    }

    public void Dispose() => _innerClient?.Dispose();
}

var sdk = new CventSDK(client: new LoggingHttpClient());
```
</details>

The SDK also provides built-in hook support through the `SDKConfiguration.Hooks` system, which automatically handles
`BeforeRequestAsync`, `AfterSuccessAsync`, and `AfterErrorAsync` hooks for advanced request lifecycle management.
<!-- End Custom HTTP Client [http-client] -->

<!-- Start License [license] -->
## License

This SDK is licensed under the MIT License. See [LICENSE.txt](LICENSE.txt) for the full license text and third party notices.

Use of this SDK is subject to [Cvent's Product Terms of Use](https://www.cvent.com/en/product-terms-of-use).
<!-- End License [license] -->

# Development

## Maturity

This SDK is in beta, and there may be breaking changes between versions without a major version update. Therefore, we recommend pinning usage
to a specific package version. This way, you can install the same version each time without breaking changes unless you are intentionally
looking for the latest version.

## Contributions

While we value open-source contributions to this SDK, this library is generated programmatically. Any manual changes added to internal files will be overwritten on the next generation.
We look forward to hearing your feedback. Feel free to open a PR or an issue with a proof of concept and we'll do our best to include it in a future release.

### SDK Created by [Speakeasy](https://www.speakeasy.com/?utm_source=cvent-sdk&utm_campaign=csharp)

<style>
  :root {
    --badge-gray-bg: #f3f4f6;
    --badge-gray-border: #d1d5db;
    --badge-gray-text: #374151;
    --badge-blue-bg: #eff6ff;
    --badge-blue-border: #3b82f6;
    --badge-blue-text: #3b82f6;
  }

  @media (prefers-color-scheme: dark) {
    :root {
      --badge-gray-bg: #374151;
      --badge-gray-border: #4b5563;
      --badge-gray-text: #f3f4f6;
      --badge-blue-bg: #1e3a8a;
      --badge-blue-border: #3b82f6;
      --badge-blue-text: #93c5fd;
    }
  }

  h1 {
    border-bottom: none !important;
    margin-bottom: 4px;
    margin-top: 0;
    letter-spacing: 0.5px;
    font-weight: 600;
  }

  .badge-text {
    letter-spacing: 1px;
    font-weight: 300;
  }

  .badge-container {
    display: inline-flex;
    align-items: center;
    background: var(--badge-gray-bg);
    border: 1px solid var(--badge-gray-border);
    border-radius: 6px;
    overflow: hidden;
    font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Helvetica, Arial, sans-serif;
    font-size: 11px;
    text-decoration: none;
    vertical-align: middle;
  }

  .badge-container.blue {
    background: var(--badge-blue-bg);
    border-color: var(--badge-blue-border);
  }

  .badge-icon-section {
    padding: 4px 8px;
    border-right: 1px solid var(--badge-gray-border);
    display: flex;
    align-items: center;
  }

  .badge-text-section {
    padding: 4px 10px;
    color: var(--badge-gray-text);
    font-weight: 400;
  }

  .badge-container.blue .badge-text-section {
    color: var(--badge-blue-text);
  }

  .badge-link {
    text-decoration: none;
    margin-left: 8px;
    display: inline-flex;
    vertical-align: middle;
  }

  .badge-link:hover {
    text-decoration: none;
  }

  .badge-link:first-child {
    margin-left: 0;
  }

  .badge-icon-section svg {
    color: var(--badge-gray-text);
  }

  .badge-container.blue .badge-icon-section svg {
    color: var(--badge-blue-text);
  }
</style>
<!-- Placeholder for Future Speakeasy SDK Sections -->
