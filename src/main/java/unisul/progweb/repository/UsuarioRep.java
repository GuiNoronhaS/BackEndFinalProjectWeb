package unisul.progweb.repository;

import unisul.progweb.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRep extends JpaRepository<Usuario, Long> {

}
