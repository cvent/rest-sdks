# UpdateRfpGuestRoomsRequest

## Example Usage

```typescript
import { UpdateRfpGuestRoomsRequest } from "@cvent/sdk/models/operations";
import { RFCDate } from "@cvent/sdk/types";

let value: UpdateRfpGuestRoomsRequest = {
  rfpId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  rfpGuestRooms: {
    occupancies: [
      {
        occupancy: "SINGLE",
        type: "DOUBLE",
      },
    ],
    checkInDate: new RFCDate("2025-10-13"),
    roomBlocks: [
      {
        dayNumber: 3,
        details: [
          {
            quantity: 24,
            type: "DOUBLE",
          },
        ],
      },
    ],
    additionalInformation: "2 Executive suites are mandatory.",
  },
};
```

## Fields

| Field                                                                          | Type                                                                           | Required                                                                       | Description                                                                    | Example                                                                        |
| ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ |
| `rfpId`                                                                        | *string*                                                                       | :heavy_check_mark:                                                             | The unique identifier of the RFP we are requesting                             | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                           |
| `rfpGuestRooms`                                                                | [components.RfpGuestRoomsInput](../../models/components/rfpguestroomsinput.md) | :heavy_check_mark:                                                             | Request body for updating guest room requirements.                             |                                                                                |