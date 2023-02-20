package dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.sql.DataSource;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class ConnectionManager {
	
	public DataSource getMySQLDataSource() {
		Properties props = new Properties();
		InputStream is = getClass().getClassLoader().getResourceAsStream("db.properties");

		MysqlDataSource mySQLDataSource = null;
		try {
			props.load(is);
			mySQLDataSource = new MysqlDataSource();
			mySQLDataSource.setURL(props.getProperty("url"));
			mySQLDataSource.setUser(props.getProperty("username"));
			mySQLDataSource.setPassword(props.getProperty("password"));
			System.out.println("varitabanýna baglandý");
		} catch (IOException e) {
			System.out.println("Baglantý kurulamadý");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return mySQLDataSource;
	}

}
