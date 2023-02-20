package dao;

import java.util.List;

import model.Cihaz;

public interface CihazDAO {
	
    public void insertCihaz(String cihazAd, int labId);
	
	public List<Cihaz> getCihazs();
	
	public void removeCihaz(int id);
	
	public Cihaz getCihaz(int id);
	
	public void updateCihaz(int id,String cihazAd,int labId);

}
