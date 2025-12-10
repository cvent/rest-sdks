# CampaignDataJson

Campaign data model.

## Example Usage

```typescript
import { CampaignDataJson } from "@cvent/sdk/models/components";

let value: CampaignDataJson = {
  created: new Date("2017-01-02T02:00:00Z"),
  createdBy: "hporter",
  lastModified: new Date("2019-02-12T03:00:00Z"),
  lastModifiedBy: "hporter",
  campaignId: "2A941E55-3367-4C50-B21B-B6A7613DFB23",
  campaignName: "Demo Campaign",
  active: true,
  clickTrackingEnabled: true,
  companyName: "Demo Company",
  fromName: "Demo name",
};
```

## Fields

| Field                                                                                         | Type                                                                                          | Required                                                                                      | Description                                                                                   | Example                                                                                       |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `created`                                                                                     | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_minus_sign:                                                                            | The ISO 8601 zoned date time when this record was created.                                    | 2017-01-02T02:00:00Z                                                                          |
| `createdBy`                                                                                   | *string*                                                                                      | :heavy_minus_sign:                                                                            | The identifier of the user that created this record.                                          | hporter                                                                                       |
| `lastModified`                                                                                | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_minus_sign:                                                                            | The ISO 8601 zoned date time when this record was updated.                                    | 2019-02-12T03:00:00Z                                                                          |
| `lastModifiedBy`                                                                              | *string*                                                                                      | :heavy_minus_sign:                                                                            | The identifier of the user that last updated this record.                                     | hporter                                                                                       |
| `campaignId`                                                                                  | *string*                                                                                      | :heavy_minus_sign:                                                                            | Unique ID of a campaign.                                                                      | 2A941E55-3367-4C50-B21B-B6A7613DFB23                                                          |
| `campaignName`                                                                                | *string*                                                                                      | :heavy_minus_sign:                                                                            | Name of the campaign.                                                                         | Demo Campaign                                                                                 |
| `active`                                                                                      | *boolean*                                                                                     | :heavy_minus_sign:                                                                            | True indicates the campaign is active.                                                        | true                                                                                          |
| `clickTrackingEnabled`                                                                        | *boolean*                                                                                     | :heavy_minus_sign:                                                                            | True indicates click tracking is enabled in the campaign.                                     | true                                                                                          |
| `companyName`                                                                                 | *string*                                                                                      | :heavy_minus_sign:                                                                            | Name of the company who is organising the campaign.                                           | Demo Company                                                                                  |
| `fromName`                                                                                    | *string*                                                                                      | :heavy_minus_sign:                                                                            | The name of the person on whose behalf the email will be sent.                                | Demo name                                                                                     |