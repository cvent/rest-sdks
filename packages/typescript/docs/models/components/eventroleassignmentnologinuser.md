# EventRoleAssignmentNoLoginUser

A no-login user to receive an event role. Identify the user by `id`, by `email`, or by both. When both are sent, `id` identifies the user and `email` must match that user's email address; a mismatch returns `400 Bad Request`.


## Supported Types

### `components.IdentifiedByID`

```typescript
const value: components.IdentifiedByID = {
  type: "NO_LOGIN_USER",
  id: "7c9e6679-7425-40de-944b-e07fc1f90ae7",
};
```

### `components.IdentifiedByEmail`

```typescript
const value: components.IdentifiedByEmail = {
  type: "NO_LOGIN_USER",
  id: "7c9e6679-7425-40de-944b-e07fc1f90ae7",
  email: "reviewer@example.com",
};
```

