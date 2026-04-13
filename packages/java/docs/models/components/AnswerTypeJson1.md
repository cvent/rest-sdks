# AnswerTypeJson1

Indicates the type of the answer, which determines how the `value` and `secondaryValue` fields are interpreted.

Set to **"Other"** when the question has the **"Other"** choice option enabled, indicating the answer in the **"secondaryValue"** field is a free-text response to that option.

Set to **"NA"** when the question has the **"N/A"** choice option enabled, to indicate an N/A type answer; in this case, `value` is omitted.

In all other cases, `answerType` is not expected to be set.

## Example Usage

```java
import com.cvent.models.components.AnswerTypeJson1;

AnswerTypeJson1 value = AnswerTypeJson1.OTHER;
```


## Values

| Name    | Value   |
| ------- | ------- |
| `OTHER` | Other   |
| `NA`    | NA      |