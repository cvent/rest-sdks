# FieldType

Determines the required format for a field. `DateTime`: Data is in date-time format. `MultiChoice`: Data is one or more options from a list. `Number`: Data is a number. `SingleChoice`: Data is a a single option from a list. `Text`: Data is free-text input.

## Example Usage

```csharp
using Cvent.SDK.Models.Components;

var value = FieldType.DateTime;
```


## Values

| Name           | Value          |
| -------------- | -------------- |
| `DateTime`     | DateTime       |
| `MultiChoice`  | MultiChoice    |
| `Number`       | Number         |
| `SingleChoice` | SingleChoice   |
| `Text`         | Text           |