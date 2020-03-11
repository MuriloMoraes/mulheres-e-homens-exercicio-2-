import java.util.Scanner;
public class exercicio3
{
    public static void main(String[] args){
        double medH, medM; 
        int homens, mulheres, turma;
        System.out.println(" Quantos homens há na turma: ");
        homens = new Scanner(System.in).nextInt();
        System.out.println(" Quantas mulheres há na turma: ");
        mulheres = new Scanner(System.in).nextInt();
        turma = homens+mulheres;
        medH = homens*100/turma;
        medM = mulheres *100/turma;
        System.out.println( " Percentual é de " +medH+ " % homens na turma");
        System.out.println( " Percentual é de " +medM+ " %mulheres na turma");
    
    
    
    }
}
