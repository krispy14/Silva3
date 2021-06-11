/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solid_mensuration_aaaa;

import javax.swing.JOptionPane;


public class shape1 {
    int side_length;
    String unit;
    public shape1 (){}
    public shape1(int a){
        this.side_length=a;
    };
    double volume(){
        double V=side_length*side_length*side_length;
        return V;
    }
    void shape1_details(){
        System.out.println("Chosen shape: cube");
        System.out.println("Find the: volume");
        String unit1 = JOptionPane.showInputDialog("Enter units used:");
        JOptionPane.showMessageDialog(null, "Entered units is " + unit1);
        
        int A2=Integer.parseInt(JOptionPane.showInputDialog("Enter side length value"));
        JOptionPane.showMessageDialog(null, "Entered side length value is " + A2+" "+unit1);
        System.out.println("side length: "+A2+" "+unit1);
        
        System.out.println("Answer:");
                shape1 shape1 = new shape1 (A2);
                shape1.unit = "sq." +unit1;
                shape1.volume();
                System.out.print("the volume is ");
                System.out.print(shape1.volume());
                System.out.print(" "+shape1.unit);
                JOptionPane.showMessageDialog(null, "the volume is " 
                        +shape1.volume()+" "+ shape1.unit);
    }
}

