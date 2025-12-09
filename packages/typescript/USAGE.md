<!-- Start SDK Example Usage [usage] -->
```typescript
import { CventSDK } from "@cvent/sdk";

const cventSDK = new CventSDK({
  security: {
    oAuth2ClientCredentials: {
      clientID: process.env["CVENTSDK_CLIENT_ID"] ?? "",
      clientSecret: process.env["CVENTSDK_CLIENT_SECRET"] ?? "",
      tokenURL: process.env["CVENTSDK_TOKEN_URL"] ?? "",
      scopes: process.env["CVENTSDK_SCOPES"] ?? "",
    },
  },
});

async function run() {
  const result = await cventSDK.users.getAccountUserGroups({
    token: "1a2b3c4d5e6f7g8h9i10j11k",
    filter: "name eq 'My User Group'",
  });

  for await (const page of result) {
    console.log(page);
  }
}

run();

```
<!-- End SDK Example Usage [usage] -->