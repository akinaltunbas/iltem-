package model;

public class Kullanici {
	
	private int kullaniciId;
	private String kullaniciAd;
	private String kullaniciSoyad;
	private String kullaniciMail;
	private String kullaniciSifre;
	private String seviye;
	
	
	
	public Kullanici() {
		super();
	}
	public Kullanici(int kullaniciId, String kullaniciAd, String kullaniciSoyad, String kullaniciMail,
			String kullaniciSifre, String seviye) {
		super();
		this.kullaniciId = kullaniciId;
		this.kullaniciAd = kullaniciAd;
		this.kullaniciSoyad = kullaniciSoyad;
		this.kullaniciMail = kullaniciMail;
		this.kullaniciSifre = kullaniciSifre;
		this.seviye = seviye;
	}
	public int getKullaniciId() {
		return kullaniciId;
	}
	public void setKullaniciId(int kullaniciId) {
		this.kullaniciId = kullaniciId;
	}
	public String getKullaniciAd() {
		return kullaniciAd;
	}
	public void setKullaniciAd(String kullaniciAd) {
		this.kullaniciAd = kullaniciAd;
	}
	public String getKullaniciSoyad() {
		return kullaniciSoyad;
	}
	public void setKullaniciSoyad(String kullaniciSoyad) {
		this.kullaniciSoyad = kullaniciSoyad;
	}
	public String getKullaniciMail() {
		return kullaniciMail;
	}
	public void setKullaniciMail(String kullaniciMail) {
		this.kullaniciMail = kullaniciMail;
	}
	public String getKullaniciSifre() {
		return kullaniciSifre;
	}
	public void setKullaniciSifre(String kullaniciSifre) {
		this.kullaniciSifre = kullaniciSifre;
	}
	public String getSeviye() {
		return seviye;
	}
	public void setSeviye(String seviye) {
		this.seviye = seviye;
	}
	
	
	

}
