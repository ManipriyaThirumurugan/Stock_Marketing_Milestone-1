package com.example.SpringBoot.Controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.SpringBoot.Model.Company;
import com.example.SpringBoot.Service.CompanyService;

@Controller
public class CompanyControllerImpl implements CompanyController {

	@Autowired
	private CompanyService companyService;

	public boolean insertCompany(Company company) throws SQLException {
		return companyService.insertCompany(company);

	}

	@Override
	public Company updateCompany(Company company) {
		return null;
	}

	
	@RequestMapping(path="/companyList")
	public ModelAndView getCompanyList() throws Exception {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("companyList");
		mv.addObject("companyList",companyService.getCompanyList());
		return mv;
	}

}
