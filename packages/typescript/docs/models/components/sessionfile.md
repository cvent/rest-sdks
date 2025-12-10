# SessionFile

Used to denote a session files attributes.

## Example Usage

```typescript
import { SessionFile } from "@cvent/sdk/models/components";

let value: SessionFile = {
  file: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  },
  href:
    "https://custom.cvent.com/a5154f85f71a4cf2464e037feb75b308/00000000000000000000000000000000/files/e209d73d845746b7a6deda4da9d91b2c.png",
  friendlyName: "Important Document",
  type: "image/png",
  size: 150,
  displayEnabled: true,
};
```

## Fields

| Field                                                                                                                                 | Type                                                                                                                                  | Required                                                                                                                              | Description                                                                                                                           | Example                                                                                                                               |
| ------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------- |
| `file`                                                                                                                                | [components.SessionFileFile](../../models/components/sessionfilefile.md)                                                              | :heavy_check_mark:                                                                                                                    | N/A                                                                                                                                   |                                                                                                                                       |
| `href`                                                                                                                                | *string*                                                                                                                              | :heavy_check_mark:                                                                                                                    | URL of a session's document                                                                                                           | https://custom.cvent.com/a5154f85f71a4cf2464e037feb75b308/00000000000000000000000000000000/files/e209d73d845746b7a6deda4da9d91b2c.png |
| `friendlyName`                                                                                                                        | *string*                                                                                                                              | :heavy_minus_sign:                                                                                                                    | Friendly name of the file                                                                                                             | Important Document                                                                                                                    |
| `type`                                                                                                                                | *string*                                                                                                                              | :heavy_minus_sign:                                                                                                                    | Mime type of the file                                                                                                                 | image/png                                                                                                                             |
| `size`                                                                                                                                | *number*                                                                                                                              | :heavy_minus_sign:                                                                                                                    | Size of the file in bytes                                                                                                             | 150                                                                                                                                   |
| `displayEnabled`                                                                                                                      | *boolean*                                                                                                                             | :heavy_minus_sign:                                                                                                                    | Display this file to the public                                                                                                       | true                                                                                                                                  |