import dao.impl.ClientDAO;
import models.Client;

import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Get all
        ClientDAO clientDAO=new ClientDAO();
        List<Client> clients=clientDAO.getAll();
        for(Client c:clients){
            System.out.println(c);
        }


//        Get by id
        Client client=clientDAO.getById(1);
        System.out.println("ID 1 : "+client);
    }
}
