package com.example.demo997;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: demo997
 * @description:
 * @author: Ma
 * @create: 2020-07-26 20:09
 **/
@Service
public class MoneyService implements MoneyMapper{
    @Autowired
    private MoneyMapper moneyMapper;

    @Override
    public List<Luckymoney> findAll() {
        return moneyMapper.findAll();
    }
}
