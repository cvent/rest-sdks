# CommunicationConfiguration

Communication compliance settings e.g. Configure which communication types will be tracked and logged for this account.

## Example Usage

```typescript
import { CommunicationConfiguration } from "@cvent/sdk/models/components";

let value: CommunicationConfiguration = {
  enabledMessageTypes: [],
};
```

## Fields

| Field                                                                                                      | Type                                                                                                       | Required                                                                                                   | Description                                                                                                |
| ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- |
| `enabledMessageTypes`                                                                                      | [components.CommunicationLogMessageTypeJson](../../models/components/communicationlogmessagetypejson.md)[] | :heavy_check_mark:                                                                                         | The list of message types that communication compliance is enabled for.                                    |