package business.control;

import java.util.ArrayList;
import business.model.Usuario;

public class MementoUsuario
{
     protected  ArrayList<Usuario> versao;

     public GerenciaMementoUsuario(ArrayList<Usuario> lista)
     {
		this.versao = new ArrayList<Usuario>(lista);
	}

     public void updateMemento(ArrayList<Usuario> lista)
     {
		this.versao = new ArrayList<Usuario>(lista);
	}

	public ArrayList<Usuario> getEstadoSalvo()
     {
		return this.estados;
	}

}