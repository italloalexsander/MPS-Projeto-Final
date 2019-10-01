package business.control;

import java.util.*;

public final class GerenteUsuario implements AdminCommand {
    
    private UsuarioMemento memento;
    private ArrayList<Usuario> listaDeUsuarios = new ArrayList<Usuario>();
    private DAOusuario u = new DAOusuario();

    public void load()
    {
         System.out.println("Carregando Usuários");
         listaDeUsuarios = u.get();
         memento = new MementoUsuario(listaDeUsuarios);
    }

    public void close()
    {
         System.out.println("Salvando Usuários");
         u.update();
    }

    public void desfazerAcao()
    {
         this.listaDeUsuarios = memento.getEstadoSalvo();
    }

    public void adicionaUsuario(Usuario usuario)
    {
         memento.updateMemento(this.listaDeUsuarios);
         listaDeUsuarios.add(usuario);
    }

     public void removeUsuario(String id)
     {
		memento.atualizarMemento(this.listaDeUsuarios);
          listaDeUsuarios.delete(id);
	}
}