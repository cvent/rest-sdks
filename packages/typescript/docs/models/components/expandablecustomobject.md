# ExpandableCustomObject

An object containing custom field data. By default, contains only the field ID.

This is an **expandable** object. When requested via the `expand` query parameter with value `customField`, this object expands to include all properties of a custom field definition.

See the `expand` parameter documentation and refer to the [Get Custom Field](#tag/Custom-Fields/operation/getCustomField) API for the complete expanded schema.

## Example Usage

```typescript
import { ExpandableCustomObject } from "@cvent/sdk/models/components";

let value: ExpandableCustomObject = {
  id: "50dc08af-24a9-4d01-84be-3d43133dc945",
};
```

## Fields

| Field                                | Type                                 | Required                             | Description                          | Example                              |
| ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ |
| `id`                                 | *string*                             | :heavy_check_mark:                   | Unique identifier for custom field.  | 50dc08af-24a9-4d01-84be-3d43133dc945 |