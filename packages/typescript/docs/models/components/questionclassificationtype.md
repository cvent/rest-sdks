# QuestionClassificationType

Indicates the types of RFP that can be assigned this custom question. `MEETING_ROOM`: Meeting room type RFPs can be assigned this custom question. `GUEST_ROOM`: Guest room type RFPs can be assigned this custom question. `ALL_RFPS`:  All RFPs can be assigned this custom question.

## Example Usage

```typescript
import { QuestionClassificationType } from "@cvent/sdk/models/components";

let value: QuestionClassificationType = "ALL_RFPS";
```

## Values

```typescript
"MEETING_ROOM" | "GUEST_ROOM" | "ALL_RFPS"
```