package model;

public class Laboratuvar {
	
	private int laboratuvarId;
	private String laboratuvarAd;
	
	
	
	public Laboratuvar() {
		super();
	}
	public Laboratuvar(int laboratuvarId, String laboratuvarAd) {
		super();
		this.laboratuvarId = laboratuvarId;
		this.laboratuvarAd = laboratuvarAd;
	}
	public int getLaboratuvarId() {
		return laboratuvarId;
	}
	public void setLaboratuvarId(int laboratuvarId) {
		this.laboratuvarId = laboratuvarId;
	}
	public String getLaboratuvarAd() {
		return laboratuvarAd;
	}
	public void setLaboratuvarAd(String laboratuvarAd) {
		this.laboratuvarAd = laboratuvarAd;
	}
	@Override
	public String toString() {
		return "Laboratuvar [laboratuvarId=" + laboratuvarId + ", laboratuvarAd=" + laboratuvarAd + "]";
	}
	
	
	
	

}
