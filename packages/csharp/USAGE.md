<!-- Start SDK Example Usage [usage] -->
```csharp
using Cvent.SDK;
using Cvent.SDK.Models.Components;
using Cvent.SDK.Models.Requests;

var sdk = new CventSDK(security: new Security() {
    OAuth2ClientCredentials = new SchemeOAuth2ClientCredentials() {
        ClientID = "<YOUR_CLIENT_ID_HERE>",
        ClientSecret = "<YOUR_CLIENT_SECRET_HERE>",
        TokenURL = "<YOUR_TOKEN_URL_HERE>",
        Scopes = "<YOUR_SCOPES_HERE>",
    },
});

GetAccountUserGroupsRequest req = new GetAccountUserGroupsRequest() {
    Token = "1a2b3c4d5e6f7g8h9i10j11k",
    Filter = "name eq 'My User Group'",
};

GetAccountUserGroupsResponse? res = await sdk.Users.GetAccountUserGroupsAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```
<!-- End SDK Example Usage [usage] -->