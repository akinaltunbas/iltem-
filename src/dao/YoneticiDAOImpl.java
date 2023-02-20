package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import model.Yonetici;


public class YoneticiDAOImpl implements YoneticiDAO {
	
	
	private static final String INSERT_YONETICI ="insert into yonetici(yoneticiad,yoneticisoyad,yoneticimail,yoneticisifre,seviye) values (?,?,?,?,?)";
	private static final String ALL_YONETICIS = "select * from yonetici";
	private static final String DELETE_YONETICI ="delete from yonetici where yoneticiid=?";
	private static final String UPDATE_YONETICI ="update yonetici set yoneticiad=?,yoneticisoyad=?,yoneticimail=?,yonetisifre=?,seviye=? where yoneticiid=?";
	private static final String GET_YONETICI = "select * from yonetici where yoneticiid=?";
	
	
	
	private DataSource getDataSource(){
		ConnectionManager manager = new ConnectionManager();
		DataSource dataSource = manager.getMySQLDataSource();
		return dataSource;
	}

	@Override
	public void insertYonetici(String yoneticiAd, String yoneticiSoyad, String yoneticiMail, String yoneticiSifre,
			String seviye) {
        DataSource dataSource = getDataSource();
		
		try {
			Connection connection = dataSource.getConnection();
			PreparedStatement ps = connection.prepareStatement(INSERT_YONETICI);
			ps.setString(1, yoneticiAd);
			ps.setString(2, yoneticiSoyad);
			ps.setString(3, yoneticiMail);
			ps.setString(4, yoneticiSifre);
			ps.setString(5, seviye);
			ps.executeUpdate();
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Yonetici> getYoneticis() {
		DataSource dataSource = getDataSource();
		Connection connection;
		List<Yonetici> yoneticis = new ArrayList<Yonetici>();
		try {
			connection = dataSource.getConnection();
			PreparedStatement ps = connection.prepareStatement(ALL_YONETICIS);
			ResultSet resultSet = ps.executeQuery();
			
			while(resultSet.next()){
				int yoneticiId = resultSet.getInt("yoneticiid");
				String yoneticiAd = resultSet.getString("yoneticiad");
				String yoneticiSoyad = resultSet.getString("yoneticisoyad");
				String yoneticiMail = resultSet.getString("yoneticimail");
				String yoneticiSifre = resultSet.getString("yoneticisifre");
				String seviye = resultSet.getString("seviye");
				
				Yonetici yonetici=new Yonetici(yoneticiId,yoneticiAd,yoneticiSoyad,yoneticiMail,yoneticiSifre,seviye);
 				yoneticis.add(yonetici);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return yoneticis;
	}

	@Override
	public void removeYonetici(int id) {
	DataSource dataSource = getDataSource();
		
		Connection connection;
		try {
			connection = dataSource.getConnection();
			PreparedStatement ps = connection.prepareStatement(DELETE_YONETICI);
			ps.setInt(1, id);
			ps.execute();
			ps.close();
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public Yonetici getYonetici(int id) {
		DataSource dataSource = getDataSource();
		Connection connection;
		Yonetici yonetici=new Yonetici();
		try {
			connection=dataSource.getConnection();
			PreparedStatement ps = connection.prepareStatement(GET_YONETICI);
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				yonetici.setYoneticiId(rs.getInt("yoneticiid"));
				yonetici.setYoneticiAd(rs.getString("yoneticiad"));
				yonetici.setYoneticiSoyad(rs.getString("yoneticisoyad"));
				yonetici.setYoneticiMail(rs.getString("yoneticimail"));
				yonetici.setYoneticiSifre(rs.getString("yoneticisifre"));
				yonetici.setSeviye(rs.getString("seviye"));
			
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return yonetici;
	}

	@Override
	public void updateYonetici(int id, String yoneticiAd, String yoneticiSoyad, String yoneticiMail,
			String yoneticiSifre, String seviye) {
		DataSource dataSource = getDataSource();
		Connection connection;
		try {
			connection=dataSource.getConnection();
			PreparedStatement ps = connection.prepareStatement(UPDATE_YONETICI);
			ps.setString(1,yoneticiAd); 
			ps.setString(2,yoneticiSoyad);
			ps.setString(3, yoneticiMail);
			ps.setString(4, yoneticiSifre);
			ps.setString(5, seviye);
			ps.setInt(6, id);
			ps.execute();
			connection.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


	}




