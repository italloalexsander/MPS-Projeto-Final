package infra;

import business.model.Usuario;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class DAOusuario implements BridgeDAO<Usuario>
{

     public List<Usuario> get() {
          return Collections.<Usuario>emptyList();
     }

     public void add(Usuario u) {
          System.out.println("Adicionando Usuario Especificado");
     }


     public void delete(String id) {
          System.out.println("Removendo Usuario Especificado...");
     }
}