# GetBounceDetailsResponse

## Example Usage

```typescript
import { GetBounceDetailsResponse } from "@cvent/sdk/models/operations";

let value: GetBounceDetailsResponse = {
  result: {
    paging: {
      previousToken: "1a2b3c4d5e6f7g8h9i10j11k",
      nextToken: "1a2b3c4d5e6f7g8h9i10j11k",
      currentToken: "1a2b3c4d5e6f7g8h9i10j11k",
      limit: 100,
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
        recipient: {
          id: "2A941E55-3367-4C50-B21B-B6A7613DFB23",
          firstName: "Brett",
          lastName: "Lawler",
          emailAddress: "brett.lawler@example.com",
        },
        bounceReason: "5.7.1 (delivery not authorized)",
        bounceDateTime: new Date("2023-01-02T02:00:00Z"),
        smtpCode: 500,
        dsnDiagnostics: "smtp;500 5.7.1 (delivery not authorized)",
        optOut: true,
        subject: "Invitation to the event",
        productLine: "EVENT",
        productId: "2A941E55-3367-4C50-B21B-B6A7613DFB23",
        emailType: "Invitation",
        emailId: "2A941E55-3367-4C50-B21B-B6A7613DFB23",
        created: new Date("2023-01-01T02:00:00Z"),
      },
    ],
  },
};
```

## Fields

| Field                                                                                | Type                                                                                 | Required                                                                             | Description                                                                          |
| ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ |
| `result`                                                                             | [components.BounceDetailsResponse](../../models/components/bouncedetailsresponse.md) | :heavy_check_mark:                                                                   | N/A                                                                                  |