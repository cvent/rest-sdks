# EmailVerified

The account user's email verification status: `UNVERIFIED` indicates the email address has not been verified, `VERIFIED` indicates the email address has been verified, and `UNVERIFIED_BLOCK_LOGIN` indicates the email address has not been verified and the account user is blocked from logging in.

## Example Usage

```csharp
using Cvent.SDK.Models.Components;

var value = EmailVerified.Unverified;
```


## Values

| Name                   | Value                  |
| ---------------------- | ---------------------- |
| `Unverified`           | UNVERIFIED             |
| `Verified`             | VERIFIED               |
| `UnverifiedBlockLogin` | UNVERIFIED_BLOCK_LOGIN |