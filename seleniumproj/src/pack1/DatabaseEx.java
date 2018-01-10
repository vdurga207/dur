package pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import java.sql.Statement;

public class DatabaseEx {

	public static void main(String[] args) throws Exception {
		Connection con=DriverManager.getConnection("jdbc:odbc:dsn2");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from tab32");
		while(rs.next())
		{
			System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
		}
		rs.close();
		st.close();
		con.close();

	}
}
