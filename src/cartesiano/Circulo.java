/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cartesiano;

/**
 *
 * @author Rafael
 */
public class Circulo extends Ponto {
    private double raio;
    
    public Circulo(){
        raio = 1;
    }
    
    public Circulo(double x, double y, double raio){
        super(x, y);
        this.raio = raio;
    }

    public Circulo(Circulo c){
        super(c);
        raio = c.raio;
    }
    
    public void assign(Circulo cl){
        super.assign(cl);
        raio = cl.raio;
    }
    public void escale(double factor){
        super.escale(factor);
        raio *= factor;
    }
    
    public boolean isValid(){
       return (raio > 0);
    }
    
    public double perimeter(){
        return 2 * Math.PI * raio;
    }
    
    public double area(){
        return Math.PI * Math.pow(raio, 2);
    }
    
    @Override
    public String toString() {
        
        return "Circulo" + super.toString() + ":" + raio;
    }
    
}
