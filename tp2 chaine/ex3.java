import java.util.Scanner;
public class ex3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String ch;
        char l;
        int comp,i;
        System.out.println("entrez une chaine :");
        ch=sc.nextLine();
        System.out.println("entrez le lettre a compter: ");
l=sc.next().charAt(0);
comp=0;
for(i=0;i<ch.length();i++){
if(ch.charAt(i)==l){
    comp++;
}
}
System.out.println(" la lettre " + l + " apparait " + comp + " fois dans la chaine ");
    }
}
