# DisplayInDataTagJson

This option allows you to choose whether to display the custom field in emails. The field name and the value entered by the invitee are used in the My Agenda data tag. You can set the custom field to display always or only when answered. Only applicable to session custom fields.

## Example Usage

```java
import com.cvent.models.components.DisplayInDataTagJson;

DisplayInDataTagJson value = DisplayInDataTagJson.YES;
```


## Values

| Name                 | Value                |
| -------------------- | -------------------- |
| `YES`                | Yes                  |
| `NO`                 | No                   |
| `ONLY_WHEN_ANSWERED` | Only when answered   |