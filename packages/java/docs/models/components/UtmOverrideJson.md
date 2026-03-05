# UtmOverrideJson

Specifies how UTM (urchin tracking module: a key and value that is attached to URLs for the purpose of identifying and tracking traffic) settings will override passed in items.

## Example Usage

```java
import com.cvent.models.components.UtmOverrideJson;

UtmOverrideJson value = UtmOverrideJson.USE_EXISTING_PARAMETER;
```


## Values

| Name                     | Value                    |
| ------------------------ | ------------------------ |
| `USE_EXISTING_PARAMETER` | use-existing-parameter   |
| `USE_CUSTOM_PARAMETER`   | use-custom-parameter     |