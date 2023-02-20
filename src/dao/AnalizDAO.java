package dao;

import java.util.List;

import model.Analiz;

public interface AnalizDAO {
	
	public void insertAnaliz(String anazlizAd,String analizFiyat,int cihId);
	
	public List<Analiz> getAnalizs();
	
	public void removeAnaliz(int id);
	
	public Analiz getAnaliz(int id);
	
	public void updateAnazliz(int id, String analizAd, String analizFiyat, int cihId);

}
