package unisul.progweb.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;

@Entity
public class Usuario {
	
	private @Id @GeneratedValue int id;
	private String login;
	private String senha;
	private String nomeCompleto;
	private int cpf;
	private String Nascimento;
	private String sexo;
	private String estadoCivil;

	Usuario() {}
	
	Usuario(String login, String senha, String nomeCompleto, int cpf, 
			String Nascimento, String sexo, String estadoCivil) {
		this.login = login;
		this.senha = senha;
		this.nomeCompleto = nomeCompleto;
		this.cpf = cpf;
		this.Nascimento = Nascimento;
		this.sexo = sexo;
		this.estadoCivil = estadoCivil;
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
		return Nascimento;
	}

	public void setNascimento(String nascimento) {
		Nascimento = nascimento;
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
	
	
	
}
