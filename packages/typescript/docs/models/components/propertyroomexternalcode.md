# PropertyRoomExternalCode

The external room codes for the room

## Example Usage

```typescript
import { PropertyRoomExternalCode } from "@cvent/sdk/models/components";

let value: PropertyRoomExternalCode = {
  type: "galileo_gds",
  roomCode: "std887",
};
```

## Fields

| Field                                                                      | Type                                                                       | Required                                                                   | Description                                                                | Example                                                                    |
| -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- |
| `type`                                                                     | [components.ExternalCodeType](../../models/components/externalcodetype.md) | :heavy_minus_sign:                                                         | Type of the external Code.                                                 | amadeus                                                                    |
| `roomCode`                                                                 | *string*                                                                   | :heavy_minus_sign:                                                         | The code identifying the room in the given external system.                | std887                                                                     |