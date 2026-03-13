# RegistrationPackRequest

A registration pack containing event, exhibitor, and capacities information.


## Fields

| Field                                                          | Type                                                           | Required                                                       | Description                                                    |
| -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- |
| `event`                                                        | [EventJson6](../../models/components/EventJson6.md)            | :heavy_check_mark:                                             | The Associated Event.                                          |
| `exhibitor`                                                    | [ExhibitorJson](../../models/components/ExhibitorJson.md)      | :heavy_check_mark:                                             | The Associated Exhibitor.                                      |
| `capacities`                                                   | List\<[CapacityJson](../../models/components/CapacityJson.md)> | :heavy_check_mark:                                             | An array of capacities for the registration pack.              |