package dao;

import java.util.List;

import model.Kullanici;

public interface KullaniciDAO {
	
	public void insertKullanici(String kullaniciAd, String kullaniciSoyad, String kullaniciMail, String kullaniciSifre, String seviye);
	
	public List<Kullanici> getKullanicis();
	
	public void removeKullanici(int id);
	
	public Kullanici getKullanici(int id);
	
	public void updateKullanici(int id, String kullaniciAd, String kullaniciSoyad, String kullaniciMail, String kullaniciSifre, String seviye);

}
