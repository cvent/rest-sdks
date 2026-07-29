# VenueDetailsPatchChainScale

A market segment classification of a venue chain based on Average Daily Rate and other factors.

Values:
- `BLANK` — Blank
- `ECONOMYCHAINS` — Economy Chains
- `INDEPENDENTS` — Independents
- `LUXURY_CHAINS` — Luxury Chains
- `MIDSCALE_CHAINS` — Midscale Chains
- `MIDSCALE_WITH_FB_CHAINS` — Midscale With F&B Chains
- `MIDSCALE_WITHOUT_FB_CHAINS` — Midscale Without F&B Chains
- `UPPER_MIDSCALE_CHAINS` — Upper Midscale Chains
- `UPPER_UPSCALE_CHAINS` — Upper Upscale Chains
- `UPSCALE_CHAINS` — Upscale Chains

## Example Usage

```typescript
import { VenueDetailsPatchChainScale } from "@cvent/sdk/models/components";

let value: VenueDetailsPatchChainScale = "UPSCALE_CHAINS";
```

## Values

```typescript
"BLANK" | "ECONOMYCHAINS" | "INDEPENDENTS" | "LUXURY_CHAINS" | "MIDSCALE_CHAINS" | "MIDSCALE_WITH_FB_CHAINS" | "MIDSCALE_WITHOUT_FB_CHAINS" | "UPPER_MIDSCALE_CHAINS" | "UPPER_UPSCALE_CHAINS" | "UPSCALE_CHAINS"
```