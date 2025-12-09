# AttendeeResponseMethodJson

Represents the method by which an attendee registered for the event.

- Administrator Responded: The invitee was registered by another contact acting as their administrator.
- API-Responded: The invitee was registered through a custom process configured via an API integration.
- Appointments Event Website: The invitee registered via an appointments event website.
- Cvent Salesforce App: The invitee registered through an action in the Cvent Salesforce App.
- External Registration: The attendee was registered through an external integration, such as Marketo.
- Group Leader Responded: The invitee was registered by a group leader and added to a group.
- Historical Import: The invitee's registration was imported into the event as historical data.
- Imported: The invitee's registration was imported into the event.
- No Response: The invitee has not registered.
- On-site Responded: The invitee registered onsite using OnArrival's Kiosk Mode.
- Planner-Imported: An account user imported the invitee's registration into the event.
- Planner-Responded: An account user registered the invitee from the Cvent back-end or the planner-side of the OnArrival app.
- Post Event: The invitee was registered by an account user after the event's end date or while the event was in Completed status.
- Self-Responded: The invitee registered themselves through a weblink or invitation.

Note: The responseMethod can only be set if the invitee's status is No Response.


## Values

| Name                                         | Value                                        |
| -------------------------------------------- | -------------------------------------------- |
| `AdministratorResponded`                     | Administrator Responded                      |
| `AdministratorRespondedWidget`               | Administrator Responded Widget               |
| `APIResponded`                               | API-Responded                                |
| `AppointmentsEventWebsite`                   | Appointments Event Website                   |
| `CventSalesforceApp`                         | Cvent Salesforce App                         |
| `CventSalesforceAppCampaignPage`             | Cvent Salesforce App - Campaign Page         |
| `CventSalesforceAppContactPage`              | Cvent Salesforce App - Contact Page          |
| `CventSalesforceAppEventPage`                | Cvent Salesforce App - Event Page            |
| `CventSalesforceAppLeadPage`                 | Cvent Salesforce App - Lead Page             |
| `CventSalesforceAppPersonAccountPage`        | Cvent Salesforce App - Person Account Page   |
| `CventSalesforceAppRecommendationWidget`     | Cvent Salesforce App - Recommendation Widget |
| `ExternalRegistration`                       | External Registration                        |
| `GroupLeaderResponded`                       | Group Leader Responded                       |
| `GroupLeaderRespondedWidget`                 | Group Leader Responded Widget                |
| `HistoricalImport`                           | Historical Import                            |
| `Imported`                                   | Imported                                     |
| `NoResponse`                                 | No Response                                  |
| `OnSiteResponded`                            | On-site Responded                            |
| `PlannerImported`                            | Planner-Imported                             |
| `PlannerResponded`                           | Planner-Responded                            |
| `PostEvent`                                  | Post Event                                   |
| `SelfResponded`                              | Self-Responded                               |
| `SelfRespondedMobile`                        | Self-Responded Mobile                        |
| `SelfRespondedWidget`                        | Self-Responded Widget                        |