# EventRoleAssignmentNoLoginUser

A no-login user to receive an event role. Identify the user by `id`, by `email`, or by both. When both are sent, `id` identifies the user and `email` must match that user's email address; a mismatch returns `400 Bad Request`.


## Supported Types

### IdentifiedByID

```csharp
EventRoleAssignmentNoLoginUser.CreateIdentifiedByID(/* values here */);
```

### IdentifiedByEmail

```csharp
EventRoleAssignmentNoLoginUser.CreateIdentifiedByEmail(/* values here */);
```
