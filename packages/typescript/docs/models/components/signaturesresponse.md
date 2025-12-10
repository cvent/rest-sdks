# SignaturesResponse

Paginated Response of Attendee Signatures.

## Example Usage

```typescript
import { SignaturesResponse } from "@cvent/sdk/models/components";

let value: SignaturesResponse = {
  paging: {
    previousToken: "1a2b3c4d5e6f7g8h9i10j11k",
    nextToken: "1a2b3c4d5e6f7g8h9i10j11k",
    currentToken: "1a2b3c4d5e6f7g8h9i10j11k",
    limit: 100,
    totalCount: 2,
    links: {
      next: {
        href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
      },
      self: {
        href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
      },
      prev: {
        href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
      },
    },
  },
  data: [
    {
      created: new Date("2017-01-02T02:00:00Z"),
      createdBy: "hporter",
      lastModified: new Date("2019-02-12T03:00:00Z"),
      lastModifiedBy: "hporter",
      id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
      event: {
        id: "b62809dd-7556-49d2-884a-591bbf96cf1a",
      },
      session: {
        id: "4d44b9e4-8c1a-403d-a20a-0b981f539935",
      },
      attendee: {
        id: "ce359543-61f5-492d-b8de-875c3473e8ae",
      },
      type: "EVENT",
      checkinSignatureUrl:
        "https://custom.t2.cvent.com/files/contact/signatures/checkinSignature.jpg",
      checkoutSignatureUrl:
        "https://custom.t2.cvent.com/files/contact/signatures/checkoutSignature.jpg",
    },
  ],
};
```

## Fields

| Field                                                                                                  | Type                                                                                                   | Required                                                                                               | Description                                                                                            |
| ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ |
| `paging`                                                                                               | [components.PagingJson](../../models/components/pagingjson.md)                                         | :heavy_minus_sign:                                                                                     | Represents pagination information for a collection of resources.                                       |
| `data`                                                                                                 | [components.AttendeeSignatureResponseJson](../../models/components/attendeesignatureresponsejson.md)[] | :heavy_minus_sign:                                                                                     | Collection of signatures.                                                                              |