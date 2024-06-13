package com.example.Connecting_To_Datasources.controller;


import com.example.Connecting_To_Datasources.model.Delivery;
import com.example.Connecting_To_Datasources.model.RecipientAndPrice;
import com.example.Connecting_To_Datasources.service.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/delivery")
public class DeliveryController {

    @Autowired
    DeliveryService deliveryService;

    @PostMapping
    public Long save(@RequestBody Delivery delivery)
    {
        return deliveryService.save(delivery);
    }

    @GetMapping("/bill/{deliveryId}")
    public RecipientAndPrice getBill(@PathVariable Long deliveryId) {
        return deliveryService.getBill(deliveryId);
    }

}
