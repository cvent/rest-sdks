# ExhibitorQuestionTypeJson

Enumeration indicating the type of data collected by an exhibitor question. 'MultiChoice': Respondents select multiple options from a list. 'SingleChoice': restricts respondents to a single option from a list, often displayed as a dropdown or radio button. 'OpenEndedTextOneLine': brief text responses, such as names or short answers. 'OpenEndedTextCommentBox': longer text responses for detailed feedback. 'OpenEndedDateTime': captures date and time information from respondents.

## Example Usage

```typescript
import { ExhibitorQuestionTypeJson } from "@cvent/sdk/models/components";

let value: ExhibitorQuestionTypeJson = "SingleChoice";
```

## Values

```typescript
"MultiChoice" | "SingleChoice" | "OpenEndedTextOneLine" | "OpenEndedTextCommentBox" | "OpenEndedDateTime"
```