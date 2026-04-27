# TextAnswerFormatJson

Text answer format. Used for `OpenEndedTextOneLine` question types.`CustomFormat`: Answers must follow a planner defined custom format. `EmailAddress`: Answers must follow the pattern of an email address. `General`: Answers can be any string. `USPhoneNumber`: Answers must be formatted as a phone number.

## Example Usage

```csharp
using Cvent.SDK.Models.Components;

var value = TextAnswerFormatJson.CustomFormat;
```


## Values

| Name            | Value           |
| --------------- | --------------- |
| `CustomFormat`  | CustomFormat    |
| `EmailAddress`  | EmailAddress    |
| `General`       | General         |
| `USPhoneNumber` | USPhoneNumber   |