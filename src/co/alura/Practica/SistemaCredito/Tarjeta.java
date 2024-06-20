package co.alura.Practica.SistemaCredito;

public class Tarjeta
{
    private String nameUser;
    private String numberAccount;
    private double saldo;

    public Tarjeta(String nameUser,double saldo , String numberAccount)
    {
        this.nameUser = nameUser;
        this.saldo = saldo;
        this.numberAccount = numberAccount;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getNumberAccount() {
        return numberAccount;
    }

    public void setNumberAccount(String numberAccount) {
        this.numberAccount = numberAccount;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
