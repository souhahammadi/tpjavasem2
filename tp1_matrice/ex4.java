import java.util.Scanner;
public class ex4 {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n,i,j,s;
        System.out.println("donner la taille d'un matrice carrée (n>0)");
n=sc.nextInt();
if(n<=0){
    System.out.println("la taille de la matrice doit etre un entier positif");
    return;
}
int [][] m=new int[n][n];
System.out.println("entrez les element d'un matrice");
for(i=0;i<n;i++){
for(j=0;i<n;j++){
    m[i][j]=sc.nextInt();
}
}
s=0;
for(i=0;i<n;i++){
    s+=m[i][i];
}
System.out.println("la somme des élément de diagonale principale est :"+s);
    }
}