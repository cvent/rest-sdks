# UtmOverrideJson

Specifies how UTM (urchin tracking module: a key and value that is attached to URLs for the purpose of identifying and tracking traffic) settings will override passed in items.

## Example Usage

```csharp
using Cvent.SDK.Models.Components;

var value = UtmOverrideJson.UseExistingParameter;
```


## Values

| Name                   | Value                  |
| ---------------------- | ---------------------- |
| `UseExistingParameter` | use-existing-parameter |
| `UseCustomParameter`   | use-custom-parameter   |