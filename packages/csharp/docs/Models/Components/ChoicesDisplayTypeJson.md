# ChoicesDisplayTypeJson

Display type indicating how to display the choices on UI. For 'Choice - Single Answer' custom field type, this defaults to Dropdown. For 'Choice - Multiple Answers' custom field type, this defaults to MultiSelectBox.

## Example Usage

```csharp
using Cvent.SDK.Models.Components;

var value = ChoicesDisplayTypeJson.Dropdown;
```


## Values

| Name             | Value            |
| ---------------- | ---------------- |
| `Dropdown`       | Dropdown         |
| `Vertical`       | Vertical         |
| `Horizontal`     | Horizontal       |
| `MultiSelectBox` | MultiSelectBox   |