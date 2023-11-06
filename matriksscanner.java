import java.util.Scanner;

public class matriksscanner {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        int baris,kolom,nilai = 0;
        int matrixA[][];

        System.out.println("Masukkan Ordo Matrix");
        System.out.print("Jumlah baris = ");
        baris = input.nextInt();
        System.out.print("Masukkan kolom = ");
        kolom = input.nextInt();

        int matrix[][] = new int[baris][kolom];

        for (int index = 0; index < matrix.length; index++) {
            for (int i = 0; i < matrix[i].length; i++) {
                System.out.print("Masukkan nilai baris "+index+"kolom"+i+":");
                matrix[index][i] = scan.nextInt();
            }
            System.out.println();
        }
        System.out.println("Matriks:");
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j]+" ");
                }
                System.out.println();
            }
        
        }
    }


