# SpeakerProgramItem

Represents a program item object that will be added to a speaker.

## Example Usage

```typescript
import { SpeakerProgramItem } from "@cvent/sdk/models/components";

let value: SpeakerProgramItem = {
  created: new Date("2017-01-02T02:00:00Z"),
  createdBy: "hporter",
  lastModified: new Date("2019-02-12T03:00:00Z"),
  lastModifiedBy: "hporter",
  id: "38db6ae2-0dc3-487b-953e-86d6abbdf7d3",
  event: {
    id: "2ef03846-fced-4ce3-a077-d64ca891a4b1",
  },
  session: {
    id: "832cb481-74c5-4859-ba21-bbb5be8b86e0",
  },
  speaker: {
    id: "6077a9f1-a230-40cd-9e32-b493a84aaa80",
  },
  programItem: {
    id: "221984b2-9e3e-4c1c-8ef4-306b1b75fa3e",
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
| `id`                                                                                          | *string*                                                                                      | :heavy_minus_sign:                                                                            | ID of the speaker to program item relationship.                                               | 38db6ae2-0dc3-487b-953e-86d6abbdf7d3                                                          |
| `event`                                                                                       | [components.EventLiteJson](../../models/components/eventlitejson.md)                          | :heavy_check_mark:                                                                            | The unique identifier of an event.                                                            |                                                                                               |
| `session`                                                                                     | [components.SessionLiteJson](../../models/components/sessionlitejson.md)                      | :heavy_check_mark:                                                                            | The unique identifier of a session.                                                           |                                                                                               |
| `speaker`                                                                                     | [components.SpeakerLiteJson](../../models/components/speakerlitejson.md)                      | :heavy_check_mark:                                                                            | The unique identifier of a speaker.                                                           |                                                                                               |
| `programItem`                                                                                 | [components.ProgramItemLiteJson](../../models/components/programitemlitejson.md)              | :heavy_check_mark:                                                                            | The unique identifier of a program item.                                                      |                                                                                               |