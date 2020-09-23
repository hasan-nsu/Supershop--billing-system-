
import java.io.File;
import java.io.FileWriter;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class productname extends product {
     String s;

    public productname(String s, double price, double ammount) {
        super(price, ammount);
        this.s = s;
    }

 

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public double sum(){
        double sum=0;
        return  sum+(getAmmount()*getPrice());
    }
    
    public double vat(double vat11){
        
        return  vat11;
    }
}
