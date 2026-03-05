# AuthorizationHeaderType2

Authorization header support characterizing the authentication type to be used for callbacks to the client system. API Key, or HTTP Basic Authentication, each configured with a corresponding option.

## Example Usage

```java
import com.cvent.models.components.AuthorizationHeaderType2;

AuthorizationHeaderType2 value = AuthorizationHeaderType2.API_KEY;
```


## Values

| Name      | Value     |
| --------- | --------- |
| `API_KEY` | apiKey    |
| `BASIC`   | basic     |