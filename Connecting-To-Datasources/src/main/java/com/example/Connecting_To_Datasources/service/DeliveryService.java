package com.example.Connecting_To_Datasources.service;

import com.example.Connecting_To_Datasources.model.Delivery;
import com.example.Connecting_To_Datasources.model.RecipientAndPrice;
import com.example.Connecting_To_Datasources.repository.DeliveryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeliveryService {

    @Autowired
    DeliveryRepository deliveryRepository;

    public Long save(Delivery delivery) {
        delivery.getPlants().forEach(plant -> plant.setDelivery(delivery));
        deliveryRepository.persist(delivery);
        return delivery.getId();
    }

    public RecipientAndPrice getBill(Long deliveryId){
        return deliveryRepository.getBill(deliveryId);
    }

}
