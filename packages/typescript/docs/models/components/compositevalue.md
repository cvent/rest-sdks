# CompositeValue

The structured representation of a complex question answer. Contains the same data as `value`, parsed into typed objects instead of JSON-serialized strings. This field is **read-only** — to write complex question answers, use `value` instead.

The structure of the array depends on the question `type`.


## Supported Types

### `components.MeetingRoomRequirement[]`

```typescript
const value: components.MeetingRoomRequirement[] = [];
```

### `components.SleepingRoomRequirement[]`

```typescript
const value: components.SleepingRoomRequirement[] = [];
```

### `components.BudgetEstimate[]`

```typescript
const value: components.BudgetEstimate[] = [
  {
    currency: "USD",
    costType: "FIXED",
    costDetail: [
      {
        category: {
          id: 3,
          name: "Travel",
        },
        subCategory: {
          id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
          name: "utilities",
        },
        units: 5.2,
        cost: 100.5,
        totalCost: 100.5,
      },
    ],
  },
];
```

