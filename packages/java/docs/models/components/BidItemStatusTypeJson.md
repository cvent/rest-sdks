# BidItemStatusTypeJson

The status of the item in negotiation.  e.g. The corporation might mark an item as delete_requested, and the hotel, if they agree, can update the item to deleted.

## Example Usage

```java
import com.cvent.models.components.BidItemStatusTypeJson;

BidItemStatusTypeJson value = BidItemStatusTypeJson.REQUESTED;
```


## Values

| Name               | Value              |
| ------------------ | ------------------ |
| `REQUESTED`        | requested          |
| `DELETE_REQUESTED` | delete_requested   |
| `DELETED`          | deleted            |
| `NOT_AVAILABLE`    | not_available      |