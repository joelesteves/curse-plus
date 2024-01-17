package com.client.ws.wscurseplus.mapper;

import com.client.ws.wscurseplus.dto.SubscriptionTypeDto;
import com.client.ws.wscurseplus.model.SubscriptionType;

public class SubscriptionTypeMapper {
    public static SubscriptionType fromDtoToEntity(SubscriptionTypeDto dto) {
        return SubscriptionType.builder()
                .id(dto.getId())
                .name(dto.getName())
                .accessMonths(dto.getAccessMonths())
                .price(dto.getPrice())
                .productKey(dto.getProductKey())
                .build();
    }
}
