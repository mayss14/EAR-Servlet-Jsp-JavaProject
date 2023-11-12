package dao;


import entities.Filiere;

import jakarta.ejb.Local;


@Local
public interface FiliereIDAO extends IDaoLocal<Filiere>{

	Filiere findByCode(String c);

}
