# Version

The identifier of the Budget version for an event.


## Fields

| Field                                                                            | Type                                                                             | Required                                                                         | Description                                                                      | Example                                                                          |
| -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- |
| `Id`                                                                             | *string*                                                                         | :heavy_minus_sign:                                                               | A string that has to be a format matching the industry standard uuid             | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                             |
| `Name`                                                                           | *string*                                                                         | :heavy_minus_sign:                                                               | Name of the budget version.                                                      | Budget Version 2                                                                 |
| `Default`                                                                        | *bool*                                                                           | :heavy_minus_sign:                                                               | True indicates the associated budget is the default budget version of the event. | true                                                                             |