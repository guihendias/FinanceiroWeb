package financeiro.web;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class UsuarioBean {
	private String name;
	private String email;
	private String senha;
	private String confirmaSenha;
	
	public String novo(){
		return "usuario";
	}
	
	public String salvar(){
		FacesContext context = FacesContext.getCurrentInstance();
		if(!this.senha.equalsIgnoreCase(this.confirmaSenha)){
			context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Senha confirmada incorretamente",""));
			return "usuario";
		}
		return "sucesso";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getConfirmaSenha() {
		return confirmaSenha;
	}
	public void setConfirmaSenha(String confirmaSenha) {
		this.confirmaSenha = confirmaSenha;
	}
}
