package com.example.SpringBoot.Model;

import java.util.List;

public class Company {

	private String companyName;
	private double turnover;
	private String ceo;
	private String boardOfDirectors;
	private List stockExchangeLists;
	private String briefWriteup;
	private int stockCode;
	private int companyCode;
	private int sectorId;

	public int getSectorId() {
		return sectorId;
	}

	public void setSectorId(int sectorId) {
		this.sectorId = sectorId;
	}

	public int getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(int companyCode) {
		this.companyCode = companyCode;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public double getTurnover() {
		return turnover;
	}

	public void setTurnover(double turnover) {
		this.turnover = turnover;
	}

	public String getCeo() {
		return ceo;
	}

	public void setCeo(String ceo) {
		this.ceo = ceo;
	}

	public String getBoardOfDirectors() {
		return boardOfDirectors;
	}

	public void setBoardOfDirectors(String boardOfDirectors) {
		this.boardOfDirectors = boardOfDirectors;
	}

	public List getStockExchangeLists() {
		return stockExchangeLists;
	}

	public void setStockExchangeLists(List stockExchangeLists) {
		this.stockExchangeLists = stockExchangeLists;
	}

	public String getBriefWriteup() {
		return briefWriteup;
	}

	public void setBriefWriteup(String briefWriteup) {
		this.briefWriteup = briefWriteup;
	}

	public int getStockCode() {
		return stockCode;
	}

	public void setStockCode(int stockCode) {
		this.stockCode = stockCode;
	}

	@Override
	public String toString() {
		return "Company [companyName=" + companyName + ", turnover=" + turnover + ", ceo=" + ceo + ", boardOfDirectors="
				+ boardOfDirectors + ", stockExchangeLists=" + stockExchangeLists + ", briefWriteup=" + briefWriteup
				+ ", stockCode=" + stockCode + ", companyCode=" + companyCode + ", sectorId=" + sectorId + "]";
	}

	

}
