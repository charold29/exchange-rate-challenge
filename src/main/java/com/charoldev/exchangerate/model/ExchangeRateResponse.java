package com.charoldev.exchangerate.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExchangeRateResponse {
  private String result;
  private String documentation;
  @JsonProperty("terms_of_use")
  private String termsOfUse;
  @JsonProperty("time_last_update_unix")
  private Integer timeLastUpdateUnix;
  @JsonProperty("time_last_update_utc")
  private String timeLastUpdateUtc;
  @JsonProperty("time_next_update_unix")
  private String timeNextUpdateUnix;
  @JsonProperty("time_next_update_utc")
  private String timeNextUpdateUtc;
  @JsonProperty("base_code")
  private String baseCode;
  @JsonProperty("target_code")
  private String targetCode;
  @JsonProperty("conversion_rate")
  private Double conversionRate;
}
