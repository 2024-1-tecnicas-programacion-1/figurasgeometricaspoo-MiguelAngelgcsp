package com.mycompany.figurasgeometricaspoo;


public class Triangulo 

{
    
    private double base;
    private double altura;
    
    public Triangulo(double base,double altura )
    {
        this.base=base;
        this.altura=altura;
        
    }    

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    
    public double obtenerArea()
    {
        double area = (base * altura) / 2;
        return area;
        
    }
    
    public double obtenerPerimetro()
    {
        double hipotenusa = Math.sqrt(base * base + altura *altura );
        double Perimetro = base + altura + hipotenusa;
        return Perimetro;
    }
    
}
