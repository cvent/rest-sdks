# BidItemStatusType

The negotiation status of the bid item. For example, the corporation marks an item as `delete_requested`, and the hotel updates the item to `deleted` when it agrees. `not_offered`: The hotel does not offer the amenity. Applies only to the supply side.

## Example Usage

```java
import com.cvent.models.components.BidItemStatusType;

BidItemStatusType value = BidItemStatusType.REQUESTED;
```


## Values

| Name               | Value              |
| ------------------ | ------------------ |
| `REQUESTED`        | requested          |
| `DELETE_REQUESTED` | delete_requested   |
| `DELETED`          | deleted            |
| `NOT_OFFERED`      | not_offered        |