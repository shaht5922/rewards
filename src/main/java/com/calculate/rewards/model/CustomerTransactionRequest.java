package com.calculate.rewards.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CustomerTransactionRequest {

    private int customerId;
    private String month;
    private double transactionAmount;
}
