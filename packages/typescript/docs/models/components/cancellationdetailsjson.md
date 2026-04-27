# CancellationDetailsJson

Information about cancellation of RFP.

## Example Usage

```typescript
import { CancellationDetailsJson } from "@cvent/sdk/models/components";

let value: CancellationDetailsJson = {
  dateTime: new Date("2021-01-13T14:06:20.080Z"),
  comments: "I am cancelling my event, postponing to Q4.",
};
```

## Fields

| Field                                                                                         | Type                                                                                          | Required                                                                                      | Description                                                                                   | Example                                                                                       |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `dateTime`                                                                                    | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_minus_sign:                                                                            | The ISO 8601 date time (in UTC) when RFP was cancelled.                                       | 2021-01-13T14:06:20.080Z                                                                      |
| `reason`                                                                                      | [components.CancelledReasonJson0](../../models/components/cancelledreasonjson0.md)            | :heavy_minus_sign:                                                                            | Reason for cancelling the RFP.                                                                |                                                                                               |
| `comments`                                                                                    | *string*                                                                                      | :heavy_minus_sign:                                                                            | Additional comments while cancelling the RFP.                                                 | I am cancelling my event, postponing to Q4.                                                   |