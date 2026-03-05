# DistributionListSecurityTypeJson

Type of distribution list security. For a public list, contacts can sign up themselves. For a semi-private list, contacts can add themselves, but a planner must approve their membership before they can receive emails. For a private list, only planners can add contacts. Contacts can always remove themselves from lists on the Manage Profile page.

## Example Usage

```csharp
using Cvent.SDK.Models.Components;

var value = DistributionListSecurityTypeJson.Private;
```


## Values

| Name          | Value         |
| ------------- | ------------- |
| `Private`     | PRIVATE       |
| `SemiPrivate` | SEMI_PRIVATE  |
| `Public`      | PUBLIC        |