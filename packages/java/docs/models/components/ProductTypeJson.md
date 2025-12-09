# ProductTypeJson

Represents a product's type. `AdmissionItem`: Product is a ticket to an event, typically denotes the day(s) the individual is attending. Every attendee must have an admission item. `Session`: Product is a agenda item at the event. Typically denotes a talk, presentation, or other scheduled occurrence at the event. `SessionBundle`: Product is a session bundle that enrolls the attendee into all the sessions included in the bundle, sometimes at a discounted rate. `QuantityItem`: Product is a quantity of things an attendee is purchasing at an event, like t-shirts or raffle tickets.


## Values

| Name             | Value            |
| ---------------- | ---------------- |
| `ADMISSION_ITEM` | AdmissionItem    |
| `SESSION`        | Session          |
| `SESSION_BUNDLE` | SessionBundle    |
| `QUANTITY_ITEM`  | QuantityItem     |