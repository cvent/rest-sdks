# RegistrationPackRequest

A registration pack containing event, exhibitor, and capacities information.


## Fields

| Field                                                         | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `Event`                                                       | [EventJson6](../../Models/Components/EventJson6.md)           | :heavy_check_mark:                                            | The Associated Event.                                         |
| `Exhibitor`                                                   | [ExhibitorJson](../../Models/Components/ExhibitorJson.md)     | :heavy_check_mark:                                            | The Associated Exhibitor.                                     |
| `Capacities`                                                  | List<[CapacityJson](../../Models/Components/CapacityJson.md)> | :heavy_check_mark:                                            | An array of capacities for the registration pack.             |