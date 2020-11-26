package unisul.progweb.model;

public class Usuario {
	
	
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
	
}
