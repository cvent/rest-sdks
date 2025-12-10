# SessionNoShow

A session activity.

## Example Usage

```typescript
import { SessionNoShow } from "@cvent/sdk/models/components";

let value: SessionNoShow = {
  session: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    title: "tech_session",
    code: "XRNGB4YY3CX",
  },
};
```

## Fields

| Field                                                                      | Type                                                                       | Required                                                                   | Description                                                                |
| -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- |
| `session`                                                                  | [components.SessionActivity5](../../models/components/sessionactivity5.md) | :heavy_minus_sign:                                                         | The activity session.                                                      |