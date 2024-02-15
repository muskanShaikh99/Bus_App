package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.MenuEntity;

public interface MenuRepository extends JpaRepository<MenuEntity, Integer>{

}
