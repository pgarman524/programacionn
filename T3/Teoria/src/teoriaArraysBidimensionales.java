public class teoriaArraysBidimensionales {
    //Recoge datos en filas ycolumnas. Fila i, columna j (esto es el convenio)

        //int [][] matriz = new int [i][j]
        public static void main(String[] args) {
            //declara un array bidimensional
           int[][] matriz = new int[5][2];
            matriz[0][0] = 1;
            matriz[0][1] = 7;
            matriz[1][0] = 2;
            matriz[1][1] = 3;
            matriz[2][0] = 8;
            matriz[2][1] = 10;
            matriz[3][0] = 77;
            matriz[3][1] = 5;
            matriz[4][0] = 2;
            matriz[4][1] = 1;

        //Vamos a recorrer la matriz
            //Primero, recorremos las filas
            for (int i = 0; i<= matriz.length-1;i++){

                for (int j=0; j<=matriz[i].length-1; j++){

                    System.out.println(matriz[i][j]);
                }
                System.out.println();
            }



                           }
        }


