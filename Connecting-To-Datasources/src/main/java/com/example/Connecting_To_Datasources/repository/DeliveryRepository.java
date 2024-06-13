package com.example.Connecting_To_Datasources.repository;

import com.example.Connecting_To_Datasources.model.Delivery;
import com.example.Connecting_To_Datasources.model.RecipientAndPrice;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public class DeliveryRepository {
    @PersistenceContext
    EntityManager entityManager;

    public void persist(Delivery delivery)
    {
        entityManager.persist(delivery);
    }

    public Delivery find(Long id)
    {
        return entityManager.find(Delivery.class, id);
    }

    public Delivery merge(Delivery detachedDelivery)
    {
        return entityManager.merge(detachedDelivery);
    }

    void delete(Long id)
    {
        Delivery delivery = entityManager.find(Delivery.class, id);
        entityManager.remove(delivery);
    }

    public List<Delivery> findDeliveriesByName(String name)
    {
        TypedQuery<Delivery> deliveries = entityManager.createNamedQuery("Delivery.deliveriesByName", Delivery.class);
        deliveries.setParameter("name", name);
        return deliveries.getResultList();
    }

    public RecipientAndPrice getBill(Long deliveryId)
    {
        TypedQuery<RecipientAndPrice> query = entityManager.createNamedQuery("Delivery.getBill", RecipientAndPrice.class);
        query.setParameter("deliveryId", deliveryId);
        return query.getSingleResult();
    }

}
