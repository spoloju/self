package com.app.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.pojo.BenifitsEnrollment;

public class BenifitsRowMapper implements RowMapper<BenifitsEnrollment>{

	@Override
	public BenifitsEnrollment mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		BenifitsEnrollment bfe = new BenifitsEnrollment();
		bfe.setEmpId(rs.getInt("empid"));
		bfe.setEnrolled(rs.getString("enrolled"));
		bfe.setActive(rs.getBoolean("active"));		

		return bfe;
	}

}
