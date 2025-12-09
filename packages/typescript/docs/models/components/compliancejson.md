# ComplianceJson

Privacy compliance fields for a contact.

## Example Usage

```typescript
import { ComplianceJson } from "@cvent/sdk/models/components";

let value: ComplianceJson = {
  creationTime: new Date("2021-03-08T17:30:01.727Z"),
  complianceScope: "CCPA",
  action: "DO_NOT_SELL",
  createdBy: "PLANNER",
};
```

## Fields

| Field                                                                                         | Type                                                                                          | Required                                                                                      | Description                                                                                   | Example                                                                                       |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `creationTime`                                                                                | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_minus_sign:                                                                            | Date-time (in GMT) when privacy compliance details were created for the contact.              | 2021-03-08T17:30:01.727Z                                                                      |
| `complianceScope`                                                                             | [components.ComplianceScope](../../models/components/compliancescope.md)                      | :heavy_minus_sign:                                                                            | Scope of privacy compliance.                                                                  | CCPA                                                                                          |
| `action`                                                                                      | [components.Action](../../models/components/action.md)                                        | :heavy_minus_sign:                                                                            | Action to take for a compliance request.                                                      | DO_NOT_SELL                                                                                   |
| `createdBy`                                                                                   | [components.CreatedBy](../../models/components/createdby.md)                                  | :heavy_minus_sign:                                                                            | Denotes how the compliance request was created.                                               | PLANNER                                                                                       |