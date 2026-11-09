# ExhibitorAnswerFormat

Display format of the answers to the question. The valid formats depend on the question type. A `SingleChoice` question uses `Dropdown` or `RadioButton`. An `OpenEndedTextOneLine` question uses `General`, `EmailAddress`, or `PhoneNumber`. An `OpenEndedDateTime` question uses `DateAndTime` or `Date`.

## Example Usage

```java
import com.cvent.models.components.ExhibitorAnswerFormat;

ExhibitorAnswerFormat value = ExhibitorAnswerFormat.DATE;
```


## Values

| Name            | Value           |
| --------------- | --------------- |
| `DATE`          | Date            |
| `DATE_AND_TIME` | DateAndTime     |
| `DROPDOWN`      | Dropdown        |
| `EMAIL_ADDRESS` | EmailAddress    |
| `GENERAL`       | General         |
| `PHONE_NUMBER`  | PhoneNumber     |
| `RADIO_BUTTON`  | RadioButton     |