# UpdateContactGroupRequest

## Example Usage

```typescript
import { UpdateContactGroupRequest } from "@cvent/sdk/models/operations";

let value: UpdateContactGroupRequest = {
  id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  contactGroup: {
    name: "group name",
    shortDescription: "short description",
    description: "long description",
    distributionListInfo: {
      internalNote: "Sample distribution list internal note",
    },
  },
};
```

## Fields

| Field                                                                        | Type                                                                         | Required                                                                     | Description                                                                  | Example                                                                      |
| ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- |
| `id`                                                                         | *string*                                                                     | :heavy_check_mark:                                                           | ID of a contact group.                                                       | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                         |
| `contactGroup`                                                               | [components.ContactGroupInput](../../models/components/contactgroupinput.md) | :heavy_check_mark:                                                           | Contact Group to be updated                                                  |                                                                              |