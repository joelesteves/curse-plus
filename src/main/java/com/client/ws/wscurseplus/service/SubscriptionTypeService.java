package com.client.ws.wscurseplus.service;

import com.client.ws.wscurseplus.dto.SubscriptionTypeDto;
import com.client.ws.wscurseplus.model.SubscriptionType;

import java.util.List;

public interface SubscriptionTypeService {
    List<SubscriptionType> findAll();

    SubscriptionType findById(Long id);

    SubscriptionType create(SubscriptionTypeDto dto);

    SubscriptionType update(Long id, SubscriptionTypeDto dto);

    void delete(Long id);
}
