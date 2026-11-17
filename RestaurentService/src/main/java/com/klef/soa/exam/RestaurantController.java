package com.klef.soa.exam;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/restaurants")
public class RestaurantController {

    @GetMapping
    public String getRestaurants() {
        return "Restaurant Service Running Successfully";
    }
}