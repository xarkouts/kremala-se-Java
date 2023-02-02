
import java.util.*;
public class kremala {
      
    public static void main(String[] args) {
        String [] lexis={"milo","portokali","aktinidio","axladi","mpanana"};
        String  lexi_s;
        Random rand=new Random();
        Scanner imput=new Scanner(System.in);
        int epi=5;
        lexi_s=lexis[rand.nextInt(epi)];
        char[] lexi_c=new char[lexi_s.length()];
        char [] krimeni=new char[lexi_s.length()];
        char grama;
        Boolean yparxi;
        int grames;
       for(int i=0; i<lexi_s.length();i++){
              lexi_c[i]=lexi_s.charAt(i);

       }
       for(int i=0; i<lexi_s.length();i++){
         krimeni[i]='_';
       }
       int prospathies=5; 
       
       while (true) {
         yparxi=false;
         grames=0;
        System.out.println(krimeni);
        for(int i=0; i<krimeni.length; i++){
            if(krimeni[i]=='_'){
                 grames++;
            }
        }
        if(grames==0){
            System.out.println("NIKISES !");
            break;
        }
        System.out.println("dose ena grama "+"exis "+prospathies+" prospathies");
        grama=imput.nextLine().charAt(0);
        for (int i=0; i<lexi_c.length;i++){
            if (grama==lexi_c[i]) {
                krimeni[i]=grama;
                yparxi=true;        
            }
                
            
        }
         if (yparxi==false) {
            --prospathies;
            System.out.println("to grama poy priktologise den yparxi ");
         }
        if (prospathies==0) {
            System.out.println("EXASES !!!!! ");
            System.out.println("I LEXI ITAN "+lexi_s);
            break;
        }
       }     
    
    }
}
