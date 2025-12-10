# LaunchEventFeaturesRequest

## Example Usage

```typescript
import { LaunchEventFeaturesRequest } from "@cvent/sdk/models/operations";

let value: LaunchEventFeaturesRequest = {
  id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  type: "Registration",
};
```

## Fields

| Field                                                                                        | Type                                                                                         | Required                                                                                     | Description                                                                                  | Example                                                                                      |
| -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- |
| `id`                                                                                         | *string*                                                                                     | :heavy_check_mark:                                                                           | Unique Id of an event                                                                        | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                                         |
| `type`                                                                                       | [components.LaunchFeatureTypeJson](../../models/components/launchfeaturetypejson.md)         | :heavy_check_mark:                                                                           | Event feature to be launched.                                                                | Registration                                                                                 |
| `eventFeatureLaunchRequest`                                                                  | [components.EventFeatureLaunchRequest](../../models/components/eventfeaturelaunchrequest.md) | :heavy_minus_sign:                                                                           | N/A                                                                                          |                                                                                              |