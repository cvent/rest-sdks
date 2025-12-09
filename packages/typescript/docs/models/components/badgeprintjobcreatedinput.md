# BadgePrintJobCreatedInput

The Badge Print Job that was created.

## Example Usage

```typescript
import { BadgePrintJobCreatedInput } from "@cvent/sdk/models/components";

let value: BadgePrintJobCreatedInput = {
  status: "Scheduled",
  pool: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  },
  badgeId: "VNNDLJ6DKVK",
};
```

## Fields

| Field                                                                                                                                                   | Type                                                                                                                                                    | Required                                                                                                                                                | Description                                                                                                                                             | Example                                                                                                                                                 |
| ------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `status`                                                                                                                                                | [components.BadgePrintJobStatusJson](../../models/components/badgeprintjobstatusjson.md)                                                                | :heavy_minus_sign:                                                                                                                                      | This is used to indicate the status of the badge print job.                                                                                             | Scheduled                                                                                                                                               |
| `pool`                                                                                                                                                  | [components.BadgePrinterPoolReferenceJson](../../models/components/badgeprinterpoolreferencejson.md)                                                    | :heavy_check_mark:                                                                                                                                      | Reference to a Badge Print Pool.                                                                                                                        |                                                                                                                                                         |
| `badgeId`                                                                                                                                               | *string*                                                                                                                                                | :heavy_check_mark:                                                                                                                                      | A unique id of the attendee for badge printing, which could be confirmation number or secured badge id depending on whether secured badge id is enabled | VNNDLJ6DKVK                                                                                                                                             |