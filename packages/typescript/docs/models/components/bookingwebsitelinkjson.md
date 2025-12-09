# BookingWebsiteLinkJson

Unique URL for a guest to access a reservation in Passkey's booking tool.

## Example Usage

```typescript
import { BookingWebsiteLinkJson } from "@cvent/sdk/models/components";

let value: BookingWebsiteLinkJson = {
  href:
    "https://book.passkey.com/entry?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJwYXlsb2FkIjp7ImVudHJ5IjoiUkVHSVNUUkFUSU9OIiwicGFyYW1zIjpbeyJuYW1lIjoiYnJpZGdlSWQiLCJ2YWx1ZSI6IlQ3VFdNTEhQLUdFNEQifV19fQ.7sH1gO_1Aambk-SRRlO2c7ac2DOpqLmCB-zsxB71q_A",
};
```

## Fields

| Field                                           | Type                                            | Required                                        | Description                                     | Example                                         |
| ----------------------------------------------- | ----------------------------------------------- | ----------------------------------------------- | ----------------------------------------------- | ----------------------------------------------- |
| `href`                                          | *string*                                        | :heavy_check_mark:                              | A url provided that can be followed for linking | ?token=90c5f062-76ad-4ea4-aa53-00eb698d9262     |