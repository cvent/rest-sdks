# ExternalReferenceJson

An external reference.

## Example Usage

```typescript
import { ExternalReferenceJson } from "@cvent/sdk/models/components";

let value: ExternalReferenceJson = {
  type: "Cvent Salesforce App",
  id: "0000X123sfjhooks",
  referenceId: "000X123jhooks",
};
```

## Fields

| Field                                                                                        | Type                                                                                         | Required                                                                                     | Description                                                                                  | Example                                                                                      |
| -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- |
| `type`                                                                                       | [components.ExternalReferenceTypeJson](../../models/components/externalreferencetypejson.md) | :heavy_minus_sign:                                                                           | Type of the external system.                                                                 | Cvent Salesforce App                                                                         |
| `id`                                                                                         | *string*                                                                                     | :heavy_minus_sign:                                                                           | The identifier of the external system.                                                       | 0000X123sfjhooks                                                                             |
| `referenceId`                                                                                | *string*                                                                                     | :heavy_minus_sign:                                                                           | The identifier of an attendee in the external system.                                        | 000X123jhooks                                                                                |