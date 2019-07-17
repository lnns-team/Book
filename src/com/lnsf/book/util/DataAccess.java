package com.lnsf.book.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;

public class DataAccess {
	private static String driver = null;
	private static String url = null;
	private static String user = null;
	private static String password = null;
	private static String xmlPath = "database.conf.xml";
	private static String xsdPath = "database.conf.xsd";
	
	public static Connection getConnection()
	{
		Connection conn = null;
		if(XMLValidator.validate(xmlPath, xsdPath))
		{
			HashMap<String,String> hm = XmlParser.parser(xmlPath);
			driver = hm.get("driver");
			url = hm.get("url");
			user = hm.get("user");
			password = hm.get("password");
		}
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url,user,password);
		} 
		
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("数据库连接异常，请检查jar包是否引入！");
			e.printStackTrace();
		} 
		
		catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("数据库连接异常，请检查连接参数是否正确");
			e.printStackTrace();
		}
		return conn;
	}
}
