/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cartesiano;

/**
 *
 * @author Rafael
 */
public class Segmento {   
    private Ponto pontoUm;
    private Ponto pontoDois;
    
    public Segmento (){
        pontoUm = new Ponto();
        pontoDois = new Ponto(0, 1);
    }
    
    public Segmento (Ponto pontoUm, Ponto pontoDois){
         this.pontoUm = new Ponto (pontoUm);
         this.pontoDois = new Ponto (pontoDois);
    }
    
    public Segmento (Segmento segmento){
         this(segmento.pontoUm, segmento.pontoDois);
    }
    
    public void assign (Segmento sg){
        pontoUm.assign(sg.pontoUm);
        pontoDois.assign(sg.pontoDois);
    }
    
    public void desloc(double dX, double dY){
        pontoUm.desloc(dX, dY);
        pontoDois.desloc(dX, dY);
    }
    
    public void escale(double factor){
        pontoUm.escale(factor);
        pontoDois.escale(factor);
    }
    
    public double lenght(){
        return pontoUm.distance(pontoDois);
    }
    
    public boolean isValid(){
        if(pontoUm == null || pontoDois == null) return false;
        else if(pontoUm.equals(pontoDois)) return false;   
        else if(pontoUm.getX() == pontoDois.getX() || pontoUm.getY() == pontoDois.getY()) return false;
        return true;
    }
    
    public Ponto midPoint(){
       Ponto pt = new Ponto((pontoUm.getX() + pontoDois.getX()) / 2, (pontoUm.getY() + pontoDois.getY()) / 2 );
       return pt;
    }
    
    @Override
    public String toString() {
        return "[" + pontoUm + ", " + pontoDois + "]";
    }
    
}
