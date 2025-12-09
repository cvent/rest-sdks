# ProgramItemSessionDocument

Represents a program item object that will be added to a session document.

## Example Usage

```typescript
import { ProgramItemSessionDocument } from "@cvent/sdk/models/components";

let value: ProgramItemSessionDocument = {
  created: new Date("2017-01-02T02:00:00Z"),
  createdBy: "hporter",
  lastModified: new Date("2019-02-12T03:00:00Z"),
  lastModifiedBy: "hporter",
  id: "38db6ae2-0dc3-487b-953e-86d6abbdf7d3",
  event: {
    id: "78842378-5d83-11ee-8c99-0242ac120002",
  },
  session: {
    id: "78842aee-5d83-11ee-8c99-0242ac120002",
  },
  document: {},
  programItem: {
    id: "788426ac-5d83-11ee-8c99-0242ac120002",
  },
};
```

## Fields

| Field                                                                                         | Type                                                                                          | Required                                                                                      | Description                                                                                   | Example                                                                                       |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `created`                                                                                     | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_minus_sign:                                                                            | The ISO 8601 zoned date time when this record was created.                                    | 2017-01-02T02:00:00Z                                                                          |
| `createdBy`                                                                                   | *string*                                                                                      | :heavy_minus_sign:                                                                            | The identifier of the user that created this record.                                          | hporter                                                                                       |
| `lastModified`                                                                                | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_minus_sign:                                                                            | The ISO 8601 zoned date time when this record was updated.                                    | 2019-02-12T03:00:00Z                                                                          |
| `lastModifiedBy`                                                                              | *string*                                                                                      | :heavy_minus_sign:                                                                            | The identifier of the user that last updated this record.                                     | hporter                                                                                       |
| `id`                                                                                          | *string*                                                                                      | :heavy_minus_sign:                                                                            | ID of the session document to program item relationship.                                      | 38db6ae2-0dc3-487b-953e-86d6abbdf7d3                                                          |
| `event`                                                                                       | [components.EventLiteJson1](../../models/components/eventlitejson1.md)                        | :heavy_check_mark:                                                                            | The related event object.                                                                     |                                                                                               |
| `session`                                                                                     | [components.SessionLiteJson1](../../models/components/sessionlitejson1.md)                    | :heavy_check_mark:                                                                            | The related session object.                                                                   |                                                                                               |
| `document`                                                                                    | [components.SessionDocumentLiteJson](../../models/components/sessiondocumentlitejson.md)      | :heavy_check_mark:                                                                            | The related document object.                                                                  |                                                                                               |
| `programItem`                                                                                 | [components.ProgramItemLiteJson1](../../models/components/programitemlitejson1.md)            | :heavy_check_mark:                                                                            | The program item associated with the session.                                                 |                                                                                               |