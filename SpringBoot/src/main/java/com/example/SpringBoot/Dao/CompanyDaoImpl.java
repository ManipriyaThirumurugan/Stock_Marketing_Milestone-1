package com.example.SpringBoot.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.SpringBoot.Model.Company;



@Repository
public class CompanyDaoImpl implements CompanyDao {

	public boolean insertCompany(Company company) throws SQLException {
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/stockexchange?useSSL=false",
				"root", "root");
		PreparedStatement preparedStatement = connection.prepareStatement(
				"insert into company (company_name,turnover,ceo,board_of_directors,sector_id,brief_writeup,stock_code) values(?,?,?,?,?,?,?)");
		preparedStatement.setString(1, company.getCompanyName());
		preparedStatement.setDouble(2, company.getTurnover());
		preparedStatement.setString(3, company.getCeo());
		preparedStatement.setString(4, company.getBoardOfDirectors());
		preparedStatement.setInt(5, 1);
		preparedStatement.setString(6, company.getBriefWriteup());
		preparedStatement.setInt(7,1);
		preparedStatement.executeUpdate();
		return true;
	}

	public List<Company> getCompanyList() {
		List<Company> companyList = new ArrayList<Company>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/stockexchange?useSSL=false",
					"root", "root");
			PreparedStatement preparedStatement = conn.prepareStatement("select * from company");
			ResultSet rs = preparedStatement.executeQuery();
			Company company = null;
			while (rs.next()) {
				company = new Company();
				company.setCompanyCode(rs.getInt("company_code"));
				company.setCompanyName(rs.getString("company_name"));
				company.setTurnover(rs.getDouble("turnover"));
				company.setCeo(rs.getString("ceo"));
				company.setBoardOfDirectors(rs.getString("board_of_directors"));
				company.setSectorId(rs.getInt("sector_id"));
				company.setBriefWriteup(rs.getString("brief_writeup"));
				company.setStockCode(rs.getInt("stock_code"));
				companyList.add(company);
			}
		} catch (Exception e) {
			System.out.println(e);
			
		}
		return companyList;
	}

	@Override
	public Company updateCompany(Company company) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args) throws Exception {
		CompanyDaoImpl dao = new CompanyDaoImpl();
		

		System.out.println(dao.getCompanyList());
	}

}
