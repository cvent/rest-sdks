# PackagePricingPreference

Represents different preferences by planner for pricing packages response that supplier has to provide. NO_PREFERENCE means no pricing package information is need, OPTIONAL means it's not mandatory to provide pricing preference, and REQUIRED means package information is mandatory to be provided by supplier.

## Example Usage

```csharp
using Cvent.SDK.Models.Components;

var value = PackagePricingPreference.NoPreference;
```


## Values

| Name           | Value          |
| -------------- | -------------- |
| `NoPreference` | NO_PREFERENCE  |
| `Optional`     | OPTIONAL       |
| `Required`     | REQUIRED       |