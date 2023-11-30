public class ejercicioTableroAjedrez {
    public static void main(String[] args) {

        /**
         * 1ºCuántas filasxcolumnas tiene  un tablero de ajedrez?
         * 2ºDeclarar un array bidimensional de 8x8 de char
         * 3ºllenar el tablero con las posiciones de cada ficha.
         * 4ºRecorre el tablero y que salga bien.
         */

        char [][] ajedrez = new char [8][8];

        ajedrez[0][0] = 'T';
        ajedrez[0][1] = 'C';
        ajedrez [0][2] = 'A';
        ajedrez [0][3] = 'Q';
        ajedrez [0][4] = 'K';
        ajedrez [0][5] = 'A';
        ajedrez [0][6] = 'C';
        ajedrez [0][7] = 'T';

        ajedrez [1][0] = 'P';
        ajedrez [1][1] = 'P';
        ajedrez [1][2] = 'P';
        ajedrez [1][3] = 'P';
        ajedrez [1][4] = 'P';
        ajedrez [1][5] = 'P';
        ajedrez [1][6] = 'P';
        ajedrez [1][7] = 'P';

        ajedrez [6][0] = 'P';
        ajedrez [6][1] = 'P';
        ajedrez [6][2] = 'P';
        ajedrez [6][3] = 'P';
        ajedrez [6][4] = 'P';
        ajedrez [6][5] = 'P';
        ajedrez [6][6] = 'P';
        ajedrez [6][7] = 'P';

        ajedrez [7][0] = 'T';
        ajedrez [7][1] = 'C';
        ajedrez [7][2] = 'A';
        ajedrez [7][3] = 'Q';
        ajedrez [7][4] = 'K';
        ajedrez [7][5] = 'A';
        ajedrez [7][6] = 'C';
        ajedrez [7][7] = 'T';

        for (int i = 0; i<= ajedrez.length-1;i++){

            //ahora, dentro de cada fila, recorremos las columnas.
            for (int j=0; j<=ajedrez[i].length-1; j++){


                //Mostramos el  elemento de esa posición.
                //De la posición [i] [j]
                System.out.println(ajedrez[i][j]);
            }
    }}
}
