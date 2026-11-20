# RfpWithStatus

RFP with status.

## Example Usage

```typescript
import { RfpWithStatus } from "@cvent/sdk/models/components";

let value: RfpWithStatus = {
  id: "a0f3116a-4dd8-4923-b778-188cbe00a68f",
  status: "ACTIVE",
};
```

## Fields

| Field                                                                                                       | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 | Example                                                                                                     |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                        | *string*                                                                                                    | :heavy_check_mark:                                                                                          | A unique identifier for an RFP                                                                              | a0f3116a-4dd8-4923-b778-188cbe00a68f                                                                        |
| `status`                                                                                                    | [components.RfpStatus](../../models/components/rfpstatus.md)                                                | :heavy_check_mark:                                                                                          | Status of the RFP. Returned as ACTIVE when no approval is required, or PENDING when approval is configured. | ACTIVE                                                                                                      |