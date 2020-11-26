package unisul.progweb.control;

import java.util.List;
import unisul.progweb.repository.UsuarioRep;
import unisul.progweb.model.Usuario;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.server.ResponseStatusException;


@Controller
@RequestMapping(path="/datacontrol")
public class DatabaseControl {
	
	@Autowired
	private UsuarioRep userRep;
	
	@GetMapping("/getTodos")
	public List<Usuario> getTodosUsuarios() {
		return this.userRep.findAll();
	}
	
	@GetMapping("/getUser/{id}")
	public Usuario getUsuario(@PathVariable(value = "id")Integer id) {
		return this.userRep.findById(id).orElseThrow(
				() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Não foi encontrado registro com esse ID"));	
	}
	
	@PostMapping("/postAddUser")
	public Usuario postAddUser(@Validated @RequestBody Usuario user) {
		return this.userRep.save(user);
	}
	
	@PutMapping("/putAlterarPorID/{id}")
	public Usuario putAlterarPorId(@PathVariable(value = "id")Integer id, @Validated @RequestBody Usuario userNovo) {
		Usuario alterar = userNovo;
		alterar.setId(id);
		return this.userRep.save(alterar);
	}
	
	@DeleteMapping("/apagar/{id")
	public ResponseEntity<?> deleteUsuario(@PathVariable(value = "id") Integer id) {
		Usuario deletar = this.getUsuario(id);
		this.userRep.delete(deletar);
		return ResponseEntity.ok().build();
	}

}
