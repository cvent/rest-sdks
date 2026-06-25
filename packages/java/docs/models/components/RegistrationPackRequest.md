# RegistrationPackRequest

A registration pack defining the registration type capacity allocations for an exhibitor at an event.


## Fields

| Field                                                  | Type                                                   | Required                                               | Description                                            |
| ------------------------------------------------------ | ------------------------------------------------------ | ------------------------------------------------------ | ------------------------------------------------------ |
| `event`                                                | [Event3](../../models/components/Event3.md)            | :heavy_check_mark:                                     | The Associated Event.                                  |
| `exhibitor`                                            | [Exhibitor](../../models/components/Exhibitor.md)      | :heavy_check_mark:                                     | The Associated Exhibitor.                              |
| `capacities`                                           | List\<[Capacity](../../models/components/Capacity.md)> | :heavy_check_mark:                                     | An array of capacities for the registration pack.      |