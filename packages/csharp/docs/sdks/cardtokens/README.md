# CardTokens

## Overview

**Card Tokenization**: Tokenization is the process Cvent uses to collect sensitive card details and
personally identifiable information (PII), directly from your customers in a secure manner.
This guarantees that no sensitive card data touches your server, and allows your integration to
operate in compliance with PCI standards. A card token is a unique identifier that represents sensitive credit card information.
It is used as a secure alternative to directly handling credit card details during transactions.
The token can be used in place of the actual credit card data when making API calls, providing an extra layer of security.


### Available Operations

* [CreateCardTokens](#createcardtokens) - Create a Credit Card Token

## CreateCardTokens

Creates a short-lived token representing a credit card. This token replaces the credit card in API methods. It can be used multiple times within a 15-minute time-to-live (TTL) period. After 15 minutes, the token will expire and can no longer be used. If the same credit card is needed to perform additional API methods after the 15-minute TTL, the card will need to be resubmitted for another short-lived token.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="createCardTokens" method="post" path="/card-tokens" -->
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

var res = await sdk.CardTokens.CreateCardTokensAsync(req);

// handle response
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `request`                                                       | [CardTokenRequest](../../Models/Components/CardTokenRequest.md) | :heavy_check_mark:                                              | The request object to use for the request.                      |
| `serverURL`                                                     | *string*                                                        | :heavy_minus_sign:                                              | An optional server URL to use.                                  |

### Response

**[CreateCardTokensResponse](../../Models/Requests/CreateCardTokensResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |