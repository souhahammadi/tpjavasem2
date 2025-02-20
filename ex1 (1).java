
import java.util.Scanner;
public class tp1{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int nl,nc,i,j,x;
Boolean valid=false;
        int[][] M=new int [50] [50];
            System.out.println("entrez le nombre de lignes");
            nl=sc.nextInt();
while(nl>50){
    System.out.println("entrez le nombre de lignes");
    nl=sc.nextInt();
}
    System.out.println("entrez le nombre de colonnes");
    nc=sc.nextInt();

while(nc>50){
    System.out.println("entrez le nombre de colonnes");
    nc=sc.nextInt();
}
System.out.println("remplir le matrice");
for( i=0 ; i<nl ;i++){
    for(j=0;j<nc;j++){
        do{
            System.out.println("M["+i+"]["+j+"]=");
            M[i][j]=sc.nextInt();
        }
        while(M[i][j] %2 != 0 );
    }
}
    
do{
    System.out.println("donner x");
 x=sc.nextInt();
}
while(x %2 != 0 );
i=0;
j=0;
while (!valid && i<nl && j<nc) {
    if(M[i][j]==x){
        valid=true;
    }
    else if(i<nl && j==(nc-1)){
        j=0;
        i++;
    }
    else{
        j++;
    }
}
if(valid){
    System.out.println("existe");
}
else{
    System.out.println("n'existe pas");
}
    }
}