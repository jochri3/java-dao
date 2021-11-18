package models;

public class Telephone {
    private int id;
    private int idClient;
    private String numero;

    public Telephone(int id, int idClient, String numero) {
        this.id = id;
        this.idClient = idClient;
        this.numero = numero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
