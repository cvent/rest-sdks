# CustomFields

## Overview

Custom Fields are created by event planners to track important information about specific objects like events, contacts, or sessions. Use these APIs to view, create, and update custom fields in your account and their related details.

### Available Operations

* [ListCustomFields](#listcustomfields) - List Custom Fields
* [CreateCustomField](#createcustomfield) - Create Custom Field
* [UpdateCustomField](#updatecustomfield) - Update Custom Field
* [GetCustomField](#getcustomfield) - Get Custom Field
* [UpdateCustomFieldAdvancedLogic](#updatecustomfieldadvancedlogic) - Update Advanced Logic
* [CreateCustomFieldTranslation](#createcustomfieldtranslation) - Create Custom Fld. Translation
* [UpdateCustomFieldTranslation](#updatecustomfieldtranslation) - Update Custom Fld. Translation

## ListCustomFields

Get a paginated list of custom fields in an account.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="listCustomFields" method="get" path="/custom-fields" -->
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

ListCustomFieldsRequest req = new ListCustomFieldsRequest() {
    After = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "category eq 'Event' and lastModified gt '2021-03-19T11:30:37.909Z' and code eq 'FAVORITE_COLOR_CODE'",
};

ListCustomFieldsResponse? res = await sdk.CustomFields.ListCustomFieldsAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [ListCustomFieldsRequest](../../Models/Requests/ListCustomFieldsRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[ListCustomFieldsResponse](../../Models/Requests/ListCustomFieldsResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## CreateCustomField

Creates a single custom field based on the values provided.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="createCustomField" method="post" path="/custom-fields" -->
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

CustomField2 req = new CustomField2() {
    Category = CustomFieldCategoryJson.Contact,
    Name = "What is a your favorite color?",
    Code = "FAVORITE_COLOR_CODE",
    Type = CustomFieldTypeJson1.OpenEndedTextOneLine,
    Details = CustomField2Details.CreateOpenEndedOneLine(
        new OpenEndedOneLine() {
            AnswerFormat = "General",
            Minimum = 2,
            Maximum = 8,
        }
    ),
    HelpText = "Enter your favorite color.",
    DefaultTagText = "Your Division",
};

var res = await sdk.CustomFields.CreateCustomFieldAsync(req);

// handle response
```

### Parameters

| Parameter                                               | Type                                                    | Required                                                | Description                                             |
| ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- |
| `request`                                               | [CustomField2](../../Models/Components/CustomField2.md) | :heavy_check_mark:                                      | The request object to use for the request.              |

### Response

**[CreateCustomFieldResponse](../../Models/Requests/CreateCustomFieldResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## UpdateCustomField

Updates a custom field based on the given custom field ID.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="updateCustomField" method="put" path="/custom-fields/{customFieldId}" -->
```csharp
using Cvent.SDK;
using Cvent.SDK.Models.Components;
using Cvent.SDK.Models.Requests;
using System.Collections.Generic;

var sdk = new CventSDK(security: new Security() {
    OAuth2ClientCredentials = new SchemeOAuth2ClientCredentials() {
        ClientID = "<YOUR_CLIENT_ID_HERE>",
        ClientSecret = "<YOUR_CLIENT_SECRET_HERE>",
        TokenURL = "<YOUR_TOKEN_URL_HERE>",
        Scopes = "<YOUR_SCOPES_HERE>",
    },
});

UpdateCustomFieldRequest req = new UpdateCustomFieldRequest() {
    CustomFieldId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    ExistingCustomField = new ExistingCustomFieldInput() {
        Category = CustomFieldCategoryJson.Contact,
        Name = "What is a your favorite color?",
        Code = "FAVORITE_COLOR_CODE",
        Type = CustomFieldTypeJson1.OpenEndedTextOneLine,
        Details = ExistingCustomFieldDetailsInput.CreateThreeInput(
            new ThreeInput() {
                Choices = new List<ChoiceJson4Input>() {
                    new ChoiceJson4Input() {
                        Text = "What is your current designation?",
                    },
                },
            }
        ),
        HelpText = "Enter your favorite color.",
        DefaultTagText = "Your Division",
    },
};

var res = await sdk.CustomFields.UpdateCustomFieldAsync(req);

// handle response
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [UpdateCustomFieldRequest](../../Models/Requests/UpdateCustomFieldRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[UpdateCustomFieldResponse](../../Models/Requests/UpdateCustomFieldResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetCustomField

Get a single custom field based on the given custom field ID.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getCustomField" method="get" path="/custom-fields/{customFieldId}" -->
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

GetCustomFieldRequest req = new GetCustomFieldRequest() {
    CustomFieldId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.CustomFields.GetCustomFieldAsync(req);

// handle response
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetCustomFieldRequest](../../Models/Requests/GetCustomFieldRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetCustomFieldResponse](../../Models/Requests/GetCustomFieldResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 401, 403, 404, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## UpdateCustomFieldAdvancedLogic

Updates the advanced logic for a custom field. Links the field given in the path to a 'source' custom field. Answers to the source custom field determine the visible choices in the given custom field. If the source field has no answers, only the default choices for the given field are visible.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="updateCustomFieldAdvancedLogic" method="put" path="/custom-fields/{customFieldId}/advanced-logic" -->
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

UpdateCustomFieldAdvancedLogicRequest req = new UpdateCustomFieldAdvancedLogicRequest() {
    CustomFieldId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    AdvancedLogic = new AdvancedLogic() {
        SourceCustomFieldId = "010ad823-4cc2-4b78-8fbd-30b63ed0229d",
    },
};

var res = await sdk.CustomFields.UpdateCustomFieldAdvancedLogicAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `request`                                                                                               | [UpdateCustomFieldAdvancedLogicRequest](../../Models/Requests/UpdateCustomFieldAdvancedLogicRequest.md) | :heavy_check_mark:                                                                                      | The request object to use for the request.                                                              |

### Response

**[UpdateCustomFieldAdvancedLogicResponse](../../Models/Requests/UpdateCustomFieldAdvancedLogicResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## CreateCustomFieldTranslation

Creates translations for a single custom field based on the values provided.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="createCustomFieldTranslation" method="post" path="/custom-fields/{customFieldId}/translations" -->
```csharp
using Cvent.SDK;
using Cvent.SDK.Models.Components;
using Cvent.SDK.Models.Requests;
using System.Collections.Generic;

var sdk = new CventSDK(security: new Security() {
    OAuth2ClientCredentials = new SchemeOAuth2ClientCredentials() {
        ClientID = "<YOUR_CLIENT_ID_HERE>",
        ClientSecret = "<YOUR_CLIENT_SECRET_HERE>",
        TokenURL = "<YOUR_TOKEN_URL_HERE>",
        Scopes = "<YOUR_SCOPES_HERE>",
    },
});

CreateCustomFieldTranslationRequest req = new CreateCustomFieldTranslationRequest() {
    CustomFieldId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    Translation1 = new Translation1() {
        Translation = new Translation() {
            NameTranslation = "Departamento",
            HelpTextTranslation = "El departamento donde trabaja.",
            ChoiceTranslations = new List<ChoiceTranslationJson>() {
                new ChoiceTranslationJson() {
                    TranslatedText = "Departamento de Tecnología",
                },
            },
        },
        Language = LanguageJson.Eses,
    },
};

var res = await sdk.CustomFields.CreateCustomFieldTranslationAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [CreateCustomFieldTranslationRequest](../../Models/Requests/CreateCustomFieldTranslationRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[CreateCustomFieldTranslationResponse](../../Models/Requests/CreateCustomFieldTranslationResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## UpdateCustomFieldTranslation

Updates translations for a single custom field based on the given custom field ID.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="updateCustomFieldTranslation" method="put" path="/custom-fields/{customFieldId}/translations" -->
```csharp
using Cvent.SDK;
using Cvent.SDK.Models.Components;
using Cvent.SDK.Models.Requests;
using System.Collections.Generic;

var sdk = new CventSDK(security: new Security() {
    OAuth2ClientCredentials = new SchemeOAuth2ClientCredentials() {
        ClientID = "<YOUR_CLIENT_ID_HERE>",
        ClientSecret = "<YOUR_CLIENT_SECRET_HERE>",
        TokenURL = "<YOUR_TOKEN_URL_HERE>",
        Scopes = "<YOUR_SCOPES_HERE>",
    },
});

UpdateCustomFieldTranslationRequest req = new UpdateCustomFieldTranslationRequest() {
    CustomFieldId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    Translation1 = new Translation1() {
        Translation = new Translation() {
            NameTranslation = "Departamento",
            HelpTextTranslation = "El departamento donde trabaja.",
            ChoiceTranslations = new List<ChoiceTranslationJson>() {
                new ChoiceTranslationJson() {
                    TranslatedText = "Departamento de Tecnología",
                },
            },
        },
        Language = LanguageJson.Eses,
    },
};

var res = await sdk.CustomFields.UpdateCustomFieldTranslationAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [UpdateCustomFieldTranslationRequest](../../Models/Requests/UpdateCustomFieldTranslationRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[UpdateCustomFieldTranslationResponse](../../Models/Requests/UpdateCustomFieldTranslationResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |