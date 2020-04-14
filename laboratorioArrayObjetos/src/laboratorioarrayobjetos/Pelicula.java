/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorioarrayobjetos;

/**
 *
 * @author kevin
 */
public class Pelicula {
    private String nombre;
    private String director;
    private int anio;
    private String resenia;
    private int cantVendidos;
    
    public Pelicula() {
    }

    public Pelicula(String nombre, String director, int anio, String resenia) {
        this.nombre = nombre;
        this.director = director;
        this.anio = anio;
        this.resenia = resenia;
        this.cantVendidos = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getResenia() {
        return resenia;
    }

    public void setResenia(String resenia) {
        this.resenia = resenia;
    }

    public int getCantVendidos() {
        return cantVendidos;
    }

    public void setCantVendidos(int cantVendidos) {
        this.cantVendidos = cantVendidos;
    }
    
    
}
