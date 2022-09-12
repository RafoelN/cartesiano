/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cartesiano;

/**
 *
 * @author Rafael
 */
public class Ponto {
    private double x;
    private double y;

    public Ponto() {
        x = 0;
        y = 0;
    }
    
    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public Ponto(Ponto p) {    
        this(p.x, p.y); 
    }
    
    public void setXY(double newX, double newY){
        x = newX;
        y = newY;
    }
    
     public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    public void assign(Ponto pt){
        x = pt.x;
        y = pt.y;
    }
    
    public double deltaX(double vX){
        return vX - x;
    }
    
    public double deltaY(double vY){
        return vY - y;
    }
    
    public double distance(double posX, double posY){
        return Math.sqrt((deltaX(posX) * deltaX(posX)) + (deltaY(posY) * deltaY(posY)));  
    }
    
    public double distance(Ponto pt){
        return distance(pt.getX(), pt.getY());
    }
    
    public double distance(){
        return distance(0, 0);
    }
    
    public void desloc(double dX, double dY){
        x += dX;
        y += dY;
    }
    
    public void escale(double factor){
        x *= factor;
        y *= factor;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
 
}
