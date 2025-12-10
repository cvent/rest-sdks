# Compliance

## Overview

These API's provide compliance support for regulated industries.

**Communication Compliance** lets you view communication activities across your account.
Various written forms of communication are captured. For example, emails, SMS, chat messages, or push notifications
can be downloaded for archival or analysis.


### Available Operations

* [GetConfiguration](#getconfiguration) - Get Communication Config

* [UpdateConfiguration](#updateconfiguration) - Update Communication Config

* [GetCommunicationLogMessages](#getcommunicationlogmessages) - List Communication

* [FilterCommunicationLogMessages](#filtercommunicationlogmessages) - List Communication


## GetConfiguration

Gets communication compliance configuration for an account. For example, gets the communication types enabled for an account.


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getConfiguration" method="get" path="/logs/communications/configuration" -->
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

var res = await sdk.Compliance.GetConfigurationAsync();

// handle response
```

### Response

**[GetConfigurationResponse](../../Models/Requests/GetConfigurationResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## UpdateConfiguration

Update the communication compliance configuration for an account.  For example, configure which communication types will be recorded in the communication log.


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="updateConfiguration" method="put" path="/logs/communications/configuration" -->
```csharp
using Cvent.SDK;
using Cvent.SDK.Models.Components;
using System.Collections.Generic;

var sdk = new CventSDK(security: new Security() {
    OAuth2ClientCredentials = new SchemeOAuth2ClientCredentials() {
        ClientID = "<YOUR_CLIENT_ID_HERE>",
        ClientSecret = "<YOUR_CLIENT_SECRET_HERE>",
        TokenURL = "<YOUR_TOKEN_URL_HERE>",
        Scopes = "<YOUR_SCOPES_HERE>",
    },
});

CommunicationConfiguration req = new CommunicationConfiguration() {
    EnabledMessageTypes = new List<CommunicationLogMessageTypeJson>() {},
};

var res = await sdk.Compliance.UpdateConfigurationAsync(req);

// handle response
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [CommunicationConfiguration](../../Models/Components/CommunicationConfiguration.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[UpdateConfigurationResponse](../../Models/Requests/UpdateConfigurationResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetCommunicationLogMessages

Gets a paginated list of communication log messages from your account. The filter is not required. If no filter
is provided then the API will return communication log messages of all types between the specified dates.

Supported types are:

  * email
  * chat
  * session_qa


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getCommunicationLogMessages" method="get" path="/logs/communications/messages" -->
```csharp
using Cvent.SDK;
using Cvent.SDK.Models.Components;
using Cvent.SDK.Models.Requests;
using System;

var sdk = new CventSDK(security: new Security() {
    OAuth2ClientCredentials = new SchemeOAuth2ClientCredentials() {
        ClientID = "<YOUR_CLIENT_ID_HERE>",
        ClientSecret = "<YOUR_CLIENT_SECRET_HERE>",
        TokenURL = "<YOUR_TOKEN_URL_HERE>",
        Scopes = "<YOUR_SCOPES_HERE>",
    },
});

GetCommunicationLogMessagesRequest req = new GetCommunicationLogMessagesRequest() {
    After = System.DateTime.Parse("2017-01-02T02:00:00Z"),
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z"),
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "type eq 'email'",
};

GetCommunicationLogMessagesResponse? res = await sdk.Compliance.GetCommunicationLogMessagesAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [GetCommunicationLogMessagesRequest](../../Models/Requests/GetCommunicationLogMessagesRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[GetCommunicationLogMessagesResponse](../../Models/Requests/GetCommunicationLogMessagesResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## FilterCommunicationLogMessages

Gets a paginated list of communication log messages from your account. The filter in the request body is not required. If no filter
is provided then the API will return communication log messages of all types between the specified dates.

Supported types are:

  * email
  * chat
  * session_qa


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="filterCommunicationLogMessages" method="post" path="/logs/communications/messages/filter" -->
```csharp
using Cvent.SDK;
using Cvent.SDK.Models.Components;
using Cvent.SDK.Models.Requests;
using System;

var sdk = new CventSDK(security: new Security() {
    OAuth2ClientCredentials = new SchemeOAuth2ClientCredentials() {
        ClientID = "<YOUR_CLIENT_ID_HERE>",
        ClientSecret = "<YOUR_CLIENT_SECRET_HERE>",
        TokenURL = "<YOUR_TOKEN_URL_HERE>",
        Scopes = "<YOUR_SCOPES_HERE>",
    },
});

FilterCommunicationLogMessagesRequest req = new FilterCommunicationLogMessagesRequest() {
    After = System.DateTime.Parse("2017-01-02T02:00:00Z"),
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z"),
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = new Filter() {
        FilterValue = "type eq 'email'",
    },
};

FilterCommunicationLogMessagesResponse? res = await sdk.Compliance.FilterCommunicationLogMessagesAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `request`                                                                                               | [FilterCommunicationLogMessagesRequest](../../Models/Requests/FilterCommunicationLogMessagesRequest.md) | :heavy_check_mark:                                                                                      | The request object to use for the request.                                                              |

### Response

**[FilterCommunicationLogMessagesResponse](../../Models/Requests/FilterCommunicationLogMessagesResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |