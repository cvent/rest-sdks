# ExistingCustomFieldDetailsInput

Type-specific details of the custom-field.


## Supported Types

### `components.ZeroOneOf1`

```typescript
const value: components.ZeroOneOf1 = {
  answerFormat: "General",
  minimum: 2,
  maximum: 8,
};
```

### `components.OneOneOf`

```typescript
const value: components.OneOneOf = {
  from: new Date("2021-01-02T02:00:00Z"),
  to: new Date("2021-02-02T02:00:00Z"),
  format: "DateOnlyMonthFirst",
  defaultToCurrentDate: false,
};
```

### `components.Two`

```typescript
const value: components.Two = {
  minimum: 2,
  maximum: 8,
};
```

### `components.ThreeInput`

```typescript
const value: components.ThreeInput = {
  choices: [
    {
      text: "What is your current designation?",
    },
  ],
};
```

