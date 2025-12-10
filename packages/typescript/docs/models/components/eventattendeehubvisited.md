# EventAttendeeHubVisited

An event attendee-hub-visited activity.

## Example Usage

```typescript
import { EventAttendeeHubVisited } from "@cvent/sdk/models/components";

let value: EventAttendeeHubVisited = {
  browser: "firefox",
  operatingSystem: "windows",
  pageName: "event website visits",
  buttonText: "Go to My Event 11",
};
```

## Fields

| Field                                                                           | Type                                                                            | Required                                                                        | Description                                                                     | Example                                                                         |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `browser`                                                                       | *string*                                                                        | :heavy_minus_sign:                                                              | The name of the web browser.                                                    | firefox                                                                         |
| `operatingSystem`                                                               | *string*                                                                        | :heavy_minus_sign:                                                              | The name of the operating system.                                               | windows                                                                         |
| `pageName`                                                                      | *string*                                                                        | :heavy_minus_sign:                                                              | The name of the event website page before the attendee arrived in Attendee Hub. | event website visits                                                            |
| `buttonText`                                                                    | *string*                                                                        | :heavy_minus_sign:                                                              | Text on the button.                                                             | Go to My Event 11                                                               |