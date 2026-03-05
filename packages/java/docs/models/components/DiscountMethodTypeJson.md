# DiscountMethodTypeJson

The method of the discount. All methods use the `value` field to determine the amount discounted. `BY_PERCENTAGE`: Discounts the item by a percentage. `BY_AMOUNT`: Discount the item by a specific amount. `FLAT_PRICE`: Set the price of the item to a specific value.

## Example Usage

```java
import com.cvent.models.components.DiscountMethodTypeJson;

DiscountMethodTypeJson value = DiscountMethodTypeJson.BY_AMOUNT;
```


## Values

| Name            | Value           |
| --------------- | --------------- |
| `BY_AMOUNT`     | BY_AMOUNT       |
| `BY_PERCENTAGE` | BY_PERCENTAGE   |
| `FLAT_PRICE`    | FLAT_PRICE      |