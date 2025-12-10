# AttendeeMessages

## Overview

These APIs retrieve and manage attendee messages—communications exchanged between attendees within channels. Channels are virtual spaces created for one-on-one or group conversations, allowing attendees to communicate directly or in groups during an event.

### Available Operations

* [GetAttendeeMessagesMembers](#getattendeemessagesmembers) - Get Messaging Members

## GetAttendeeMessagesMembers

When attendee initiates a chat with other attendee(s), a channel is created for attendees to communicate over.
This endpoint is used to retrieve the members of these channels using channel ids to filter the results.
The results will include all the channel members; even the ones that left the channel at some point.


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getAttendeeMessagesMembers" method="get" path="/events/{eventId}/attendee-messages/members" -->
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

GetAttendeeMessagesMembersRequest req = new GetAttendeeMessagesMembersRequest() {
    EventId = "eeeeb4b4-d132-4db4-aaa7-5ec58efd65c8",
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "<value>",
};

GetAttendeeMessagesMembersResponse? res = await sdk.AttendeeMessages.GetAttendeeMessagesMembersAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [GetAttendeeMessagesMembersRequest](../../Models/Requests/GetAttendeeMessagesMembersRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[GetAttendeeMessagesMembersResponse](../../Models/Requests/GetAttendeeMessagesMembersResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |