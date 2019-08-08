package com.example.SpringBoot.Controller;

import java.sql.SQLException;
import java.util.List;

import com.example.SpringBoot.Model.StockExchange;


public interface StockExchangeController {
	public boolean insertStockRecord(StockExchange stockExchange)throws SQLException;
	public StockExchange updateStockRecord(StockExchange stockExchange);
	public List<StockExchange> getStockList() throws Exception;

}
