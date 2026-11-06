# ExternalReference

An external reference linking the attendee to a record in an external system.

## Example Usage

```typescript
import { ExternalReference } from "@cvent/sdk/models/components";

let value: ExternalReference = {
  type: "Cvent Salesforce App",
  id: "0000X123sfjhooks",
  referenceId: "000X123jhooks",
};
```

## Fields

| Field                                                                                | Type                                                                                 | Required                                                                             | Description                                                                          | Example                                                                              |
| ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ |
| `type`                                                                               | [components.ExternalReferenceType](../../models/components/externalreferencetype.md) | :heavy_minus_sign:                                                                   | Type of the external system.                                                         | Cvent Salesforce App                                                                 |
| `id`                                                                                 | *string*                                                                             | :heavy_minus_sign:                                                                   | External system ID.                                                                  | 0000X123sfjhooks                                                                     |
| `referenceId`                                                                        | *string*                                                                             | :heavy_minus_sign:                                                                   | Attendee ID in the external system.                                                  | 000X123jhooks                                                                        |