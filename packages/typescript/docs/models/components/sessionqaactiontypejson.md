# SessionQaActionTypeJson

The user action that just occurred.
 `question.asked` - A question was asked.
 `question.upvoted` - A question was upvoted.
 `question.statusUpdated` - The status of a question was updated.
 `question.answered` - Either question was answered or the earlier provided answer was updated.
 `answer.deleted` - An answer was deleted.

## Example Usage

```typescript
import { SessionQaActionTypeJson } from "@cvent/sdk/models/components";

let value: SessionQaActionTypeJson = "question.asked";
```

## Values

```typescript
"question.asked" | "question.upvoted" | "question.statusUpdated" | "question.answered" | "answer.deleted"
```