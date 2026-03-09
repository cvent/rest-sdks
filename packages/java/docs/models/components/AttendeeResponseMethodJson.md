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

## Example Usage

```java
import com.cvent.models.components.AttendeeResponseMethodJson;

AttendeeResponseMethodJson value = AttendeeResponseMethodJson.ADMINISTRATOR_RESPONDED;
```


## Values

| Name                                         | Value                                        |
| -------------------------------------------- | -------------------------------------------- |
| `ADMINISTRATOR_RESPONDED`                    | Administrator Responded                      |
| `ADMINISTRATOR_RESPONDED_WIDGET`             | Administrator Responded Widget               |
| `API_RESPONDED`                              | API-Responded                                |
| `APPOINTMENTS_EVENT_WEBSITE`                 | Appointments Event Website                   |
| `CVENT_SALESFORCE_APP`                       | Cvent Salesforce App                         |
| `CVENT_SALESFORCE_APP_CAMPAIGN_PAGE`         | Cvent Salesforce App - Campaign Page         |
| `CVENT_SALESFORCE_APP_CONTACT_PAGE`          | Cvent Salesforce App - Contact Page          |
| `CVENT_SALESFORCE_APP_EVENT_PAGE`            | Cvent Salesforce App - Event Page            |
| `CVENT_SALESFORCE_APP_LEAD_PAGE`             | Cvent Salesforce App - Lead Page             |
| `CVENT_SALESFORCE_APP_PERSON_ACCOUNT_PAGE`   | Cvent Salesforce App - Person Account Page   |
| `CVENT_SALESFORCE_APP_RECOMMENDATION_WIDGET` | Cvent Salesforce App - Recommendation Widget |
| `EXTERNAL_REGISTRATION`                      | External Registration                        |
| `GROUP_LEADER_RESPONDED`                     | Group Leader Responded                       |
| `GROUP_LEADER_RESPONDED_WIDGET`              | Group Leader Responded Widget                |
| `HISTORICAL_IMPORT`                          | Historical Import                            |
| `IMPORTED`                                   | Imported                                     |
| `NO_RESPONSE`                                | No Response                                  |
| `ON_SITE_RESPONDED`                          | On-site Responded                            |
| `PLANNER_IMPORTED`                           | Planner-Imported                             |
| `PLANNER_RESPONDED`                          | Planner-Responded                            |
| `POST_EVENT`                                 | Post Event                                   |
| `SELF_RESPONDED`                             | Self-Responded                               |
| `SELF_RESPONDED_MOBILE`                      | Self-Responded Mobile                        |
| `SELF_RESPONDED_WIDGET`                      | Self-Responded Widget                        |