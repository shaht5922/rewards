package com.calculate.rewards.controller;

import com.calculate.rewards.model.CustomerTransactionRequest;
import com.calculate.rewards.model.EachMonthChargesAndRewards;
import com.calculate.rewards.service.RewardsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/v1")
public class RewardsController {

    @Autowired
    RewardsServiceImpl rewardsService;

    @PostMapping("/calculate")
    public Map<Integer, List<EachMonthChargesAndRewards>> calculateRewards(@RequestBody List<CustomerTransactionRequest> transactionCharges){

        return rewardsService.calculateRewards(transactionCharges);
    }
}
