package business.control;

public final class GerenteCalendario implements AdminCommand {
   

  public void load()
    {
         System.out.println("Carregando Calendário do usuário");
    }

    public void close()
    {
         System.out.println("Salvando Calendário");
    }

}