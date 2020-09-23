
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class main {
    public static void main(String[] args) {
        String s = null;
        double a,sum=0;
        productname [] p=new productname[50];
        File f =new File("input.txt");
        
         Scanner sc =new Scanner (System.in);
        
        
           
             
        try{
            FileWriter Fw=new FileWriter("output.txt");
        for(int i=0;i<10;i++){
            
            System.out.println("enter product");
            s=sc.nextLine();
            sc.nextLine();
             
            Scanner sca = new Scanner (f);
          
                while(sca.hasNextLine()){
                    String t =sca.nextLine();
                   
                    if(t.endsWith(s)){
                        
                       double pr=sca.nextDouble();
                       
                        System.out.println("enter amount of" +" "+ s);
                        a=sc.nextDouble();
                       p[i]=new productname(s,pr,a); 
                      Fw.write(s+"   "+String.valueOf(a)+"*"+String.valueOf(pr)+"  = "+String.valueOf(p[i].sum()));
                      Fw.write("\n");
                       sum=sum+p[i].sum();
                        System.out.println(sum);
                        
                        }
                    
                    }
                    
                  
            
               
               }
        Fw.close();
        }
            
            
            catch (Exception ex){
                System.out.println(ex.getMessage());
            }
         
        
       
       
          
         
    }
}    
                
                
               
    
