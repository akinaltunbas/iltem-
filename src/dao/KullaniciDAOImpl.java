package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import model.Kullanici;


public class KullaniciDAOImpl implements KullaniciDAO {
	
	
	private static final String INSERT_KULLANICI ="insert into yonetici(yoneticiad,yoneticisoyad,yoneticimail,yoneticisifre,seviye) values (?,?,?,?,?)";
	private static final String ALL_KULLANICIS = "select * from kullanici";
	private static final String DELETE_KULLANICI ="delete from yonetici where yoneticiid=?";
	private static final String UPDATE_KULLANICI ="update kullanici set kullaniciad=?,kullanicisoyad=?,kullanicimail=?,kullanicisifre=?,seviye=? where kullaniciid=?";
	private static final String GET_KULLANICI = "select * from kullanici where kullaniciid=?";
	
	
	
	private DataSource getDataSource(){
		ConnectionManager manager = new ConnectionManager();
		DataSource dataSource = manager.getMySQLDataSource();
		return dataSource;
	}

	@Override
	public void insertKullanici(String kullaniciAd, String kullaniciSoyad, String kullaniciMail, String kullaniciSifre,
			String seviye) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Kullanici> getKullanicis() {
		DataSource dataSource = getDataSource();
		Connection connection;
		List<Kullanici> kullanicis = new ArrayList<Kullanici>();
		try {
			connection = dataSource.getConnection();
			PreparedStatement ps = connection.prepareStatement(ALL_KULLANICIS);
			ResultSet resultSet = ps.executeQuery();
			
			while(resultSet.next()){
				int kullaniciId = resultSet.getInt("kullaniciid");
				String kullaniciAd = resultSet.getString("kullaniciad");
				String kullaniciSoyad = resultSet.getString("kullanicisoyad");
				String kullaniciMail = resultSet.getString("kullanicimail");
				String kullaniciSifre = resultSet.getString("kullanicisifre");
				String seviye = resultSet.getString("seviye");
				
				Kullanici kullanici=new Kullanici(kullaniciId,kullaniciAd,kullaniciSoyad,kullaniciMail,kullaniciSifre,seviye);
				kullanicis.add(kullanici);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return kullanicis;
	}

	@Override
	public void removeKullanici(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Kullanici getKullanici(int id) {
		DataSource dataSource = getDataSource();
		Connection connection;
		Kullanici kullanici=new Kullanici();
		try {
			connection=dataSource.getConnection();
			PreparedStatement ps = connection.prepareStatement(GET_KULLANICI);
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				kullanici.setKullaniciId(rs.getInt("kullaniciid"));
				kullanici.setKullaniciAd(rs.getString("kullaniciad"));
				kullanici.setKullaniciSoyad(rs.getString("kullanicisoyad"));
				kullanici.setKullaniciMail(rs.getString("kullanicimail"));
				kullanici.setKullaniciSifre(rs.getString("kullanicisifre"));
				kullanici.setSeviye(rs.getString("seviye"));
			
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return kullanici;
	}

	@Override
	public void updateKullanici(int id, String kullaniciAd, String kullaniciSoyad, String kullaniciMail,
			String kullaniciSifre, String seviye) {
		DataSource dataSource = getDataSource();
		Connection connection;
		try {
			connection=dataSource.getConnection();
			PreparedStatement ps = connection.prepareStatement(UPDATE_KULLANICI);
			ps.setString(1,kullaniciAd); 
			ps.setString(2,kullaniciSoyad);
			ps.setString(3, kullaniciMail);
			ps.setString(4, kullaniciSifre);
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
