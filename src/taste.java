import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class taste {
    //private JFrame frame;
    
    public static void main(String[] args) throws IOException {
        String s,st ;
        double a,sum=0;
        productname [] p=new productname[50];
          
        File f =new File("input.txt");
        File fw =new File("output.txt");
         FileWriter Fw=new FileWriter(fw);
         Scanner sc =new Scanner (System.in);
         System.out.println("enter pasword");
         
         
         for(int z=0;z<3;z++){
             String  pas = sc.nextLine();
        if("1234".endsWith(pas)){
            System.out.println("WELCOME");
           break; 
            
        }
        if(z>=2){
            System.exit(0);
            System.out.println("!!SORRY!!");
        }
        else{
            System.out.println("wrong password");
        }
                 
    }
         
         try{
             
             for(int i=0;i<10;i++){
            
            System.out.println("enter product");
            
             st=sc.nextLine();
             s=st.toLowerCase();
             
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
             Fw.write("................................................................");
             Fw.write("\n");
           
    }
         catch(Exception ex){
             System.out.println("w");
         }
         System.out.println("total amount");
        System.out.println(sum);
        System.out.println("if golden press 1 if silvar press 2 if not press any integer  ");
        int card =sc.nextInt();
        
        if(card==1){
              sum=sum-(5*sum)/100;
              
              
          }
          if(card==2){
              
              double sum1=sum-(3*sum)/100;
              
              
              
              
          }
          
          System.out.println("discounted value");
           System.out.println(sum);    
           double sum2=sum;
           System.out.println("price included vat");
           double sum1=sum+(5*sum)/100;
           System.out.println(sum1);
           System.out.println("Enter customar's given amount");
           int give =sc.nextInt();
           double back =give -sum1;
            System.out.println("Return amount amount " +back );
            int r;
            try{ Fw.write("total amount            =  " + String.valueOf(sum2));
            Fw.write("\n");
                Fw.write("total amount include vat =  " + String.valueOf(sum1)+"(5%)");
                Fw.write("\n");
                Fw.write("given amount             =  " + String.valueOf(give));
                Fw.write("\n");
                Fw.write("................................................................");
                Fw.write("\n");
                Fw.write("Return amount            =  " + String.valueOf(back));
                Fw.write("\n");
                Fw.write("THANK YOU");
                Fw.close();
            }
            catch(Exception ep){
                
            }
    if(back!=0){


if (back>=500){
        r=(int) (back/500);
        back=back%500;
        System.out.println("500 taka =" + r);
}
 if  (back>=100){
       r=(int) (back/100);
        back=(back%100);
        System.out.println("100 taka =" + r);

    } if (back>=50){
       r=(int) (back/50);
        back=(back%50);
        System.out.println("50 taka =" + r);


    }
    if (back>=20){
       r=(int) (back/20);
        back=(back%20);
        System.out.println("20 taka =" + r);


    }
    if (back>=10){
       r=(int) (back/10);
        back=(back%10);
        System.out.println("10 taka =" + r);

    }
    if (back>=5){
       r=(int) (back/5);
        back=(back%5);
        System.out.println("5 taka =" + r);
        }
    if (back>=2){
       r=(int) (back/2);
        back=(back%2);
        System.out.println("2 taka =" + r);

    }
  if (back>=1){
       r=(int) (back/1);
        back=(back%1);
        System.out.println("chocklet =" + r);
    }
          
        }
         }
        }
