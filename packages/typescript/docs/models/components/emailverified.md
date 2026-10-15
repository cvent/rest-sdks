# EmailVerified

The account user's email verification status: `UNVERIFIED` indicates the email address has not been verified, `VERIFIED` indicates the email address has been verified, and `UNVERIFIED_BLOCK_LOGIN` indicates the email address has not been verified and the account user is blocked from logging in.

## Example Usage

```typescript
import { EmailVerified } from "@cvent/sdk/models/components";

let value: EmailVerified = "VERIFIED";
```

## Values

```typescript
"UNVERIFIED" | "VERIFIED" | "UNVERIFIED_BLOCK_LOGIN"
```