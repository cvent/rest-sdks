# TextAnswerFormat

Text answer format. Used for `OpenEndedTextOneLine` question types.`CustomFormat`: Answers must follow a planner defined custom format. `EmailAddress`: Answers must follow the pattern of an email address. `General`: Answers can be any string. `USPhoneNumber`: Answers must be formatted as a phone number.

## Example Usage

```java
import com.cvent.models.components.TextAnswerFormat;

TextAnswerFormat value = TextAnswerFormat.CUSTOM_FORMAT;
```


## Values

| Name              | Value             |
| ----------------- | ----------------- |
| `CUSTOM_FORMAT`   | CustomFormat      |
| `EMAIL_ADDRESS`   | EmailAddress      |
| `GENERAL`         | General           |
| `US_PHONE_NUMBER` | USPhoneNumber     |