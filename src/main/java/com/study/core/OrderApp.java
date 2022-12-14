package com.study.core;

import com.study.core.member.Grade;
import com.study.core.member.Member;
import com.study.core.member.MemberService;
import com.study.core.member.MemberServiceImpl;
import com.study.core.order.Order;
import com.study.core.order.OrderService;
import com.study.core.order.OrderServiceImpl;

public class OrderApp {
	public static void main(String[] args) {
		AppConfig appConfig = new AppConfig();
		MemberService memberService = appConfig.memberService();
		OrderService orderService = appConfig.orderService();

		Long memberId = 1L;
		Member member = new Member(memberId, "memberA", Grade.VIP);
		memberService.join(member);

		Order order = orderService.createOrder(memberId, "itemA", 10000);
		System.out.println(order.toString());
	}
}
