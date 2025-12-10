# CallCenterLinkJson

Unique URL for Passkey users (rather than guests) to access a reservation in Passkey's call center tool.

## Example Usage

```typescript
import { CallCenterLinkJson } from "@cvent/sdk/models/components";

let value: CallCenterLinkJson = {
  href:
    "https://manage.passkey.com/Login?src=api&redirect=ccbridge&regacknumber=WODS7LK4-GA8C",
};
```

## Fields

| Field                                           | Type                                            | Required                                        | Description                                     | Example                                         |
| ----------------------------------------------- | ----------------------------------------------- | ----------------------------------------------- | ----------------------------------------------- | ----------------------------------------------- |
| `href`                                          | *string*                                        | :heavy_check_mark:                              | A url provided that can be followed for linking | ?token=90c5f062-76ad-4ea4-aa53-00eb698d9262     |