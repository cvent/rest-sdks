# TextAnswerFormatJson

Text answer format. Used for `OpenEndedTextOneLine` question types.`CustomFormat`: Answers must follow a planner defined custom format. `EmailAddress`: Answers must follow the pattern of an email address. `General`: Answers can be any string. `USPhoneNumber`: Answers must be formatted as a phone number.

## Example Usage

```typescript
import { TextAnswerFormatJson } from "@cvent/sdk/models/components";

let value: TextAnswerFormatJson = "CustomFormat";
```

## Values

```typescript
"CustomFormat" | "EmailAddress" | "General" | "USPhoneNumber"
```