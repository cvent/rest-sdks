# CommissionApplicableType1

The category of hotel or venue service to which a commission applies.

Values:
- `ACCOMMODATIONS` — Hotel or venue room accommodations.
- `AUDIO_AND_VISUAL_ONSITE_ASSISTANCE` — Audio and visual onsite assistance services.
- `DDR` — Day delegate rate packages.
- `FOOD_AND_BEVERAGE` — Food and beverage services.
- `MEETING_SPACES_MEETING_ROOM_RENTAL` — Meeting spaces and meeting room rental.
- `OTHER` — Other applicable commission category not covered by a standard value.

## Example Usage

```typescript
import { CommissionApplicableType1 } from "@cvent/sdk/models/components";

let value: CommissionApplicableType1 = "FOOD_AND_BEVERAGE";
```

## Values

```typescript
"ACCOMMODATIONS" | "AUDIO_AND_VISUAL_ONSITE_ASSISTANCE" | "DDR" | "FOOD_AND_BEVERAGE" | "MEETING_SPACES_MEETING_ROOM_RENTAL" | "OTHER"
```