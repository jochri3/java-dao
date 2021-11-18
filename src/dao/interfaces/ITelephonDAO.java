package dao.interfaces;


import models.Telephone;

import java.util.List;

public interface ITelephonDAO {
    List<Telephone> getAll();
    Telephone getById(int id);
    void save(Telephone telephone);
    void update(Telephone telephone);
    void delete(int id);
}
