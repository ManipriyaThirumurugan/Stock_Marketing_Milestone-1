package com.example.SpringBoot.Controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.web.servlet.ModelAndView;

import com.example.SpringBoot.Model.Company;

public interface CompanyController {

	public boolean insertCompany(Company company) throws SQLException;

	public Company updateCompany(Company company);

	public ModelAndView getCompanyList() throws Exception;

}
