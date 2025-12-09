# OpenEndedDateTime

This is used to denote the open ended date time type of custom field.

## Example Usage

```typescript
import { OpenEndedDateTime } from "@cvent/sdk/models/components";

let value: OpenEndedDateTime = {
  from: new Date("2021-01-02T02:00:00Z"),
  to: new Date("2021-02-02T02:00:00Z"),
  format: "DateOnlyMonthFirst",
  defaultToCurrentDate: false,
};
```

## Fields

| Field                                                                                         | Type                                                                                          | Required                                                                                      | Description                                                                                   | Example                                                                                       |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `from`                                                                                        | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_minus_sign:                                                                            | The ISO 8601 zoned minimum date time accepted.                                                | 2021-01-02T02:00:00Z                                                                          |
| `to`                                                                                          | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_minus_sign:                                                                            | The ISO 8601 zoned maximum date time accepted.                                                | 2021-02-02T02:00:00Z                                                                          |
| `format`                                                                                      | [components.DateTimeDisplayFormatJson](../../models/components/datetimedisplayformatjson.md)  | :heavy_minus_sign:                                                                            | This is used to denote the display format type of date time type custom field.                | DateOnlyMonthFirst                                                                            |
| `defaultToCurrentDate`                                                                        | *boolean*                                                                                     | :heavy_minus_sign:                                                                            | Whether it needs to be pre populated with current date.                                       | false                                                                                         |
| `displayPopUpCalendar`                                                                        | *boolean*                                                                                     | :heavy_minus_sign:                                                                            | True means that a pop-up calendar will be displayed to assist date selection on UI.           | false                                                                                         |