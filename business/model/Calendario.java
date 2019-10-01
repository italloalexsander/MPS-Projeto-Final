package business.model;

import java.util.ArrayList;
import java.io.Serializable;

public class Calendario implements Serializable{
	ArrayList<String> Eventos = new Arraylist();

    public adicionaEvento(String data, String tipo, String nome){
        Eventos.add("Evento: " + nome + "" + data + "" + tipo)
    }

    public void MostraEventos() {
        for (i=0; i<n; i++) {
		System.out.printf("%s", Eventos.get(i));
    }
 
}