package com.example.SpringBoot.Dao;

import java.sql.SQLException;
import java.util.List;

import com.example.SpringBoot.Model.StockExchange;





public interface StockExchangeDao {
	public boolean insertStockRecord(StockExchange stockExchange) throws SQLException;

	public StockExchange updateStockRecord(StockExchange stockExchange);

	public List<StockExchange> getStockList() throws SQLException;

}
