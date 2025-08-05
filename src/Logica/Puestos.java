
package Logica;

/**
 *
 * @author arima
 */
public class Puestos {
    
    private int idpuestos;
    private String  nombrePuesto;
    private  double salario;

    public Puestos(int idpuestos, String nombrePuesto, double salario) {
        this.idpuestos = idpuestos;
        this.nombrePuesto = nombrePuesto;
        this.salario = salario;
    }
    
    
    public Puestos() {
        this.idpuestos = 0;
        this.nombrePuesto = "";
        this.salario = 0;
    }

    public int getIdpuestos() {
        return idpuestos;
    }

    public void setIdpuestos(int idpuestos) {
        this.idpuestos = idpuestos;
    }

    public String getNombrePuesto() {
        return nombrePuesto;
    }

    public void setNombrePuesto(String nombrePuesto) {
        this.nombrePuesto = nombrePuesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
     
    
    
}
