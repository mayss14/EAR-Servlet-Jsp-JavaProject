package sessions;

import java.util.List;

import dao.IDao;
import dao.IDaoLocal;
import dao.UserIDAO;
import entities.Etudiant;
import entities.User;
import jakarta.annotation.security.PermitAll;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Stateless
public class UserService implements IDao<User>,UserIDAO {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	@PermitAll
	public boolean create(User o) {
		em.persist(o);
		return true;
	}

	@Override
	@PermitAll
	public boolean update(User o) {
		User u = em.find(User.class,o.getId());
		
		u.setLogin(o.getLogin());
		u.setPsd(o.getPsd());
		u.setRoles(o.getRoles());
		
		em.merge(u);
		return true;
	}

	@Override
	@PermitAll
	public boolean delete(User o) {
		em.remove(o);
		return true;
	}
	@PermitAll
	@Override
	public User findById(int id) {
		return em.find(User.class, id);
	}

	@Override
	@PermitAll
	public List<User> findAll() {
		jakarta.persistence.Query query = em.createQuery("select u from User u");
		return query.getResultList();		
	}
	
}
