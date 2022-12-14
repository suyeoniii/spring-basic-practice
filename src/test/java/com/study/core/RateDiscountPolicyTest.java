package com.study.core;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.study.core.member.Grade;
import com.study.core.member.Member;
import com.study.core.discount.DiscountPolicy;
import com.study.core.discount.RateDiscountPolicy;

class RateDiscountPolicyTest {

	DiscountPolicy discountPolicy = new RateDiscountPolicy();

	@Test
	@DisplayName("VIP는 10%할인이 적용되어야 한다")
	void vip_o() {
		Member member = new Member(1L, "memberA", Grade.VIP);

		int discount = discountPolicy.discount(member, 10000);

		assertThat(discount).isEqualTo(1000);
	}

	@Test
	@DisplayName("VIP가 아니면 할인이 적용되지 않아야한다.")
	void vip_x() {
		Member member = new Member(1L, "memberA", Grade.BASIC);

		int discount = discountPolicy.discount(member, 10000);

		assertThat(discount).isEqualTo(0);
	}

}