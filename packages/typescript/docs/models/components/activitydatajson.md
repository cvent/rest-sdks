# ActivityDataJson

This is used to denote the type of the attendee activity


## Supported Types

### `components.AppointmentAccepted`

```typescript
const value: components.AppointmentAccepted = {
  appointment: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    name: "Meeting with Cvent",
    code: "NTNHR3XMX5Z",
    appointmentEvent: {
      title: "Demo- Attendee Activity",
      code: "VFNGZT7LH7D",
    },
    start: new Date("2020-02-03T13:00:00.000Z"),
    end: new Date("2020-02-03T14:00:00.000Z"),
  },
  contact: {
    firstName: "Henry",
    lastName: "Potterfield",
    email: "h.potterfield@test.com",
  },
};
```

### `components.AppointmentCancelled`

```typescript
const value: components.AppointmentCancelled = {
  appointment: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    name: "Meeting with Cvent",
    code: "NTNHR3XMX5Z",
    appointmentEvent: {
      title: "Demo- Attendee Activity",
      code: "VFNGZT7LH7D",
    },
    start: new Date("2020-02-03T13:00:00.000Z"),
    end: new Date("2020-02-03T14:00:00.000Z"),
  },
  contact: {
    firstName: "Henry",
    lastName: "Potterfield",
    email: "h.potterfield@test.com",
  },
};
```

### `components.AppointmentCheckedIn`

```typescript
const value: components.AppointmentCheckedIn = {
  appointment: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    name: "Meeting with Cvent",
    code: "NTNHR3XMX5Z",
    appointmentEvent: {
      title: "Demo- Attendee Activity",
      code: "VFNGZT7LH7D",
    },
    start: new Date("2020-02-03T13:00:00.000Z"),
    end: new Date("2020-02-03T14:00:00.000Z"),
  },
  contact: {
    firstName: "Henry",
    lastName: "Potterfield",
    email: "h.potterfield@test.com",
  },
  checkedIn: new Date("2020-02-03T13:00:00.000Z"),
};
```

### `components.AppointmentCreated`

```typescript
const value: components.AppointmentCreated = {
  appointment: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    name: "Meeting with Cvent",
    code: "NTNHR3XMX5Z",
    appointmentEvent: {
      title: "Demo- Attendee Activity",
      code: "VFNGZT7LH7D",
    },
    start: new Date("2020-02-03T13:00:00.000Z"),
    end: new Date("2020-02-03T14:00:00.000Z"),
  },
  contact: {
    firstName: "Henry",
    lastName: "Potterfield",
    email: "h.potterfield@test.com",
  },
};
```

### `components.AppointmentDeclined`

```typescript
const value: components.AppointmentDeclined = {
  appointment: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    name: "Meeting with Cvent",
    code: "NTNHR3XMX5Z",
    appointmentEvent: {
      title: "Demo- Attendee Activity",
      code: "VFNGZT7LH7D",
    },
    start: new Date("2020-02-03T13:00:00.000Z"),
    end: new Date("2020-02-03T14:00:00.000Z"),
  },
  contact: {
    firstName: "Henry",
    lastName: "Potterfield",
    email: "h.potterfield@test.com",
  },
};
```

### `components.AppointmentDenied`

```typescript
const value: components.AppointmentDenied = {
  appointment: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    name: "Meeting with Cvent",
    code: "NTNHR3XMX5Z",
    appointmentEvent: {
      title: "Demo- Attendee Activity",
      code: "VFNGZT7LH7D",
    },
  },
  contact: {
    firstName: "Henry",
    lastName: "Potterfield",
    email: "h.potterfield@test.com",
  },
};
```

### `components.AppointmentRescheduled`

```typescript
const value: components.AppointmentRescheduled = {
  appointment: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    name: "Meeting with Cvent",
    code: "NTNHR3XMX5Z",
    appointmentEvent: {
      title: "Demo- Attendee Activity",
      code: "VFNGZT7LH7D",
    },
    start: new Date("2020-02-03T13:00:00.000Z"),
    end: new Date("2020-02-03T14:00:00.000Z"),
  },
  contact: {
    firstName: "Henry",
    lastName: "Potterfield",
    email: "h.potterfield@test.com",
  },
};
```

### `components.EmailBounced`

```typescript
const value: components.EmailBounced = {
  type: "Invitation Reminder",
  reason: "5.x.x - delivery error",
  contact: {
    firstName: "Henry",
    lastName: "Potterfield",
    email: "h.potterfield@test.com",
  },
  bounced: new Date("2020-02-03T13:00:00.000Z"),
  smtpCode: 500,
  dsnDiagnostic: "smtp;500 ESS - global exclusion",
};
```

### `components.EmailClicked`

```typescript
const value: components.EmailClicked = {
  type: "Invitation Reminder",
  clicked: new Date("2020-02-03T13:00:00.000Z"),
  url: "http://www.cvent.com",
  urlText: "Click Here",
};
```

### `components.EmailOpened`

```typescript
const value: components.EmailOpened = {
  type: "Invitation Reminder",
  opened: new Date("2020-02-03T13:00:00.000Z"),
};
```

### `components.EmailSent`

```typescript
const value: components.EmailSent = {
  type: "Invitation Reminder",
  sent: new Date("2020-02-03T13:00:00.000Z"),
};
```

### `components.EmailUndelivered`

```typescript
const value: components.EmailUndelivered = {
  type: "Invitation Reminder",
  contact: {
    firstName: "Henry",
    lastName: "Potterfield",
    email: "h.potterfield@test.com",
  },
  undelivered: new Date("2020-02-03T13:00:00.000Z"),
};
```

### `components.EventAttendeeHubVisited`

```typescript
const value: components.EventAttendeeHubVisited = {
  browser: "firefox",
  operatingSystem: "windows",
  pageName: "event website visits",
  buttonText: "Go to My Event 11",
};
```

### `components.EventAttendeeSubstituted`

```typescript
const value: components.EventAttendeeSubstituted = {
  oldContact: {
    firstName: "Henry",
    lastName: "Potterfield",
    email: "h.potterfield@test.com",
  },
  newContact: {
    firstName: "Henry",
    lastName: "Potterfield",
    email: "h.potterfield@test.com",
  },
};
```

### `components.EventBannerLinkClicked`

```typescript
const value: components.EventBannerLinkClicked = {
  exhibitor: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    name: "AutoExpo",
    featured: true,
    eventSponsor: true,
  },
  platform: "Attendee Hub",
  target: {
    details: "https://www.cvent.com",
  },
};
```

### `components.EventCheckedIn`

```typescript
const value: components.EventCheckedIn = {
  checkedIn: new Date("2020-02-03T13:00:00.000Z"),
};
```

### `components.EventCheckedOut`

```typescript
const value: components.EventCheckedOut = {
  checkOut: new Date("2020-02-03T13:00:00.000Z"),
};
```

### `components.EventCustomCardOpened`

```typescript
const value: components.EventCustomCardOpened = {
  name: "Join our mailing list.",
  url: "https://cvent.com",
  type: "Video",
  multipleLinks: false,
};
```

### `components.EventFeedbackSubmitted`

```typescript
const value: components.EventFeedbackSubmitted = {
  survey: {
    responseMethod: "sample method",
    responses: [
      {
        question: {
          id: "861b51ec-aa7e-475f-b38d-4c8e35c47d63",
          text: "How would you rate this session?",
          code: "CODE_A",
        },
        answers: [
          {
            id: "861b51ec-aa7e-475f-b38d-4c8e35c47d63",
            text: "How would you rate this session?",
          },
        ],
      },
    ],
  },
};
```

### `components.EventNoShow`

```typescript
const value: components.EventNoShow = {};
```

### `components.EventPageVisitTracked`

```typescript
const value: components.EventPageVisitTracked = {
  source: "twitter",
  medium: "social",
  campaign: "sale",
  term: "social-media",
  content: "register-button",
  custom: "custom-param",
  additional: {
    "id": "d89eaf5b-b2dc-4ffb-964e-affbb0942e65",
    "submitted": "true",
  },
};
```

### `components.EventRegistered`

```typescript
const value: components.EventRegistered = {
  status: "Accepted",
};
```

### `components.EventRegistrationAbandoned`

```typescript
const value: components.EventRegistrationAbandoned = {
  lastSavedRegistrationPageName: "Personal Information",
  lastActivity: new Date("2020-02-03T13:00:00.000Z"),
};
```

### `components.EventRegistrationCancelled`

```typescript
const value: components.EventRegistrationCancelled = {
  status: "Accepted",
};
```

### `components.EventVideoPlayed`

```typescript
const value: components.EventVideoPlayed = {
  browser: "firefox",
  operatingSystem: "windows",
  title: "We are Cvent!",
  pageName: "Agenda",
};
```

### `components.EventWaitlisted`

```typescript
const value: components.EventWaitlisted = {
  status: "Accepted",
};
```

### `components.ExhibitorDocumentOpened`

```typescript
const value: components.ExhibitorDocumentOpened = {
  exhibitor: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    name: "AutoExpo",
    featured: true,
    eventSponsor: true,
  },
  platform: "Attendee Hub",
  document: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    title: "FAQs",
    format: "pdf",
    downloaded: true,
  },
};
```

### `components.ExhibitorSocialLinkOpened`

```typescript
const value: components.ExhibitorSocialLinkOpened = {
  exhibitor: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    name: "AutoExpo",
    featured: true,
    eventSponsor: true,
  },
  platform: "Attendee Hub",
  sponsorshipLevel: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    name: "Gold",
  },
  socialNetwork: "LinkedIn",
  url: "https://www.linkedin.com/company/cvent/mycompany/",
};
```

### `components.ExhibitorViewed`

```typescript
const value: components.ExhibitorViewed = {
  exhibitor: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    name: "AutoExpo",
    featured: true,
    eventSponsor: true,
  },
  platform: "Attendee Hub",
  sponsorshipLevel: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    name: "Gold",
  },
  navigationSource: {
    type: "Sponsored Session",
    name: "Session name",
  },
};
```

### `components.ExhibitorVirtualBoothJoined`

```typescript
const value: components.ExhibitorVirtualBoothJoined = {
  exhibitor: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    name: "AutoExpo",
    featured: true,
    eventSponsor: true,
  },
  platform: "Attendee Hub",
  sponsorshipLevel: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    name: "Gold",
  },
  solutionType: "CVC",
};
```

### `components.ExhibitorWeblinkOpened`

```typescript
const value: components.ExhibitorWeblinkOpened = {
  exhibitor: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    name: "AutoExpo",
    featured: true,
    eventSponsor: true,
  },
  platform: "Attendee Hub",
  weblink: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    name: "Cvent's website",
  },
};
```

### `components.LeadInboundCreated`

```typescript
const value: components.LeadInboundCreated = {
  exhibitor: {
    code: "CODE_UPDATE_1",
    marketingCode: "MARKETING_CODE_1",
    name: "Example Company",
  },
  lead: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  },
};
```

### `components.LeadQualified`

```typescript
const value: components.LeadQualified = {
  exhibitor: {
    code: "CODE_UPDATE_1",
    marketingCode: "MARKETING_CODE_1",
    name: "Example Company",
  },
  lead: {
    deviceId: "123",
    deviceName: "Jack's iPhone",
    boothStaff: {
      firstName: "John",
      lastName: "Doe",
      email: "h.potterfield@test.com",
    },
  },
  responses: [
    {
      question: {
        id: "861b51ec-aa7e-475f-b38d-4c8e35c47d63",
        text: "How would you rate this session?",
        code: "CODE_A",
      },
      answers: [
        {
          id: "861b51ec-aa7e-475f-b38d-4c8e35c47d63",
          text: "How would you rate this session?",
          type: "simple",
        },
      ],
    },
  ],
};
```

### `components.LeadScanned`

```typescript
const value: components.LeadScanned = {
  exhibitor: {
    code: "CODE_UPDATE_1",
    marketingCode: "MARKETING_CODE_1",
    name: "Example Company",
  },
  lead: {
    deviceId: "123",
    deviceName: "Jack's iPhone",
    boothStaff: {
      firstName: "John",
      lastName: "Doe",
      email: "h.potterfield@test.com",
    },
  },
};
```

### `components.SessionCheckedIn`

```typescript
const value: components.SessionCheckedIn = {
  session: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    title: "tech_session",
    code: "XRNGB4YY3CX",
  },
  checkedIn: new Date("2020-02-03T13:00:00.000Z"),
};
```

### `components.SessionCheckedOut`

```typescript
const value: components.SessionCheckedOut = {
  session: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    title: "tech_session",
    code: "XRNGB4YY3CX",
  },
  checkOut: new Date("2020-02-03T13:00:00.000Z"),
};
```

### `components.SessionEnrolled`

```typescript
const value: components.SessionEnrolled = {
  session: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    title: "tech_session",
    code: "XRNGB4YY3CX",
  },
};
```

### `components.SessionFeedbackSubmitted`

```typescript
const value: components.SessionFeedbackSubmitted = {
  session: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    title: "tech_session",
    code: "XRNGB4YY3CX",
  },
  survey: {
    responseMethod: "sample method",
    responses: [
      {
        question: {
          id: "861b51ec-aa7e-475f-b38d-4c8e35c47d63",
          text: "How would you rate this session?",
          code: "CODE_A",
        },
        answers: [
          {
            id: "861b51ec-aa7e-475f-b38d-4c8e35c47d63",
            text: "How would you rate this session?",
          },
        ],
      },
    ],
  },
};
```

### `components.SessionNoShow`

```typescript
const value: components.SessionNoShow = {
  session: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    title: "tech_session",
    code: "XRNGB4YY3CX",
  },
};
```

### `components.SessionPollResponseSubmitted`

```typescript
const value: components.SessionPollResponseSubmitted = {
  session: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    title: "tech_session",
    code: "XRNGB4YY3CX",
  },
  poll: {
    name: "Do you like the session?",
    responses: [
      {
        question: {
          id: "861b51ec-aa7e-475f-b38d-4c8e35c47d63",
          text: "How would you rate this session?",
        },
        answers: [
          {
            value: "my answer",
          },
        ],
      },
    ],
  },
};
```

### `components.SessionQuestionAsked`

```typescript
const value: components.SessionQuestionAsked = {
  session: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    title: "tech_session",
    code: "XRNGB4YY3CX",
  },
  question: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    text: "Is this a new session?",
  },
  platform: "Attendee Hub",
  votes: 0,
  anonymous: false,
};
```

### `components.SessionQuestionUpvoted`

```typescript
const value: components.SessionQuestionUpvoted = {
  session: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    title: "tech_session",
    code: "XRNGB4YY3CX",
  },
  question: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    text: "Is this a new session?",
  },
  platform: "Attendee Hub",
  votes: 0,
};
```

### `components.SessionUnenrolled`

```typescript
const value: components.SessionUnenrolled = {
  session: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    title: "tech_session",
    code: "XRNGB4YY3CX",
  },
};
```

### `components.SessionWaitlisted`

```typescript
const value: components.SessionWaitlisted = {
  session: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    title: "tech_session",
    code: "XRNGB4YY3CX",
  },
};
```

### `components.SpeakerFeedbackSubmitted`

```typescript
const value: components.SpeakerFeedbackSubmitted = {
  session: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    title: "tech_session",
    code: "XRNGB4YY3CX",
  },
  speaker: {
    name: "Henry Ford",
  },
  survey: {
    responseMethod: "sample method",
    responses: [
      {
        question: {
          id: "861b51ec-aa7e-475f-b38d-4c8e35c47d63",
          text: "How would you rate this session?",
          code: "CODE_A",
        },
        answers: [
          {
            id: "861b51ec-aa7e-475f-b38d-4c8e35c47d63",
            text: "How would you rate this session?",
          },
        ],
      },
    ],
  },
};
```

### `components.SpeakerFileDownloaded`

```typescript
const value: components.SpeakerFileDownloaded = {
  browser: "firefox",
  operatingSystem: "windows",
  name: "Instructions",
  type: "docx",
  speaker: {
    name: "Henry Ford",
  },
};
```

### `components.ActivityDataJsonAppointmentExternal`

```typescript
const value: components.ActivityDataJsonAppointmentExternal = {
  id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  externalActivityDate: new Date("2019-08-24T14:15:22Z"),
  additionalFields: {
    "venue": "tokyo",
    "submitted": "true",
  },
};
```

### `components.ActivityDataJsonEventExternal`

```typescript
const value: components.ActivityDataJsonEventExternal = {
  id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  externalActivityDate: new Date("2019-08-24T14:15:22Z"),
  additionalFields: {
    "venue": "tokyo",
    "submitted": "true",
  },
};
```

### `components.ActivityDataJsonExhibitorExternal`

```typescript
const value: components.ActivityDataJsonExhibitorExternal = {
  id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  externalActivityDate: new Date("2019-08-24T14:15:22Z"),
  additionalFields: {
    "venue": "tokyo",
    "submitted": "true",
  },
};
```

### `components.ActivityDataJsonSessionExternal`

```typescript
const value: components.ActivityDataJsonSessionExternal = {
  id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  externalActivityDate: new Date("2019-08-24T14:15:22Z"),
  additionalFields: {
    "venue": "tokyo",
    "submitted": "true",
  },
};
```

### `components.EventAdViewed`

```typescript
const value: components.EventAdViewed = {
  platform: "UserPlatform",
  ad: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    name: "New Year Sale",
    product: "ATTENDEE_HUB",
    location: "Home Page",
    attribution: {
      type: "CUSTOM",
    },
  },
};
```

### `components.EventAdClicked`

```typescript
const value: components.EventAdClicked = {
  platform: "UserPlatform",
  ad: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    name: "New Year Sale",
    product: "ATTENDEE_HUB",
    location: "Home Page",
    attribution: {
      type: "CUSTOM",
    },
  },
};
```

