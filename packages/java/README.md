# cvent-sdk

Developer-friendly & type-safe Java SDK specifically catered to leverage *cvent-sdk* API.

<!-- Start Summary [summary] -->
## Summary

Cvent REST APIs: Official Cvent SDK providing typed access to Cvent REST APIs for event management, contacts, attendees, and more using OAuth2 authentication.
For documentation, see the README and USAGE. To get credentials, visit https://developers.cvent.com/docs/rest-api/overview.


For more information about the API: [Cvent Developer Documentation](https://developers.cvent.com/docs)
<!-- End Summary [summary] -->

<!-- Start Table of Contents [toc] -->
## Table of Contents
<!-- $toc-max-depth=2 -->
* [cvent-sdk](#cvent-sdk)
  * [SDK Installation](#sdk-installation)
  * [SDK Example Usage](#sdk-example-usage)
  * [Asynchronous Support](#asynchronous-support)
  * [Authentication](#authentication)
  * [Available Resources and Operations](#available-resources-and-operations)
  * [Pagination](#pagination)
  * [Error Handling](#error-handling)
  * [Server Selection](#server-selection)
  * [Custom HTTP Client](#custom-http-client)
  * [Debugging](#debugging)
  * [License](#license)
  * [Jackson Configuration](#jackson-configuration)

<!-- End Table of Contents [toc] -->

<!-- Start SDK Installation [installation] -->
## SDK Installation

### Getting started

JDK 11 or later is required.

The samples below show how a published SDK artifact is used:

Gradle:
```groovy
implementation 'com.cvent:sdk:1.0.11'
```

Maven:
```xml
<dependency>
    <groupId>com.cvent</groupId>
    <artifactId>sdk</artifactId>
    <version>1.0.11</version>
</dependency>
```

### How to build
After cloning the git repository to your file system you can build the SDK artifact from source to the `build` directory by running `./gradlew build` on *nix systems or `gradlew.bat` on Windows systems.

If you wish to build from source and publish the SDK artifact to your local Maven repository (on your filesystem) then use the following command (after cloning the git repo locally):

On *nix:
```bash
./gradlew publishToMavenLocal -Pskip.signing
```
On Windows:
```bash
gradlew.bat publishToMavenLocal -Pskip.signing
```
<!-- End SDK Installation [installation] -->

<!-- Start SDK Example Usage [usage] -->
## SDK Example Usage

### Example

```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetAccountUserGroupsRequest;
import com.cvent.models.operations.GetAccountUserGroupsResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        CventSDK sdk = CventSDK.builder()
                .security(Security.builder()
                        .oAuth2ClientCredentials(SchemeOAuth2ClientCredentials.builder()
                                .clientID("<id>")
                                .clientSecret("<value>")
                                .tokenURL("https://api-platform.cvent.com/ea/oauth2/token")
                                .scopes(List.of(System.getenv().getOrDefault("SCOPES", "")))
                                .build())
                        .build())
                .build();

        GetAccountUserGroupsRequest req = GetAccountUserGroupsRequest.builder()
                .token("1a2b3c4d5e6f7g8h9i10j11k")
                .filter("name eq 'My User Group'")
                .build();

        sdk.users().getAccountUserGroups().callAsStream().forEach((GetAccountUserGroupsResponse item) -> {
            // handle page
        });
    }
}

```
#### Asynchronous Call
An asynchronous SDK client is also available that returns a [`CompletableFuture<T>`][comp-fut]. See [Asynchronous Support](#asynchronous-support) for more details on async benefits and reactive library integration.
```java
package hello.world;

import com.cvent.AsyncCventSDK;
import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.operations.GetAccountUserGroupsRequest;
import com.cvent.models.operations.async.GetAccountUserGroupsResponse;
import java.util.List;
import reactor.core.publisher.Flux;

public class Application {

    public static void main(String[] args) {

        AsyncCventSDK sdk = CventSDK.builder()
                .security(Security.builder()
                        .oAuth2ClientCredentials(SchemeOAuth2ClientCredentials.builder()
                                .clientID("<id>")
                                .clientSecret("<value>")
                                .tokenURL("https://api-platform.cvent.com/ea/oauth2/token")
                                .scopes(List.of(System.getenv().getOrDefault("SCOPES", "")))
                                .build())
                        .build())
                .build()
                .async();

        GetAccountUserGroupsRequest req = GetAccountUserGroupsRequest.builder()
                .token("1a2b3c4d5e6f7g8h9i10j11k")
                .filter("name eq 'My User Group'")
                .build();

        var b = sdk.users().getAccountUserGroups();

        // Example using Project Reactor (illustrative) - pages
        Flux<GetAccountUserGroupsResponse> pageFlux = Flux.from(b.callAsPublisher());
        pageFlux.subscribe(
                page -> System.out.println(page),
                error -> error.printStackTrace(),
                () -> System.out.println("Pagination completed"));
    }
}

```

[comp-fut]: https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CompletableFuture.html

#### Union Consumption Patterns

When a response field is a union model:

- Discriminated unions: branch on the discriminator (`switch`) and then narrow to the concrete type.
- Non-discriminated unions: use generated accessors (for example `string()`, `asLong()`, `simpleObject()`) to determine the active variant.

For full model-specific examples (including Java 11/16/21 variants), see each union model's **Supported Types** section in the generated model docs.
<!-- End SDK Example Usage [usage] -->

<!-- Start Asynchronous Support [async-support] -->
## Asynchronous Support

The SDK provides comprehensive asynchronous support using Java's [`CompletableFuture<T>`][comp-fut] and [Reactive Streams `Publisher<T>`][reactive-streams] APIs. This design makes no assumptions about your choice of reactive toolkit, allowing seamless integration with any reactive library.

<details>
<summary>Why Use Async?</summary>

Asynchronous operations provide several key benefits:

- **Non-blocking I/O**: Your threads stay free for other work while operations are in flight
- **Better resource utilization**: Handle more concurrent operations with fewer threads
- **Improved scalability**: Build highly responsive applications that can handle thousands of concurrent requests
- **Reactive integration**: Works seamlessly with reactive streams and backpressure handling

</details>

<details>
<summary>Reactive Library Integration</summary>

The SDK returns [Reactive Streams `Publisher<T>`][reactive-streams] instances for operations dealing with streams involving multiple I/O interactions. We use Reactive Streams instead of JDK Flow API to provide broader compatibility with the reactive ecosystem, as most reactive libraries natively support Reactive Streams.

**Why Reactive Streams over JDK Flow?**
- **Broader ecosystem compatibility**: Most reactive libraries (Project Reactor, RxJava, Akka Streams, etc.) natively support Reactive Streams
- **Industry standard**: Reactive Streams is the de facto standard for reactive programming in Java
- **Better interoperability**: Seamless integration without additional adapters for most use cases

**Integration with Popular Libraries:**
- **Project Reactor**: Use `Flux.from(publisher)` to convert to Reactor types
- **RxJava**: Use `Flowable.fromPublisher(publisher)` for RxJava integration
- **Akka Streams**: Use `Source.fromPublisher(publisher)` for Akka Streams integration
- **Vert.x**: Use `ReadStream.fromPublisher(vertx, publisher)` for Vert.x reactive streams
- **Mutiny**: Use `Multi.createFrom().publisher(publisher)` for Quarkus Mutiny integration

**For JDK Flow API Integration:**
If you need JDK Flow API compatibility (e.g., for Quarkus/Mutiny 2), you can use adapters:
```java
// Convert Reactive Streams Publisher to Flow Publisher
Flow.Publisher<T> flowPublisher = FlowAdapters.toFlowPublisher(reactiveStreamsPublisher);

// Convert Flow Publisher to Reactive Streams Publisher
Publisher<T> reactiveStreamsPublisher = FlowAdapters.toPublisher(flowPublisher);
```

For standard single-response operations, the SDK returns `CompletableFuture<T>` for straightforward async execution.

</details>

<details>
<summary>Supported Operations</summary>

Async support is available for:

- **[Server-sent Events](#server-sent-event-streaming)**: Stream real-time events with Reactive Streams `Publisher<T>`
- **[JSONL Streaming](#jsonl-streaming)**: Process streaming JSON lines asynchronously
- **[Pagination](#pagination)**: Iterate through paginated results using `callAsPublisher()` and `callAsPublisherUnwrapped()`
- **[File Uploads](#file-uploads)**: Upload files asynchronously with progress tracking
- **[File Downloads](#file-downloads)**: Download files asynchronously with streaming support
- **[Standard Operations](#example)**: All regular API calls return `CompletableFuture<T>` for async execution

</details>

[comp-fut]: https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CompletableFuture.html
[reactive-streams]: https://www.reactive-streams.org/
<!-- End Asynchronous Support [async-support] -->

<!-- Start Authentication [security] -->
## Authentication

### Per-Client Security Schemes

This SDK supports the following security schemes globally:

| Name                      | Type   | Scheme       |
| ------------------------- | ------ | ------------ |
| `oAuth2ClientCredentials` | oauth2 | OAuth2 token |
| `oAuth2AuthorizationCode` | oauth2 | OAuth2 token |

You can set the security parameters through the `security` builder method when initializing the SDK client instance. The selected scheme will be used by default to authenticate with the API for all operations that support it. For example:
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetAccountUserGroupsRequest;
import com.cvent.models.operations.GetAccountUserGroupsResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        CventSDK sdk = CventSDK.builder()
                .security(Security.builder()
                        .oAuth2ClientCredentials(SchemeOAuth2ClientCredentials.builder()
                                .clientID("<id>")
                                .clientSecret("<value>")
                                .tokenURL("https://api-platform.cvent.com/ea/oauth2/token")
                                .scopes(List.of(System.getenv().getOrDefault("SCOPES", "")))
                                .build())
                        .build())
                .build();

        GetAccountUserGroupsRequest req = GetAccountUserGroupsRequest.builder()
                .token("1a2b3c4d5e6f7g8h9i10j11k")
                .filter("name eq 'My User Group'")
                .build();

        sdk.users().getAccountUserGroups().callAsStream().forEach((GetAccountUserGroupsResponse item) -> {
            // handle page
        });
    }
}

```

### Per-Operation Security Schemes

Some operations in this SDK require the security scheme to be specified at the request level. For example:
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.errors.BadRequestException;
import com.cvent.models.operations.*;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestException, Exception {

        CventSDK sdk = CventSDK.builder().build();

        Oauth2TokenRequest req = Oauth2TokenRequest.builder()
                .grantType(GrantType.CLIENT_CREDENTIALS)
                .clientId("djc98u3jiedmi283eu928")
                .scope("event/events:read event/attendees:read")
                .redirectUri("https://example.com/redirect")
                .refreshToken("dn43ud8uj32nk2je")
                .code("AUTHORIZATION_CODE")
                .build();

        Oauth2TokenResponse res = sdk.authentication()
                .oauth2Token()
                .request(req)
                .security(Oauth2TokenSecurity.builder()
                        .username("")
                        .password("")
                        .build())
                .call();

        if (res.object().isPresent()) {
            System.out.println(res.object().get());
        }
    }
}

```
<!-- End Authentication [security] -->

<!-- Start Available Resources and Operations [operations] -->
## Available Resources and Operations

<details open>
<summary>Available methods</summary>

### [Appointments](docs/sdks/appointments/README.md)

* [listAppointmentAttendees](docs/sdks/appointments/README.md#listappointmentattendees) - List Appt Attendees
* [getAppointmentAttendeeById](docs/sdks/appointments/README.md#getappointmentattendeebyid) - Get Appt Attendee
* [listAvailability](docs/sdks/appointments/README.md#listavailability) - List Availability
* [getAvailabilityById](docs/sdks/appointments/README.md#getavailabilitybyid) - Get Availability
* [listAppointmentEvents](docs/sdks/appointments/README.md#listappointmentevents) - List Appt Events
* [getAppointmentEventById](docs/sdks/appointments/README.md#getappointmenteventbyid) - Get Appt Event
* [listAvailableTimes](docs/sdks/appointments/README.md#listavailabletimes) - List Available Times
* [listAppointmentTypes](docs/sdks/appointments/README.md#listappointmenttypes) - List Appointment Types
* [createAppointment](docs/sdks/appointments/README.md#createappointment) - Create Appointment
* [updateAppointment](docs/sdks/appointments/README.md#updateappointment) - Update Appointments
* [cancelAppointment](docs/sdks/appointments/README.md#cancelappointment) - Cancel Appointment
* [listLocations](docs/sdks/appointments/README.md#listlocations) - List Locations
* [listMeetingInterests](docs/sdks/appointments/README.md#listmeetinginterests) - List Interests
* [getMeetingInterestById](docs/sdks/appointments/README.md#getmeetinginterestbyid) - Get Interest
* [listAppointments](docs/sdks/appointments/README.md#listappointments) - List Appointments
* [getAppointmentById](docs/sdks/appointments/README.md#getappointmentbyid) - Get Appointment

### [AttendeeActivities](docs/sdks/attendeeactivities/README.md)

* [listAttendeeActivities](docs/sdks/attendeeactivities/README.md#listattendeeactivities) - List Activities
* [createAttendeeActivity](docs/sdks/attendeeactivities/README.md#createattendeeactivity) - Add External Activity
* [listExternalAttendeeActivitiesMetadata](docs/sdks/attendeeactivities/README.md#listexternalattendeeactivitiesmetadata) - List Ext. Activities Metadata
* [createExternalAttendeeActivityMetadata](docs/sdks/attendeeactivities/README.md#createexternalattendeeactivitymetadata) - Add Ext. Activities Metadata
* [deleteExternalAttendeeActivityMetadata](docs/sdks/attendeeactivities/README.md#deleteexternalattendeeactivitymetadata) - Delete Ext Activities Metadata
* [updateExternalAttendeeActivityMetadata](docs/sdks/attendeeactivities/README.md#updateexternalattendeeactivitymetadata) - Update Ext Activities Metadata

### [AttendeeInsights](docs/sdks/attendeeinsights/README.md)

* [listAttendeeInsights](docs/sdks/attendeeinsights/README.md#listattendeeinsights) - List Engagement Scores
* [getAttendeeInsightsById](docs/sdks/attendeeinsights/README.md#getattendeeinsightsbyid) - Get Engagement Score
* [getScores](docs/sdks/attendeeinsights/README.md#getscores) - Get Scores
* [getStats](docs/sdks/attendeeinsights/README.md#getstats) - Get Stats

### [AttendeeMessages](docs/sdks/attendeemessages/README.md)

* [getAttendeeMessagesMembers](docs/sdks/attendeemessages/README.md#getattendeemessagesmembers) - Get Messaging Members

### [Attendees](docs/sdks/attendees/README.md)

* [listDurations](docs/sdks/attendees/README.md#listdurations) - List Attendance Duration
* [createAttendee](docs/sdks/attendees/README.md#createattendee) - Add Attendees
* [listAttendees](docs/sdks/attendees/README.md#listattendees) - List Attendees
* [listAttendeesPostFilter](docs/sdks/attendees/README.md#listattendeespostfilter) - List Attendees
* [getAttendeeById](docs/sdks/attendees/README.md#getattendeebyid) - Get Attendee
* [updateAttendee](docs/sdks/attendees/README.md#updateattendee) - Update Attendee
* [updateAttendeeSubscriptionStatus](docs/sdks/attendees/README.md#updateattendeesubscriptionstatus) - Update Email Subscription
* [updateInternalInfoAnswers](docs/sdks/attendees/README.md#updateinternalinfoanswers) - Update Internal Information
* [postBadge](docs/sdks/attendees/README.md#postbadge) - Create Badge
* [getBadge](docs/sdks/attendees/README.md#getbadge) - Get Badge
* [getBadgesPostFilters](docs/sdks/attendees/README.md#getbadgespostfilters) - Get Badges
* [updateBadge](docs/sdks/attendees/README.md#updatebadge) - Update Badge

### [AudienceSegments](docs/sdks/audiencesegments/README.md)

* [disassociateAttendeeFromAudienceSegments](docs/sdks/audiencesegments/README.md#disassociateattendeefromaudiencesegments) - Delete Attendee Associations
* [createAudienceSegment](docs/sdks/audiencesegments/README.md#createaudiencesegment) - Create Audience Segment
* [listAudienceSegments](docs/sdks/audiencesegments/README.md#listaudiencesegments) - List Audience Segments
* [listAudienceSegmentsPostFilter](docs/sdks/audiencesegments/README.md#listaudiencesegmentspostfilter) - List Audience Segments
* [getAudienceSegmentById](docs/sdks/audiencesegments/README.md#getaudiencesegmentbyid) - Get Audience Segment
* [updateAudienceSegment](docs/sdks/audiencesegments/README.md#updateaudiencesegment) - Update Audience Segment
* [deleteAudienceSegment](docs/sdks/audiencesegments/README.md#deleteaudiencesegment) - Delete Audience Segment
* [listSegmentAssociatedAttendees](docs/sdks/audiencesegments/README.md#listsegmentassociatedattendees) - List Associated Attendees
* [associateAttendeeToSegment](docs/sdks/audiencesegments/README.md#associateattendeetosegment) - Associate Attendee to Segment
* [disassociateAttendeeFromAudienceSegment](docs/sdks/audiencesegments/README.md#disassociateattendeefromaudiencesegment) - Disassociate Attendee

### [Authentication](docs/sdks/authentication/README.md)

* [oauth2Authorize](docs/sdks/authentication/README.md#oauth2authorize) - Authorize
* [oauth2Token](docs/sdks/authentication/README.md#oauth2token) - Token
* [validateToken](docs/sdks/authentication/README.md#validatetoken) - Validate Token

### [BadgePrintJob](docs/sdks/badgeprintjob/README.md)

* [createBadgePrintJob](docs/sdks/badgeprintjob/README.md#createbadgeprintjob) - Create Badge Print Job
* [getEventBadgePrintJobs](docs/sdks/badgeprintjob/README.md#geteventbadgeprintjobs) - List Badge Print Jobs
* [getBadgePrintJob](docs/sdks/badgeprintjob/README.md#getbadgeprintjob) - Get Badge Print Job

### [BadgePrinterPools](docs/sdks/badgeprinterpools/README.md)

* [getBadgePrinterPools](docs/sdks/badgeprinterpools/README.md#getbadgeprinterpools) - List Badge Printer Pools
* [getBadgePrinterPool](docs/sdks/badgeprinterpools/README.md#getbadgeprinterpool) - Get Badge Printer Pool

### [Budget](docs/sdks/budget/README.md)

* [getAccountBudgetItems](docs/sdks/budget/README.md#getaccountbudgetitems) - List Budget Items
* [getCards](docs/sdks/budget/README.md#getcards) - List Cards
* [getCardTransactions](docs/sdks/budget/README.md#getcardtransactions) - List Card Transactions
* [createCardTransaction](docs/sdks/budget/README.md#createcardtransaction) - Create Card Transaction
* [deleteCardTransaction](docs/sdks/budget/README.md#deletecardtransaction) - Delete Card Transaction
* [updateCardTransaction](docs/sdks/budget/README.md#updatecardtransaction) - Update Card Transaction
* [getCurrencyConversionRate](docs/sdks/budget/README.md#getcurrencyconversionrate) - List Currency Conversion Rates
* [createCurrencyConversionRate](docs/sdks/budget/README.md#createcurrencyconversionrate) - Create Conversion Rate
* [updateCurrencyConversionRate](docs/sdks/budget/README.md#updatecurrencyconversionrate) - Update Conversion Rate
* [deleteCurrencyConversionRate](docs/sdks/budget/README.md#deletecurrencyconversionrate) - Delete Conversion Rate
* [getBudgetItems](docs/sdks/budget/README.md#getbudgetitems) - List Event Budget Items
* [createBudgetItem](docs/sdks/budget/README.md#createbudgetitem) - Create Budget Item
* [getBudgetAllocations](docs/sdks/budget/README.md#getbudgetallocations) - List Budget Allocations
* [updateBudgetItem](docs/sdks/budget/README.md#updatebudgetitem) - Update Budget Item
* [updateBudgetAllocations](docs/sdks/budget/README.md#updatebudgetallocations) - Update Budget Allocations
* [deleteBudgetAllocations](docs/sdks/budget/README.md#deletebudgetallocations) - Delete  Budget Allocations
* [createPayment](docs/sdks/budget/README.md#createpayment) - Create Budget Payment
* [updatePayment](docs/sdks/budget/README.md#updatepayment) - Update Budget Payment
* [deletePayment](docs/sdks/budget/README.md#deletepayment) - Delete Budget Payment
* [answerBudgetCustomField](docs/sdks/budget/README.md#answerbudgetcustomfield) - Update Budget Cstm Fld Answers
* [getPayments](docs/sdks/budget/README.md#getpayments) - List Budget Payments
* [attachInvoiceToPayment](docs/sdks/budget/README.md#attachinvoicetopayment) - Assign Invoice To Payment
* [getEventBudgetTotals](docs/sdks/budget/README.md#geteventbudgettotals) - List Budget Totals

### [Bulk](docs/sdks/bulk/README.md)

* [createBulkJob](docs/sdks/bulk/README.md#createbulkjob) - Create Bulk Job
* [getBulkJobById](docs/sdks/bulk/README.md#getbulkjobbyid) - Get Bulk Job
* [cancelBulkJob](docs/sdks/bulk/README.md#cancelbulkjob) - Cancel Bulk Job
* [uploadBulkJobData](docs/sdks/bulk/README.md#uploadbulkjobdata) - Upload Bulk Job Data
* [listBulkJobResult](docs/sdks/bulk/README.md#listbulkjobresult) - List Bulk Job Result
* [runBulkJob](docs/sdks/bulk/README.md#runbulkjob) - Run Bulk Job

### [Campaigns](docs/sdks/campaigns/README.md)

* [getCampaigns](docs/sdks/campaigns/README.md#getcampaigns) - List eMarketing Campaigns
* [getEmailTemplates](docs/sdks/campaigns/README.md#getemailtemplates) - List Email Templates
* [sendEMarketingEmails](docs/sdks/campaigns/README.md#sendemarketingemails) - Send Email To Recipients
* [getEmarketingEmailStatus](docs/sdks/campaigns/README.md#getemarketingemailstatus) - List Emarketing Email Status

### [CardTokens](docs/sdks/cardtokens/README.md)

* [createCardTokens](docs/sdks/cardtokens/README.md#createcardtokens) - Create a Credit Card Token

### [Compliance](docs/sdks/compliance/README.md)

* [getConfiguration](docs/sdks/compliance/README.md#getconfiguration) - Get Communication Config

* [updateConfiguration](docs/sdks/compliance/README.md#updateconfiguration) - Update Communication Config

* [getCommunicationLogMessages](docs/sdks/compliance/README.md#getcommunicationlogmessages) - List Communication

* [filterCommunicationLogMessages](docs/sdks/compliance/README.md#filtercommunicationlogmessages) - List Communication


### [Contacts](docs/sdks/contacts/README.md)

* [createContactGroup](docs/sdks/contacts/README.md#createcontactgroup) - Create Contact Group
* [listContactGroups](docs/sdks/contacts/README.md#listcontactgroups) - List Contact Groups
* [getContactGroupById](docs/sdks/contacts/README.md#getcontactgroupbyid) - Get Contact Group
* [updateContactGroup](docs/sdks/contacts/README.md#updatecontactgroup) - Update Contact Group
* [deleteContactGroup](docs/sdks/contacts/README.md#deletecontactgroup) - Delete Contact Group
* [getContactIdsByContactGroup](docs/sdks/contacts/README.md#getcontactidsbycontactgroup) - Get Ids in Contact Group
* [addContactToContactGroup](docs/sdks/contacts/README.md#addcontacttocontactgroup) - Add Contact To Group
* [removeContactFromContactGroup](docs/sdks/contacts/README.md#removecontactfromcontactgroup) - Remove Contact From Group
* [listContactTypes](docs/sdks/contacts/README.md#listcontacttypes) - List Contact Types
* [listContacts](docs/sdks/contacts/README.md#listcontacts) - List Contacts
* [updateContacts](docs/sdks/contacts/README.md#updatecontacts) - Update Contacts
* [patchContacts](docs/sdks/contacts/README.md#patchcontacts) - Patch Contacts
* [createContacts](docs/sdks/contacts/README.md#createcontacts) - Create Contacts
* [listContactsPostFilters](docs/sdks/contacts/README.md#listcontactspostfilters) - List Contacts
* [getContactObfuscationStatusById](docs/sdks/contacts/README.md#getcontactobfuscationstatusbyid) - Get Obfuscation Status
* [getChangeHistoryForASpecificContact](docs/sdks/contacts/README.md#getchangehistoryforaspecificcontact) - Get Contact Change History
* [getContactById](docs/sdks/contacts/README.md#getcontactbyid) - Get Contact
* [updateContactById](docs/sdks/contacts/README.md#updatecontactbyid) - Update Contact
* [patchContactById](docs/sdks/contacts/README.md#patchcontactbyid) - Patch Contact
* [deleteContactById](docs/sdks/contacts/README.md#deletecontactbyid) - Delete Contact
* [updateContactCustomFieldAnswers](docs/sdks/contacts/README.md#updatecontactcustomfieldanswers) - Update Custom Field Answers
* [mergeContacts](docs/sdks/contacts/README.md#mergecontacts) - Merge Contacts
* [obfuscateContactById](docs/sdks/contacts/README.md#obfuscatecontactbyid) - Obfuscate a Contact
* [deleteContactProfileImage](docs/sdks/contacts/README.md#deletecontactprofileimage) - Delete Contact Profile Picture
* [assignContactProfileImage](docs/sdks/contacts/README.md#assigncontactprofileimage) - Assign Contact Profile Picture
* [getContactRelationshipsById](docs/sdks/contacts/README.md#getcontactrelationshipsbyid) - Get Related Contact Ids
* [createContactRelationship](docs/sdks/contacts/README.md#createcontactrelationship) - Add Contact Relationship
* [deleteContactRelationship](docs/sdks/contacts/README.md#deletecontactrelationship) - Delete Contact Relationship

### [CustomFields](docs/sdks/customfields/README.md)

* [listCustomFields](docs/sdks/customfields/README.md#listcustomfields) - List Custom Fields
* [createCustomField](docs/sdks/customfields/README.md#createcustomfield) - Create Custom Field
* [updateCustomField](docs/sdks/customfields/README.md#updatecustomfield) - Update Custom Field
* [getCustomField](docs/sdks/customfields/README.md#getcustomfield) - Get Custom Field
* [updateCustomFieldAdvancedLogic](docs/sdks/customfields/README.md#updatecustomfieldadvancedlogic) - Update Advanced Logic
* [createCustomFieldTranslation](docs/sdks/customfields/README.md#createcustomfieldtranslation) - Create Custom Fld. Translation
* [updateCustomFieldTranslation](docs/sdks/customfields/README.md#updatecustomfieldtranslation) - Update Custom Fld. Translation

### [Discounts](docs/sdks/discounts/README.md)

* [listEventDiscounts](docs/sdks/discounts/README.md#listeventdiscounts) - List Event Discounts
* [createEventDiscount](docs/sdks/discounts/README.md#createeventdiscount) - Create Event Discount
* [listDiscountedAgendaItems](docs/sdks/discounts/README.md#listdiscountedagendaitems) - List Discounted Agenda Items
* [updateEventDiscount](docs/sdks/discounts/README.md#updateeventdiscount) - Update Event Discount
* [linkAgendaItemToDiscount](docs/sdks/discounts/README.md#linkagendaitemtodiscount) - Link Agenda Item to Discount
* [unlinkAgendaItemFromDiscount](docs/sdks/discounts/README.md#unlinkagendaitemfromdiscount) - Unlink Agenda Item Discount

### [Emails](docs/sdks/emails/README.md)

* [getBounceDetails](docs/sdks/emails/README.md#getbouncedetails) - List Email Bounces
* [getEmailsHistory](docs/sdks/emails/README.md#getemailshistory) - Get Emails History Data
* [~~getEmailStatus~~](docs/sdks/emails/README.md#getemailstatus) - List Email Status :warning: **Deprecated**

### [EventCredits](docs/sdks/eventcredits/README.md)

* [getAttendeeCredits](docs/sdks/eventcredits/README.md#getattendeecredits) - List Attendee Event Credits

### [EventFeatures](docs/sdks/eventfeatures/README.md)

* [getEventFeatures](docs/sdks/eventfeatures/README.md#geteventfeatures) - List Event Features
* [updateEventFeatures](docs/sdks/eventfeatures/README.md#updateeventfeatures) - Update Event Feature
* [launchEventFeatures](docs/sdks/eventfeatures/README.md#launcheventfeatures) - Launch Event Feature
* [listEventWeblinks](docs/sdks/eventfeatures/README.md#listeventweblinks) - List Event Weblinks

### [EventRole](docs/sdks/eventrole/README.md)

* [listEventRoleAssignment](docs/sdks/eventrole/README.md#listeventroleassignment) - List Event Role Assignments

### [EventTravel](docs/sdks/eventtravel/README.md)

* [getAirActualDetail](docs/sdks/eventtravel/README.md#getairactualdetail) - Get Air Actual
* [getAirRequests](docs/sdks/eventtravel/README.md#getairrequests) - Get Air Requests
* [getAlternateTravelAnswers](docs/sdks/eventtravel/README.md#getalternatetravelanswers) - Get Alternate Travel Answers
* [getHotelRequests](docs/sdks/eventtravel/README.md#gethotelrequests) - Get Hotel Requests
* [getHousingReservationRequests](docs/sdks/eventtravel/README.md#gethousingreservationrequests) - Get Housing Requests

### [Events](docs/sdks/events/README.md)

* [listAdmissionItems](docs/sdks/events/README.md#listadmissionitems) - List Admission Items
* [listAdmissionItemsPostFilters](docs/sdks/events/README.md#listadmissionitemspostfilters) - List Admission Items
* [getEventQuestions](docs/sdks/events/README.md#geteventquestions) - List Event Questions
* [getChoicesForQuestion](docs/sdks/events/README.md#getchoicesforquestion) - Get Question Choices
* [getEvents](docs/sdks/events/README.md#getevents) - List Events
* [createEventAsync](docs/sdks/events/README.md#createeventasync) - Create Event Async
* [getEventAsyncStatus](docs/sdks/events/README.md#geteventasyncstatus) - Get Event Async Status
* [getEventCopyStatus](docs/sdks/events/README.md#geteventcopystatus) - Get Event Copy Status
* [sendEventEmails](docs/sdks/events/README.md#sendeventemails) - Send Email To Attendees
* [getEventEmailStatus](docs/sdks/events/README.md#geteventemailstatus) - List Event Email Status
* [getEventsPostFilters](docs/sdks/events/README.md#geteventspostfilters) - List Events
* [getEventById](docs/sdks/events/README.md#geteventbyid) - Get Event
* [updateEvent](docs/sdks/events/README.md#updateevent) - Update Event
* [eventCheckIn](docs/sdks/events/README.md#eventcheckin) - Event Check-In
* [deleteEventCheckIn](docs/sdks/events/README.md#deleteeventcheckin) - Remove Check-In
* [copyEvent](docs/sdks/events/README.md#copyevent) - Copy Event
* [answerEventCustomField](docs/sdks/events/README.md#answereventcustomfield) - Event Custom Field Answers
* [listDonationItems](docs/sdks/events/README.md#listdonationitems) - List Donation Items
* [listDonationItemsPostFilter](docs/sdks/events/README.md#listdonationitemspostfilter) - List Donation Items
* [listEventEmails](docs/sdks/events/README.md#listeventemails) - List Event Emails
* [listFeeItems](docs/sdks/events/README.md#listfeeitems) - List Fee Items
* [getInvitationList](docs/sdks/events/README.md#getinvitationlist) - List Invitation Lists
* [listMembershipItems](docs/sdks/events/README.md#listmembershipitems) - List Membership Items
* [getOrders](docs/sdks/events/README.md#getorders) - List Orders
* [getOrderItems](docs/sdks/events/README.md#getorderitems) - List Order Items
* [associateDiscountCodeToOrderItem](docs/sdks/events/README.md#associatediscountcodetoorderitem) - Assign Discount to Order Item
* [getEventPlanningDocuments](docs/sdks/events/README.md#geteventplanningdocuments) - List Event Planning Documents
* [listQuantityItems](docs/sdks/events/README.md#listquantityitems) - List Quantity Items
* [listQuantityItemsPostFilter](docs/sdks/events/README.md#listquantityitemspostfilter) - List Quantity Items
* [listRegistrationPaths](docs/sdks/events/README.md#listregistrationpaths) - List Registration Paths
* [listRegistrationTypes](docs/sdks/events/README.md#listregistrationtypes) - List Registration Types
* [updateRegistrationType](docs/sdks/events/README.md#updateregistrationtype) - Update Event Registration Type
* [getTransactions](docs/sdks/events/README.md#gettransactions) - List Transactions
* [postTransactions](docs/sdks/events/README.md#posttransactions) - Create Transactions
* [getTransactionItems](docs/sdks/events/README.md#gettransactionitems) - List Transaction Items
* [listEventUserGroups](docs/sdks/events/README.md#listeventusergroups) - List Event User Groups
* [associateEventUserGroup](docs/sdks/events/README.md#associateeventusergroup) - Associate User Group to Event
* [disassociateEventUserGroup](docs/sdks/events/README.md#disassociateeventusergroup) - Disassociate Group from Event
* [updateQuantityItemRegistrationForAttendee](docs/sdks/events/README.md#updatequantityitemregistrationforattendee) - Update Quantity Item
* [listSessionsAttendance](docs/sdks/events/README.md#listsessionsattendance) - Session Attendance
* [listSessionsEnrollment](docs/sdks/events/README.md#listsessionsenrollment) - List Session Registrants
* [listSessionsEnrollmentPostFilter](docs/sdks/events/README.md#listsessionsenrollmentpostfilter) - List Session Registrants
* [deleteSessionAttendance](docs/sdks/events/README.md#deletesessionattendance) - Del Session Check-in
* [sessionCheckIn](docs/sdks/events/README.md#sessioncheckin) - Session Check-In
* [updateSessionCheckIn](docs/sdks/events/README.md#updatesessioncheckin) - Update Session Check-In
* [createSessionEnrollment](docs/sdks/events/README.md#createsessionenrollment) - Create Session Registration
* [deleteSessionEnrollment](docs/sdks/events/README.md#deletesessionenrollment) - Delete Session Registration

### [EventsPlusHub](docs/sdks/eventsplushub/README.md)

* [listHubs](docs/sdks/eventsplushub/README.md#listhubs) - List Events+ Hubs
* [getHubMembers](docs/sdks/eventsplushub/README.md#gethubmembers) - Get Events+ Hub Members

### [Exhibitor](docs/sdks/exhibitor/README.md)

* [getExhibitorCategories](docs/sdks/exhibitor/README.md#getexhibitorcategories) - List Exhibitor Categories
* [createExhibitorCategory](docs/sdks/exhibitor/README.md#createexhibitorcategory) - Create Exhibitor Category
* [updateExhibitorCategory](docs/sdks/exhibitor/README.md#updateexhibitorcategory) - Update Exhibitor Category
* [deleteExhibitorCategory](docs/sdks/exhibitor/README.md#deleteexhibitorcategory) - Delete Exhibitor Category
* [updateExhibitorCategoryBanner](docs/sdks/exhibitor/README.md#updateexhibitorcategorybanner) - Assign Banner to Category
* [deleteExhibitorCategoryImage](docs/sdks/exhibitor/README.md#deleteexhibitorcategoryimage) - Delete Banner from Category
* [listExhibitors](docs/sdks/exhibitor/README.md#listexhibitors) - List Category's Exhibitors
* [addExhibitorToExhibitorCategory](docs/sdks/exhibitor/README.md#addexhibitortoexhibitorcategory) - Assign Exhibitor to Category
* [removeExhibitorFromExhibitorCategory](docs/sdks/exhibitor/README.md#removeexhibitorfromexhibitorcategory) - Delete Exhibitor from Category
* [getExhibitorQuestions](docs/sdks/exhibitor/README.md#getexhibitorquestions) - List Exhibitor Questions
* [getExhibitors](docs/sdks/exhibitor/README.md#getexhibitors) - List Exhibitors
* [createExhibitor](docs/sdks/exhibitor/README.md#createexhibitor) - Create Exhibitor
* [getExhibitor](docs/sdks/exhibitor/README.md#getexhibitor) - Get Exhibitor
* [updateExhibitor](docs/sdks/exhibitor/README.md#updateexhibitor) - Update Exhibitor
* [deleteExhibitor](docs/sdks/exhibitor/README.md#deleteexhibitor) - Delete Exhibitor
* [updateExhibitorBanner](docs/sdks/exhibitor/README.md#updateexhibitorbanner) - Assign Exhibitor Banner Image
* [deleteExhibitorBanner](docs/sdks/exhibitor/README.md#deleteexhibitorbanner) - Delete Exhibitor Banner Image
* [getExhibitorAnswers](docs/sdks/exhibitor/README.md#getexhibitoranswers) - List Exhibitor Answers
* [updateExhibitorAnswers](docs/sdks/exhibitor/README.md#updateexhibitoranswers) - Update Exhibitor Answers
* [listExhibitorCategories](docs/sdks/exhibitor/README.md#listexhibitorcategories) - List Exhibitor's Categories
* [updateExhibitorLogo](docs/sdks/exhibitor/README.md#updateexhibitorlogo) - Assign Exhibitor Logo Image
* [deleteExhibitorLogo](docs/sdks/exhibitor/README.md#deleteexhibitorlogo) - Delete Exhibitor Logo Image
* [getLeadQualificationQuestions](docs/sdks/exhibitor/README.md#getleadqualificationquestions) - List Qualification Questions
* [postRegistrationPack](docs/sdks/exhibitor/README.md#postregistrationpack) - Create Registration Pack
* [getExhibitorRegistrationPacks](docs/sdks/exhibitor/README.md#getexhibitorregistrationpacks) - List Registration Packs
* [getRegistrationPack](docs/sdks/exhibitor/README.md#getregistrationpack) - Get Registration Pack
* [updateRegistrationPack](docs/sdks/exhibitor/README.md#updateregistrationpack) - Update Registration Pack
* [deleteRegistrationPack](docs/sdks/exhibitor/README.md#deleteregistrationpack) - Delete Registration Pack
* [getSponsorshipLevels](docs/sdks/exhibitor/README.md#getsponsorshiplevels) - List Sponsorship Levels
* [getSponsorshipLevel](docs/sdks/exhibitor/README.md#getsponsorshiplevel) - Get Sponsorship Level

### [ExhibitorContent](docs/sdks/exhibitorcontent/README.md)

* [listExhibitorFiles](docs/sdks/exhibitorcontent/README.md#listexhibitorfiles) - List Exhibitor Files
* [getExhibitorFile](docs/sdks/exhibitorcontent/README.md#getexhibitorfile) - Get Exhibitor File
* [updateExhibitorFile](docs/sdks/exhibitorcontent/README.md#updateexhibitorfile) - Associate Exhibitor File
* [disassociateExhibitorFile](docs/sdks/exhibitorcontent/README.md#disassociateexhibitorfile) - Disassociate Exhibitor File
* [listExhibitorWeblinks](docs/sdks/exhibitorcontent/README.md#listexhibitorweblinks) - List Exhibitor Weblinks
* [createExhibitorWeblink](docs/sdks/exhibitorcontent/README.md#createexhibitorweblink) - Create Exhibitor Weblink
* [getExhibitorWeblink](docs/sdks/exhibitorcontent/README.md#getexhibitorweblink) - Get Exhibitor Weblink
* [updateExhibitorWeblink](docs/sdks/exhibitorcontent/README.md#updateexhibitorweblink) - Update Exhibitor Weblink
* [deleteExhibitorWeblink](docs/sdks/exhibitorcontent/README.md#deleteexhibitorweblink) - Delete Exhibitor Weblink

### [ExhibitorTeam](docs/sdks/exhibitorteam/README.md)

* [listExhibitorAdmins](docs/sdks/exhibitorteam/README.md#listexhibitoradmins) - List Exhibitor Admins
* [postExhibitorAdmin](docs/sdks/exhibitorteam/README.md#postexhibitoradmin) - Create Exhibitor Admin
* [getExhibitorAdmin](docs/sdks/exhibitorteam/README.md#getexhibitoradmin) - Get Exhibitor Admin
* [updateExhibitorAdmin](docs/sdks/exhibitorteam/README.md#updateexhibitoradmin) - Update Exhibitor Admin
* [listBoothStaff](docs/sdks/exhibitorteam/README.md#listboothstaff) - List Booth Staff
* [associateBoothStaff](docs/sdks/exhibitorteam/README.md#associateboothstaff) - Create Booth Staff
* [getBoothStaff](docs/sdks/exhibitorteam/README.md#getboothstaff) - Get Booth Staff member
* [deleteBoothStaff](docs/sdks/exhibitorteam/README.md#deleteboothstaff) - Delete Booth Staff member

### [File](docs/sdks/file/README.md)

* [uploadFile](docs/sdks/file/README.md#uploadfile) - Upload a File
* [getFile](docs/sdks/file/README.md#getfile) - Get File Location

### [Hooks](docs/sdks/hooks/README.md)

* [listContactHooks](docs/sdks/hooks/README.md#listcontacthooks) - List Contact Hooks
* [createContactHook](docs/sdks/hooks/README.md#createcontacthook) - Create Contact Hook
* [updateContactHook](docs/sdks/hooks/README.md#updatecontacthook) - Update Contact Hook
* [deleteContactHook](docs/sdks/hooks/README.md#deletecontacthook) - Delete Contact Hook

### [Housing](docs/sdks/housing/README.md)

* [createConnection](docs/sdks/housing/README.md#createconnection) - Create Connection
* [getHousingEventsSummaries](docs/sdks/housing/README.md#gethousingeventssummaries) - Get Housing Events Summaries
* [getHousingEventInfo](docs/sdks/housing/README.md#gethousingeventinfo) - Get Housing Event Info
* [getHousingEventHotels](docs/sdks/housing/README.md#gethousingeventhotels) - Get Housing Event Hotels
* [getHousingEventHotel](docs/sdks/housing/README.md#gethousingeventhotel) - Get Housing Event Hotel
* [getHousingEventHotelAvailability](docs/sdks/housing/README.md#gethousingeventhotelavailability) - Get Event Hotel Availability
* [getHousingEventRoomTypes](docs/sdks/housing/README.md#gethousingeventroomtypes) - Get Housing Event Room Types
* [getRoomTypeDetails](docs/sdks/housing/README.md#getroomtypedetails) - Get Room Type Details
* [getRoomTypeInventory](docs/sdks/housing/README.md#getroomtypeinventory) - Get Room Type Inventory
* [getHousingEventInventory](docs/sdks/housing/README.md#gethousingeventinventory) - Get Housing Event Inventory
* [getHousingEventReservations](docs/sdks/housing/README.md#gethousingeventreservations) - Get Housing Event Reservations
* [createReservationRequest](docs/sdks/housing/README.md#createreservationrequest) - Create Reservation Request
* [getReservationRequest](docs/sdks/housing/README.md#getreservationrequest) - Get Reservation Request
* [updateReservationRequest](docs/sdks/housing/README.md#updatereservationrequest) - Update Reservation Request
* [cancelReservationRequest](docs/sdks/housing/README.md#cancelreservationrequest) - Cancel Reservation Request
* [linkReservation](docs/sdks/housing/README.md#linkreservation) - Link Reservation
* [unlinkReservation](docs/sdks/housing/README.md#unlinkreservation) - Unlink Reservation
* [createReservation](docs/sdks/housing/README.md#createreservation) - Create Reservation
* [getReservation](docs/sdks/housing/README.md#getreservation) - Get Reservation
* [cancelReservation](docs/sdks/housing/README.md#cancelreservation) - Cancel Reservation
* [updateReservationSync](docs/sdks/housing/README.md#updatereservationsync) - Update Reservation

### [HousingHotels](docs/sdks/housinghotels/README.md)

* [updateHotelRoomRates](docs/sdks/housinghotels/README.md#updatehotelroomrates) - Update Hotel Room Rates

### [Leads](docs/sdks/leads/README.md)

* [getEliteratureRequests](docs/sdks/leads/README.md#geteliteraturerequests) - List E-literature Requests
* [getLeadQualificationAnswers](docs/sdks/leads/README.md#getleadqualificationanswers) - List Qualification Answers
* [getLeads](docs/sdks/leads/README.md#getleads) - List Leads
* [getLeadsPostFiltersData](docs/sdks/leads/README.md#getleadspostfiltersdata) - List Leads

### [MeetingRequest](docs/sdks/meetingrequest/README.md)

* [getMeetingRequestByEventId](docs/sdks/meetingrequest/README.md#getmeetingrequestbyeventid) - Get MR by Event ID
* [listMRF](docs/sdks/meetingrequest/README.md#listmrf) - List MR Forms
* [getMRFById](docs/sdks/meetingrequest/README.md#getmrfbyid) - Get MR Form
* [createMeetingRequest](docs/sdks/meetingrequest/README.md#createmeetingrequest) - Create MR (Bulk)
* [updateMeetingRequest](docs/sdks/meetingrequest/README.md#updatemeetingrequest) - Update MR (Bulk)
* [listMeetingRequest](docs/sdks/meetingrequest/README.md#listmeetingrequest) - List MR
* [getMeetingRequestById](docs/sdks/meetingrequest/README.md#getmeetingrequestbyid) - Get MR
* [listMeetingRequestDocuments](docs/sdks/meetingrequest/README.md#listmeetingrequestdocuments) - List MR Documents

### [ProcessForm](docs/sdks/processform/README.md)

* [listProcessFormSubmission](docs/sdks/processform/README.md#listprocessformsubmission) - List Process Form Submissions

### [ProposalDraft](docs/sdks/proposaldraft/README.md)

* [createProposalDraft](docs/sdks/proposaldraft/README.md#createproposaldraft) - Beta - Create Proposal Draft

### [Seating](docs/sdks/seating/README.md)

* [listSeating](docs/sdks/seating/README.md#listseating) - List Seating
* [getEventTableAssignments](docs/sdks/seating/README.md#geteventtableassignments) - List All Seating Assignments
* [getSeating](docs/sdks/seating/README.md#getseating) - Get Seating
* [getTableAssignment](docs/sdks/seating/README.md#gettableassignment) - List Seating Assignments
* [listTables](docs/sdks/seating/README.md#listtables) - List Tables
* [getTable](docs/sdks/seating/README.md#gettable) - Get Table
* [listSeats](docs/sdks/seating/README.md#listseats) - List Seats
* [getSeat](docs/sdks/seating/README.md#getseat) - Get Seat

### [Sessions](docs/sdks/sessions/README.md)

* [getSessionLocation](docs/sdks/sessions/README.md#getsessionlocation) - List Session Locations
* [addSessionLocation](docs/sdks/sessions/README.md#addsessionlocation) - Add Session Location
* [createProgramItem](docs/sdks/sessions/README.md#createprogramitem) - Create Program Item
* [listProgramItems](docs/sdks/sessions/README.md#listprogramitems) - List Program Items
* [filterProgramItemDocuments](docs/sdks/sessions/README.md#filterprogramitemdocuments) - Filter Program Item Documents
* [listProgramItemsPostFilters](docs/sdks/sessions/README.md#listprogramitemspostfilters) - List Program Items
* [updateProgramItem](docs/sdks/sessions/README.md#updateprogramitem) - Update Program Item
* [deleteProgramItem](docs/sdks/sessions/README.md#deleteprogramitem) - Delete Session Program Item
* [~~getProgramItemDocuments~~](docs/sdks/sessions/README.md#getprogramitemdocuments) - Get Program Item Documents :warning: **Deprecated**
* [relateProgramItemToSessionDocument](docs/sdks/sessions/README.md#relateprogramitemtosessiondocument) - Add Program Item Document
* [getProgramItemSessionDocument](docs/sdks/sessions/README.md#getprogramitemsessiondocument) - Get Program Item Document
* [deleteProgramItemSessionDocument](docs/sdks/sessions/README.md#deleteprogramitemsessiondocument) - Delete Program Item Document
* [listSessionsCategories](docs/sdks/sessions/README.md#listsessionscategories) - List Session Categories
* [createSessionCategory](docs/sdks/sessions/README.md#createsessioncategory) - Create Session Categories
* [getSessionSegments](docs/sdks/sessions/README.md#getsessionsegments) - Get Session Segments
* [listSessions](docs/sdks/sessions/README.md#listsessions) - List Sessions
* [createSession](docs/sdks/sessions/README.md#createsession) - Create Session
* [listSessionsPostFilters](docs/sdks/sessions/README.md#listsessionspostfilters) - List Sessions
* [getSessionById](docs/sdks/sessions/README.md#getsessionbyid) - Get Session
* [updateSession](docs/sdks/sessions/README.md#updatesession) - Update Session
* [deleteSession](docs/sdks/sessions/README.md#deletesession) - Delete Session
* [updateSessionCustomFieldAnswers](docs/sdks/sessions/README.md#updatesessioncustomfieldanswers) - Update Custom Field Answers
* [listSessionDocs](docs/sdks/sessions/README.md#listsessiondocs) - List Session Documents
* [getSessionDoc](docs/sdks/sessions/README.md#getsessiondoc) - Get Session Document
* [addSessionDoc](docs/sdks/sessions/README.md#addsessiondoc) - Add Document To Session
* [deleteSessionDocument](docs/sdks/sessions/README.md#deletesessiondocument) - Delete Document from Session
* [listSessionSpeakers](docs/sdks/sessions/README.md#listsessionspeakers) - List Session's Speakers
* [addSpeakerToSession](docs/sdks/sessions/README.md#addspeakertosession) - Assign Speaker to Session
* [removeSpeakerFromSession](docs/sdks/sessions/README.md#removespeakerfromsession) - Delete Speaker From Session

### [Signatures](docs/sdks/signatures/README.md)

* [getSignatures](docs/sdks/signatures/README.md#getsignatures) - List Signatures

### [Speakers](docs/sdks/speakers/README.md)

* [getSessionProgramSpeakers](docs/sdks/speakers/README.md#getsessionprogramspeakers) - Get Session Program Speakers
* [listSessionProgramSpeakersPostFilters](docs/sdks/speakers/README.md#listsessionprogramspeakerspostfilters) - List Session Program Speakers
* [createSessionProgramSpeaker](docs/sdks/speakers/README.md#createsessionprogramspeaker) - Add Session Program Speaker
* [getSessionProgramSpeaker](docs/sdks/speakers/README.md#getsessionprogramspeaker) - Get Session Program Speaker
* [deleteSessionProgramSpeaker](docs/sdks/speakers/README.md#deletesessionprogramspeaker) - Delete Session Program Speaker
* [listSpeakersCategories](docs/sdks/speakers/README.md#listspeakerscategories) - List Speakers Categories
* [addSpeakerCategory](docs/sdks/speakers/README.md#addspeakercategory) - Create Speaker Category
* [listSpeakers](docs/sdks/speakers/README.md#listspeakers) - List Speakers
* [createSpeaker](docs/sdks/speakers/README.md#createspeaker) - Create Speaker
* [listSpeakersPostFilter](docs/sdks/speakers/README.md#listspeakerspostfilter) - List Speakers
* [updateSpeaker](docs/sdks/speakers/README.md#updatespeaker) - Update Speaker
* [deleteSpeaker](docs/sdks/speakers/README.md#deletespeaker) - Delete Speaker
* [listSpeakerDocs](docs/sdks/speakers/README.md#listspeakerdocs) - List Speaker's Documents
* [getSpeakerDoc](docs/sdks/speakers/README.md#getspeakerdoc) - Get a document for a speaker
* [addSpeakerDoc](docs/sdks/speakers/README.md#addspeakerdoc) - Add Document To Speaker
* [deleteSpeakerDocument](docs/sdks/speakers/README.md#deletespeakerdocument) - Delete Document From Speaker
* [deleteSpeakerProfileImage](docs/sdks/speakers/README.md#deletespeakerprofileimage) - Delete Speaker Profile Picture
* [assignSpeakerProfileImage](docs/sdks/speakers/README.md#assignspeakerprofileimage) - Assign Speaker Profile Picture
* [listSpeakerSessions](docs/sdks/speakers/README.md#listspeakersessions) - List Speaker's Sessions

### [Surveys](docs/sdks/surveys/README.md)

* [getAllEventSurveyResponses](docs/sdks/surveys/README.md#getalleventsurveyresponses) - List All Event Responses
* [getEventSurveys](docs/sdks/surveys/README.md#geteventsurveys) - List Event Surveys
* [getEventSurveyQuestions](docs/sdks/surveys/README.md#geteventsurveyquestions) - List Event Survey Questions
* [getEventSurveyRespondents](docs/sdks/surveys/README.md#geteventsurveyrespondents) - List Event Survey Respondents
* [createEventSurveyRespondent](docs/sdks/surveys/README.md#createeventsurveyrespondent) - Create Event Survey Respondent
* [updateEventSurveyRespondent](docs/sdks/surveys/README.md#updateeventsurveyrespondent) - Update Event Survey Respondent
* [createEventSurveyResponses](docs/sdks/surveys/README.md#createeventsurveyresponses) - Create Event Survey Responses
* [getEventSurveyResponses](docs/sdks/surveys/README.md#geteventsurveyresponses) - List Event Survey Responses
* [getLargeChoices](docs/sdks/surveys/README.md#getlargechoices) - List Large Choices
* [getQuestions](docs/sdks/surveys/README.md#getquestions) - List Questions
* [getRespondents](docs/sdks/surveys/README.md#getrespondents) - List Respondents
* [getResponses](docs/sdks/surveys/README.md#getresponses) - List Responses
* [getStandardSurveys](docs/sdks/surveys/README.md#getstandardsurveys) - List Standalone Surveys
* [getStandardSurveyResponses](docs/sdks/surveys/README.md#getstandardsurveyresponses) - List Stdl. Survey Responses
* [getStandardSurveyEmailTemplates](docs/sdks/surveys/README.md#getstandardsurveyemailtemplates) - List Stdl. Survey Email Templ.
* [getStandardSurveyQuestions](docs/sdks/surveys/README.md#getstandardsurveyquestions) - List Stdl. Survey Questions
* [getStandardSurveyRespondents](docs/sdks/surveys/README.md#getstandardsurveyrespondents) - List Stdl. Survey Respondents
* [createStandardSurveyRespondent](docs/sdks/surveys/README.md#createstandardsurveyrespondent) - Create Stdl. Survey Respondent
* [updateStandardSurveyRespondent](docs/sdks/surveys/README.md#updatestandardsurveyrespondent) - Update Stdl. Survey Respondent
* [sendStandardSurveyEmail](docs/sdks/surveys/README.md#sendstandardsurveyemail) - Send Standalone Survey Email
* [createStandardSurveyResponses](docs/sdks/surveys/README.md#createstandardsurveyresponses) - Create Stdl. Survey Responses
* [updateStandardSurveyResponses](docs/sdks/surveys/README.md#updatestandardsurveyresponses) - Update Stdl. Survey Responses
* [getSurvey](docs/sdks/surveys/README.md#getsurvey) - List Surveys

### [TravelAccounts](docs/sdks/travelaccounts/README.md)

* [listTravelAccounts](docs/sdks/travelaccounts/README.md#listtravelaccounts) - List Travel Accounts
* [listSupplierAccounts](docs/sdks/travelaccounts/README.md#listsupplieraccounts) - List Supplier Accounts
* [getTravelAccount](docs/sdks/travelaccounts/README.md#gettravelaccount) - Get Travel Account
* [getSupplierAccount](docs/sdks/travelaccounts/README.md#getsupplieraccount) - Get Supplier Account

### [TravelRFPs](docs/sdks/travelrfps/README.md)

* [listTravelPrograms](docs/sdks/travelrfps/README.md#listtravelprograms) - List Travel Programs
* [listTravelProgramsQuestions](docs/sdks/travelrfps/README.md#listtravelprogramsquestions) - List Travel Programs Questions
* [getTravelProgram](docs/sdks/travelrfps/README.md#gettravelprogram) - Get Travel Program
* [listTravelProgramQuestions](docs/sdks/travelrfps/README.md#listtravelprogramquestions) - List Travel Program Questions
* [getTravelProgramQuestion](docs/sdks/travelrfps/README.md#gettravelprogramquestion) - Get Travel Program Question
* [listTravelProposals](docs/sdks/travelrfps/README.md#listtravelproposals) - List Travel Proposals
* [listTravelProposalBids](docs/sdks/travelrfps/README.md#listtravelproposalbids) - List Travel Proposal Bids
* [getTravelProposalBid](docs/sdks/travelrfps/README.md#gettravelproposalbid) - Get Travel Proposal Bid
* [getTravelProposal](docs/sdks/travelrfps/README.md#gettravelproposal) - Get Travel Proposal

### [TravelSuppliers](docs/sdks/travelsuppliers/README.md)

* [propertyApiListBrands](docs/sdks/travelsuppliers/README.md#propertyapilistbrands) - List Supplier Brands
* [propertyApiGetBrand](docs/sdks/travelsuppliers/README.md#propertyapigetbrand) - Get Supplier Brand
* [propertyApiListChains](docs/sdks/travelsuppliers/README.md#propertyapilistchains) - List Supplier Chains
* [propertyApiGetChain](docs/sdks/travelsuppliers/README.md#propertyapigetchain) - Get Supplier Chain
* [propertyApiListProperties](docs/sdks/travelsuppliers/README.md#propertyapilistproperties) - List Supplier Properties
* [propertyApiGetProperty](docs/sdks/travelsuppliers/README.md#propertyapigetproperty) - Get Supplier Property
* [btApiGetPropertyRooms](docs/sdks/travelsuppliers/README.md#btapigetpropertyrooms) - List Supplier Property Rooms
* [propertyApiGetPropertyRoom](docs/sdks/travelsuppliers/README.md#propertyapigetpropertyroom) - Get Supplier Property Room

### [Usage](docs/sdks/usage/README.md)

* [getUsage](docs/sdks/usage/README.md#getusage) - Get Current Usage
* [getUsageTier](docs/sdks/usage/README.md#getusagetier) - Get Current Usage Tier

### [UserSCIM](docs/sdks/userscim/README.md)

* [getUserGroups](docs/sdks/userscim/README.md#getusergroups) - Get SCIM Groups
* [getResourceTypes](docs/sdks/userscim/README.md#getresourcetypes) - List Resource Types
* [getResourceType](docs/sdks/userscim/README.md#getresourcetype) - Get Resource Type
* [getSchemas](docs/sdks/userscim/README.md#getschemas) - List Schemas
* [getSchema](docs/sdks/userscim/README.md#getschema) - Get Schema
* [getServiceProviderConfig](docs/sdks/userscim/README.md#getserviceproviderconfig) - Get Service Provider Config
* [createUser](docs/sdks/userscim/README.md#createuser) - Create User
* [listUsers](docs/sdks/userscim/README.md#listusers) - List Users
* [getUser](docs/sdks/userscim/README.md#getuser) - Get User
* [updateUser](docs/sdks/userscim/README.md#updateuser) - Update User
* [deleteUser](docs/sdks/userscim/README.md#deleteuser) - Delete User

### [Users](docs/sdks/users/README.md)

* [getAccountUserGroups](docs/sdks/users/README.md#getaccountusergroups) - List Account User Groups
* [createAccountUserGroup](docs/sdks/users/README.md#createaccountusergroup) - Create Account User Group
* [getAccountUserGroup](docs/sdks/users/README.md#getaccountusergroup) - Get Account User Group
* [updateAccountUserGroup](docs/sdks/users/README.md#updateaccountusergroup) - Update Account User Group
* [deleteAccountUserGroup](docs/sdks/users/README.md#deleteaccountusergroup) - Delete Account User Group
* [addUserToAccountUserGroup](docs/sdks/users/README.md#addusertoaccountusergroup) - Associate User to Group
* [deleteUserFromAccountUserGroup](docs/sdks/users/README.md#deleteuserfromaccountusergroup) - Delete User from Group

### [Video](docs/sdks/video/README.md)

* [listVideos](docs/sdks/video/README.md#listvideos) - List Videos
* [getVideoViews](docs/sdks/video/README.md#getvideoviews) - List Video Views
* [listAudioTracks](docs/sdks/video/README.md#listaudiotracks) - List Audio Tracks
* [listVideoRenditions](docs/sdks/video/README.md#listvideorenditions) - List Video Renditions
* [createTextTrack](docs/sdks/video/README.md#createtexttrack) - Create Text Track
* [listVideoTextTracks](docs/sdks/video/README.md#listvideotexttracks) - List Text Tracks
* [updateTextTrack](docs/sdks/video/README.md#updatetexttrack) - Update Text Track

### [Webcasts](docs/sdks/webcasts/README.md)

* [createWebcast](docs/sdks/webcasts/README.md#createwebcast) - Create Webcast
* [listWebcasts](docs/sdks/webcasts/README.md#listwebcasts) - List Webcasts
* [listAttendeeLinks](docs/sdks/webcasts/README.md#listattendeelinks) - List Attendee Links
* [listPlayers](docs/sdks/webcasts/README.md#listplayers) - List Players
* [getWebcastById](docs/sdks/webcasts/README.md#getwebcastbyid) - Get Webcast
* [deleteWebcast](docs/sdks/webcasts/README.md#deletewebcast) - Delete Webcast
* [updateWebcast](docs/sdks/webcasts/README.md#updatewebcast) - Update Webcast
* [createAttendeeLinks](docs/sdks/webcasts/README.md#createattendeelinks) - Create Attendee Link
* [updateAttendeeLinks](docs/sdks/webcasts/README.md#updateattendeelinks) - Update Attendee Link
* [~~listWebcastAttendeeLinks~~](docs/sdks/webcasts/README.md#listwebcastattendeelinks) - List Attendee Links :warning: **Deprecated**
* [deleteAttendeeLink](docs/sdks/webcasts/README.md#deleteattendeelink) - Delete Attendee Link

</details>
<!-- End Available Resources and Operations [operations] -->

<!-- Start Pagination [pagination] -->
## Pagination

Some of the endpoints in this SDK support pagination. To use pagination, you can make your SDK calls using the `callAsIterable` or `callAsStream` methods.
For certain operations, you can also use the `callAsStreamUnwrapped` method that streams individual page items directly.

Here's an example depicting the different ways to use pagination:

```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetAccountUserGroupsRequest;
import com.cvent.models.operations.GetAccountUserGroupsResponse;
import java.lang.Exception;
import java.lang.Iterable;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        CventSDK sdk = CventSDK.builder()
                .security(Security.builder()
                        .oAuth2ClientCredentials(SchemeOAuth2ClientCredentials.builder()
                                .clientID("<id>")
                                .clientSecret("<value>")
                                .tokenURL("https://api-platform.cvent.com/ea/oauth2/token")
                                .scopes(List.of(System.getenv().getOrDefault("SCOPES", "")))
                                .build())
                        .build())
                .build();

        GetAccountUserGroupsRequest req = GetAccountUserGroupsRequest.builder()
                .token("1a2b3c4d5e6f7g8h9i10j11k")
                .filter("name eq 'My User Group'")
                .build();

        var b = sdk.users().getAccountUserGroups();

        // Iterate through all pages using a traditional for-each loop
        // Each iteration returns a complete page response
        Iterable<GetAccountUserGroupsResponse> iterable = b.callAsIterable();
        for (GetAccountUserGroupsResponse page : iterable) {
            // handle page
        }

        // Stream through all pages and process individual items
        // callAsStreamUnwrapped() flattens pages into individual items

        // Stream through pages without unwrapping (each item is a complete page)
        b.callAsStream().forEach((GetAccountUserGroupsResponse page) -> {
            // handle page
        });
    }
}

```
#### Asynchronous Pagination
An asynchronous SDK client is also available for pagination that returns a [`Flow.Publisher<T>`][flow-pub]. For async pagination, you can use `callAsPublisher()` to get pages as a publisher, or `callAsPublisherUnwrapped()` to get individual items directly. See [Asynchronous Support](#asynchronous-support) for more details on async benefits and reactive library integration.
```java
package hello.world;

import com.cvent.AsyncCventSDK;
import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.operations.GetAccountUserGroupsRequest;
import com.cvent.models.operations.async.GetAccountUserGroupsResponse;
import java.util.List;
import reactor.core.publisher.Flux;

public class Application {

    public static void main(String[] args) {

        AsyncCventSDK sdk = CventSDK.builder()
                .security(Security.builder()
                        .oAuth2ClientCredentials(SchemeOAuth2ClientCredentials.builder()
                                .clientID("<id>")
                                .clientSecret("<value>")
                                .tokenURL("https://api-platform.cvent.com/ea/oauth2/token")
                                .scopes(List.of(System.getenv().getOrDefault("SCOPES", "")))
                                .build())
                        .build())
                .build()
                .async();

        GetAccountUserGroupsRequest req = GetAccountUserGroupsRequest.builder()
                .token("1a2b3c4d5e6f7g8h9i10j11k")
                .filter("name eq 'My User Group'")
                .build();

        var b = sdk.users().getAccountUserGroups();

        // Example using Project Reactor (illustrative) - pages
        Flux<GetAccountUserGroupsResponse> pageFlux = Flux.from(b.callAsPublisher());
        pageFlux.subscribe(
                page -> System.out.println(page),
                error -> error.printStackTrace(),
                () -> System.out.println("Pagination completed"));
    }
}

```

[flow-pub]: https://docs.oracle.com/javase/9/docs/api/java/util/concurrent/Flow.Publisher.html
<!-- End Pagination [pagination] -->

<!-- Start Error Handling [errors] -->
## Error Handling

Handling errors in this SDK should largely match your expectations. All operations return a response object or raise an exception.


[`CventSDKError`](./src/main/java/models/errors/CventSDKError.java) is the base class for all HTTP error responses. It has the following properties:

| Method           | Type                        | Description                                                              |
| ---------------- | --------------------------- | ------------------------------------------------------------------------ |
| `message()`      | `String`                    | Error message                                                            |
| `code()`         | `int`                       | HTTP response status code eg `404`                                       |
| `headers`        | `Map<String, List<String>>` | HTTP response headers                                                    |
| `body()`         | `byte[]`                    | HTTP body as a byte array. Can be empty array if no body is returned.    |
| `bodyAsString()` | `String`                    | HTTP body as a UTF-8 string. Can be empty string if no body is returned. |
| `rawResponse()`  | `HttpResponse<?>`           | Raw HTTP response (body already read and not available for re-read)      |

### Example
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.CventSDKError;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetAccountUserGroupsRequest;
import com.cvent.models.operations.GetAccountUserGroupsResponse;
import java.io.UncheckedIOException;
import java.lang.Exception;
import java.lang.String;
import java.util.List;
import java.util.Optional;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        CventSDK sdk = CventSDK.builder()
                .security(Security.builder()
                        .oAuth2ClientCredentials(SchemeOAuth2ClientCredentials.builder()
                                .clientID("<id>")
                                .clientSecret("<value>")
                                .tokenURL("https://api-platform.cvent.com/ea/oauth2/token")
                                .scopes(List.of(System.getenv().getOrDefault("SCOPES", "")))
                                .build())
                        .build())
                .build();
        try {

            GetAccountUserGroupsRequest req = GetAccountUserGroupsRequest.builder()
                    .token("1a2b3c4d5e6f7g8h9i10j11k")
                    .filter("name eq 'My User Group'")
                    .build();

            sdk.users().getAccountUserGroups().callAsStream().forEach((GetAccountUserGroupsResponse item) -> {
                // handle page
            });

        } catch (CventSDKError ex) { // all SDK exceptions inherit from CventSDKError

            // ex.ToString() provides a detailed error message including
            // HTTP status code, headers, and error payload (if any)
            System.out.println(ex);

            // Base exception fields
            var rawResponse = ex.rawResponse();
            var headers = ex.headers();
            var contentType = headers.first("Content-Type");
            int statusCode = ex.code();
            Optional<byte[]> responseBody = ex.body();

            // different error subclasses may be thrown
            // depending on the service call
            if (ex instanceof ErrorResponse) {
                var e = (ErrorResponse) ex;
                // Check error data fields
                e.data().ifPresent(payload -> {
                    long code = payload.code();
                    String message = payload.message();
                    // ...
                });
            }

            // An underlying cause may be provided. If the error payload
            // cannot be deserialized then the deserialization exception
            // will be set as the cause.
            if (ex.getCause() != null) {
                var cause = ex.getCause();
            }
        } catch (UncheckedIOException ex) {
            // handle IO error (connection, timeout, etc)
        }
    }
}

```

### Error Classes
**Primary errors:**
* [`CventSDKError`](./src/main/java/models/errors/CventSDKError.java): The base class for HTTP error responses.
  * [`com.cvent.models.errors.ErrorResponse`](./src/main/java/models/errors/com.cvent.models.errors.ErrorResponse.java): Represents an error response with additional details of cascading error messages. *

<details><summary>Less common errors (9)</summary>

<br />

**Network errors:**
* `java.io.IOException` (always wrapped by `java.io.UncheckedIOException`). Commonly encountered subclasses of
`IOException` include `java.net.ConnectException`, `java.net.SocketTimeoutException`, `EOFException` (there are
many more subclasses in the JDK platform).

**Inherit from [`CventSDKError`](./src/main/java/models/errors/CventSDKError.java)**:
* [`com.cvent.models.errors.ErrorResponseJson20`](./src/main/java/models/errors/com.cvent.models.errors.ErrorResponseJson20.java): The error response. Applicable to 11 of 427 methods.*
* [`com.cvent.models.errors.SegmentsErrorResponse`](./src/main/java/models/errors/com.cvent.models.errors.SegmentsErrorResponse.java): Segments error response details. Status code `400`. Applicable to 2 of 427 methods.*
* [`com.cvent.models.errors.BadRequestException`](./src/main/java/models/errors/com.cvent.models.errors.BadRequestException.java): A bad token response. Status code `400`. Applicable to 1 of 427 methods.*


</details>

\* Check [the method documentation](#available-resources-and-operations) to see if the error is applicable.
<!-- End Error Handling [errors] -->

<!-- Start Server Selection [server] -->
## Server Selection

### Select Server by Index

You can override the default server globally using the `.serverIndex(int serverIdx)` builder method when initializing the SDK client instance. The selected server will then be used as the default on the operations that use it. This table lists the indexes associated with the available servers:

| #   | Server                                  | Description |
| --- | --------------------------------------- | ----------- |
| 0   | `https://api-platform.cvent.com/ea`     |             |
| 1   | `https://api-platform-eur.cvent.com/ea` |             |

#### Example

```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetAccountUserGroupsRequest;
import com.cvent.models.operations.GetAccountUserGroupsResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        CventSDK sdk = CventSDK.builder()
                .serverIndex(0)
                .security(Security.builder()
                        .oAuth2ClientCredentials(SchemeOAuth2ClientCredentials.builder()
                                .clientID("<id>")
                                .clientSecret("<value>")
                                .tokenURL("https://api-platform.cvent.com/ea/oauth2/token")
                                .scopes(List.of(System.getenv().getOrDefault("SCOPES", "")))
                                .build())
                        .build())
                .build();

        GetAccountUserGroupsRequest req = GetAccountUserGroupsRequest.builder()
                .token("1a2b3c4d5e6f7g8h9i10j11k")
                .filter("name eq 'My User Group'")
                .build();

        sdk.users().getAccountUserGroups().callAsStream().forEach((GetAccountUserGroupsResponse item) -> {
            // handle page
        });
    }
}

```

### Override Server URL Per-Client

The default server can also be overridden globally using the `.serverURL(String serverUrl)` builder method when initializing the SDK client instance. For example:
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetAccountUserGroupsRequest;
import com.cvent.models.operations.GetAccountUserGroupsResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        CventSDK sdk = CventSDK.builder()
                .serverURL("https://api-platform-eur.cvent.com/ea")
                .security(Security.builder()
                        .oAuth2ClientCredentials(SchemeOAuth2ClientCredentials.builder()
                                .clientID("<id>")
                                .clientSecret("<value>")
                                .tokenURL("https://api-platform.cvent.com/ea/oauth2/token")
                                .scopes(List.of(System.getenv().getOrDefault("SCOPES", "")))
                                .build())
                        .build())
                .build();

        GetAccountUserGroupsRequest req = GetAccountUserGroupsRequest.builder()
                .token("1a2b3c4d5e6f7g8h9i10j11k")
                .filter("name eq 'My User Group'")
                .build();

        sdk.users().getAccountUserGroups().callAsStream().forEach((GetAccountUserGroupsResponse item) -> {
            // handle page
        });
    }
}

```

### Override Server URL Per-Operation

The server URL can also be overridden on a per-operation basis, provided a server list was specified for the operation. For example:
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.CreateCardTokensResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        CventSDK sdk = CventSDK.builder()
                .security(Security.builder()
                        .oAuth2ClientCredentials(SchemeOAuth2ClientCredentials.builder()
                                .clientID("<id>")
                                .clientSecret("<value>")
                                .tokenURL("https://api-platform.cvent.com/ea/oauth2/token")
                                .scopes(List.of(System.getenv().getOrDefault("SCOPES", "")))
                                .build())
                        .build())
                .build();

        CardTokenRequest req = CardTokenRequest.builder()
                .creditCard(CreditCardRequestJson.builder()
                        .accountHolderName("John Doe")
                        .expMonth(11L)
                        .expYear(2026L)
                        .number("4111111111111111")
                        .cvv("123")
                        .addressLine1("123 Main Street")
                        .addressLine2("First Floor")
                        .addressLine3("Apt 101")
                        .addressCity("McLean")
                        .addressStateProvince("VA")
                        .addressPostalCode("12345")
                        .addressCountry("USA")
                        .addressCountryAlpha2("US")
                        .contactPhone("910-999-9999")
                        .email("jdoe@example.com")
                        .build())
                .build();

        CreateCardTokensResponse res = sdk.cardTokens()
                .createCardTokens()
                .request(req)
                .serverURL("https://secure-ecommerce.api-platform.cvent.com/ea")
                .call();

        if (res.cardTokenResponse().isPresent()) {
            System.out.println(res.cardTokenResponse().get());
        }
    }
}

```
<!-- End Server Selection [server] -->

<!-- Start Custom HTTP Client [http-client] -->
## Custom HTTP Client

The Java SDK makes API calls using an `HTTPClient` that wraps the native
[HttpClient](https://docs.oracle.com/en/java/javase/11/docs/api/java.net.http/java/net/http/HttpClient.html). This
client provides the ability to attach hooks around the request lifecycle that can be used to modify the request or handle
errors and response.

The `HTTPClient` interface allows you to either use the default `SpeakeasyHTTPClient` that comes with the SDK,
or provide your own custom implementation with customized configuration such as custom executors, SSL context,
connection pools, and other HTTP client settings.

The interface provides synchronous (`send`) methods and asynchronous (`sendAsync`) methods. The `sendAsync` method
is used to power the async SDK methods and returns a `CompletableFuture<HttpResponse<Blob>>` for non-blocking operations.

The following example shows how to add a custom header and handle errors:

```java
import com.cvent.CventSDK;
import com.cvent.utils.HTTPClient;
import com.cvent.utils.SpeakeasyHTTPClient;
import com.cvent.utils.Utils;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.io.InputStream;
import java.time.Duration;

public class Application {
    public static void main(String[] args) {
        // Create a custom HTTP client with hooks
        HTTPClient httpClient = new HTTPClient() {
            private final HTTPClient defaultClient = new SpeakeasyHTTPClient();
            
            @Override
            public HttpResponse<InputStream> send(HttpRequest request) throws IOException, URISyntaxException, InterruptedException {
                // Add custom header and timeout using Utils.copy()
                HttpRequest modifiedRequest = Utils.copy(request)
                    .header("x-custom-header", "custom value")
                    .timeout(Duration.ofSeconds(30))
                    .build();
                    
                try {
                    HttpResponse<InputStream> response = defaultClient.send(modifiedRequest);
                    // Log successful response
                    System.out.println("Request successful: " + response.statusCode());
                    return response;
                } catch (Exception error) {
                    // Log error
                    System.err.println("Request failed: " + error.getMessage());
                    throw error;
                }
            }
        };

        CventSDK sdk = CventSDK.builder()
            .client(httpClient)
            .build();
    }
}
```

<details>
<summary>Custom HTTP Client Configuration</summary>

You can also provide a completely custom HTTP client with your own configuration:

```java
import com.cvent.CventSDK;
import com.cvent.utils.HTTPClient;
import com.cvent.utils.Blob;
import com.cvent.utils.ResponseWithBody;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.io.InputStream;
import java.time.Duration;
import java.util.concurrent.Executors;
import java.util.concurrent.CompletableFuture;

public class Application {
    public static void main(String[] args) {
        // Custom HTTP client with custom configuration
        HTTPClient customHttpClient = new HTTPClient() {
            private final HttpClient client = HttpClient.newBuilder()
                .executor(Executors.newFixedThreadPool(10))
                .connectTimeout(Duration.ofSeconds(30))
                // .sslContext(customSslContext) // Add custom SSL context if needed
                .build();

            @Override
            public HttpResponse<InputStream> send(HttpRequest request) throws IOException, URISyntaxException, InterruptedException {
                return client.send(request, HttpResponse.BodyHandlers.ofInputStream());
            }

            @Override
            public CompletableFuture<HttpResponse<Blob>> sendAsync(HttpRequest request) {
                // Convert response to HttpResponse<Blob> for async operations
                return client.sendAsync(request, HttpResponse.BodyHandlers.ofPublisher())
                    .thenApply(resp -> new ResponseWithBody<>(resp, Blob::from));
            }
        };

        CventSDK sdk = CventSDK.builder()
            .client(customHttpClient)
            .build();
    }
}
```

</details>

You can also enable debug logging on the default `SpeakeasyHTTPClient`:

```java
import com.cvent.CventSDK;
import com.cvent.utils.SpeakeasyHTTPClient;

public class Application {
    public static void main(String[] args) {
        SpeakeasyHTTPClient httpClient = new SpeakeasyHTTPClient();
        httpClient.enableDebugLogging(true);

        CventSDK sdk = CventSDK.builder()
            .client(httpClient)
            .build();
    }
}
```
<!-- End Custom HTTP Client [http-client] -->

<!-- Start Debugging [debug] -->
## Debugging

### Debug

You can setup your SDK to emit debug logs for SDK requests and responses.

For request and response logging (especially json bodies), call `enableHTTPDebugLogging(boolean)` on the SDK builder like so:

```java
SDK.builder()
    .enableHTTPDebugLogging(true)
    .build();
```
Example output:
```
Sending request: http://localhost:35123/bearer#global GET
Request headers: {Accept=[application/json], Authorization=[******], Client-Level-Header=[added by client], Idempotency-Key=[some-key], x-speakeasy-user-agent=[speakeasy-sdk/java 0.0.1 internal 0.1.0 org.openapis.openapi]}
Received response: (GET http://localhost:35123/bearer#global) 200
Response headers: {access-control-allow-credentials=[true], access-control-allow-origin=[*], connection=[keep-alive], content-length=[50], content-type=[application/json], date=[Wed, 09 Apr 2025 01:43:29 GMT], server=[gunicorn/19.9.0]}
Response body:
{
  "authenticated": true, 
  "token": "global"
}
```
__WARNING__: This logging should only be used for temporary debugging purposes. Leaving this option on in a production system could expose credentials/secrets in logs. <i>Authorization</i> headers are redacted by default and there is the ability to specify redacted header names via `SpeakeasyHTTPClient.setRedactedHeaders`.

__NOTE__: This is a convenience method that calls `HTTPClient.enableDebugLogging()`. The `SpeakeasyHTTPClient` honors this setting. If you are using a custom HTTP client, it is up to the custom client to honor this setting.


Another option is to set the System property `-Djdk.httpclient.HttpClient.log=all`. However, this second option does not log bodies.
<!-- End Debugging [debug] -->

<!-- Start License [license] -->
## License

This SDK is licensed under the MIT License. See [LICENSE.txt](LICENSE.txt) for the full license text.

For information about third-party dependencies and their licenses, see [THIRD_PARTY_NOTICES](THIRD_PARTY_NOTICES).

Use of this SDK is subject to [Cvent's Product Terms of Use](https://www.cvent.com/en/product-terms-of-use).
<!-- End License [license] -->

<!-- Start Jackson Configuration [jackson] -->
## Jackson Configuration

The SDK ships with a pre-configured Jackson [`ObjectMapper`][jackson-databind] accessible via
`JSON.getMapper()`. It is set up with type modules, strict deserializers, and the feature flags
needed for full SDK compatibility (including ISO-8601 `OffsetDateTime` serialization):

```java
import com.cvent.utils.JSON;

String json = JSON.getMapper().writeValueAsString(response);
```

To compose with your own `ObjectMapper`, register the provided `SDKJacksonModule`, which
bundles all the same modules and feature flags as a single plug-and-play module:

```java
import com.cvent.utils.SDKJacksonModule;
import com.fasterxml.jackson.databind.ObjectMapper;

ObjectMapper myMapper = new ObjectMapper()
    .registerModule(new SDKJacksonModule());

String json = myMapper.writeValueAsString(response);
```

[jackson-databind]: https://github.com/FasterXML/jackson-databind
[jackson-jsr310]: https://github.com/FasterXML/jackson-modules-java8/tree/master/datetime
<!-- End Jackson Configuration [jackson] -->

<!-- Placeholder for Future Speakeasy SDK Sections -->
