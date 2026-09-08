# Region1

Region where the live stream originates. Although, the value is consumed for IVS livestreams the requested origin is actually ignored due to IVS' global data plane.

## Example Usage

```typescript
import { Region1 } from "@cvent/sdk/models/components";

let value: Region1 = "Oregon";
```

## Values

```typescript
"Oregon" | "Virginia" | "Tokyo" | "Singapore" | "Sydney" | "Mumbai" | "Frankfurt" | "Ireland"
```