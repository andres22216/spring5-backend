package com.bolsadeideas.springboot.backend.apirest.models.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.bolsadeideas.springboot.backend.apirest.models.entity.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario, Long>{
	
	//Busqueda por medio del metodo, se ejecuta lo que indica el nombre
	public Usuario findByUsername(String username);
	
	//Busqueda por query personalizado
	@Query("select u from Usuario u where u.username=?1")
	public Usuario findByUsername2(String username);

}
