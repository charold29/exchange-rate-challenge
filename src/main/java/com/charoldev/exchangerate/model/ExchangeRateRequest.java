package com.charoldev.exchangerate.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ExchangeRateRequest {
  private String from;
  private String to;
}
