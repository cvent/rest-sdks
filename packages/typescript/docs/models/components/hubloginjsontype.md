# HubLoginJsonType

Login method for the members of the Events+ hub. MAGIC_LINK: The members can log in via a 'magic link' provided via email. Magic links are unique for each member, allowing the member to log in without requiring credentials. SSO: The members log in via a single-sign-on (SSO) method previously configured in the Events+ hub. BOTH: Members can log in via the magic link method or the single-sign-on (SSO) method.

## Example Usage

```typescript
import { HubLoginJsonType } from "@cvent/sdk/models/components";

let value: HubLoginJsonType = "BOTH";
```

## Values

```typescript
"MAGIC_LINK" | "SSO" | "BOTH"
```