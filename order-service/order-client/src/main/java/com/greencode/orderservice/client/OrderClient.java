package com.greencode.orderservice.client;

public interface OrderClient {

    OrderResponse order(OrderDTO orderDTO);
}
