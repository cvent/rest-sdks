# RefundTypeJson

The type of refund policy for the fee. `RefundByFixedAmount`: Returns a fixed amount to the attendee as chosen by the planner. `RefundByCancellationAmount`: Refunds everything to the attendee minus an cancellation fee chosen by the planner. `RefundByPercentage`: Refunds a percentage of the amount as chosen by the planner.

## Example Usage

```java
import com.cvent.models.components.RefundTypeJson;

RefundTypeJson value = RefundTypeJson.REFUND_BY_FIXED_AMOUNT;
```


## Values

| Name                            | Value                           |
| ------------------------------- | ------------------------------- |
| `REFUND_BY_FIXED_AMOUNT`        | RefundByFixedAmount             |
| `REFUND_BY_CANCELLATION_AMOUNT` | RefundByCancellationAmount      |
| `REFUND_BY_PERCENTAGE`          | RefundByPercentage              |