import java.util.Scanner;
public class ex3 {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int nl,nc,i,j;
    do{
    System.out.println("entrez le nombre de ligne");
    nl=sc.nextInt();}
    while (nl<=0 || nl>20) ;
        do{
    System.out.println("entrez le nombre de colonne");
    nc=sc.nextInt();}
    while (nc<=0 || nc>30); 
    int [] [] M= new int [nl][nc];
    int [] T= new int [nl];
    System.out.println("remplissez la matrice ");
    for(i=0;i<nl;i++){
        int somme=0;
        for( j=0;j<nc;j++){
            System.out.println("M["+i+"]["+j+"]=");
            M[i][j]=sc.nextInt();
            somme += M[i][j];
        }
        T[i]=somme;
    }
    int min = T[0] , max = T[0];
    for( i=1 ; i<nl ; i++){
        if(T[i]<min) 
        min=T[i];
        if(T[i]>max)
        max=T[i];
    }
    System.out.println("somme de ligne");
    for( i=0 ; i<nl ; i++){
        System.out.println("ligne" +(i+1)+ ":" +T[i]);
    }
    System.out.println("somme minimale"+min);
    System.out.println("somme maximale"+max);
}
    
}