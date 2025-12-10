# ChatReactionJson

A reaction to a message

## Example Usage

```typescript
import { ChatReactionJson } from "@cvent/sdk/models/components";

let value: ChatReactionJson = {
  type: "lol",
};
```

## Fields

| Field                                                                                     | Type                                                                                      | Required                                                                                  | Description                                                                               | Example                                                                                   |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `type`                                                                                    | *string*                                                                                  | :heavy_check_mark:                                                                        | The reaction type if the action type was one of the reaction.created or reaction.deleted. | lol                                                                                       |