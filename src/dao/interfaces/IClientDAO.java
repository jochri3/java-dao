package dao.interfaces;

import models.Client;

import java.util.List;

public interface IClientDAO {
    List<Client> getAll();
    Client getById(int id);
    void save(Client client);
    void update(Client client);
    void delete(int id);
}
