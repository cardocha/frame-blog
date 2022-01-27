package com.cardocha.frameblog.repository;

import com.cardocha.frameblog.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
