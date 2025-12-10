# ServiceProviderConfig

Service Provider Configs

## Example Usage

```typescript
import { ServiceProviderConfig } from "@cvent/sdk/models/components";

let value: ServiceProviderConfig = {
  schemas: [
    "urn:ietf:params:scim:api:messages:2.0:ListResponse",
  ],
  documentationUri:
    "https://developers.cvent.com/documentation#section/Introduction",
  patch: {
    supported: false,
  },
  bulk: {
    supported: false,
    maxOperations: 1,
    maxPayloadSize: 1048576,
  },
  filter: {
    supported: false,
    maxResults: 100,
  },
  changePassword: {
    supported: false,
  },
  sort: {
    supported: false,
  },
  etag: {
    supported: false,
  },
  authenticationSchemes: [
    {
      name: "OAuth Bearer Token",
      description:
        "Authentication scheme using the OAuth Bearer Token Standard",
      specUri:
        "https://developers.cvent.com/documentation#section/Introduction",
      documentationUri:
        "https://developers.cvent.com/documentation#section/Introduction",
      type: "oauthbearertoken",
      primary: true,
    },
  ],
  meta: {
    resourceType: "user",
    location: "https://<account>/scim/v2/Users/2",
    created: new Date("2021-12-16T00:59:14.570Z"),
    lastModified: new Date("2021-12-16T00:59:14.570Z"),
  },
};
```

## Fields

| Field                                                                                            | Type                                                                                             | Required                                                                                         | Description                                                                                      | Example                                                                                          |
| ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ |
| `schemas`                                                                                        | *string*[]                                                                                       | :heavy_minus_sign:                                                                               | The list of schemas using this resource.                                                         |                                                                                                  |
| `documentationUri`                                                                               | *string*                                                                                         | :heavy_minus_sign:                                                                               | The location of the API documentation.                                                           | https://developers.cvent.com/documentation#section/Introduction                                  |
| `patch`                                                                                          | [components.Patch](../../models/components/patch.md)                                             | :heavy_minus_sign:                                                                               | Config details for patch operations.                                                             |                                                                                                  |
| `bulk`                                                                                           | [components.Bulk](../../models/components/bulk.md)                                               | :heavy_minus_sign:                                                                               | Config details for bulk operations.                                                              |                                                                                                  |
| `filter`                                                                                         | [components.ServiceProviderConfigFilter](../../models/components/serviceproviderconfigfilter.md) | :heavy_minus_sign:                                                                               | Config details for filter operations.                                                            |                                                                                                  |
| `changePassword`                                                                                 | [components.ChangePassword](../../models/components/changepassword.md)                           | :heavy_minus_sign:                                                                               | Config details for change password operations.                                                   |                                                                                                  |
| `sort`                                                                                           | [components.Sort](../../models/components/sort.md)                                               | :heavy_minus_sign:                                                                               | Config details for sort operations.                                                              |                                                                                                  |
| `etag`                                                                                           | [components.Etag](../../models/components/etag.md)                                               | :heavy_minus_sign:                                                                               | Config details for change e-tag operations.                                                      |                                                                                                  |
| `authenticationSchemes`                                                                          | [components.AuthenticationSchemaJson](../../models/components/authenticationschemajson.md)[]     | :heavy_minus_sign:                                                                               | The collection of authentication schemas.                                                        |                                                                                                  |
| `meta`                                                                                           | [components.MetaJson](../../models/components/metajson.md)                                       | :heavy_minus_sign:                                                                               | Metadata of the resource.                                                                        |                                                                                                  |