import java.util.Scanner;
public class ex2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nl,nc,i,j,somme;
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
System.out.println("remplissez la matrice");
for( i=0 ; i<nl ;i++){
    for(j=0;j<nc;j++){
            System.out.println("M["+i+"]["+j+"]=");
            M[i][j]=sc.nextInt();
        
    }
}
somme=0;
double produits=1;
for( i=0 ; i<nl ;i++){
    for(j=0;j<nc;j++){
        somme+=M[i][j];
        produits*=M[i][j];
}}
}}
