package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Menu;
import com.example.demo.dto.Order;

public interface RestuarentService {

	Menu createMenu(Menu menu);

	List<Menu> getAllMenu();

	Menu getMenuById(int id);

	Order createOrder(Order order);

	Order getOrderById(int id);
}
