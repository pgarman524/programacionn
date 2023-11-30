import java.lang.module.FindException;
import java.util.Scanner;

public class hundirFlota07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[][] arrHundir = new char[10][10];

        arrHundir[0][0] = 'A';
        arrHundir[1][1] = 'A';
        arrHundir[2][2] = 'A';
        arrHundir[3][3] = 'A';
        arrHundir[4][4] = 'A';
        arrHundir[5][5] = 'A';
        arrHundir[6][6] = 'A';
        arrHundir[7][7] = 'A';
        arrHundir[8][8] = 'A';
        arrHundir[9][9] = 'A';

        arrHundir[0][1] = 'A';
        arrHundir[1][0] = 'A';
        arrHundir[1][2] = 'A';
        arrHundir[1][3] = 'A';
        arrHundir[1][4] = 'A';
        arrHundir[1][5] = 'A';
        arrHundir[1][6] = 'A';
        arrHundir[1][7] = 'A';
        arrHundir[1][8] = 'A';
        arrHundir[1][9] = 'A';


        //Para movernos por el array bidimensional usamos esta fórmula
        for (int i = 0; i <= arrHundir.length - 1; i++) {

            for (int j = 0; j <= arrHundir[i].length - 1; j++) {

                //Si queremos rellenar todas las partes de los arrays con el mismo char pero no queremos hacerlo manualmente usamos esta fórmula:

                arrHundir[i][j] = 'A';

                System.out.print(arrHundir[i][j]);


                //¿Cómo hago un scaner scan de un array?
                //¿Cómo modifico el array para transformarlo en  otro char?
                //
            }

            int posX = 0;
            int posY = 0;

            int nLanchasColocadas = 0;

            do {
                try {
                    System.out.println("Dime fila");
                    posX = scan.nextInt();
                    System.out.println("Dime columna");
                    posY = scan.nextInt();

                    if (arrHundir[posX][posY] == 'A') {
                        //Si  no es A entonces se sustituye por una L
                        arrHundir[posX][posY] = 'L';
                        nLanchasColocadas++;
                    } else {
                        System.out.println("Esa posición ya está ocupada.");
                    }

                }catch(IndexOutOfBoundsException e) {
                    System.out.println("Introduce un valor válido.");
                }
            } while (nLanchasColocadas < 4);


        }

    }
}

