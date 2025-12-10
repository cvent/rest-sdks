# UpdateExhibitorWeblinkRequest


## Fields

| Field                                         | Type                                          | Required                                      | Description                                   | Example                                       |
| --------------------------------------------- | --------------------------------------------- | --------------------------------------------- | --------------------------------------------- | --------------------------------------------- |
| `Id`                                          | *string*                                      | :heavy_check_mark:                            | ID of an event.                               | 3db28cfc-db22-11eb-8d19-0242ac130003          |
| `ExhibitorId`                                 | *string*                                      | :heavy_check_mark:                            | ID of an exhibitor.                           | 4888db54-db22-11eb-8d19-0242ac130003          |
| `WeblinkId`                                   | *string*                                      | :heavy_check_mark:                            | ID of an exhibitor weblink.                   | 4d44b9e4-8c1a-403d-a20a-0b981f539935          |
| `Weblink`                                     | [Weblink](../../Models/Components/Weblink.md) | :heavy_check_mark:                            | Exhibitor content to be updated.              |                                               |