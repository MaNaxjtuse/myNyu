package com.example.demo997;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
public interface MoneyMapper {
    List<Luckymoney> findAll();
}
