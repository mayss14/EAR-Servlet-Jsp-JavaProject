package sessions;

import java.util.List;

import dao.FiliereIDAO;
import dao.IDao;
import dao.IDaoLocal;
import entities.Filiere;
import jakarta.annotation.security.PermitAll;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Stateless
public class FiliereService implements IDao<Filiere>,FiliereIDAO {


	@PersistenceContext
	private EntityManager em;
	
	@Override
	@PermitAll
	public boolean create(Filiere o) {
		em.persist(o);
		return true;
	}

	@Override
	@PermitAll
	public boolean update(Filiere o) {
		Filiere f = em.find(Filiere.class,o.getId());
		
		f.setCode(o.getCode());
		f.setName(o.getName());
	
		
		em.merge(f);
		return true;
	}

	@Override
	@PermitAll
	public boolean delete(Filiere o) {
		em.remove(o);
		return true;
	}

	@PermitAll
	@Override
	public Filiere findById(int id) {
		return em.find(Filiere.class, id);
	}

	@PermitAll
	@Override
	public Filiere findByCode(String c) {
		return em.find(Filiere.class, c);
	}

	@SuppressWarnings("unchecked")
	@Override
	@PermitAll
	public List<Filiere> findAll() {
		jakarta.persistence.Query query = em.createQuery("select e from Filiere e");
		return query.getResultList();		
	}
	

}
