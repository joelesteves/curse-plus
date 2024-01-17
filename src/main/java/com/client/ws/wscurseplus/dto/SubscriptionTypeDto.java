package com.client.ws.wscurseplus.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
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

    @NotBlank(message = "cannot be null")
    @Size(min = 5, max = 30)
    private String name;

    @Max(value = 12, message = "cannot be less than 12")
    private Long accessMonths;

    @NotNull(message = "cannot be null")
    private BigDecimal price;

    @NotBlank(message = "cannot be null or empty")
    @Size(min = 5, max = 15)
    private String productKey;
}
