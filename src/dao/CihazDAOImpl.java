package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import model.Cihaz;
import model.Laboratuvar;

public class CihazDAOImpl implements CihazDAO{
	
	
	private static final String INSERT_CIHAZ="insert into cihaz(cihazad,labid) values(?,?)";
	private static final String ALL_CIHAZS="select * from cihaz c join laboratuvar l on c.labId=l.laboratuvarId;";
	private static final String DELETE_CIHAZ ="delete from cihaz where cihazid=?";
    private static final String UPDATE_CIHAZ="update cihaz set cihazad=? , labId=? where cihazid=?";
	private static final String GET_CIHAZ ="select * from cihaz where cihazid=?";
	
	
	private DataSource getDataSource() {
		ConnectionManager manager = new ConnectionManager();
		DataSource dataSource = manager.getMySQLDataSource();
		return dataSource;
	}


	@Override
	public void insertCihaz(String cihazAd, int labId) {
		
		DataSource dataSource = getDataSource();

		try {
			Connection connection = dataSource.getConnection();
			
			PreparedStatement ps = connection.prepareStatement(INSERT_CIHAZ);
			ps.setString(1,cihazAd );
			ps.setInt(2,labId );
			ps.executeUpdate();
			connection.close();
			System.out.println("eklendi");
		} catch (SQLException e) {
			System.out.println("eklenmedi");
			e.printStackTrace();
		}
		
	}


	@Override
	public List<Cihaz> getCihazs() {
		
		DataSource dataSource = getDataSource();
		Connection connection;
		List<Cihaz> cihazs = new ArrayList<Cihaz>();
		try {
			connection = dataSource.getConnection();
			
			PreparedStatement ps = connection.prepareStatement(ALL_CIHAZS);
			ResultSet resultSet = ps.executeQuery();

			while (resultSet.next()) {
				int cihazId = resultSet.getInt("cihazid");
				String chazAd = resultSet.getString("cihazad");
				int labId = resultSet.getInt("labid");
				String laboratuvarAd = resultSet.getString("laboratuvarAd");
				
				Laboratuvar laboratuvar = new Laboratuvar(labId,laboratuvarAd);

				Cihaz cihaz = new Cihaz(cihazId, chazAd,laboratuvar);
				cihazs.add(cihaz);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return cihazs;
	}


	@Override
	public void removeCihaz(int id) {
		
		DataSource dataSource = getDataSource();

		Connection connection;
		try {
			connection = dataSource.getConnection();
			
			PreparedStatement ps = connection.prepareStatement(DELETE_CIHAZ);
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
	public Cihaz getCihaz(int id) {

		DataSource dataSource = getDataSource();
		Connection connection;
		Cihaz cihaz = new Cihaz();
		try {
			connection = dataSource.getConnection();
			
			PreparedStatement ps = connection.prepareStatement(GET_CIHAZ);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				cihaz.setCihazId(rs.getInt("cihazid"));
				cihaz.setCihazAd(rs.getString("cihazad"));
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return cihaz;
	}


	@Override
	public void updateCihaz(int id, String cihazAd, int labId) {
		
        DataSource dataSource = getDataSource();
		
		Connection connection;
		try {
			connection = dataSource.getConnection();
			
			PreparedStatement ps = connection.prepareStatement(UPDATE_CIHAZ);
			ps.setString(1, cihazAd);
			ps.setInt(2, labId);
			ps.setInt(3, id);
			ps.execute();
			ps.close();
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	

}
