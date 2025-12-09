# RewardProgramJson

Represents reward program information.

## Example Usage

```typescript
import { RewardProgramJson } from "@cvent/sdk/models/components";

let value: RewardProgramJson = {
  id: 10000,
  name: "Test name",
};
```

## Fields

| Field              | Type               | Required           | Description        | Example            |
| ------------------ | ------------------ | ------------------ | ------------------ | ------------------ |
| `id`               | *number*           | :heavy_check_mark: | Reward ID.         | 10000              |
| `name`             | *string*           | :heavy_minus_sign: | Reward name.       | Test name          |