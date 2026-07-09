# DisplayType1

Display type indicating how to display the choices on UI. For 'Choice - Single Answer' custom field type, this defaults to Dropdown. For 'Choice - Multiple Answers' custom field type, this defaults to MultiSelectBox.

## Example Usage

```java
import com.cvent.models.components.DisplayType1;

DisplayType1 value = DisplayType1.DROPDOWN;
```


## Values

| Name               | Value              |
| ------------------ | ------------------ |
| `DROPDOWN`         | Dropdown           |
| `VERTICAL`         | Vertical           |
| `HORIZONTAL`       | Horizontal         |
| `MULTI_SELECT_BOX` | MultiSelectBox     |