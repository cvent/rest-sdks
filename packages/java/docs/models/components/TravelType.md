# TravelType

Type of travel alternate question. Supported values: AirRequest = attendee requested air travel; HotelRequest = attendee requested hotel travel; AirActual = actual air travel booked; GroupFlight = group flight booking; TrainRequest = attendee requested train travel; AirAndTrainRequest = attendee did not want air or train travel and submitted an alternate response.

## Example Usage

```java
import com.cvent.models.components.TravelType;

TravelType value = TravelType.AIR_REQUEST;
```


## Values

| Name                    | Value                   |
| ----------------------- | ----------------------- |
| `AIR_REQUEST`           | AirRequest              |
| `HOTEL_REQUEST`         | HotelRequest            |
| `AIR_ACTUAL`            | AirActual               |
| `GROUP_FLIGHT`          | GroupFlight             |
| `TRAIN_REQUEST`         | TrainRequest            |
| `AIR_AND_TRAIN_REQUEST` | AirAndTrainRequest      |