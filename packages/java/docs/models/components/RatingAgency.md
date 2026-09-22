# RatingAgency

The rating agency. Only agencies applicable to the venue's type and country are accepted. Use the GET response to discover which agencies are valid for a specific venue.

**Core agencies (available regardless of country):**

| Value | Agency | Scale |
|-------|--------|-------|
| `AAA` | AAA | Diamonds |
| `FORBES_TRAVEL_GUIDE` | Forbes Travel Guide | Whole stars |
| `GENERALITAT_DE_CATALUNYA` | Generalitat de Catalunya | Catalunya scale |
| `MINISTRY_OF_TOURISM_INDIA` | Ministry of Tourism, India | Half-star |
| `PHRI` | Perhimpunan Hotel dan Restoran Indonesia | Whole stars |
| `ZAGAT_APPEAL` | Zagat – Appeal | Zagat numeric |
| `ZAGAT_COST` | Zagat – Cost | Zagat cost tier |
| `ZAGAT_DECOR` | Zagat – Decor | Zagat numeric |
| `ZAGAT_DINING` | Zagat – Dining | Zagat numeric |
| `ZAGAT_FACILITIES` | Zagat – Facilities | Zagat numeric |
| `ZAGAT_FOOD` | Zagat – Food | Zagat numeric |
| `ZAGAT_ROOMS` | Zagat – Rooms | Zagat numeric |
| `ZAGAT_SERVICE` | Zagat – Service | Zagat numeric |

**Country-specific tourism boards (half-star scale; only available for venues in the listed countries):**

| Value | Agency | Country codes |
|-------|--------|---------------|
| `AA_HOTEL_SERVICES` | AA Hotel Services | GB1, GB2, FR |
| `AAA_TOURISM` | AAA Tourism | AU |
| `ABU_DHABI_TOURISM` | Abu Dhabi Tourism and Culture Authority | AE |
| `ATIC_AUSTRALIA` | ATIC Australia | AU |
| `ATOUT_FRANCE` | Atout France | FR |
| `BALI_HOTEL_ASSOCIATION` | Bali Hotel Association | ID |
| `CAMARA_MUNICIPAL_DE_LISBOA` | Camara Municipal de Lisboa | PT |
| `CHINA_NATIONAL_TOURISM_ADMINISTRATION` | China National Tourism Administration | CN |
| `COMUNIDAD_DE_MADRID` | Comunidad de Madrid | ES |
| `CONSEJERIA_DE_FOMENTO_MURCIA` | Consejeria de Fomento Murcia | ES |
| `DEHOGA` | DEHOGA | AT, CH, CZ, DE, EE, HU, LT, LV, NL, SE |
| `DEPARTMENT_OF_TOURISM_PHILIPPINES` | Department of Tourism Philippines | PH |
| `DEPARTMENT_OF_TOURISM_THAILAND` | Department of Tourism Thailand | TH |
| `DISCOVER_IRELAND` | Discover Ireland | IE |
| `DISCOVER_NORTHERN_IRELAND` | Discover Northern Ireland | GB4 |
| `DUBAI_TOURISM` | Dubai Tourism (DTCM) | AE |
| `ESKISEHIR_DIRECTORATE` | Eskisehir Provincial Directorate of Culture and Tourism | TR |
| `FAILTE_IRELAND` | Failte Ireland | IE |
| `HELLENIC_CHAMBER_OF_HOTELS` | Hellenic Chamber of Hotels | GR |
| `HOTELLERIESUISSE` | Hotelleriesuisse | CH |
| `HOTELSTARS_UNION` | Hotelstars Union | AT, BT, CZ, DK, ET, DE, GR, HU, LV, LT, LU, MT, NL, ES, SE, CH, BE, EE |
| `INDONESIAN_TOURISM_BUSINESS_CERTIFICATION` | Indonesian Tourism Business Certification | ID |
| `ITALIA_HOTEL_CLASSIFICATION` | Italia Hotel Classification | IT |
| `MINISTRY_CULTURE_SPORTS_TOURISM_SOUTH_KOREA` | Ministry of Culture, Sports and Tourism (South Korea) | KR |
| `MINISTRY_OF_CULTURE_RUSSIA` | Ministry of Culture of the Russian Federation | RU |
| `MINISTRY_OF_CULTURE_TOURISM_AZERBAIJAN` | Ministry of Culture and Tourism of Azerbaijan | AZ |
| `MINISTRY_OF_TOURISM_CULTURE_MALAYSIA` | Ministry of Tourism and Culture Malaysia | MY |
| `MINISTRY_OF_TOURISM_EGYPT` | Ministry of Tourism, Egypt | EG |
| `MINISTRY_OF_TOURISM_MOROCCO` | Ministry of Tourism, Kingdom of Morocco | MA |
| `NATIONAL_HOSPITALITY_CERTIFICATION` | National Hospitality Certification | ID |
| `PORTUGAL_TOURISM` | Portugal Tourism | PT |
| `QUALMARK_NEW_ZEALAND` | Qualmark New Zealand | NZ |
| `RUSSIAN_HOTEL_ASSOCIATION` | Russian Hotel Association | RU |
| `SAMORZAD_MAZOWIECKI` | Samorzad Wojewodztwa Mazowieckiego | PL |
| `SERTIFIKASI_USAHA_PARIWISATA_INDONESIA` | Sertifikasi Usaha Pariwisata Indonesia | ID |
| `TGCSA` | Tourism Grading Council of South Africa | ZA |
| `TGCSA_2` | Tourism Grading Council of South Africa (TGCSA) | ZA |
| `THAI_HOTELS_ASSOCIATION` | Thai Hotels Association | TH |
| `TOERISME_VLAANDEREN` | Toerisme Vlaanderen | BE |
| `TURKISH_TOURISM` | Turkish Tourism | TR |
| `TUV_RHEINLAND_INDONESIA` | TUV Rheinland Indonesia (TRID) | ID |
| `VIETNAM_NATIONAL_ADMINISTRATION_OF_TOURISM` | Vietnam National Administration of Tourism | VN |
| `VORARLBERG_CHAMBER_OF_COMMERCE` | Vorarlberg Chamber of Commerce | AT |

## Example Usage

```java
import com.cvent.models.components.RatingAgency;

RatingAgency value = RatingAgency.AA_HOTEL_SERVICES;
```


## Values

| Name                                          | Value                                         |
| --------------------------------------------- | --------------------------------------------- |
| `AA_HOTEL_SERVICES`                           | AA_HOTEL_SERVICES                             |
| `AAA`                                         | AAA                                           |
| `AAA_TOURISM`                                 | AAA_TOURISM                                   |
| `ABU_DHABI_TOURISM`                           | ABU_DHABI_TOURISM                             |
| `ATIC_AUSTRALIA`                              | ATIC_AUSTRALIA                                |
| `ATOUT_FRANCE`                                | ATOUT_FRANCE                                  |
| `BALI_HOTEL_ASSOCIATION`                      | BALI_HOTEL_ASSOCIATION                        |
| `CAMARA_MUNICIPAL_DE_LISBOA`                  | CAMARA_MUNICIPAL_DE_LISBOA                    |
| `CHINA_NATIONAL_TOURISM_ADMINISTRATION`       | CHINA_NATIONAL_TOURISM_ADMINISTRATION         |
| `COMUNIDAD_DE_MADRID`                         | COMUNIDAD_DE_MADRID                           |
| `CONSEJERIA_DE_FOMENTO_MURCIA`                | CONSEJERIA_DE_FOMENTO_MURCIA                  |
| `DEHOGA`                                      | DEHOGA                                        |
| `DEPARTMENT_OF_TOURISM_PHILIPPINES`           | DEPARTMENT_OF_TOURISM_PHILIPPINES             |
| `DEPARTMENT_OF_TOURISM_THAILAND`              | DEPARTMENT_OF_TOURISM_THAILAND                |
| `DISCOVER_IRELAND`                            | DISCOVER_IRELAND                              |
| `DISCOVER_NORTHERN_IRELAND`                   | DISCOVER_NORTHERN_IRELAND                     |
| `DUBAI_TOURISM`                               | DUBAI_TOURISM                                 |
| `ESKISEHIR_DIRECTORATE`                       | ESKISEHIR_DIRECTORATE                         |
| `FAILTE_IRELAND`                              | FAILTE_IRELAND                                |
| `FORBES_TRAVEL_GUIDE`                         | FORBES_TRAVEL_GUIDE                           |
| `GENERALITAT_DE_CATALUNYA`                    | GENERALITAT_DE_CATALUNYA                      |
| `HELLENIC_CHAMBER_OF_HOTELS`                  | HELLENIC_CHAMBER_OF_HOTELS                    |
| `HOTELLERIESUISSE`                            | HOTELLERIESUISSE                              |
| `HOTELSTARS_UNION`                            | HOTELSTARS_UNION                              |
| `INDONESIAN_TOURISM_BUSINESS_CERTIFICATION`   | INDONESIAN_TOURISM_BUSINESS_CERTIFICATION     |
| `ITALIA_HOTEL_CLASSIFICATION`                 | ITALIA_HOTEL_CLASSIFICATION                   |
| `MINISTRY_CULTURE_SPORTS_TOURISM_SOUTH_KOREA` | MINISTRY_CULTURE_SPORTS_TOURISM_SOUTH_KOREA   |
| `MINISTRY_OF_CULTURE_RUSSIA`                  | MINISTRY_OF_CULTURE_RUSSIA                    |
| `MINISTRY_OF_CULTURE_TOURISM_AZERBAIJAN`      | MINISTRY_OF_CULTURE_TOURISM_AZERBAIJAN        |
| `MINISTRY_OF_TOURISM_CULTURE_MALAYSIA`        | MINISTRY_OF_TOURISM_CULTURE_MALAYSIA          |
| `MINISTRY_OF_TOURISM_EGYPT`                   | MINISTRY_OF_TOURISM_EGYPT                     |
| `MINISTRY_OF_TOURISM_INDIA`                   | MINISTRY_OF_TOURISM_INDIA                     |
| `MINISTRY_OF_TOURISM_MOROCCO`                 | MINISTRY_OF_TOURISM_MOROCCO                   |
| `NATIONAL_HOSPITALITY_CERTIFICATION`          | NATIONAL_HOSPITALITY_CERTIFICATION            |
| `PHRI`                                        | PHRI                                          |
| `PORTUGAL_TOURISM`                            | PORTUGAL_TOURISM                              |
| `QUALMARK_NEW_ZEALAND`                        | QUALMARK_NEW_ZEALAND                          |
| `RUSSIAN_HOTEL_ASSOCIATION`                   | RUSSIAN_HOTEL_ASSOCIATION                     |
| `SAMORZAD_MAZOWIECKI`                         | SAMORZAD_MAZOWIECKI                           |
| `SERTIFIKASI_USAHA_PARIWISATA_INDONESIA`      | SERTIFIKASI_USAHA_PARIWISATA_INDONESIA        |
| `TGCSA`                                       | TGCSA                                         |
| `TGCSA2`                                      | TGCSA_2                                       |
| `THAI_HOTELS_ASSOCIATION`                     | THAI_HOTELS_ASSOCIATION                       |
| `TOERISME_VLAANDEREN`                         | TOERISME_VLAANDEREN                           |
| `TURKISH_TOURISM`                             | TURKISH_TOURISM                               |
| `TUV_RHEINLAND_INDONESIA`                     | TUV_RHEINLAND_INDONESIA                       |
| `VIETNAM_NATIONAL_ADMINISTRATION_OF_TOURISM`  | VIETNAM_NATIONAL_ADMINISTRATION_OF_TOURISM    |
| `VORARLBERG_CHAMBER_OF_COMMERCE`              | VORARLBERG_CHAMBER_OF_COMMERCE                |
| `ZAGAT_APPEAL`                                | ZAGAT_APPEAL                                  |
| `ZAGAT_COST`                                  | ZAGAT_COST                                    |
| `ZAGAT_DECOR`                                 | ZAGAT_DECOR                                   |
| `ZAGAT_DINING`                                | ZAGAT_DINING                                  |
| `ZAGAT_FACILITIES`                            | ZAGAT_FACILITIES                              |
| `ZAGAT_FOOD`                                  | ZAGAT_FOOD                                    |
| `ZAGAT_ROOMS`                                 | ZAGAT_ROOMS                                   |
| `ZAGAT_SERVICE`                               | ZAGAT_SERVICE                                 |