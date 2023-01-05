package com.codestates.coffee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;

@Slf4j
@RestController
@RequestMapping("/v11/doffees")
public class SpringWebFluxMainCoffeeController {

    String  uri = "http://localhost:5050/v11/coffees/1";

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{coffee-id}")
    public Mono<CoffeeResponseDto> getCoffee(@PathVariable("coffee-id") long coffeeId) throws  InterruptedException{
        log.info("# call Spring WebFlux Main Controller: {}", LocalDateTime.now());

        return WebClient.create()
                .get()
                .uri(uri)
                .retrieve()
                .bodyToMono(CoffeeResponseDto.class);
    }

}
