
package com.mycompany.figurasgeometricaspoo;

import java.util.Scanner;

public class Main 
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) 
    {
        System.out.println("Ingrese el nombre de la figura");
        String nombre = sc.nextLine();
        
        System.out.println("Ingrese el color de la figura");
        String color = sc.nextLine();
        
        System.out.println("Ingrese el tipo de figura");
        System.out.println("1.Circulo");
        System.out.println("2.Rectangulo");
        System.out.println("3.Triangulo");
        
        int tipo = sc.nextInt();
        
         
         
         
         
        switch (tipo)
        {
            case 1:

                System.out.println("Ingrese el radio del circulo");
                double radio= sc.nextDouble();
                
                Circulo figura = new Circulo(radio);
                figura.obtenerArea();
                figura.obtenerPerimetro();
                
                System.out.println("El nombre de la figura es: " + nombre);
                System.out.println("El color de la figura es: " + color);
                System.out.println("El area del circuolo es "+figura.obtenerArea());
                System.out.println("El perimetro del circulo es "+ figura.obtenerPerimetro());
                break;
            case 2:
                
                
                System.out.println("Ingrese el valor del lado 1 del rectangulo");
                double lado1 = sc.nextDouble();
                System.out.println("Ingrese el valor del lado 2 del rectangulo");
                double lado2 = sc.nextDouble();
                
                Rectangulo rectangulo = new Rectangulo(lado1, lado2);
                System.out.println("El nombre de la figura es: " + nombre);
                System.out.println("El color de la figura es: " + color);
                System.out.println("El area del rectangulo es " + rectangulo.obtenerArea());
                System.out.println("El perimetro del rectangulo es " + rectangulo.obtenerPerimetro());
                
                break;       
                
                
            case 3:
                System.out.println("Ingrese el valor de la base del trinagulo ");
                double base = sc.nextDouble();
                System.out.println("Ingrese el valor de la altura del triangulo ");
                double altura = sc.nextDouble();
                
                Triangulo triangulo = new Triangulo(base, altura);
                System.out.println("El nombre de la figura es: " + nombre);
                System.out.println("El color de la figura es: " + color);
                System.out.println("El area del triangulo es " + triangulo.obtenerArea());
                System.out.println("El perimetro del triangulo es " + triangulo.obtenerPerimetro());
                break; 
              
       
        }
        
    }
    
}
