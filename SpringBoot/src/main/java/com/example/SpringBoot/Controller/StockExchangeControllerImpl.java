package com.example.SpringBoot.Controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.SpringBoot.Model.StockExchange;
import com.example.SpringBoot.Service.StockExchangeService;


@Controller
public class StockExchangeControllerImpl implements StockExchangeController {
	@Autowired
	private StockExchangeService stockService ;

	@Override
	public boolean insertStockRecord(StockExchange stockExchange) throws SQLException {
		// TODO Auto-generated method stub

		return stockService.insertStockRecord(stockExchange);
	}

	@Override
	public StockExchange updateStockRecord(StockExchange stockExchange) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StockExchange> getStockList() throws Exception {
		// TODO Auto-generated method stub
		return stockService.getStockList();
	}

	/**
	 * @param args
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	
	}


