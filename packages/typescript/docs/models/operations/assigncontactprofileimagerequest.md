# AssignContactProfileImageRequest

## Example Usage

```typescript
import { AssignContactProfileImageRequest } from "@cvent/sdk/models/operations";

let value: AssignContactProfileImageRequest = {
  id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  contactFile: {
    file: {},
  },
};
```

## Fields

| Field                                                                                  | Type                                                                                   | Required                                                                               | Description                                                                            | Example                                                                                |
| -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- |
| `id`                                                                                   | *string*                                                                               | :heavy_check_mark:                                                                     | ID of a contact.                                                                       | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                                   |
| `contactFile`                                                                          | [components.ContactFileInput](../../models/components/contactfileinput.md)             | :heavy_check_mark:                                                                     | The file ID provided by the <a href="#operation/uploadFile">file upload</a> endpoint.<br/> |                                                                                        |