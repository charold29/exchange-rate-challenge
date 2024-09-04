package com.charoldev.exchangerate.controller;

import com.charoldev.exchangerate.model.ExchangeRateRequest;
import com.charoldev.exchangerate.model.ExchangeRateResponse;
import com.charoldev.exchangerate.service.ExchangeRateService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
public class ExchangeRateController {
  private final ExchangeRateService exchangeRateService;

  @GetMapping("/exchange-rate")
  public Mono<ExchangeRateResponse> getExchangeRate(
          @RequestHeader("x-base") String base,
          @RequestHeader("x-target") String target) {

    return exchangeRateService.getExchangeRate(
            ExchangeRateRequest.builder()
                    .from(base)
                    .to(target)
                    .build()
            );
  }

}
