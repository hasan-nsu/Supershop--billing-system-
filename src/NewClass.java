import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class NewClass {
    public static void main(String[] args) {
        String s ;
        double a,sum=0;
        productname [] p=new productname[50];
        File f =new File("input.txt");
        
         Scanner sc =new Scanner (System.in);
         try{
             FileWriter Fw=new FileWriter("output.txt");
             for(int i=0;i<10;i++){
            
            System.out.println("enter product");
            
             s=sc.nextLine();
             if("f".endsWith(s)){
                 break;
             }
             else {
              Scanner sca = new Scanner (f);
              
                while(sca.hasNextLine()){
                    String t =sca.nextLine();
                   
                    if(t.endsWith(s)){
                        
                       double pr=sca.nextDouble();
                       
                        System.out.println("enter amount of" +" "+ s);
                        a=sc.nextDouble();
                        
                        sc.nextLine();
                       p[i]=new productname(s,pr,a);
                       sum=sum+p[i].sum();
                        Fw.write(s+"   "+String.valueOf(a)+"*"+String.valueOf(pr)+"  = "+String.valueOf(p[i].sum()));
                      Fw.write("\n");
                       
                       
                    }
         }
                }
             }
             Fw.close();
    }
         catch(Exception ex){
             System.out.println("no product found");
         }
         System.out.println("total amount");
        System.out.println(sum);
        System.out.println("if golden press 1 if silvar press 2 if not press any integer  ");
        int card =sc.nextInt();
        
        if(card==1){
              sum=sum-(5*sum)/100;
              
          }
          if(card==2){
              sum=sum-(3*sum)/100;
          }
           System.out.println(sum);    
        }
}
