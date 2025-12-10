# ProgramItemSessionDocuments

Represents an array of session document IDs associated with the given program item ID.

## Example Usage

```typescript
import { ProgramItemSessionDocuments } from "@cvent/sdk/models/components";

let value: ProgramItemSessionDocuments = {
  data: [
    {
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
    },
  ],
};
```

## Fields

| Field                                                                                            | Type                                                                                             | Required                                                                                         | Description                                                                                      |
| ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ |
| `data`                                                                                           | [components.ProgramItemSessionDocument](../../models/components/programitemsessiondocument.md)[] | :heavy_minus_sign:                                                                               | List of program item session documents.                                                          |