package unisul.progweb.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name="table_usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String login;
	private String senha;
	private String nomeCompleto;
	private int cpf;
	private String nascimento;
	private String sexo;
	private String estadoCivil;

	public Usuario() {
	}

	public Usuario(String login, String senha, String nomeCompleto, int cpf, String Nascimento, String sexo,
			String estadoCivil) {
		this.login = login;
		this.senha = senha;
		this.nomeCompleto = nomeCompleto;
		this.cpf = cpf;
		this.nascimento = Nascimento;
		this.sexo = sexo;
		this.estadoCivil = estadoCivil;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getNascimento() {
		return nascimento;
	}

	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	
	@Override
	public String toString() {
		return "Usuario{ " +
				"login: "+ this.login +
				", senha: " + this.senha +
				", nomeCompleto: " + this.nomeCompleto +
				", cpf: " + this.cpf +
				", Nascimento: " + this.nascimento +
				", sexo: " + this.sexo +
				", Estado Civil: " + this.estadoCivil +
				" }";
	}

}
