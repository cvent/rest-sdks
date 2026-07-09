# GrantType

Controls the OAuth2 grant flow used to obtain tokens.

## Example Usage

```csharp
using Cvent.SDK.Models.Requests;

var value = GrantType.ClientCredentials;
```


## Values

| Name                | Value               |
| ------------------- | ------------------- |
| `ClientCredentials` | client_credentials  |
| `AuthorizationCode` | authorization_code  |
| `RefreshToken`      | refresh_token       |