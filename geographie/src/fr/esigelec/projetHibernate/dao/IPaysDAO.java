package fr.esigelec.projetHibernate.dao;

import java.util.List;

import fr.esigelec.projetHibernate.dto.Pays;
import fr.esigelec.projetHibernate.dto.Ville;

public interface IPaysDAO {	
	public void ajouter(Pays p);
	public Pays getPays(int id);
	public List<Pays> getPays();
	public Pays getPays(String nomPays);
	public void update(Pays p);
	public void delete(Pays p);
	public void refresh(Pays p);
	public List<Ville> getVilles(Pays p);
}
