# RegistrationPackRequest

A registration pack defining the registration type capacity allocations for an exhibitor at an event.


## Fields

| Field                                                               | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `Event`                                                             | [Event4](../../Models/Components/Event4.md)                         | :heavy_check_mark:                                                  | The Associated Event.                                               |
| `Exhibitor`                                                         | [Models.Components.Exhibitor](../../Models/Components/Exhibitor.md) | :heavy_check_mark:                                                  | The Associated Exhibitor.                                           |
| `Capacities`                                                        | List<[Capacity](../../Models/Components/Capacity.md)>               | :heavy_check_mark:                                                  | An array of capacities for the registration pack.                   |