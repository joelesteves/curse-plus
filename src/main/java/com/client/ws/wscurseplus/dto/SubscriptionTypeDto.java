package com.client.ws.wscurseplus.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SubscriptionTypeDto {
    private Long id;

    private String name;

    private Long accessMonth;

    private BigDecimal price;

    private String productKey;
}