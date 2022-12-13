package com.study.core;

import com.study.core.Order;

public interface OrderService {
	Order createOrder(Long memberId, String itemName, int itemPrice);
}
