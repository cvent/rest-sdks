# AnswerTypeJson1

Indicates the type of the answer, which determines how the `value` and `secondaryValue` fields are interpreted.

Set to **"Other"** when the question has the **"Other"** choice option enabled, indicating the answer in the **"secondaryValue"** field is a free-text response to that option.

Set to **"NA"** when the question has the **"N/A"** choice option enabled, to indicate an N/A type answer; in this case, `value` is omitted.

In all other cases, `answerType` is not expected to be set.

## Example Usage

```typescript
import { AnswerTypeJson1 } from "@cvent/sdk/models/components";

let value: AnswerTypeJson1 = "Other";
```

## Values

```typescript
"Other" | "NA"
```