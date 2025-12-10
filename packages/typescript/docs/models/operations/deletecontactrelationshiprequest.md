# DeleteContactRelationshipRequest

## Example Usage

```typescript
import { DeleteContactRelationshipRequest } from "@cvent/sdk/models/operations";

let value: DeleteContactRelationshipRequest = {
  id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  relatedContactId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};
```

## Fields

| Field                                | Type                                 | Required                             | Description                          | Example                              |
| ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ |
| `id`                                 | *string*                             | :heavy_check_mark:                   | ID of a contact.                     | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3 |
| `relatedContactId`                   | *string*                             | :heavy_check_mark:                   | ID of a related contact.             | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3 |