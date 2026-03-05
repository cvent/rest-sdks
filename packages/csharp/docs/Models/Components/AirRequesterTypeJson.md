# AirRequesterTypeJson

Representation of an attendee type of the flight requester. Contact means the requester is an independent attendee. Guest means the attendee is accompanying another attendee. Unknown means attendee has requested a flight for passenger other than its guest.

## Example Usage

```csharp
using Cvent.SDK.Models.Components;

var value = AirRequesterTypeJson.Contact;
```


## Values

| Name      | Value     |
| --------- | --------- |
| `Contact` | Contact   |
| `Guest`   | Guest     |
| `Unknown` | Unknown   |