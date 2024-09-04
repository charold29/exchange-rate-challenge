package com.charoldev.exchangerate.service;

import com.charoldev.exchangerate.model.ExchangeRateRequest;
import com.charoldev.exchangerate.model.ExchangeRateResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import static com.charoldev.exchangerate.common.Constants.API_URL;

@Service
@RequiredArgsConstructor
public class ExchangeRateService {
  private final WebClient.Builder webClientBuilder;

  public Mono<ExchangeRateResponse> getExchangeRate(ExchangeRateRequest req) {
    return webClientBuilder.build()
            .get()
            .uri(API_URL, req.getFrom(), req.getTo())
            .retrieve()
            .bodyToMono(ExchangeRateResponse.class);
  }
}
