# ExhibitorQuestionType

Type of data that an exhibitor question collects. `MultiChoice`: the respondent selects multiple options from a list. `SingleChoice`: the respondent selects one option from a list, such as a dropdown or radio buttons. `OpenEndedTextOneLine`: the respondent enters a short text answer, such as a name. `OpenEndedTextCommentBox`: the respondent enters a long text answer. `OpenEndedDateTime`: the respondent enters a date and time.

## Example Usage

```java
import com.cvent.models.components.ExhibitorQuestionType;

ExhibitorQuestionType value = ExhibitorQuestionType.MULTI_CHOICE;
```


## Values

| Name                          | Value                         |
| ----------------------------- | ----------------------------- |
| `MULTI_CHOICE`                | MultiChoice                   |
| `SINGLE_CHOICE`               | SingleChoice                  |
| `OPEN_ENDED_TEXT_ONE_LINE`    | OpenEndedTextOneLine          |
| `OPEN_ENDED_TEXT_COMMENT_BOX` | OpenEndedTextCommentBox       |
| `OPEN_ENDED_DATE_TIME`        | OpenEndedDateTime             |