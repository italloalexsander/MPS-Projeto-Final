package business.control;

import business.model.Usuario;

public static class SIGAAAdapter extends API_SIGAA implements ValidaLogin{

     public void validaCadastro(String login, String senha) {
		SIGAA_ValidaCadastro(login, senha);
	}

	public void validaLogin(String login, String senha) {
		SIGAA_ValidaLogin(login, senha);
	}
}