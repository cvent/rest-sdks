# CustomFields

## Overview

Custom Fields are created by event planners to track important information about specific objects like events, contacts, or sessions. Use these APIs to view, create, and update custom fields in your account and their related details.

### Available Operations

* [listCustomFields](#listcustomfields) - List Custom Fields
* [createCustomField](#createcustomfield) - Create Custom Field
* [updateCustomField](#updatecustomfield) - Update Custom Field
* [getCustomField](#getcustomfield) - Get Custom Field
* [updateCustomFieldAdvancedLogic](#updatecustomfieldadvancedlogic) - Update Advanced Logic
* [createCustomFieldTranslation](#createcustomfieldtranslation) - Create Custom Fld. Translation
* [updateCustomFieldTranslation](#updatecustomfieldtranslation) - Update Custom Fld. Translation

## listCustomFields

Get a paginated list of custom fields in an account.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="listCustomFields" method="get" path="/custom-fields" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.ListCustomFieldsRequest;
import com.cvent.models.operations.ListCustomFieldsResponse;
import java.lang.Exception;
import java.time.OffsetDateTime;
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

        ListCustomFieldsRequest req = ListCustomFieldsRequest.builder()
                .filter("category eq 'Event' and lastModified gt '2021-03-19T11:30:37.909Z' and code eq 'FAVORITE_COLOR_CODE'")
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .build();


        sdk.customFields().listCustomFields()
                .callAsStream()
                .forEach((ListCustomFieldsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ListCustomFieldsRequest](../../models/operations/ListCustomFieldsRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ListCustomFieldsResponse](../../models/operations/ListCustomFieldsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## createCustomField

Creates a single custom field based on the values provided.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="createCustomField" method="post" path="/custom-fields" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.CreateCustomFieldResponse;
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

        CustomField2 req = CustomField2.builder()
                .category(CustomFieldCategoryJson.CONTACT)
                .name("What is a your favorite color?")
                .code("FAVORITE_COLOR_CODE")
                .type(CustomFieldTypeJson1.OPEN_ENDED_TEXT_ONE_LINE)
                .details(CustomField2Details.of(OpenEndedOneLine.builder()
                    .answerFormat("General")
                    .minimum(2L)
                    .maximum(8L)
                    .build()))
                .helpText("Enter your favorite color.")
                .defaultTagText("Your Division")
                .build();

        CreateCustomFieldResponse res = sdk.customFields().createCustomField()
                .request(req)
                .call();

        if (res.existingCustomField().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                           | Type                                                | Required                                            | Description                                         |
| --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- |
| `request`                                           | [CustomField2](../../models/shared/CustomField2.md) | :heavy_check_mark:                                  | The request object to use for the request.          |

### Response

**[CreateCustomFieldResponse](../../models/operations/CreateCustomFieldResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## updateCustomField

Updates a custom field based on the given custom field ID.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="updateCustomField" method="put" path="/custom-fields/{customFieldId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.UpdateCustomFieldRequest;
import com.cvent.models.operations.UpdateCustomFieldResponse;
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

        UpdateCustomFieldRequest req = UpdateCustomFieldRequest.builder()
                .customFieldId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .existingCustomField(ExistingCustomFieldInput.builder()
                    .category(CustomFieldCategoryJson.CONTACT)
                    .name("What is a your favorite color?")
                    .code("FAVORITE_COLOR_CODE")
                    .type(CustomFieldTypeJson1.OPEN_ENDED_TEXT_ONE_LINE)
                    .details(ExistingCustomFieldDetailsInput.of(ThreeInput.builder()
                        .choices(List.of(
                            ChoiceJson4Input.builder()
                                .text("What is your current designation?")
                                .build()))
                        .build()))
                    .helpText("Enter your favorite color.")
                    .defaultTagText("Your Division")
                    .build())
                .build();

        UpdateCustomFieldResponse res = sdk.customFields().updateCustomField()
                .request(req)
                .call();

        if (res.existingCustomField().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [UpdateCustomFieldRequest](../../models/operations/UpdateCustomFieldRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[UpdateCustomFieldResponse](../../models/operations/UpdateCustomFieldResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getCustomField

Get a single custom field based on the given custom field ID.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getCustomField" method="get" path="/custom-fields/{customFieldId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetCustomFieldRequest;
import com.cvent.models.operations.GetCustomFieldResponse;
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

        GetCustomFieldRequest req = GetCustomFieldRequest.builder()
                .customFieldId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        GetCustomFieldResponse res = sdk.customFields().getCustomField()
                .request(req)
                .call();

        if (res.existingCustomField().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetCustomFieldRequest](../../models/operations/GetCustomFieldRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetCustomFieldResponse](../../models/operations/GetCustomFieldResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 401, 403, 404, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## updateCustomFieldAdvancedLogic

Updates the advanced logic for a custom field. Links the field given in the path to a 'source' custom field. Answers to the source custom field determine the visible choices in the given custom field. If the source field has no answers, only the default choices for the given field are visible.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="updateCustomFieldAdvancedLogic" method="put" path="/custom-fields/{customFieldId}/advanced-logic" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.UpdateCustomFieldAdvancedLogicRequest;
import com.cvent.models.operations.UpdateCustomFieldAdvancedLogicResponse;
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

        UpdateCustomFieldAdvancedLogicRequest req = UpdateCustomFieldAdvancedLogicRequest.builder()
                .customFieldId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .advancedLogic(AdvancedLogic.builder()
                    .sourceCustomFieldId("010ad823-4cc2-4b78-8fbd-30b63ed0229d")
                    .build())
                .build();

        UpdateCustomFieldAdvancedLogicResponse res = sdk.customFields().updateCustomFieldAdvancedLogic()
                .request(req)
                .call();

        if (res.advancedLogic().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                 | [UpdateCustomFieldAdvancedLogicRequest](../../models/operations/UpdateCustomFieldAdvancedLogicRequest.md) | :heavy_check_mark:                                                                                        | The request object to use for the request.                                                                |

### Response

**[UpdateCustomFieldAdvancedLogicResponse](../../models/operations/UpdateCustomFieldAdvancedLogicResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## createCustomFieldTranslation

Creates translations for a single custom field based on the values provided.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="createCustomFieldTranslation" method="post" path="/custom-fields/{customFieldId}/translations" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.CreateCustomFieldTranslationRequest;
import com.cvent.models.operations.CreateCustomFieldTranslationResponse;
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

        CreateCustomFieldTranslationRequest req = CreateCustomFieldTranslationRequest.builder()
                .customFieldId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .translation1(Translation1.builder()
                    .translation(Translation.builder()
                        .nameTranslation("Departamento")
                        .helpTextTranslation("El departamento donde trabaja.")
                        .choiceTranslations(List.of(
                            ChoiceTranslationJson.builder()
                                .translatedText("Departamento de Tecnología")
                                .build()))
                        .build())
                    .language(LanguageJson.ESES)
                    .build())
                .build();

        CreateCustomFieldTranslationResponse res = sdk.customFields().createCustomFieldTranslation()
                .request(req)
                .call();

        if (res.translation1().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `request`                                                                                             | [CreateCustomFieldTranslationRequest](../../models/operations/CreateCustomFieldTranslationRequest.md) | :heavy_check_mark:                                                                                    | The request object to use for the request.                                                            |

### Response

**[CreateCustomFieldTranslationResponse](../../models/operations/CreateCustomFieldTranslationResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## updateCustomFieldTranslation

Updates translations for a single custom field based on the given custom field ID.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="updateCustomFieldTranslation" method="put" path="/custom-fields/{customFieldId}/translations" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.UpdateCustomFieldTranslationRequest;
import com.cvent.models.operations.UpdateCustomFieldTranslationResponse;
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

        UpdateCustomFieldTranslationRequest req = UpdateCustomFieldTranslationRequest.builder()
                .customFieldId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .translation1(Translation1.builder()
                    .translation(Translation.builder()
                        .nameTranslation("Departamento")
                        .helpTextTranslation("El departamento donde trabaja.")
                        .choiceTranslations(List.of(
                            ChoiceTranslationJson.builder()
                                .translatedText("Departamento de Tecnología")
                                .build()))
                        .build())
                    .language(LanguageJson.ESES)
                    .build())
                .build();

        UpdateCustomFieldTranslationResponse res = sdk.customFields().updateCustomFieldTranslation()
                .request(req)
                .call();

        if (res.translation1().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `request`                                                                                             | [UpdateCustomFieldTranslationRequest](../../models/operations/UpdateCustomFieldTranslationRequest.md) | :heavy_check_mark:                                                                                    | The request object to use for the request.                                                            |

### Response

**[UpdateCustomFieldTranslationResponse](../../models/operations/UpdateCustomFieldTranslationResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |