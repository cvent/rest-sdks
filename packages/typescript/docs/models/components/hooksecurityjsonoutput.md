# HookSecurityJsonOutput

Describe security for a web hook callback. Each option corresponds to an Authorization header variant.


## Supported Types

### `components.APIKeyAuthenticationOutput`

```typescript
const value: components.APIKeyAuthenticationOutput = {
  type: "apiKey",
  authHeaderKey: "x-api-key",
};
```

### `components.BasicAuthenticationOutput`

```typescript
const value: components.BasicAuthenticationOutput = {
  type: "apiKey",
};
```

