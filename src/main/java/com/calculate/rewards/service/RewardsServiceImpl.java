package com.calculate.rewards.service;

import com.calculate.rewards.model.CustomerTransactionRequest;
import com.calculate.rewards.model.EachMonthChargesAndRewards;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class RewardsServiceImpl implements RewardsService{

    public Map<Integer, List<EachMonthChargesAndRewards>> calculateRewards(List<CustomerTransactionRequest> transactionCharges){

        Map<Integer, List<EachMonthChargesAndRewards>> map = new HashMap<>();
        for(CustomerTransactionRequest customer : transactionCharges){
            if(map.containsKey(customer.getCustomerId())){
                List<EachMonthChargesAndRewards> eachMonthChargesAndRewardsList =
                        map.get(customer.getCustomerId());
                for(EachMonthChargesAndRewards eachMonthChargesAndRewards : eachMonthChargesAndRewardsList){
                    //if(eachMonthChargesAndRewards.getMonth().equals())
                }

            }else {
                EachMonthChargesAndRewards eachMonthChargesAndRewards =EachMonthChargesAndRewards.
                                builder().month(customer.getMonth())
                                .totalRewardsForThatMonth
                                    (calculateRewardsForEachTransaction
                                            (customer.getTransactionAmount()))
                                .build();
                List<EachMonthChargesAndRewards> eachMonthChargesAndRewardsList = new ArrayList<>(3);
                eachMonthChargesAndRewardsList.add(eachMonthChargesAndRewards);
                map.put(customer.getCustomerId(),eachMonthChargesAndRewardsList);
            }
        }

        return map;
    }

    private double calculateRewardsForEachTransaction(double transactionCharge) {

        if(transactionCharge<50){
            return 0;
        } else if(transactionCharge <=100 ){
            return transactionCharge -50;
        }
        double result = ((transactionCharge -100) * 2 ) + 50;
        return result;
    }
}
