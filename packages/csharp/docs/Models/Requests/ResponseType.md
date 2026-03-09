# ResponseType

The response type must be code. Indicates the client wants an authorization code (authorization code grant flow).

**Note:** *implicit flow* or the *token* value is not supported at this time.


## Example Usage

```csharp
using Cvent.SDK.Models.Requests;

var value = ResponseType.Code;
```


## Values

| Name   | Value  |
| ------ | ------ |
| `Code` | code   |