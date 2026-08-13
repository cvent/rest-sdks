# CustomField2Details

Type-specific details of the custom-field.


## Supported Types

### `components.OpenEndedOneLine`

```typescript
const value: components.OpenEndedOneLine = {
  answerFormat: "General",
  minimum: 2,
  maximum: 8,
};
```

### `components.OpenEndedDateTime1`

```typescript
const value: components.OpenEndedDateTime1 = {
  from: new Date("2021-01-02T02:00:00Z"),
  to: new Date("2021-02-02T02:00:00Z"),
  format: "DateOnlyMonthFirst",
  defaultToCurrentDate: false,
};
```

### `components.OpenEndedCommentBox`

```typescript
const value: components.OpenEndedCommentBox = {
  minimum: 2,
  maximum: 8,
};
```

### `components.Choices1Input`

```typescript
const value: components.Choices1Input = {
  choices: [
    {
      text: "What is your current designation?",
    },
  ],
};
```

