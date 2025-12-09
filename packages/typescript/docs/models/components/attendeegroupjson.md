# AttendeeGroupJson

An attendee group.

## Example Usage

```typescript
import { AttendeeGroupJson } from "@cvent/sdk/models/components";

let value: AttendeeGroupJson = {
  id: "d97d28b6-cf35-4d6c-90eb-bb10fef1d1ce",
  member: true,
  leader: true,
};
```

## Fields

| Field                                                          | Type                                                           | Required                                                       | Description                                                    | Example                                                        |
| -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- |
| `id`                                                           | *string*                                                       | :heavy_minus_sign:                                             | Attendee group ID.                                             | d97d28b6-cf35-4d6c-90eb-bb10fef1d1ce                           |
| `member`                                                       | *boolean*                                                      | :heavy_minus_sign:                                             | True indicates the attendee is a member of the attendee group. | true                                                           |
| `leader`                                                       | *boolean*                                                      | :heavy_minus_sign:                                             | True indicates the attendee is a group leader.                 | true                                                           |