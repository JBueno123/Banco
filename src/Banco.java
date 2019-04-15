import java.util.*;
public class Banco {
    private int Numero;
    private int Clave;
    private String Dueño;
    private double Saldo;

    public Banco(int Numero, int Clave, String Dueño, double Saldo) {
        this.Numero = Numero;
        this.Clave = Clave;
        this.Dueño = Dueño;
        this.Saldo = Saldo;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public int getClave() {
        return Clave;
    }

    public void setClave(int Clave) {
        this.Clave = Clave;
    }

    public String getDueño() {
        return Dueño;
    }

    public void setDueño(String Dueño) {
        this.Dueño = Dueño;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }
    public boolean consignar (int valor){
    if(valor > 0) {
    this.Saldo+= valor;
    return true;}
    return false;
    }
}
