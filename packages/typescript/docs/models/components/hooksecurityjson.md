# HookSecurityJson

Describe security for a web hook callback. Each option corresponds to an Authorization header variant.


## Supported Types

### `components.APIKeyAuthentication`

```typescript
const value: components.APIKeyAuthentication = {
  type: "apiKey",
  secret: "2b3cc2bf083ff11206ce6b2f3ee09591",
  authHeaderKey: "x-api-key",
};
```

### `components.BasicAuthentication`

```typescript
const value: components.BasicAuthentication = {
  type: "apiKey",
  secret: "ZGVtbzpwQDU1dzByZA==",
};
```

