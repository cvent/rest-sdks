# ExhibitorAnswerFormatJson

Specifies the format for displaying answers based on the question type. For SingleChoice questions, choose between 'Dropdown' or 'RadioButton'. For OpenEndedTextOneLine questions, select 'General', 'EmailAddress', or 'PhoneNumber'. For OpenEndedDateTime questions, use 'DateAndTime' or 'Date'.

## Example Usage

```csharp
using Cvent.SDK.Models.Components;

var value = ExhibitorAnswerFormatJson.Date;
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