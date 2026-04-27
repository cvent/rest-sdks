# FieldTypeJson

Determines the required format for a field. `DateTime`: Data is in date-time format. `MultiChoice`: Data is one or more options from a list. `Number`: Data is a number. `SingleChoice`: Data is a a single option from a list. `Text`: Data is free-text input.

## Example Usage

```java
import com.cvent.models.components.FieldTypeJson;

FieldTypeJson value = FieldTypeJson.DATE_TIME;
```


## Values

| Name            | Value           |
| --------------- | --------------- |
| `DATE_TIME`     | DateTime        |
| `MULTI_CHOICE`  | MultiChoice     |
| `NUMBER`        | Number          |
| `SINGLE_CHOICE` | SingleChoice    |
| `TEXT`          | Text            |