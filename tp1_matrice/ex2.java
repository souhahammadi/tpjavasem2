import java.util.Scanner;
public class ex2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nl,nc,i,j;
        int[][] M=new int [30] [30];
        System.out.println("entrez le nombre de lignes");
        nl=sc.nextInt();
while(nl>30){
System.out.println("entrez le nombre de lignes");
nl=sc.nextInt();
}
System.out.println("entrez le nombre de colonnes");
nc=sc.nextInt();

while(nc>30){
System.out.println("entrez le nombre de colonnes");
nc=sc.nextInt();
}
int somme=0;
double produit=1;
int total = nl * nc ;
System.out.println("remplissez la matrice");
for( i=0 ; i<nl ;i++){
    for(j=0;j<nc;j++){
            System.out.println("M["+i+"]["+j+"]=");
            M[i][j]=sc.nextInt();
        somme += M[i] [j];
        produit *=  M[i] [j];
    }
}
double moyenne = (double) somme / total;
System.out.println("somme des élément :" +somme);
System.out.println("produit des élément :" +produit);
System.out.println("moyenne des élément :" +moyenne);
    }}


