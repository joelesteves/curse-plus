package com.client.ws.wscurseplus.service;

import com.client.ws.wscurseplus.model.SubscriptionType;

import java.util.List;

public interface SubscriptionTypeService {
    List<SubscriptionType> findAll();

    SubscriptionType findById(Long id);

    SubscriptionType create(SubscriptionType subscriptionType);

    SubscriptionType update(Long id, SubscriptionType subscriptionType);

    void delete(Long id);
}
