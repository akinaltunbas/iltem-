package dao;

import java.util.List;

import model.Laboratuvar;

public interface LaboratuvarDAO {
	
	public void insertLaboratuvar(String laboratuvarAd);

	public List<Laboratuvar> getLaboratuvars();

	public void removeLaboratuvar(int id);

	public Laboratuvar getLaboratuvar(int id);

	public void updateLaboratuvar(int id, String laboratuvarAd);

}
