# StatusSummary

Represents a summary of status associated with this proposal.

## Example Usage

```typescript
import { StatusSummary } from "@cvent/sdk/models/components";

let value: StatusSummary = {
  reason: "Other",
  comment: "Not as per requirement",
};
```

## Fields

| Field                                                                      | Type                                                                       | Required                                                                   | Description                                                                | Example                                                                    |
| -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- |
| `reason`                                                                   | *string*                                                                   | :heavy_minus_sign:                                                         | Reason provided by the planner for status update                           | Other                                                                      |
| `comment`                                                                  | *string*                                                                   | :heavy_minus_sign:                                                         | Comment provided by the planner while updating the status of the proposal. | Not as per requirement                                                     |