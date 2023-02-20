package dao;

import java.util.List;

import model.Yonetici;

public interface YoneticiDAO {
	
	public void insertYonetici(String yoneticiAd, String yoneticiSoyad, String yoneticiMail, String yoneticiSifre, String seviye);
	
	public List<Yonetici> getYoneticis();
	
	public void removeYonetici(int id);
	
	public Yonetici getYonetici(int id);
	
	public void updateYonetici(int id, String yoneticiAd, String yoneticiSoyad, String yoneticiMail, String yoneticiSifre, String seviye);
	
  
}
