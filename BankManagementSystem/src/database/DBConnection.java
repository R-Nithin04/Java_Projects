package database;

import java.sql.*;
public class DBConnection 
{
	public static Connection getConnection()
	{
		String url="jdbc:sqlserver://localhost:1433;"+"databaseName=BankDB;"+"encrypt=true;"+"trustServerCertificate=true;";
		try
		{
			Connection con=DriverManager.getConnection(url,"sa","Nithin@123");
			return con;
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			return null;
		}
	}
		public static void main(String args[])
		{
			Connection con=getConnection();
			if(con!=null)
			{
				System.out.println("Connection Successful");
				try
				{
					con.close();
				}
				catch(SQLException e)
				{
					e.printStackTrace();
				}
			}
		}
	}
