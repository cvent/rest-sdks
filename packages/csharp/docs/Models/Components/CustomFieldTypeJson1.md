# CustomFieldTypeJson1

This is used to denote the type of data collected by a custom field. Auto-Increment custom fields are read only.

## Example Usage

```csharp
using Cvent.SDK.Models.Components;

var value = CustomFieldTypeJson1.OpenEndedTextDateTime;
```


## Values

| Name                          | Value                         |
| ----------------------------- | ----------------------------- |
| `OpenEndedTextDateTime`       | Open Ended Text - Date/Time   |
| `OpenEndedTextOneLine`        | Open Ended Text - One Line    |
| `OpenEndedTextCommentBox`     | Open Ended Text - Comment Box |
| `ChoiceSingleAnswer`          | Choice - Single Answer        |
| `ChoiceMultipleAnswers`       | Choice - Multiple Answers     |
| `AutoIncrement`               | Auto-Increment                |