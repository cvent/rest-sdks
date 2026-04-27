# RebateTypeJson

Rebate type for specifying the rebate value on citywide RFPs. If rebateType is `BY_AMOUNT`, the rebate value will be in decimal format. If rebateType is `BY_PERCENTAGE`, the rebate value will represent a percentage.

## Example Usage

```java
import com.cvent.models.components.RebateTypeJson;

RebateTypeJson value = RebateTypeJson.BY_AMOUNT;
```


## Values

| Name            | Value           |
| --------------- | --------------- |
| `BY_AMOUNT`     | BY_AMOUNT       |
| `BY_PERCENTAGE` | BY_PERCENTAGE   |