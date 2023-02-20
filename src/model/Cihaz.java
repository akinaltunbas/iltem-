package model;

public class Cihaz {
	
	private int cihazId;
	private String cihazAd;
	private  Laboratuvar laboratuvar;
	
	
	
	public Cihaz() {
		super();
	}
	public Cihaz(int cihazId, String cihazAd) {
		super();
		this.cihazId = cihazId;
		this.cihazAd = cihazAd;
	}
	public Cihaz(int cihazId, String cihazAd, Laboratuvar laboratuvar) {
		super();
		this.cihazId = cihazId;
		this.cihazAd = cihazAd;
		this.laboratuvar = laboratuvar;
	}
	public int getCihazId() {
		return cihazId;
	}
	public void setCihazId(int cihazId) {
		this.cihazId = cihazId;
	}
	public String getCihazAd() {
		return cihazAd;
	}
	public void setCihazAd(String cihazAd) {
		this.cihazAd = cihazAd;
	}
	public Laboratuvar getLaboratuvar() {
		return laboratuvar;
	}
	public void setLaboratuvar(Laboratuvar laboratuvar) {
		this.laboratuvar = laboratuvar;
	}
	@Override
	public String toString() {
		return "Cihaz [cihazId=" + cihazId + ", cihazAd=" + cihazAd + ", laboratuvar=" + laboratuvar + "]";
	}
	
	
	
	

}
