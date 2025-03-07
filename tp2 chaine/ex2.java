import java.util.Scanner;
public class ex2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String ch,inv;
        System.out.println("entrez une chaine:");
        ch=sc.nextLine();
inv=new StringBuilder(ch).reverse().toString();
System.out.println("chaine inversée:"+inv);
    }
}
