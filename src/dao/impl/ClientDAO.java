package dao.impl;

import dao.interfaces.IClientDAO;
import models.Client;
import service.DatabaseConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClientDAO implements IClientDAO {
    @Override
    public List<Client> getAll() {
        List<Client> clients=new ArrayList<>();
        Connection connexion=null;
        Statement statement=null;
        ResultSet resultSet=null;
        try{
            connexion=DatabaseConnection.getInstance();
            statement=connexion.createStatement();
            resultSet=statement.executeQuery("SELECT * FROM clients");
            while (resultSet.next()){
                int id=resultSet.getInt("id");
                String nom=resultSet.getString("nom");
                String prenom=resultSet.getString("prenom");
                String email=resultSet.getString("email");
                char genre=resultSet.getString("genre").charAt(0);
                Date dateInscription=resultSet.getDate("dateInscription");
                Date dateNaissance=resultSet.getDate("dateNaissance");

                clients.add(new Client(id,nom,prenom,email,genre,dateInscription,dateNaissance));
            }
        }catch (SQLException err){
            err.printStackTrace();
        }
        return clients;
    }

    @Override
    public Client getById(int id) {
        return null;
    }

    @Override
    public void save(Client client) {

    }

    @Override
    public void update(Client client) {

    }

    @Override
    public void delete(int id) {

    }
}
