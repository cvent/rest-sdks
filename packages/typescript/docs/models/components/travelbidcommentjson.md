# TravelBidCommentJson

A comment on a travel bid.

## Example Usage

```typescript
import { TravelBidCommentJson } from "@cvent/sdk/models/components";

let value: TravelBidCommentJson = {
  commentType: "promotions",
  comment: "This is a high value client.",
};
```

## Fields

| Field                                                                    | Type                                                                     | Required                                                                 | Description                                                              | Example                                                                  |
| ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ |
| `commentType`                                                            | [components.CommentTypeJson](../../models/components/commenttypejson.md) | :heavy_minus_sign:                                                       | Bid comment type                                                         | promotions                                                               |
| `comment`                                                                | *string*                                                                 | :heavy_minus_sign:                                                       | The text of the comment.                                                 | This is a high value client.                                             |