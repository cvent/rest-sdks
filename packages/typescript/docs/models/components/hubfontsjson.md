# HubFontsJson

The fonts of the Events+ hub.

## Example Usage

```typescript
import { HubFontsJson } from "@cvent/sdk/models/components";

let value: HubFontsJson = {
  headingId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  bodyId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};
```

## Fields

| Field                                                                                                       | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 | Example                                                                                                     |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `headingId`                                                                                                 | *string*                                                                                                    | :heavy_minus_sign:                                                                                          | The id of the font used in this Events+ hub's heading. Custom fonts are previously uploaded in the account. | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                                                        |
| `bodyId`                                                                                                    | *string*                                                                                                    | :heavy_minus_sign:                                                                                          | The id of the font used in this Events+ hub's body text. Custom fonts are previously uploaded in account.   | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                                                        |