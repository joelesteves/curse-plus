package com.client.ws.wscurseplus.service.impl;

import com.client.ws.wscurseplus.model.SubscriptionType;
import com.client.ws.wscurseplus.repository.SubscriptionTypeRepository;
import com.client.ws.wscurseplus.service.SubscriptionTypeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubscriptionTypeServiceImpl implements SubscriptionTypeService {

    private final SubscriptionTypeRepository subscriptionTypeRepository;

    SubscriptionTypeServiceImpl(SubscriptionTypeRepository subscriptionTypeRepository){
        this.subscriptionTypeRepository = subscriptionTypeRepository;
    }

    @Override
    public List<SubscriptionType> findAll() {
        return subscriptionTypeRepository.findAll();
    }

    @Override
    public SubscriptionType findById(Long id) {
        return null;
    }

    @Override
    public SubscriptionType create(SubscriptionType subscriptionType) {
        return null;
    }

    @Override
    public SubscriptionType update(Long id, SubscriptionType subscriptionType) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
