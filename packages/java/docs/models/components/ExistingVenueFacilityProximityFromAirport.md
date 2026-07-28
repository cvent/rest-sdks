# ExistingVenueFacilityProximityFromAirport

Distance from the nearest airport. `unit` is required when `distance` is provided.


## Fields

| Field                                                                                    | Type                                                                                     | Required                                                                                 | Description                                                                              | Example                                                                                  |
| ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- |
| `distance`                                                                               | *Optional\<Double>*                                                                      | :heavy_minus_sign:                                                                       | Distance from the nearest airport, expressed in `unit`. Up to four digits.               | 12.5                                                                                     |
| `unit`                                                                                   | [Optional\<DistanceMeasurementUnit>](../../models/components/DistanceMeasurementUnit.md) | :heavy_minus_sign:                                                                       | Unit of measurement for distance.<br/><br/>Values:<br/>- `MILES` — Miles<br/>- `KILOMETERS` — Kilometers |                                                                                          |