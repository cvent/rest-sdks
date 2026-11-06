# ExhibitorQuestionType

Type of data that an exhibitor question collects. `MultiChoice`: the respondent selects multiple options from a list. `SingleChoice`: the respondent selects one option from a list, such as a dropdown or radio buttons. `OpenEndedTextOneLine`: the respondent enters a short text answer, such as a name. `OpenEndedTextCommentBox`: the respondent enters a long text answer. `OpenEndedDateTime`: the respondent enters a date and time.

## Example Usage

```csharp
using Cvent.SDK.Models.Components;

var value = ExhibitorQuestionType.MultiChoice;
```


## Values

| Name                      | Value                     |
| ------------------------- | ------------------------- |
| `MultiChoice`             | MultiChoice               |
| `SingleChoice`            | SingleChoice              |
| `OpenEndedTextOneLine`    | OpenEndedTextOneLine      |
| `OpenEndedTextCommentBox` | OpenEndedTextCommentBox   |
| `OpenEndedDateTime`       | OpenEndedDateTime         |