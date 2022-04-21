package com.mysqlconnectjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RetrieveDataFromJdbc {
              
	
	public Connection conn;
	public PreparedStatement pstmt;
	public ResultSet rs;
	public StringBuffer buf;
	
	public RetrieveDataFromJdbc()
	{
		
		try {

			// System.out.println("Clsss Driver");
			Class.forName("com.mysql.cj.jdbc.Driver");
					
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
			String sql="select * from product";
			pstmt = conn.prepareStatement(sql);

			rs = pstmt.executeQuery();
					
			while (rs.next()) {
				buf = new StringBuffer();
				buf.append(padRight(rs.getString("produ_id"), 6) + "  " + padRight(rs.getString("produ_name"), 40)
						+ "  " + padRight(rs.getString("expiry_dt"), 40) + "  "
								+ padRight(rs.getString("proce_id"), 40)+ "  "
						+ padRight(rs.getString("war_id"), 40));
				System.out.println(buf);
			}
		} catch (ClassNotFoundException e) {
			System.err.println(e);
		} catch (SQLException e) {
			System.err.println(e);
		} finally {
			try {

				conn.close();
			} catch (SQLException e) {
			}
		}
	}
		
		public String padRight(String data, int length) {
			StringBuffer buf = new StringBuffer(data);
			for (int i = buf.length(); i < length; i++)
				buf.append(" ");
			return buf.toString();
		}
		
	
	
	public static void main(String[] args) {
        new RetrieveDataFromJdbc();
		
		
		
	}

}
