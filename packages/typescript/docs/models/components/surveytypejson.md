# SurveyTypeJson

Describes the survey's type. `Standalone` indicates the survey exists independent of an event. `Event` indicates the survey is an event or session feedback survey. `Assessment` indicates the survey is associated with an event and is for assessing attendees.

## Example Usage

```typescript
import { SurveyTypeJson } from "@cvent/sdk/models/components";

let value: SurveyTypeJson = "Event";
```

## Values

```typescript
"Standalone" | "Event" | "Assessment"
```