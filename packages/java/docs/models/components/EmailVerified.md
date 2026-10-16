# EmailVerified

The account user's email verification status: `UNVERIFIED` indicates the email address has not been verified, `VERIFIED` indicates the email address has been verified, and `UNVERIFIED_BLOCK_LOGIN` indicates the email address has not been verified and the account user is blocked from logging in.

## Example Usage

```java
import com.cvent.models.components.EmailVerified;

EmailVerified value = EmailVerified.UNVERIFIED;
```


## Values

| Name                     | Value                    |
| ------------------------ | ------------------------ |
| `UNVERIFIED`             | UNVERIFIED               |
| `VERIFIED`               | VERIFIED                 |
| `UNVERIFIED_BLOCK_LOGIN` | UNVERIFIED_BLOCK_LOGIN   |