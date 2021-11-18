package dao.impl;

import dao.interfaces.IClientDAO;
import models.Client;
import service.DatabaseConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClientDAO implements IClientDAO {
    @Override
    public List<Client> getAll() {
        List<Client> clients=new ArrayList<>();
        try{
            Connection connexion=DatabaseConnection.getInstance();
            Statement statement=connexion.createStatement();
            ResultSet resultSet=statement.executeQuery("SELECT * FROM clients");
            while (resultSet.next()){
                int id=resultSet.getInt("id");
                String nom=resultSet.getString("nom");
                String prenom=resultSet.getString("prenom");
                String email=resultSet.getString("email");
                char genre=resultSet.getString("genre").charAt(0);
                Date dateInscription=resultSet.getDate("dateInscription");
                Date dateNaissance=resultSet.getDate("dateNaissance");

//                v1
//                Client client=new Client(id,nom,prenom,email,genre,dateInscription,dateNaissance);
//                clients.add(client);

//                v2
                clients.add(new Client(id,nom,prenom,email,genre,dateInscription,dateNaissance));

            }
        }catch (SQLException err){
            err.printStackTrace();
        }
        return clients;
    }

    @Override
    public Client getById(int id) {
        Client client=null;
        try{
            Connection connexion=DatabaseConnection.getInstance();
            PreparedStatement statement=connexion.prepareStatement("SELECT * FROM clients WHERE id=?");
            statement.setInt(1,id);
            ResultSet resultSet=statement.executeQuery();
            while (resultSet.next()){
                int clientId=resultSet.getInt("id");
                String nom=resultSet.getString("nom");
                String prenom=resultSet.getString("prenom");
                String email=resultSet.getString("email");
                char genre=resultSet.getString("genre").charAt(0);
                Date dateInscription=resultSet.getDate("dateInscription");
                Date dateNaissance=resultSet.getDate("dateNaissance");
                client=new Client(clientId,nom,prenom,email,genre,dateInscription,dateNaissance);
            }
        }catch (SQLException err){
            err.printStackTrace();
        }
        return client;
    }

    @Override
    public void save(Client client) {
        try{
            Connection connexion=DatabaseConnection.getInstance();
            PreparedStatement statement=connexion.prepareStatement("INSERT INTO clients(nom,prenom,email,genre) values(?,?,?,?)");
            statement.setString(1,client.getNom());
            statement.setString(2,client.getPrenom());
            statement.setString(3,client.getEmail());
            statement.setString(4,String.valueOf(client.getGenre()));
            statement.executeUpdate();
            System.out.println("Client crée avec succès");
        }catch (SQLException err){
            err.printStackTrace();
        }
    }

    @Override
    public void update(Client client) {
        try{
            Connection connexion=DatabaseConnection.getInstance();
            PreparedStatement statement=connexion.prepareStatement("UPDATE clients SET nom=?,prenom=?,email=?,genre=? WHERE id=?");
            statement.setString(1,client.getNom());
            statement.setString(2,client.getPrenom());
            statement.setString(3,client.getEmail());
            statement.setString(4,String.valueOf(client.getGenre()));
            statement.setInt(5,client.getId());
            statement.executeUpdate();
            System.out.println("Client mis à jour avec succès");
        }catch (SQLException err){
            err.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {
        try{
            Connection connexion=DatabaseConnection.getInstance();
            PreparedStatement statement=connexion.prepareStatement("DELETE FROM clients WHERE id=?");
            statement.setInt(1,id);
            statement.executeUpdate();
            System.out.println("Client supprimé avec succès");
        }catch (SQLException err){
            err.printStackTrace();
        }
    }

//    private Client getRow(ResultSet res){
//        int clientId=res.getInt("id");
//        String nom=res.getString("nom");
//        String prenom=res.getString("prenom");
//        String email=res.getString("email");
//        char genre=res.getString("genre").charAt(0);
//        Date dateInscription=res.getDate("dateInscription");
//        Date dateNaissance=res.getDate("dateNaissance");
//        return new Client(clientId,nom,prenom,email,genre,dateInscription,dateNaissance);
//    }
}
