# AirRequesterType

Representation of an attendee type of the flight requester. Contact means the requester is an independent attendee. Guest means the attendee is accompanying another attendee. Unknown means attendee has requested a flight for passenger other than its guest.

## Example Usage

```java
import com.cvent.models.components.AirRequesterType;

AirRequesterType value = AirRequesterType.CONTACT;
```


## Values

| Name      | Value     |
| --------- | --------- |
| `CONTACT` | Contact   |
| `GUEST`   | Guest     |
| `UNKNOWN` | Unknown   |