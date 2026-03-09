# ResponseType

The response type must be code. Indicates the client wants an authorization code (authorization code grant flow).

**Note:** *implicit flow* or the *token* value is not supported at this time.


## Example Usage

```java
import com.cvent.models.operations.ResponseType;

ResponseType value = ResponseType.CODE;
```


## Values

| Name   | Value  |
| ------ | ------ |
| `CODE` | code   |