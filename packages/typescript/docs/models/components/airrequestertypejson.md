# AirRequesterTypeJson

Representation of an attendee type of the flight requester. Contact means the requester is an independent attendee. Guest means the attendee is accompanying another attendee. Unknown means attendee has requested a flight for passenger other than its guest.

## Example Usage

```typescript
import { AirRequesterTypeJson } from "@cvent/sdk/models/components";

let value: AirRequesterTypeJson = "Contact";
```

## Values

```typescript
"Contact" | "Guest" | "Unknown"
```