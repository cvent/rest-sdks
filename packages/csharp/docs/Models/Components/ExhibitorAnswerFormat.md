# ExhibitorAnswerFormat

Display format of the answers to the question. The valid formats depend on the question type. A `SingleChoice` question uses `Dropdown` or `RadioButton`. An `OpenEndedTextOneLine` question uses `General`, `EmailAddress`, or `PhoneNumber`. An `OpenEndedDateTime` question uses `DateAndTime` or `Date`.

## Example Usage

```csharp
using Cvent.SDK.Models.Components;

var value = ExhibitorAnswerFormat.Date;
```


## Values

| Name           | Value          |
| -------------- | -------------- |
| `Date`         | Date           |
| `DateAndTime`  | DateAndTime    |
| `Dropdown`     | Dropdown       |
| `EmailAddress` | EmailAddress   |
| `General`      | General        |
| `PhoneNumber`  | PhoneNumber    |
| `RadioButton`  | RadioButton    |