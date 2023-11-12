package sessions;

import java.util.List;

import dao.EtudiantIDAO;
import dao.IDao;
import dao.IDaoLocal;
import entities.Etudiant;
import entities.User;
import jakarta.annotation.security.PermitAll;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;


@Stateless
public class EtudiantService  implements IDao<Etudiant>,EtudiantIDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	@PermitAll
	public boolean create(Etudiant o) {
		em.persist(o);
		return true;
	}
    
	@PermitAll
	@Override
	public boolean update(Etudiant o) {
		
		Etudiant e = em.find(Etudiant.class,o.getId());
		e.setFn(o.getFn());
		e.setLn(o.getLn());
		e.setCne(o.getCne());
		e.setLogin(o.getLogin());
		e.setPsd(o.getPsd());
		e.setF(o.getF());
		e.setRoles(o.getRoles());
	
		
		em.merge(e);
		return true;
	}

	@Override
	@PermitAll
	public boolean delete(Etudiant o) {
		em.remove(o);
		return true;
	}

	@PermitAll
	@Override
	public Etudiant findById(int id) {
		return em.find(Etudiant.class, id);
	}

	@Override
	@PermitAll
	public List<Etudiant> findAll() {
		jakarta.persistence.Query query = em.createQuery("select e from Etudiant e");
		return query.getResultList();		
	}
	

}
