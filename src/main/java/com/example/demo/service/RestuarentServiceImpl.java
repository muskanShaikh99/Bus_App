package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.dto.Menu;
import com.example.demo.dto.Order;
import com.example.demo.entity.MenuEntity;
import com.example.demo.entity.OrderEntity;
import com.example.demo.repository.MenuRepository;
import com.example.demo.repository.OrderRepository;


public class RestuarentServiceImpl implements RestuarentService{

	
	@Autowired
	OrderRepository orderRepository;

	@Autowired
	MenuRepository menuRepository;

	@Autowired
	ModelMapper modelMapper;
	@Override
	public Menu createMenu(Menu menu) {
		MenuEntity menuEntity = this.modelMapper.map(menu, MenuEntity.class);
		menuEntity = menuRepository.save(menuEntity);
		menu = this.modelMapper.map(menuEntity, Menu.class);
		return menu;
	}

	@Override
	public List<Menu> getAllMenu() {
		List<MenuEntity> menuList = menuRepository.findAll();

		return convertDtoToEntity(menuList);
	}
	private List<Menu> convertDtoToEntity(List<MenuEntity> menuList) {
		List<Menu> menuDto = new ArrayList<>();
		for (MenuEntity menuEntity : menuList) {
			Menu menu = this.modelMapper.map(menuEntity, Menu.class);
			menuDto.add(menu);
		}
		return menuDto;
	}

	@Override
	public Menu getMenuById(int id) {
		Optional<MenuEntity> optionalMenuEntity = menuRepository.findById(id);

		Menu menu = this.modelMapper.map(optionalMenuEntity.get(), Menu.class);

		return menu;
	}

	@Override
	public Order createOrder(Order order) {
		OrderEntity orderEntity = this.modelMapper.map(order, OrderEntity.class);
		orderEntity = orderRepository.save(orderEntity);
		order = this.modelMapper.map(orderEntity, Order.class);

		return order;
	}

	@Override
	public Order getOrderById(int id) {
		
			Optional<OrderEntity> optionalOrder = orderRepository.findById(id);
			return this.modelMapper.map(optionalOrder.get(), Order.class);
		}
	}


