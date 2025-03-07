 import java.util.Scanner;

public class expl{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String mot1,mot2,ch;
        StringBuffer texte;
        int l1,l2,p;
        do{
        System.out.println("donner un chaine ne depasse pas 50 caractere");
      ch=sc.nextLine();
    }
        while(ch.length()>50);
        do{
        System.out.println("donner mot1 ne depasse pas 10 caractere");
        mot1=sc.nextLine();
        System.out.println("donner mot2 ne depasse pas 10 caractere");
        mot2=sc.nextLine();
      }while (mot1.length()>10 || mot2.length()>10) ;
   texte=new StringBuffer(ch);
   l1=mot1.length();
   l2=mot2.length();
   while (texte.indexOf(mot1)!=-1) {
    p=texte.indexOf(mot1);
    texte=texte.delete(p,p+l1);
    texte=texte.insert(p, mot2);
   }


System.out.println("le nouveau text est :" +texte);
  }


}

    

