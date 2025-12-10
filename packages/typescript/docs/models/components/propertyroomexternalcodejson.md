# PropertyRoomExternalCodeJson

The external room codes for the room

## Example Usage

```typescript
import { PropertyRoomExternalCodeJson } from "@cvent/sdk/models/components";

let value: PropertyRoomExternalCodeJson = {
  type: "crs",
  roomCode: "std887",
};
```

## Fields

| Field                                                                              | Type                                                                               | Required                                                                           | Description                                                                        | Example                                                                            |
| ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| `type`                                                                             | [components.ExternalCodeTypeJson](../../models/components/externalcodetypejson.md) | :heavy_minus_sign:                                                                 | Type of the external Code.                                                         | amadeus                                                                            |
| `roomCode`                                                                         | *string*                                                                           | :heavy_minus_sign:                                                                 | The code identifying the room in the given external system.                        | std887                                                                             |