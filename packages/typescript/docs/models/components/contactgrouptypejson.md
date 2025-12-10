# ContactGroupTypeJson

Type of contact group. `BLACKLIST` are contacts that are not allowed to register for your events. `DISTRIBUTION_LIST` is a group of contacts you plan to send eMarketing emails to. `STANDARD` is a multi-purpose group for organizing contacts.

## Example Usage

```typescript
import { ContactGroupTypeJson } from "@cvent/sdk/models/components";

let value: ContactGroupTypeJson = "STANDARD";
```

## Values

```typescript
"BLACKLIST" | "DISTRIBUTION_LIST" | "STANDARD"
```