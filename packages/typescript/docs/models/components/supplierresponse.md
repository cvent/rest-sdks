# SupplierResponse

Contains response from supplier on an RFP.

## Example Usage

```typescript
import { SupplierResponse } from "@cvent/sdk/models/components";

let value: SupplierResponse = {
  dateTime: new Date("2017-02-02T03:19:19.991Z"),
  reason: "GUEST_ROOMS_NO_LONGER_AVAILABLE",
  comment:
    "We are unable to accommodate the request on the required dates. Please let us know if we can help with any other dates.",
};
```

## Fields

| Field                                                                                                                   | Type                                                                                                                    | Required                                                                                                                | Description                                                                                                             | Example                                                                                                                 |
| ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| `dateTime`                                                                                                              | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date)                           | :heavy_minus_sign:                                                                                                      | The ISO 8601 date time (in UTC) when the response was sent by supplier.                                                 | 2017-02-02T03:19:19.991Z                                                                                                |
| `reason`                                                                                                                | [components.RfpResponseReasonJson](../../models/components/rfpresponsereasonjson.md)                                    | :heavy_minus_sign:                                                                                                      | Reason given for a response to an RFP.                                                                                  | GUEST_ROOMS_NO_LONGER_AVAILABLE                                                                                         |
| `comment`                                                                                                               | *string*                                                                                                                | :heavy_minus_sign:                                                                                                      | Comment for the response reason.                                                                                        | We are unable to accommodate the request on the required dates. Please let us know if we can help with any other dates. |