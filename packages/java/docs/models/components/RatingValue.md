# RatingValue

The grade awarded by the agency. Accepted values depend on the agency's rating scale — refer to the lists below. Omit to remove a previously saved rating for that agency.

**AAA — diamonds:**
`ONE_DIAMOND`, `TWO_DIAMONDS`, `THREE_DIAMONDS`, `FOUR_DIAMONDS`, `FIVE_DIAMONDS`

**Forbes Travel Guide / PHRI — whole stars:**
`ONE_STAR`, `TWO_STARS`, `THREE_STARS`, `FOUR_STARS`, `FIVE_STARS`

**Zagat numeric score (`ZAGAT_ROOMS`, `ZAGAT_DINING`, `ZAGAT_SERVICE`, `ZAGAT_FACILITIES`, `ZAGAT_APPEAL`, `ZAGAT_DECOR`, `ZAGAT_FOOD`):**
`ZAGAT_SCORE_1` … `ZAGAT_SCORE_30`

**Zagat cost tier (`ZAGAT_COST`):**
`VERY_EXPENSIVE`, `EXPENSIVE`, `MODERATE`, `INEXPENSIVE`

**Half-star scale — Ministry of Tourism India and all country-specific tourism boards:**
`HALF_STAR_1`, `HALF_STAR_1_5`, `HALF_STAR_2`, `HALF_STAR_2_5`, `HALF_STAR_3`, `HALF_STAR_3_5`, `HALF_STAR_4`, `HALF_STAR_4_5`, `HALF_STAR_5`, `HALF_STAR_5_5`

**Catalunya scale (`GENERALITAT_DE_CATALUNYA`):**
`CATALUNYA_1_STAR`, `CATALUNYA_2_STARS`, `CATALUNYA_3_STARS`, `CATALUNYA_4_STARS`, `CATALUNYA_4_STARS_SUPERIOR`, `CATALUNYA_5_STARS`, `CATALUNYA_LUXE`

## Example Usage

```java
import com.cvent.models.components.RatingValue;

RatingValue value = RatingValue.ONE_DIAMOND;
```


## Values

| Name                        | Value                       |
| --------------------------- | --------------------------- |
| `ONE_DIAMOND`               | ONE_DIAMOND                 |
| `TWO_DIAMONDS`              | TWO_DIAMONDS                |
| `THREE_DIAMONDS`            | THREE_DIAMONDS              |
| `FOUR_DIAMONDS`             | FOUR_DIAMONDS               |
| `FIVE_DIAMONDS`             | FIVE_DIAMONDS               |
| `ONE_STAR`                  | ONE_STAR                    |
| `TWO_STARS`                 | TWO_STARS                   |
| `THREE_STARS`               | THREE_STARS                 |
| `FOUR_STARS`                | FOUR_STARS                  |
| `FIVE_STARS`                | FIVE_STARS                  |
| `ZAGAT_SCORE1`              | ZAGAT_SCORE_1               |
| `ZAGAT_SCORE2`              | ZAGAT_SCORE_2               |
| `ZAGAT_SCORE3`              | ZAGAT_SCORE_3               |
| `ZAGAT_SCORE4`              | ZAGAT_SCORE_4               |
| `ZAGAT_SCORE5`              | ZAGAT_SCORE_5               |
| `ZAGAT_SCORE6`              | ZAGAT_SCORE_6               |
| `ZAGAT_SCORE7`              | ZAGAT_SCORE_7               |
| `ZAGAT_SCORE8`              | ZAGAT_SCORE_8               |
| `ZAGAT_SCORE9`              | ZAGAT_SCORE_9               |
| `ZAGAT_SCORE10`             | ZAGAT_SCORE_10              |
| `ZAGAT_SCORE11`             | ZAGAT_SCORE_11              |
| `ZAGAT_SCORE12`             | ZAGAT_SCORE_12              |
| `ZAGAT_SCORE13`             | ZAGAT_SCORE_13              |
| `ZAGAT_SCORE14`             | ZAGAT_SCORE_14              |
| `ZAGAT_SCORE15`             | ZAGAT_SCORE_15              |
| `ZAGAT_SCORE16`             | ZAGAT_SCORE_16              |
| `ZAGAT_SCORE17`             | ZAGAT_SCORE_17              |
| `ZAGAT_SCORE18`             | ZAGAT_SCORE_18              |
| `ZAGAT_SCORE19`             | ZAGAT_SCORE_19              |
| `ZAGAT_SCORE20`             | ZAGAT_SCORE_20              |
| `ZAGAT_SCORE21`             | ZAGAT_SCORE_21              |
| `ZAGAT_SCORE22`             | ZAGAT_SCORE_22              |
| `ZAGAT_SCORE23`             | ZAGAT_SCORE_23              |
| `ZAGAT_SCORE24`             | ZAGAT_SCORE_24              |
| `ZAGAT_SCORE25`             | ZAGAT_SCORE_25              |
| `ZAGAT_SCORE26`             | ZAGAT_SCORE_26              |
| `ZAGAT_SCORE27`             | ZAGAT_SCORE_27              |
| `ZAGAT_SCORE28`             | ZAGAT_SCORE_28              |
| `ZAGAT_SCORE29`             | ZAGAT_SCORE_29              |
| `ZAGAT_SCORE30`             | ZAGAT_SCORE_30              |
| `VERY_EXPENSIVE`            | VERY_EXPENSIVE              |
| `EXPENSIVE`                 | EXPENSIVE                   |
| `MODERATE`                  | MODERATE                    |
| `INEXPENSIVE`               | INEXPENSIVE                 |
| `HALF_STAR1`                | HALF_STAR_1                 |
| `HALF_STAR15`               | HALF_STAR_1_5               |
| `HALF_STAR2`                | HALF_STAR_2                 |
| `HALF_STAR25`               | HALF_STAR_2_5               |
| `HALF_STAR3`                | HALF_STAR_3                 |
| `HALF_STAR35`               | HALF_STAR_3_5               |
| `HALF_STAR4`                | HALF_STAR_4                 |
| `HALF_STAR45`               | HALF_STAR_4_5               |
| `HALF_STAR5`                | HALF_STAR_5                 |
| `HALF_STAR55`               | HALF_STAR_5_5               |
| `CATALUNYA1_STAR`           | CATALUNYA_1_STAR            |
| `CATALUNYA2_STARS`          | CATALUNYA_2_STARS           |
| `CATALUNYA3_STARS`          | CATALUNYA_3_STARS           |
| `CATALUNYA4_STARS`          | CATALUNYA_4_STARS           |
| `CATALUNYA4_STARS_SUPERIOR` | CATALUNYA_4_STARS_SUPERIOR  |
| `CATALUNYA5_STARS`          | CATALUNYA_5_STARS           |
| `CATALUNYA_LUXE`            | CATALUNYA_LUXE              |