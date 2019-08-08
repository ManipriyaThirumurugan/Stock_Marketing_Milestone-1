package com.example.SpringBoot.Dao;

import java.sql.SQLException;
import java.util.List;

import com.example.SpringBoot.Model.Company;



public interface CompanyDao {
	  public boolean insertCompany(Company company) throws SQLException;
	    public Company updateCompany(Company company);
		public List<Company> getCompanyList() throws SQLException;

}
