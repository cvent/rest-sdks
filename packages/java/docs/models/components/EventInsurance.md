# EventInsurance

Indicates whether event insurance is required at the venue. Applicable only to venue types: Aquarium/Zoo, Arena/Stadium, Banquet Facility, Bar/Club, Corporate Office Space, Educational Facility, Entertainment Venue, Gallery/Museum, Golf Course, Movie Theatre, and Special Event Venue.

Values:
- `BLANK` — Indicates no selection, leaves the field blank
- `REQUIRED` — Required
- `MAY_BE_REQUIRED` — May Be Required
- `NOT_REQUIRED` — Not Required

## Example Usage

```java
import com.cvent.models.components.EventInsurance;

EventInsurance value = EventInsurance.BLANK;
```


## Values

| Name              | Value             |
| ----------------- | ----------------- |
| `BLANK`           | BLANK             |
| `REQUIRED`        | REQUIRED          |
| `MAY_BE_REQUIRED` | MAY_BE_REQUIRED   |
| `NOT_REQUIRED`    | NOT_REQUIRED      |