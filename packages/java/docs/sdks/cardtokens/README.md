# CardTokens

## Overview

**Card Tokenization**: Tokenization is the process Cvent uses to collect sensitive card details and
personally identifiable information (PII), directly from your customers in a secure manner.
This guarantees that no sensitive card data touches your server, and allows your integration to
operate in compliance with PCI standards. A card token is a unique identifier that represents sensitive credit card information.
It is used as a secure alternative to directly handling credit card details during transactions.
The token can be used in place of the actual credit card data when making API calls, providing an extra layer of security.


### Available Operations

* [createCardTokens](#createcardtokens) - Create a Credit Card Token

## createCardTokens

Creates a short-lived token representing a credit card. This token replaces the credit card in API methods. It can be used multiple times within a 15-minute time-to-live (TTL) period. After 15 minutes, the token will expire and can no longer be used. If the same credit card is needed to perform additional API methods after the 15-minute TTL, the card will need to be resubmitted for another short-lived token.

### Example Usage

<!-- UsageSnippet language="java" operationID="createCardTokens" method="post" path="/card-tokens" -->
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

        CreateCardTokensResponse res = sdk.cardTokens().createCardTokens()
                .request(req)
                .call();

        if (res.cardTokenResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                   | Type                                                        | Required                                                    | Description                                                 |
| ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- |
| `request`                                                   | [CardTokenRequest](../../models/shared/CardTokenRequest.md) | :heavy_check_mark:                                          | The request object to use for the request.                  |
| `serverURL`                                                 | *String*                                                    | :heavy_minus_sign:                                          | An optional server URL to use.                              |

### Response

**[CreateCardTokensResponse](../../models/operations/CreateCardTokensResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |