# DisplayInDataTagJson

This option allows you to choose whether to display the custom field in emails. The field name and the value entered by the invitee are used in the My Agenda data tag. You can set the custom field to display always or only when answered. Only applicable to session custom fields.

## Example Usage

```typescript
import { DisplayInDataTagJson } from "@cvent/sdk/models/components";

let value: DisplayInDataTagJson = "No";
```

## Values

```typescript
"Yes" | "No" | "Only when answered"
```