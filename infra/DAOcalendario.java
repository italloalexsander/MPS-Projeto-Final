package infra;

import business.model.Livro;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class DAOcalendario implements BridgeDAO<Calendario> {

     public List<Calendario> get() {
          return Collections.<Calendario>emptyList();
     }

     public void add() {
          System.out.println("Adicionando Calendario");
     }

     public void delete() {
          System.out.println("Removendo Calendario");
     }

}