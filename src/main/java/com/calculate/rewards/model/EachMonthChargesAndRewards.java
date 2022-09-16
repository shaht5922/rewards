package com.calculate.rewards.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EachMonthChargesAndRewards {
    private String month;
    private double totalRewardsForThatMonth;
}
