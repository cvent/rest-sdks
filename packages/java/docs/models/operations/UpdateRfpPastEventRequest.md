# UpdateRfpPastEventRequest


## Fields

| Field                                                   | Type                                                    | Required                                                | Description                                             | Example                                                 |
| ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- |
| `rfpId`                                                 | *String*                                                | :heavy_check_mark:                                      | The unique identifier of the RFP we are requesting      | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                    |
| `pastEventId`                                           | *String*                                                | :heavy_check_mark:                                      | The unique identifier of the RFP past event.            | f56a51a4-84b0-46c9-a612-716dc95a1c96                    |
| `rfpPastEvent`                                          | [RfpPastEvent](../../models/components/RfpPastEvent.md) | :heavy_check_mark:                                      | Request body for updating a past event on RFP.          |                                                         |