/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cartesiano;

/**
 *
 * @author Rafael
 */
public class Cartesiano {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo c1 = new Circulo();
        Circulo c2 = new Circulo(3, 2, 5); 
        Circulo c3 = new Circulo(c2);

        System.out.println("c1 " + c1);
        System.out.println("c2 " + c2);
        System.out.println("c3 " + c3);
        System.out.println(c2.isValid());
        System.out.println(c2.perimeter());
        System.out.println(c2.area());
        
        c1.assign(c2);
        System.out.println(c1);
    }
    
}
