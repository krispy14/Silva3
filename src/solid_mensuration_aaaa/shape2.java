/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solid_mensuration_aaaa;

import javax.swing.JOptionPane;
public class shape2 {
    int length;
    int base;
    int height;
    String unit;
    public shape2 (){}
    public shape2(int l, int b, int h){
        this.length=l;
        this.base=b;
        this.height=h;
    };
    double volume(){
        double V=length*base*height;
        return V;
    }
    void shape2_details(){
        System.out.println("Chosen shape: cuboid");
        System.out.println("Find the: volume");
        String unit1 = JOptionPane.showInputDialog("Enter units used:");
        JOptionPane.showMessageDialog(null, "Entered units is " + unit1);
        
        int A1=Integer.parseInt(JOptionPane.showInputDialog("Enter length value"));
        JOptionPane.showMessageDialog(null, "Entered length value is " + A1+" "+unit1);
        System.out.println("length: "+A1+" "+unit1);
        
        int B1=Integer.parseInt(JOptionPane.showInputDialog("Enter base value"));
        JOptionPane.showMessageDialog(null, "Entered base value is " + B1+" "+unit1);
        System.out.println("base: "+B1+" "+unit1);
        
        int C1=Integer.parseInt(JOptionPane.showInputDialog("Enter height value"));
        JOptionPane.showMessageDialog(null, "Entered height value is " + C1+" "+unit1);
        System.out.println("height: "+C1+" "+unit1);
        
        System.out.println("Answer:");
                shape2 shape1 = new shape2 (A1,B1,C1);
                shape1.unit = "sq." +unit1;
                shape1.volume();
                System.out.print("the volume is ");
                System.out.print(shape1.volume());
                System.out.print(" "+shape1.unit);
                JOptionPane.showMessageDialog(null, "the volume is " 
                        +shape1.volume()+" "+ shape1.unit);
    }
}
