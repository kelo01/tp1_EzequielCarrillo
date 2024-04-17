package ar.unju.edu.fi.ejercicio10.model;


public class Pizza {
    private int diametro;
    private double precio;
    private double area;
    private boolean ingredientesEspeciales;
    private final int ADICIONAL_ESPECIALES_20 = 500;
    private final int ADICIONAL_ESPECIALES_30 = 750;
    private final int ADICIONAL_ESPECIALES_40 = 1000;

    public Pizza() {
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    public double getPrecio() {
        return precio;
    }

    public double getArea() {
        return area;
    }

    public boolean isIngredientesEspeciales() {
        return ingredientesEspeciales;
    }

    public void setIngredientesEspeciales(boolean ingredientesEspeciales) {
        this.ingredientesEspeciales = ingredientesEspeciales;
    } 

    public void calcularPrecio() {
        if (diametro == 20) {
            if (ingredientesEspeciales) {
                precio = 4500 + ADICIONAL_ESPECIALES_20;
            } else {
                precio = 4500;
            }
        } else if (diametro == 30) {
            if (ingredientesEspeciales) {
                precio = 4800 + ADICIONAL_ESPECIALES_30;
            } else {
                precio = 4800;
            }
        } else if (diametro == 40) {
            if (ingredientesEspeciales) {
                precio = 5500 + ADICIONAL_ESPECIALES_40;
            } else {
                precio = 5500;
            }
        }
    }

    public void calcularArea() {
        area = Math.PI * Math.pow(diametro / 2.0, 2);
    }
}