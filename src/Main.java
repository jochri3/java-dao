import dao.impl.ClientDAO;
import models.Client;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ClientDAO clientDAO=new ClientDAO();

        List<Client> clients=clientDAO.getAll();

//        Itérer sur les objets
        for(Client c:clients){
            System.out.println(c);
        }

        // 2ème méthode d'itération
        clients.forEach(element->{
            System.out.println(element);
        });
    }
}
