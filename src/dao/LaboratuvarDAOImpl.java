package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import model.Laboratuvar;

public class LaboratuvarDAOImpl implements LaboratuvarDAO {
	
	
	private static final String INSERT_LABORATUVAR="insert into laboratuvar(laboratuvarad) values(?)";
	private static final String ALL_LABORATUVARS="select * from laboratuvar";
	private static final String DELETE_LABORATUVAR ="delete from laboratuvar where laboratuvarid=?";
    private static final String UPDATE_LABORATUVAR="update laboratuvar set laboratuvarad=? where laboratuvarid=?";
	private static final String GET_LABORATUVAR ="select * from laboratuvar where laboratuvarid=?";
	
	
	
	private DataSource getDataSource() {
		ConnectionManager manager = new ConnectionManager();
		DataSource dataSource = manager.getMySQLDataSource();
		return dataSource;

	}

	@Override
	public void insertLaboratuvar(String laboratuvarAd) {
		
		DataSource dataSource = getDataSource();

		try {
			Connection connection = dataSource.getConnection();
			
			PreparedStatement ps = connection.prepareStatement(INSERT_LABORATUVAR);
			ps.setString(1, laboratuvarAd);
			ps.executeUpdate();
			connection.close();
			System.out.println("eklendi");
		} catch (SQLException e) {
			System.out.println("eklenmedi");
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Laboratuvar> getLaboratuvars() {
		
		DataSource dataSource = getDataSource();
		Connection connection;
		List<Laboratuvar> laboratuvars = new ArrayList<Laboratuvar>();
		try {
			connection = dataSource.getConnection();
			
			PreparedStatement ps = connection.prepareStatement(ALL_LABORATUVARS);
			ResultSet resultSet = ps.executeQuery();

			while (resultSet.next()) {
				int laboratuvarId = resultSet.getInt("laboratuvarid");
				String laboratuvarAd = resultSet.getString("laboratuvarad");

				Laboratuvar laboratuvar = new Laboratuvar(laboratuvarId, laboratuvarAd);
				laboratuvars.add(laboratuvar);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return laboratuvars;
	}

	@Override
	public void removeLaboratuvar(int id) {
		
		DataSource dataSource = getDataSource();

		Connection connection;
		try {
			connection = dataSource.getConnection();
			
			PreparedStatement ps = connection.prepareStatement(DELETE_LABORATUVAR);
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
	public Laboratuvar getLaboratuvar(int id) {
		
		DataSource dataSource = getDataSource();
		Connection connection;
		Laboratuvar laboratuvar = new Laboratuvar();
		try {
			connection = dataSource.getConnection();
			
			PreparedStatement ps = connection.prepareStatement(GET_LABORATUVAR);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				laboratuvar.setLaboratuvarId(rs.getInt("laboratuvarid"));
				laboratuvar.setLaboratuvarAd(rs.getString("laboratuvarad"));
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return laboratuvar;
	}

	@Override
	public void updateLaboratuvar(int id, String laboratuvarAd) {
	
		DataSource dataSource = getDataSource();
		
		Connection connection;
		try {
			connection = dataSource.getConnection();
			
			PreparedStatement ps = connection.prepareStatement(UPDATE_LABORATUVAR);
			ps.setString(1, laboratuvarAd);
			ps.setInt(2, id);
			ps.execute();
			ps.close();
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

		
