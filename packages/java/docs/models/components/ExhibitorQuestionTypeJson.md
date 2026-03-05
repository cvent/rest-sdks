# ExhibitorQuestionTypeJson

Enumeration indicating the type of data collected by an exhibitor question. 'MultiChoice': Respondents select multiple options from a list. 'SingleChoice': restricts respondents to a single option from a list, often displayed as a dropdown or radio button. 'OpenEndedTextOneLine': brief text responses, such as names or short answers. 'OpenEndedTextCommentBox': longer text responses for detailed feedback. 'OpenEndedDateTime': captures date and time information from respondents.

## Example Usage

```java
import com.cvent.models.components.ExhibitorQuestionTypeJson;

ExhibitorQuestionTypeJson value = ExhibitorQuestionTypeJson.MULTI_CHOICE;
```


## Values

| Name                          | Value                         |
| ----------------------------- | ----------------------------- |
| `MULTI_CHOICE`                | MultiChoice                   |
| `SINGLE_CHOICE`               | SingleChoice                  |
| `OPEN_ENDED_TEXT_ONE_LINE`    | OpenEndedTextOneLine          |
| `OPEN_ENDED_TEXT_COMMENT_BOX` | OpenEndedTextCommentBox       |
| `OPEN_ENDED_DATE_TIME`        | OpenEndedDateTime             |