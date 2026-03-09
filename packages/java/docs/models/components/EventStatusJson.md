# EventStatusJson

Event status denotes if the event is in the past, present or future. Also can denote if the event was cancelled or deleted. 

## Example Usage

```java
import com.cvent.models.components.EventStatusJson;

EventStatusJson value = EventStatusJson.UPCOMING;
```


## Values

| Name         | Value        |
| ------------ | ------------ |
| `UPCOMING`   | Upcoming     |
| `ONGOING`    | Ongoing      |
| `COMPLETED`  | Completed    |
| `CANCELLED`  | Cancelled    |
| `DELETED`    | Deleted      |
| `PROCESSING` | Processing   |
| `ARCHIVED`   | Archived     |