package com.study.core;

import com.study.core.member.Grade;
import com.study.core.member.Member;

public class FixDiscountPolicy implements DiscountPolicy {

	private int discountFixAmountt = 1000; // 1000d원 할인

	@Override
	public int discount(Member member, int price) {
		if(member.getGrade() == Grade.VIP){
			return discountFixAmountt;
		}
		else {
			return 0;
		}
	}
}
