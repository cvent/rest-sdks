# MetaJson

Metadata of the resource.

## Example Usage

```typescript
import { MetaJson } from "@cvent/sdk/models/components";

let value: MetaJson = {
  resourceType: "user",
  location: "https://<account>/scim/v2/Users/2",
  created: new Date("2021-12-16T00:59:14.570Z"),
  lastModified: new Date("2021-12-16T00:59:14.570Z"),
};
```

## Fields

| Field                                                                                         | Type                                                                                          | Required                                                                                      | Description                                                                                   | Example                                                                                       |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `resourceType`                                                                                | *string*                                                                                      | :heavy_minus_sign:                                                                            | The type of the resource.                                                                     | user                                                                                          |
| `location`                                                                                    | *string*                                                                                      | :heavy_minus_sign:                                                                            | The location (URI) of the resource.                                                           | https://<account>/scim/v2/Users/2                                                             |
| `created`                                                                                     | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_minus_sign:                                                                            | The ISO 8601 zoned date time when this record was created.                                    | 2021-12-16T00:59:14.570Z                                                                      |
| `lastModified`                                                                                | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_minus_sign:                                                                            | The ISO 8601 zoned date time when this record was modified.                                   | 2021-12-16T00:59:14.570Z                                                                      |