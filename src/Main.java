import dao.impl.ClientDAO;
import models.Client;

import java.util.List;
import java.util.Scanner;

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

        //    Création
        Scanner clavier=new Scanner(System.in);
        System.out.print("Votre nom : ");
        String nom=clavier.nextLine();

        System.out.print("Votre prenom : ");
        String prenom=clavier.nextLine();

        System.out.print("Votre email : ");
        String email=clavier.nextLine();

        System.out.print("Votre genre : ");
        char genre=clavier.next().charAt(0);

        Client nouveau=new Client(nom,prenom,email,genre);
        clientDAO.save(nouveau);
    }


}
