# SessionQaActionTypeJson

The user action that just occurred.
 `question.asked` - A question was asked.
 `question.upvoted` - A question was upvoted.
 `question.statusUpdated` - The status of a question was updated.
 `question.answered` - Either question was answered or the earlier provided answer was updated.
 `answer.deleted` - An answer was deleted.

## Example Usage

```java
import com.cvent.models.components.SessionQaActionTypeJson;

SessionQaActionTypeJson value = SessionQaActionTypeJson.QUESTION_ASKED;
```


## Values

| Name                      | Value                     |
| ------------------------- | ------------------------- |
| `QUESTION_ASKED`          | question.asked            |
| `QUESTION_UPVOTED`        | question.upvoted          |
| `QUESTION_STATUS_UPDATED` | question.statusUpdated    |
| `QUESTION_ANSWERED`       | question.answered         |
| `ANSWER_DELETED`          | answer.deleted            |