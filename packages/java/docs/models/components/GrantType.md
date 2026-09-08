# GrantType

Controls the OAuth2 grant flow used to obtain tokens.

## Example Usage

```java
import com.cvent.models.components.GrantType;

GrantType value = GrantType.CLIENT_CREDENTIALS;
```


## Values

| Name                 | Value                |
| -------------------- | -------------------- |
| `CLIENT_CREDENTIALS` | client_credentials   |
| `AUTHORIZATION_CODE` | authorization_code   |
| `REFRESH_TOKEN`      | refresh_token        |