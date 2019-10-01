package infra;

import business.model.Livro;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class DAOtag implements BridgeDAO<Tag> {

     public List<Tag> get() {
          return Collections.<Tag>emptyList();
     }

     public void add() {
          System.out.println("Adicionando Tag");
     }

     public void delete() {
          System.out.println("Removendo Tag");
     }

}