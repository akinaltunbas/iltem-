package model;

public class Analiz {
	
	private int analizId;
	private String analizAd;
	private String analizFiyat;
	private Cihaz cihaz;
	private Laboratuvar laboratuvar;
	
	
	
	
	public Analiz() {
		super();
	}
	
	
	
	public Analiz(int analizId, String analizAd, String analizFiyat) {
		super();
		this.analizId = analizId;
		this.analizAd = analizAd;
		this.analizFiyat = analizFiyat;
	}

   

	public Analiz(int analizId, String analizAd, String analizFiyat, Cihaz cihaz) {
		super();
		this.analizId = analizId;
		this.analizAd = analizAd;
		this.analizFiyat = analizFiyat;
		this.cihaz = cihaz;
	}



	public Analiz(int analizId, String analizAd, String analizFiyat, Cihaz cihaz, Laboratuvar laboratuvar) {
		super();
		this.analizId = analizId;
		this.analizAd = analizAd;
		this.analizFiyat = analizFiyat;
		this.cihaz = cihaz;
		this.laboratuvar = laboratuvar;
	}
	public int getAnalizId() {
		return analizId;
	}
	public void setAnalizId(int analizId) {
		this.analizId = analizId;
	}
	public String getAnalizAd() {
		return analizAd;
	}
	public void setAnalizAd(String analizAd) {
		this.analizAd = analizAd;
	}
	public String getAnalizFiyat() {
		return analizFiyat;
	}
	public void setAnalizFiyat(String analizFiyat) {
		this.analizFiyat = analizFiyat;
	}
	public Cihaz getCihaz() {
		return cihaz;
	}
	public void setCihaz(Cihaz cihaz) {
		this.cihaz = cihaz;
	}
	public Laboratuvar getLaboratuvar() {
		return laboratuvar;
	}
	public void setLaboratuvar(Laboratuvar laboratuvar) {
		this.laboratuvar = laboratuvar;
	}
	@Override
	public String toString() {
		return "Analiz [analizId=" + analizId + ", analizAd=" + analizAd + ", analizFiyat=" + analizFiyat + ", cihaz="
				+ cihaz + ", laboratuvar=" + laboratuvar + "]";
	}
	
	

}
