# CreateConnectionRequest

## Example Usage

```typescript
import { CreateConnectionRequest } from "@cvent/sdk/models/operations";

let value: CreateConnectionRequest = {
  cventAccessCode: "<value>",
};
```

## Fields

| Field                                                                                                                                                  | Type                                                                                                                                                   | Required                                                                                                                                               | Description                                                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `cventAccessCode`                                                                                                                                      | *string*                                                                                                                                               | :heavy_check_mark:                                                                                                                                     | Example:<br/><br/>Cvent-Access-Code: c44bf029-f7f1-43dc-95c7-79403b247e2a<br/><br/><br/>Access code for the event. It can be provided to integration partner in an email.<br/> |