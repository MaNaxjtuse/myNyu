package com.example.demo997;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

/**
 * Created by mana
 * 2019-03-11 21:35
 */
@RestController
@RequestMapping("/mn")
public class LuckymoneyController {

	@Autowired
	private MoneyService moneyService;


	/**
	 * 获取红包列表
	 */
	@GetMapping("/luckymoneys")
	public List<Luckymoney> list() {
		return moneyService.findAll();
	}
}
