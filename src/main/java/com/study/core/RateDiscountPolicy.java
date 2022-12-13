package com.study.core;

import com.study.core.member.Grade;
import com.study.core.member.Member;

public class RateDiscountPolicy implements DiscountPolicy {

	private int discountRateAmountt = 10; // 10% 할인

	@Override
	public int discount(Member member, int price) {
		if(member.getGrade() == Grade.VIP){
			return price * discountRateAmountt / 100;
		}
		else {
			return 0;
		}
	}
}
