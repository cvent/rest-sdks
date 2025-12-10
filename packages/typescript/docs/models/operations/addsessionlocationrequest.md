# AddSessionLocationRequest

## Example Usage

```typescript
import { AddSessionLocationRequest } from "@cvent/sdk/models/operations";

let value: AddSessionLocationRequest = {
  id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  sessionLocation: {
    code: "ConfA",
    name: "Conference Room A",
  },
};
```

## Fields

| Field                                                                              | Type                                                                               | Required                                                                           | Description                                                                        | Example                                                                            |
| ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| `id`                                                                               | *string*                                                                           | :heavy_check_mark:                                                                 | Unique Id of Event                                                                 | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                               |
| `sessionLocation`                                                                  | [components.SessionLocationInput](../../models/components/sessionlocationinput.md) | :heavy_check_mark:                                                                 | Details of the session location you're creating.                                   |                                                                                    |