package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import model.Analiz;
import model.Cihaz;


public class AnalizDAOImpl implements AnalizDAO {
	
	private static final String INSERT_ANALIZ="insert into analiz(analizad,analizfiyat,cihid) values(?,?,?)";
	private static final String ALL_ANALIZS="select * from analiz a join cihaz c on a.cihId=c.cihazId; ";
	private static final String DELETE_ANALIZ ="delete from analiz where analizid=?";
    private static final String UPDATE_ANALIZ="update analiz set analizad=? where analizid=?";
	private static final String GET_ANALIZ ="select * from analiz where analizid=?";
	
	
	private DataSource getDataSource() {
		ConnectionManager manager = new ConnectionManager();
		DataSource dataSource = manager.getMySQLDataSource();
		return dataSource;
	}
	

	@Override
	public void insertAnaliz(String analizAd, String analizFiyat, int cihId) {
		
		DataSource dataSource = getDataSource();
		
		try {
			Connection connection = dataSource.getConnection();
			
			PreparedStatement ps = connection.prepareStatement(INSERT_ANALIZ);
			ps.setString(1,analizAd );
			ps.setString(2, analizFiyat);
			ps.setInt(3,cihId );
			
			ps.executeUpdate();
			connection.close();
			System.out.println("eklendi");
		} catch (SQLException e) {
			System.out.println("eklenmedi");
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Analiz> getAnalizs() {
		
		DataSource dataSource = getDataSource();
		Connection connection;
		List<Analiz> analizs = new ArrayList<Analiz>();
		try {
			connection = dataSource.getConnection();
			
			PreparedStatement ps = connection.prepareStatement(ALL_ANALIZS);
			ResultSet resultSet = ps.executeQuery();

			while (resultSet.next()) {
				int analizId = resultSet.getInt("analizid");
				String analizAd = resultSet.getString("analizad");
				String analizFiyat = resultSet.getString("analizfiyat");
				int cihId = resultSet.getInt("cihid");
				String cihazAd=resultSet.getString("cihazad");
				
				
				Cihaz cihaz = new Cihaz(cihId,cihazAd);
				
				
				Analiz analiz = new Analiz(analizId, analizAd,analizFiyat,cihaz);
				analizs.add(analiz);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return analizs;
	}

	@Override
	public void removeAnaliz(int id) {
		
		DataSource dataSource = getDataSource();

		Connection connection;
		try {
			connection = dataSource.getConnection();
			
			PreparedStatement ps = connection.prepareStatement(DELETE_ANALIZ);
			ps.setInt(1, id);
			ps.execute();
			ps.close();
			connection.close();
			System.out.println("silindi");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("silme iþlemi baþarýsýz");
			e.printStackTrace();
		}
		
	}

	@Override
	public Analiz getAnaliz(int id) {
		
		DataSource dataSource = getDataSource();
		Connection connection;
		Analiz analiz = new Analiz();
		try {
			connection = dataSource.getConnection();
			
			PreparedStatement ps = connection.prepareStatement(GET_ANALIZ);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				analiz.setAnalizId(rs.getInt("analizid"));
				analiz.setAnalizAd(rs.getString("analizad"));
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return analiz;
	}

	@Override
	public void updateAnazliz(int id, String analizAd, String analizFiyat, int cihId) {
		
        DataSource dataSource = getDataSource();
		
		Connection connection;
		try {
			connection = dataSource.getConnection();
			
			PreparedStatement ps = connection.prepareStatement(UPDATE_ANALIZ);
			ps.setString(1, analizAd);
			ps.setString(2, analizFiyat);
			ps.setInt(3, cihId);
			
			ps.setInt(5, id);
			ps.execute();
			ps.close();
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
