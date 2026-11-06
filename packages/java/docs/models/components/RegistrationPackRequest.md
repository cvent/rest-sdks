# RegistrationPackRequest

A registration pack defining the registration type capacity allocations for an exhibitor at an event.


## Fields

| Field                                                  | Type                                                   | Required                                               | Description                                            |
| ------------------------------------------------------ | ------------------------------------------------------ | ------------------------------------------------------ | ------------------------------------------------------ |
| `event`                                                | [Event4](../../models/components/Event4.md)            | :heavy_check_mark:                                     | Associated event.                                      |
| `exhibitor`                                            | [Exhibitor](../../models/components/Exhibitor.md)      | :heavy_check_mark:                                     | Associated exhibitor.                                  |
| `capacities`                                           | List\<[Capacity](../../models/components/Capacity.md)> | :heavy_check_mark:                                     | List of the capacities of the registration pack.       |