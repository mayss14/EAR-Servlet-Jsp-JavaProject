package sessions;

import java.util.List;

import dao.IDao;
import dao.IDaoLocal;
import entities.Role;
import jakarta.annotation.security.PermitAll;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;


@Stateless
public class RoleService implements IDao<Role>{

	@PersistenceContext
	private EntityManager em;
	
	@Override
	@PermitAll
	public boolean create(Role o) {
		em.persist(o);
		return true;
	}
	
	@Override
	public boolean update(Role o) {
		Role r = em.find(Role.class,o.getId());
		r.setName(o.getName());
		r.setUsers(o.getUsers());
		em.merge(r);
		return true;
	}

	
	@Override
	public boolean delete(Role o) {
		em.remove(o);
		return true;
	}

	@PermitAll
	@Override
	public Role findById(int id) {
		return em.find(Role.class, id);
	}

	@Override
	@PermitAll
	public List<Role> findAll() {
		jakarta.persistence.Query query = em.createQuery("select r from Role r");
		return query.getResultList();		
	}

}
