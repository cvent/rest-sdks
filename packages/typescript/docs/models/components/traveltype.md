# TravelType

Type of travel alternate question. Supported values: AirRequest = attendee requested air travel; HotelRequest = attendee requested hotel travel; AirActual = actual air travel booked; GroupFlight = group flight booking; TrainRequest = attendee requested train travel; AirAndTrainRequest = attendee did not want air or train travel and submitted an alternate response.

## Example Usage

```typescript
import { TravelType } from "@cvent/sdk/models/components";

let value: TravelType = "AirRequest";
```

## Values

```typescript
"AirRequest" | "HotelRequest" | "AirActual" | "GroupFlight" | "TrainRequest" | "AirAndTrainRequest"
```