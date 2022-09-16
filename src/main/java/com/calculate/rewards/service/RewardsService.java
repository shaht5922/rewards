package com.calculate.rewards.service;

import com.calculate.rewards.model.CustomerTransactionRequest;
import com.calculate.rewards.model.EachMonthChargesAndRewards;

import java.util.List;
import java.util.Map;

public interface RewardsService {
    public Map<Integer, List<EachMonthChargesAndRewards>> calculateRewards(List<CustomerTransactionRequest> transactionCharges);
}
