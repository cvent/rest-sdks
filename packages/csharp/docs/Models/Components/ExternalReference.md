# ExternalReference

An external reference linking the attendee to a record in an external system.


## Fields

| Field                                                                     | Type                                                                      | Required                                                                  | Description                                                               | Example                                                                   |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `Type`                                                                    | [ExternalReferenceType](../../Models/Components/ExternalReferenceType.md) | :heavy_minus_sign:                                                        | Type of the external system.                                              | Cvent Salesforce App                                                      |
| `Id`                                                                      | *string*                                                                  | :heavy_minus_sign:                                                        | External system ID.                                                       | 0000X123sfjhooks                                                          |
| `ReferenceId`                                                             | *string*                                                                  | :heavy_minus_sign:                                                        | Attendee ID in the external system.                                       | 000X123jhooks                                                             |