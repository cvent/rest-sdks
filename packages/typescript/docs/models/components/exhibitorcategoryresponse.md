# ExhibitorCategoryResponse

A description of the Existing Exhibitor Category JSON schema

## Example Usage

```typescript
import { ExhibitorCategoryResponse } from "@cvent/sdk/models/components";

let value: ExhibitorCategoryResponse = {
  created: new Date("2017-01-02T02:00:00Z"),
  createdBy: "hporter",
  lastModified: new Date("2019-02-12T03:00:00Z"),
  lastModifiedBy: "hporter",
  event: {
    id: "3db28cfc-db22-11eb-8d19-0242ac130003",
  },
  name: "Automobile",
  description: "everything related to automobiles",
  order: 3,
  type: "LOGO",
  id: "534a465b-b4cb-471d-9498-4bf3917ad8bf",
  bannerId: "22ca5ab1-0dc3-487b-953e-41d6dacde3e6",
  bannerUrl: "https://images.cvent.com/pt/fileLocation/url_456",
};
```

## Fields

| Field                                                                                                | Type                                                                                                 | Required                                                                                             | Description                                                                                          | Example                                                                                              |
| ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- |
| `created`                                                                                            | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date)        | :heavy_minus_sign:                                                                                   | The ISO 8601 zoned date time when this record was created.                                           | 2017-01-02T02:00:00Z                                                                                 |
| `createdBy`                                                                                          | *string*                                                                                             | :heavy_minus_sign:                                                                                   | The identifier of the user that created this record.                                                 | hporter                                                                                              |
| `lastModified`                                                                                       | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date)        | :heavy_minus_sign:                                                                                   | The ISO 8601 zoned date time when this record was updated.                                           | 2019-02-12T03:00:00Z                                                                                 |
| `lastModifiedBy`                                                                                     | *string*                                                                                             | :heavy_minus_sign:                                                                                   | The identifier of the user that last updated this record.                                            | hporter                                                                                              |
| `event`                                                                                              | [components.EventJson6](../../models/components/eventjson6.md)                                       | :heavy_check_mark:                                                                                   | The Associated Event.                                                                                |                                                                                                      |
| `name`                                                                                               | *string*                                                                                             | :heavy_check_mark:                                                                                   | Name of the exhibitor category                                                                       | Automobile                                                                                           |
| `description`                                                                                        | *string*                                                                                             | :heavy_minus_sign:                                                                                   | Exhibitor Category description                                                                       | everything related to automobiles                                                                    |
| `order`                                                                                              | *number*                                                                                             | :heavy_check_mark:                                                                                   | order for exhibitor category                                                                         | 3                                                                                                    |
| `type`                                                                                               | [components.ExhibitorCategoryResponseType](../../models/components/exhibitorcategoryresponsetype.md) | :heavy_check_mark:                                                                                   | Type of exhibitor category                                                                           | LOGO                                                                                                 |
| `id`                                                                                                 | *string*                                                                                             | :heavy_minus_sign:                                                                                   | ID of exhibitor category.                                                                            | 534a465b-b4cb-471d-9498-4bf3917ad8bf                                                                 |
| `bannerId`                                                                                           | *string*                                                                                             | :heavy_minus_sign:                                                                                   | File ID for exhibitor category banner.                                                               | 22ca5ab1-0dc3-487b-953e-41d6dacde3e6                                                                 |
| `bannerUrl`                                                                                          | *string*                                                                                             | :heavy_minus_sign:                                                                                   | URL for exhibitor category banner.                                                                   | https://images.cvent.com/pt/fileLocation/url_456                                                     |