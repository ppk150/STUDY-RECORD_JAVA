package com.codestates.coffee;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;


@RestController
@RequestMapping("/v11/coffees")
public class SpringWebFluxOutboundCoffeeController {
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{coffee-id}")
    public Mono<CoffeeResponseDto> getCoffee(@PathVariable("coffee-id") long coffeeId) throws InterruptedException{
        CoffeeResponseDto responseDto = new CoffeeResponseDto(coffeeId, "카페라떼", "CafeLattee", 4000);

        Thread.sleep(5000);
        return  Mono.just(responseDto);
    }
}
