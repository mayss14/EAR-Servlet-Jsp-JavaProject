import java.util.Hashtable;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import dao.IDao;
import entities.Etudiant;
import entities.Filiere;
import entities.Role;
import entities.User;

public class TestEtudiant{
	
	public static IDao<Etudiant> lookUpEtudiantRemote() throws NamingException {
		final Hashtable<String, String> jndiProperties = new Hashtable();
		jndiProperties.put(Context.INITIAL_CONTEXT_FACTORY, "org.wildfly.naming.client.WildFlyInitialContextFactory");
		jndiProperties.put(Context.PROVIDER_URL, "http-remoting://localhost:8080");
		final Context context = new InitialContext(jndiProperties);

		return (IDao<Etudiant>) context.lookup("ejb:G3EAR/G3Serveur/EtudiantService!dao.IDao");

	}
	public static IDao<Filiere> lookUpFiliereRemote() throws NamingException {
		final Hashtable<String, String> jndiProperties = new Hashtable();
		jndiProperties.put(Context.INITIAL_CONTEXT_FACTORY, "org.wildfly.naming.client.WildFlyInitialContextFactory");
		jndiProperties.put(Context.PROVIDER_URL, "http-remoting://localhost:8080");
		final Context context = new InitialContext(jndiProperties);

		return (IDao<Filiere>) context.lookup("ejb:G3EAR/G3Serveur/FiliereService!dao.IDao");

	}
	public static IDao<Role> lookUpRoleRemote() throws NamingException {
		final Hashtable<String, String> jndiProperties = new Hashtable();
		jndiProperties.put(Context.INITIAL_CONTEXT_FACTORY, "org.wildfly.naming.client.WildFlyInitialContextFactory");
		jndiProperties.put(Context.PROVIDER_URL, "http-remoting://localhost:8080");
		final Context context = new InitialContext(jndiProperties);

		return (IDao<Role>) context.lookup("ejb:G3EAR/G3Serveur/RoleService!dao.IDao");

	}
	
	public static IDao<User> lookUpUserRemote() throws NamingException {
		final Hashtable<String, String> jndiProperties = new Hashtable();
		jndiProperties.put(Context.INITIAL_CONTEXT_FACTORY, "org.wildfly.naming.client.WildFlyInitialContextFactory");
		jndiProperties.put(Context.PROVIDER_URL, "http-remoting://localhost:8080");
		final Context context = new InitialContext(jndiProperties);

		return (IDao<User>) context.lookup("ejb:G3EAR/G3Serveur/UserService!dao.IDao");

	}

	public static void main(String[] args) {
		
		try {
			IDao<Etudiant> dao = lookUpEtudiantRemote();
			IDao<Filiere> daof = lookUpFiliereRemote();
			IDao<Role> daor = lookUpRoleRemote();
			IDao<User> daou = lookUpUserRemote();
			
			daou.create(new User("admin","1234"));
			daou.create(new User("admin1","12345"));
			
			daof.create(new Filiere("IIR5","Informatique"));
			daof.create(new Filiere("IFA","Finance"));
			daof.create(new Filiere("GC","Genie Civil"));
			
			daor.create(new Role("Admin"));
			daor.create(new Role("Admin2"));
			
			
			
			Filiere f = daof.findById(1);
			System.out.println(f.toString());
			
			dao.create(new Etudiant("admin", "1234", "IE6524","Mayssae", "Jabbar",f));
			dao.create(new Etudiant("admin", "1234", "IE6524","Mayssae1", "Jabbar2",daof.findById(2)));
			
			List<Role> roles= daor.findAll();
			Etudiant e1= dao.findById(3);
			
			e1.setRoles(roles);
			
			//dao.delete(dao.findById(1));
			/*
			for(Etudiant e : dao.findAll())
				System.out.println(e);
				*/
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
		
	}

}
