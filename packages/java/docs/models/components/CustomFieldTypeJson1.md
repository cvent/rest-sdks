# CustomFieldTypeJson1

This is used to denote the type of data collected by a custom field. Auto-Increment custom fields are read only.

## Example Usage

```java
import com.cvent.models.components.CustomFieldTypeJson1;

CustomFieldTypeJson1 value = CustomFieldTypeJson1.OPEN_ENDED_TEXT_DATE_TIME;
```


## Values

| Name                          | Value                         |
| ----------------------------- | ----------------------------- |
| `OPEN_ENDED_TEXT_DATE_TIME`   | Open Ended Text - Date/Time   |
| `OPEN_ENDED_TEXT_ONE_LINE`    | Open Ended Text - One Line    |
| `OPEN_ENDED_TEXT_COMMENT_BOX` | Open Ended Text - Comment Box |
| `CHOICE_SINGLE_ANSWER`        | Choice - Single Answer        |
| `CHOICE_MULTIPLE_ANSWERS`     | Choice - Multiple Answers     |
| `AUTO_INCREMENT`              | Auto-Increment                |