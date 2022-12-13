package com.study.core.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import com.study.core.Order;
import com.study.core.OrderService;
import com.study.core.OrderServiceImpl;
import com.study.core.member.Grade;
import com.study.core.member.Member;
import com.study.core.member.MemberService;
import com.study.core.member.MemberServiceImpl;

public class OrderServiceTest {

	MemberService memberService = new MemberServiceImpl();
	OrderService orderService = new OrderServiceImpl();

	@Test
	void createOrder() {
		Long memberId = 1L;
		Member member = new Member(memberId, "memberA", Grade.VIP);
		memberService.join(member);

		Order order = orderService.createOrder(memberId, "itemA", 10000);

		Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);
	}
}
