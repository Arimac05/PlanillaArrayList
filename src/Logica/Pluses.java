/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author arima
 */
public class Pluses {
    private int idPlus;
    private String titulo;
    private int porcIncremento;

    public Pluses(int idPlus, String titulo, int porcIncremento) {
        this.idPlus = idPlus;
        this.titulo = titulo;
        this.porcIncremento = porcIncremento;
    }
    
     public Pluses() {
        this.idPlus = 0;
        this.titulo = "";
        this.porcIncremento =0 ;
    }

    public int getIdPlus() {
        return idPlus;
    }

    public void setIdPlus(int idPlus) {
        this.idPlus = idPlus;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPorcIncremento() {
        return porcIncremento;
    }

    public void setPorcIncremento(int porcIncremento) {
        this.porcIncremento = porcIncremento;
    }
    
}
