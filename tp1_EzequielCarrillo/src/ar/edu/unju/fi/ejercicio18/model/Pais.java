package ar.edu.unju.fi.ejercicio18.model;

import java.util.ArrayList;

public class Pais {
    private String codigo;
    private String nombre;

    public Pais(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public static Pais buscarPaisPorCodigo(ArrayList<Pais> paises, String codigo) {
        for (Pais pais : paises) {
            if (pais.getCodigo().equals(codigo)) {
                return pais;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}