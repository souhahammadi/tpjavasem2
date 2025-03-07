import java.util.Scanner;
public class ex7{
    public static void main(String [] args){
        Scanner sc=new Scanner (System.in);
        String ver,rad;
        do{
        System.out.println("entrez un verbe :");
        ver=sc.nextLine();
        }while(!ver.endsWith("er") || ver.equals("aller"));
   System.out.println(" je " +ver.replace("er", "e") );
   System.out.println(" tu " +ver.replace("er", "es") );
   System.out.println(" il/elle " +ver.replace("er", "e") );
   if(ver.equals("manger")){
   System.out.println(" nous " +ver.replace("er", "eons") );
   }else if(ver.equals("commencer")){
    System.out.println(" je " +ver.replace("cer", "çons") );
      
   }
   System.out.println(" vous " +ver.replace("er", "ez") );
   System.out.println(" ils/elles " +ver.replace("er", "ent") );
      
    }
}