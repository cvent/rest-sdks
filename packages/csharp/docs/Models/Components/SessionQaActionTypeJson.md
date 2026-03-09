# SessionQaActionTypeJson

The user action that just occurred.
 `question.asked` - A question was asked.
 `question.upvoted` - A question was upvoted.
 `question.statusUpdated` - The status of a question was updated.
 `question.answered` - Either question was answered or the earlier provided answer was updated.
 `answer.deleted` - An answer was deleted.

## Example Usage

```csharp
using Cvent.SDK.Models.Components;

var value = SessionQaActionTypeJson.QuestionAsked;
```


## Values

| Name                    | Value                   |
| ----------------------- | ----------------------- |
| `QuestionAsked`         | question.asked          |
| `QuestionUpvoted`       | question.upvoted        |
| `QuestionStatusUpdated` | question.statusUpdated  |
| `QuestionAnswered`      | question.answered       |
| `AnswerDeleted`         | answer.deleted          |