# RespondedThroughJson

Indicates the mode by which a respondent submitted their response.

This field contains one of the enumerated, string constants listed below.

Enum values:

- "Not Responded": Respondent did not provide a response.
- "API": Response was submitted via an API.
- "Import": Response was created by a bulk import process.
- "Mobile" (deprecated): Historically indicated submission from a mobile device. This value is deprecated.
- "Desktop" (deprecated): Historically indicated submission from a desktop device. This value is deprecated.

## Example Usage

```java
import com.cvent.models.components.RespondedThroughJson;

RespondedThroughJson value = RespondedThroughJson.NOT_RESPONDED;
```


## Values

| Name            | Value           |
| --------------- | --------------- |
| `NOT_RESPONDED` | Not Responded   |
| `API`           | API             |
| `IMPORT`        | Import          |
| `MOBILE`        | Mobile          |
| `DESKTOP`       | Desktop         |