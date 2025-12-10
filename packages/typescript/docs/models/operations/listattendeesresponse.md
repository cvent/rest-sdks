# ListAttendeesResponse

## Example Usage

```typescript
import { ListAttendeesResponse } from "@cvent/sdk/models/operations";

let value: ListAttendeesResponse = {
  result: {
    paging: {
      previousToken: "1a2b3c4d5e6f7g8h9i10j11k",
      nextToken: "1a2b3c4d5e6f7g8h9i10j11k",
      currentToken: "1a2b3c4d5e6f7g8h9i10j11k",
      limit: 100,
      totalCount: 2,
      links: {
        next: {
          href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
        },
        self: {
          href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
        },
        prev: {
          href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
        },
      },
    },
    data: [
      {
        created: new Date("2017-01-02T02:00:00Z"),
        createdBy: "hporter",
        lastModified: new Date("2019-02-12T03:00:00Z"),
        lastModifiedBy: "hporter",
        confirmationNumber: "VNNDLJ6DKVK",
        contact: {
          firstName: "Henry",
          lastName: "Potterfield",
          middleName: "A",
          nickname: "Harry",
          email: "h.potterfield@test.com",
          ccEmail: "h.porter@tesing.com",
          gender: "Male",
          company: "Cvent Inc.",
          designation: "Event",
          title: "Event Planner",
          type: {
            id: "861B51EC-AA7E-475F-B38D-4C8E35C47D63",
            name: "VIP Member",
          },
          primaryAddressType: "Home",
          homeAddress: {
            address1: "Cvent Inc.",
            address2: "4001 West Parmer Lane",
            address3: "PO Box 123",
            city: "Austin",
            countryCode: "US",
            postalCode: "78727",
            region: "Texas",
            regionCode: "TX",
            country: "United States of America",
            latitude: 30,
            longitude: -97,
          },
          homePhone: "555-555-5555",
          homeFax: "555-555-5555",
          workAddress: {
            address1: "Cvent Inc.",
            address2: "4001 West Parmer Lane",
            address3: "PO Box 123",
            city: "Austin",
            countryCode: "US",
            postalCode: "78727",
            region: "Texas",
            regionCode: "TX",
            country: "United States of America",
            latitude: 30,
            longitude: -97,
          },
          workPhone: "555-555-5555",
          workFax: "555-555-5555",
          optOut: {},
          customFields: [
            {
              id: "a3572698-a615-4f55-a7a1-b30b588e81fa",
              name: "What is a your favorite color?",
              type: "General",
              value: [
                "Choice C",
                "Choice A",
              ],
              order: 1,
            },
          ],
          sourceId: "system-a-00000000-0000-0000-0000-000000000000",
          mobilePhone: "555-555-5555",
          compliance: [
            {
              creationTime: new Date("2021-03-08T17:30:01.727Z"),
              complianceScope: "CCPA",
              action: "DO_NOT_SELL",
              createdBy: "PLANNER",
            },
          ],
          prefix: "Dr.",
          pager: "555-555-5555",
          headline:
            "Marketing Director Crafting Memorable Campaigns that Engage Audiences and Elevate Brands",
          personalWebsite: "https://www.example.com",
          biography:
            "I am a marketing professional with experience in event planning and brand strategy.",
          pronouns: "he/him/she/her/they/them",
          links: {
            twitterUrl: {
              href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
            },
            facebookUrl: {
              href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
            },
            linkedInUrl: {
              href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
            },
            profilePicture: {
              href: "https://cvent.com/picture123",
            },
          },
        },
        checkedIn: true,
        checkIn: new Date("2018-01-13T02:00:00Z"),
        checkOut: new Date("2018-01-13T02:00:00Z"),
        duration: 4000,
        registrationPath: {
          id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
          code: "MU",
          name: "Meet up",
        },
        invitationList: {
          id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
          name: "Sample Object name",
        },
        webLinks: {
          acceptRegistration:
            "https://example.com/123ABC?i=abcdefghijklmnopqrstuv",
          declineRegistration:
            "https://example.com/123ABC?i=abcdefghijklmnopqrstuv",
        },
        registrationType: {
          id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
          code: "MU",
          name: "Meet up",
        },
        referenceId: "refid-plannerside",
        externalReferences: [
          {
            type: "Cvent Salesforce App",
            id: "0000X123sfjhooks",
            referenceId: "000X123jhooks",
          },
        ],
        note: "Would like to sit near the front of the room for sessions.",
        guest: true,
        deletedGuest: false,
        group: {
          id: "d97d28b6-cf35-4d6c-90eb-bb10fef1d1ce",
          member: true,
          leader: true,
        },
        administrator: {
          id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
        },
        unsubscribed: false,
        status: "Accepted",
        registeredAt: new Date("2018-01-13T02:00:00Z"),
        registrationLastModified: new Date("2018-01-13T02:00:00Z"),
        registrationCancelledAt: new Date("2018-01-13T02:00:00Z"),
        invitedBy: "Planner-Invited",
        responseMethod: "Self-Responded",
        answers: [
          {
            question: {
              id: "60f1d05b-e3ee-4d70-a7f3-0edb9a76af4a",
            },
            value: [
              "1234",
            ],
          },
        ],
        admissionItem: {
          id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
          code: "MU",
          name: "Meet up",
        },
        visibility: "Private",
        bio:
          "In west Philadelphia, born and raised, on the playground is where I spent most of my days.",
        websiteUrl: "https://www.example.com",
        allowPushNotifications: false,
        allowAppointmentPushNotifications: false,
        testRecord: false,
        attendeeLastModified: new Date("2018-01-13T02:00:00Z"),
        appointmentGroups: [
          {
            id: "bf183d50-56ad-454b-8b9f-06d8e923e1fd",
          },
        ],
        credit: 10,
      },
    ],
  },
};
```

## Fields

| Field                                                                                        | Type                                                                                         | Required                                                                                     | Description                                                                                  |
| -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- |
| `result`                                                                                     | [components.AttendeePaginatedResponse](../../models/components/attendeepaginatedresponse.md) | :heavy_check_mark:                                                                           | N/A                                                                                          |