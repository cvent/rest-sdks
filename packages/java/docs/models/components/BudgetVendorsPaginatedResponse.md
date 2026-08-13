# BudgetVendorsPaginatedResponse

The response from a request to get the list of vendors.


## Fields

| Field                                                                          | Type                                                                           | Required                                                                       | Description                                                                    |
| ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ |
| `paging`                                                                       | [Paging](../../models/components/Paging.md)                                    | :heavy_check_mark:                                                             | Represents pagination information for a collection of resources.               |
| `data`                                                                         | List\<[BudgetVendorResponse](../../models/components/BudgetVendorResponse.md)> | :heavy_check_mark:                                                             | Collection of budget vendor entities.                                          |