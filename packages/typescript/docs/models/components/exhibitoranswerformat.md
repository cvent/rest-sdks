# ExhibitorAnswerFormat

Display format of the answers to the question. The valid formats depend on the question type. A `SingleChoice` question uses `Dropdown` or `RadioButton`. An `OpenEndedTextOneLine` question uses `General`, `EmailAddress`, or `PhoneNumber`. An `OpenEndedDateTime` question uses `DateAndTime` or `Date`.

## Example Usage

```typescript
import { ExhibitorAnswerFormat } from "@cvent/sdk/models/components";

let value: ExhibitorAnswerFormat = "RadioButton";
```

## Values

```typescript
"Date" | "DateAndTime" | "Dropdown" | "EmailAddress" | "General" | "PhoneNumber" | "RadioButton"
```