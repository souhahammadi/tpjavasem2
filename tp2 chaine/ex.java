import java.util.Scanner;

public class ex {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String texte,mot1,mot2,x;
        int l,p;
        System.out.println("donner un chaine de caracter");
        texte=sc.nextLine();
        System.out.println("donner mot1");
        mot1=sc.nextLine();
        System.out.println("donner mot2");
mot2=sc.nextLine();
if(texte.indexOf(mot1)==-1){
    System.out.println(mot1+" n'existe pas dans le texte");
}else{
  l=mot1.length();
 
    p=texte.indexOf(mot1);
 x=texte.replace(mot1, mot2);

System.out.println("le nouveau text est :" +x);
  }


}
    }

