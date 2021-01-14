package com.bolsadeideas.springboot.backend.apirest.models.services;

import org.springframework.data.jpa.repository.Query;

import com.bolsadeideas.springboot.backend.apirest.models.entity.Usuario;

public interface IUsuarioService {

	//Busqueda por medio del metodo, se ejecuta lo que indica el nombre
		public Usuario findByUsername(String username);
	
}
