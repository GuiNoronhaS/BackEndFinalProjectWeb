package unisul.progweb.backend.repository;

import unisul.progweb.backend.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRep extends JpaRepository<Usuario, Integer> {

}
