# AccountUserContactDetails

The contact details of a Cvent core account user.

## Example Usage

```typescript
import { AccountUserContactDetails } from "@cvent/sdk/models/components";

let value: AccountUserContactDetails = {
  honorificPrefix: "Mr.",
  firstName: "Jack",
  middleName: "John",
  lastName: "Tripper",
  title: "Senior Software Engineer",
  organization: "Cvent",
  email: "jack.tripper@example.com",
  homePhone: "+17035551234",
  homeFax: "+17035551234",
  mobilePhone: "+17035551234",
  workPhone: "+17035551234",
  workFax: "+17035551234",
  pager: "+17035551234",
  address: {
    address1: "1765 Greensboro Station Pl",
    address2: "7th Floor",
    address3: "",
    city: "McLean",
    countryCode: "US",
    regionCode: "VA",
    postalCode: "22102",
  },
};
```

## Fields

| Field                                                                          | Type                                                                           | Required                                                                       | Description                                                                    | Example                                                                        |
| ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ |
| `honorificPrefix`                                                              | *string*                                                                       | :heavy_minus_sign:                                                             | Honorific prefix to use before users name.                                     | Mr.                                                                            |
| `firstName`                                                                    | *string*                                                                       | :heavy_check_mark:                                                             | User's first name.                                                             | Jack                                                                           |
| `middleName`                                                                   | *string*                                                                       | :heavy_minus_sign:                                                             | User's middle name.                                                            | John                                                                           |
| `lastName`                                                                     | *string*                                                                       | :heavy_check_mark:                                                             | User's last name.                                                              | Tripper                                                                        |
| `title`                                                                        | *string*                                                                       | :heavy_minus_sign:                                                             | Position held by the current user.                                             | Senior Software Engineer                                                       |
| `organization`                                                                 | *string*                                                                       | :heavy_minus_sign:                                                             | Organization in which the user is employed.                                    | Cvent                                                                          |
| `email`                                                                        | *string*                                                                       | :heavy_check_mark:                                                             | User associated email.                                                         | jack.tripper@example.com                                                       |
| `homePhone`                                                                    | *string*                                                                       | :heavy_minus_sign:                                                             | Phone number associated to given user.                                         | +17035551234                                                                   |
| `homeFax`                                                                      | *string*                                                                       | :heavy_minus_sign:                                                             | Phone number associated to given user.                                         | +17035551234                                                                   |
| `mobilePhone`                                                                  | *string*                                                                       | :heavy_minus_sign:                                                             | Phone number associated to given user.                                         | +17035551234                                                                   |
| `workPhone`                                                                    | *string*                                                                       | :heavy_minus_sign:                                                             | Phone number associated to given user.                                         | +17035551234                                                                   |
| `workFax`                                                                      | *string*                                                                       | :heavy_minus_sign:                                                             | Phone number associated to given user.                                         | +17035551234                                                                   |
| `pager`                                                                        | *string*                                                                       | :heavy_minus_sign:                                                             | Phone number associated to given user.                                         | +17035551234                                                                   |
| `address`                                                                      | [components.AccountUserAddress](../../models/components/accountuseraddress.md) | :heavy_minus_sign:                                                             | Represents the address of a Cvent core account user.                           |                                                                                |