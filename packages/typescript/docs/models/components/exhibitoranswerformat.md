# ExhibitorAnswerFormat

Specifies the format for displaying answers based on the question type. For SingleChoice questions, choose between 'Dropdown' or 'RadioButton'. For OpenEndedTextOneLine questions, select 'General', 'EmailAddress', or 'PhoneNumber'. For OpenEndedDateTime questions, use 'DateAndTime' or 'Date'.

## Example Usage

```typescript
import { ExhibitorAnswerFormat } from "@cvent/sdk/models/components";

let value: ExhibitorAnswerFormat = "RadioButton";
```

## Values

```typescript
"Date" | "DateAndTime" | "Dropdown" | "EmailAddress" | "General" | "PhoneNumber" | "RadioButton"
```