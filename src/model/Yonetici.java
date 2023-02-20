package model;

public class Yonetici {
	
	private int yoneticiId;
	private String yoneticiAd;
	private String yoneticiSoyad;
	private String yoneticiMail;
	private String yoneticiSifre;
	private String seviye;
	
	
	
	public Yonetici() {
		super();
	}
	public Yonetici(int yoneticiId, String yoneticiAd, String yoneticiSoyad, String yoneticiMail, String yoneticiSifre,
			String seviye) {
		super();
		this.yoneticiId = yoneticiId;
		this.yoneticiAd = yoneticiAd;
		this.yoneticiSoyad = yoneticiSoyad;
		this.yoneticiMail = yoneticiMail;
		this.yoneticiSifre = yoneticiSifre;
		this.seviye = seviye;
	}
	public int getYoneticiId() {
		return yoneticiId;
	}
	public void setYoneticiId(int yoneticiId) {
		this.yoneticiId = yoneticiId;
	}
	public String getYoneticiAd() {
		return yoneticiAd;
	}
	public void setYoneticiAd(String yoneticiAd) {
		this.yoneticiAd = yoneticiAd;
	}
	public String getYoneticiSoyad() {
		return yoneticiSoyad;
	}
	public void setYoneticiSoyad(String yoneticiSoyad) {
		this.yoneticiSoyad = yoneticiSoyad;
	}
	public String getYoneticiMail() {
		return yoneticiMail;
	}
	public void setYoneticiMail(String yoneticiMail) {
		this.yoneticiMail = yoneticiMail;
	}
	public String getYoneticiSifre() {
		return yoneticiSifre;
	}
	public void setYoneticiSifre(String yoneticiSifre) {
		this.yoneticiSifre = yoneticiSifre;
	}
	public String getSeviye() {
		return seviye;
	}
	public void setSeviye(String seviye) {
		this.seviye = seviye;
	}
	
	
	
	
	

}
