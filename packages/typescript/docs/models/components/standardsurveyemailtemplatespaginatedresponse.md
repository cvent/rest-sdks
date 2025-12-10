# StandardSurveyEmailTemplatesPaginatedResponse

Response include paging and collection of email templates of a particular standard survey

## Example Usage

```typescript
import { StandardSurveyEmailTemplatesPaginatedResponse } from "@cvent/sdk/models/components";

let value: StandardSurveyEmailTemplatesPaginatedResponse = {
  paging: {
    previousToken: "1a2b3c4d5e6f7g8h9i10j11k",
    nextToken: "1a2b3c4d5e6f7g8h9i10j11k",
    currentToken: "1a2b3c4d5e6f7g8h9i10j11k",
    limit: 100,
    totalCount: 2,
    links: {
      next: {
        href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
      },
      self: {
        href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
      },
      prev: {
        href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
      },
    },
  },
  data: [
    {
      created: new Date("2017-01-02T02:00:00Z"),
      createdBy: "hporter",
      lastModified: new Date("2019-02-12T03:00:00Z"),
      lastModifiedBy: "hporter",
      name: "Invitation",
      subject: "Email Template Testing",
      fromName: "Henry Potterfield",
      fromEmail: "h.potterfield@test.com",
      plaintextBody:
        "We’d love to hear your thoughts!\n\nPlease take a few minutes to let us know about your recent experience.\n\nStart Survey Now ({[RES-SURVEY URL]})",
      htmlBody:
        "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\"><html><head><title></title></head><body style=\"margin:0;padding:0\" id=\"body\"><table ><tbody><tr><td align=\"center\" bgcolor=\"#041532\"><table ><tbody><tr><td align=\"center\" bgcolor=\"#DDE2E6\" style=\"padding-top:0;padding-bottom:0;padding-left:0;padding-right:0\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"max-width:600px\" class=\"wrapper\"><tbody><tr><td><table><tbody><tr><td valign=\"top\"><table><tbody><tr><td><table><tbody><tr><td bgcolor=\"transparent\" style=\"padding-top:15px;padding-bottom:15px;padding-left:15px;padding-right:15px\"><table><tbody><tr><td><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\"><tr><td>{[C-FIRST NAME]}, <br></td></tr> <tr><td>We&#x2019;d love to hear your thoughts!</td></tr> </table></td></tr></tbody></table></td></tr></tbody></table></td></tr></tbody></table></td></tr><tr><td valign=\"top\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" align=\"left\" class=\"column\"><tbody><tr><td><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" data-cvent-id=\"widget-NucleusText-widget:13ea36d2-1eb4-452f-ae17-9d582dbeb7eb\"><tbody><tr><td bgcolor=\"transparent\" style=\"padding-top:15px;padding-bottom:15px;padding-left:15px;padding-right:15px\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\"><tbody><tr><td><table><tr><td>Please take a few minutes to let us know about your recent experience.</td></tr> </table></td></tr></tbody></table></td></tr></tbody></table></td></tr></tbody></table></td></tr><tr><td valign=\"top\"><table><tbody><tr><td><table><tbody><tr><td><table><tbody><tr><td >Start Survey Now</a></td></tr></tbody></table></td></tr></tbody></table></td></tr></tbody></table></td></tr><tr><td valign=\"top\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" align=\"left\" class=\"column\"><tbody><tr><td><table ><tbody><tr><td bgcolor=\"transparent\" style=\"padding-top:15px;padding-bottom:15px;padding-left:15px;padding-right:15px\"><table ><tbody><tr><td><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\"><tr><td style=\"font-size:16px;line-height:20px;font-family:Arial,Helvetica,sans-serif;color:#273F69;font-style:normal;font-weight:400;text-align:center; padding: 6px 0;\">If you have any questions, feel free to email us at {[SUR-AUTHOR EMAIL]}.<br>Thank you,<br>{[SUR-AUTHOR COMPANY]}&#xA0;</td></tr> </table></td></tr></tbody></table></td></tr></tbody></table></td></tr></tbody></table></td></tr><tr><td valign=\"top\"><table><tbody><tr><td><table><tbody><tr><td bgcolor=\"transparent\" style=\"padding-top:15px;padding-bottom:15px;padding-left:15px;padding-right:15px\"><table ><tbody><tr><td><table><tr><td>Click the link below to opt out of receiving emails from {[SUR-AUTHOR FIRST NAME]} {[SUR-AUTHOR LAST NAME]}.<br>{[EMAIL OPT OUT]}&#xA0;</td></tr> </table></td></tr></tbody></table></td></tr></tbody></table></td></tr></tbody></table></td></tr></tbody></table></td></tr></tbody></table></td></tr><tr><td><table><tbody><tr><td><table><tbody></tbody></table></td></tr></tbody></table></td></tr></tbody></table> ></td></tr></tbody></table></body></html>",
      locale: "en-US",
      clickTrackingEnabled: true,
      replyToName: "Henry Potterfield",
      replyToEmail: "h.potterfield@test.com",
      id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
      active: true,
    },
  ],
};
```

## Fields

| Field                                                                                                      | Type                                                                                                       | Required                                                                                                   | Description                                                                                                |
| ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- |
| `paging`                                                                                                   | [components.PagingJson](../../models/components/pagingjson.md)                                             | :heavy_check_mark:                                                                                         | Represents pagination information for a collection of resources.                                           |
| `data`                                                                                                     | [components.StandardSurveyEmailTemplateJson](../../models/components/standardsurveyemailtemplatejson.md)[] | :heavy_check_mark:                                                                                         | Collection of standard survey email templates                                                              |