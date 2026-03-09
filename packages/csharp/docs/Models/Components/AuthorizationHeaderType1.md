# AuthorizationHeaderType1

Authorization header support characterizing the authentication type to be used for callbacks to the client system. API Key, or HTTP Basic Authentication, each configured with a corresponding option.

## Example Usage

```csharp
using Cvent.SDK.Models.Components;

var value = AuthorizationHeaderType1.ApiKey;
```


## Values

| Name     | Value    |
| -------- | -------- |
| `ApiKey` | apiKey   |
| `Basic`  | basic    |