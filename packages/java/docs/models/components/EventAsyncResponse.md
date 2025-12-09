# EventAsyncResponse

Asynchronous event operation job details.


## Fields

| Field                                                                                   | Type                                                                                    | Required                                                                                | Description                                                                             | Example                                                                                 |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `id`                                                                                    | *String*                                                                                | :heavy_check_mark:                                                                      | The identifier to be used to get the async status of the event being created or copied. | 9163c74j-67c6-401c-k710-oe0f783bf022                                                    |
| `status`                                                                                | [EventAsyncResponseStatus](../../models/components/EventAsyncResponseStatus.md)         | :heavy_check_mark:                                                                      | The status of the event being created or copied.                                        | Processing                                                                              |