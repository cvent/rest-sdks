# PackagePricingPreferenceJson

Represents different preferences by planner for pricing packages response that supplier has to provide. NO_PREFERENCE means no pricing package information is need, OPTIONAL means it's not mandatory to provide pricing preference, and REQUIRED means package information is mandatory to be provided by supplier.

## Example Usage

```java
import com.cvent.models.components.PackagePricingPreferenceJson;

PackagePricingPreferenceJson value = PackagePricingPreferenceJson.NO_PREFERENCE;
```


## Values

| Name            | Value           |
| --------------- | --------------- |
| `NO_PREFERENCE` | NO_PREFERENCE   |
| `OPTIONAL`      | OPTIONAL        |
| `REQUIRED`      | REQUIRED        |