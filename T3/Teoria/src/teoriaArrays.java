public class teoriaArrays {
    public static void main(String[] args) {

        //1º Cómo declarar un array
        // tipoDeDato [] <- identificador de array

        int[] arr;

        //  2º Inicializar
        // identificador = new tipoDeDato[longitudDelArray]
        arr= new int[5];    //No siempre hay que dar una longitud

        // 3ª Asignar valores
        // Identificador[indice] = valor;
        arr[0] = 100;
        arr[1] = 2;
        arr[2] = 7;
        arr[3] = 4;
        arr[4] = 0;

        System.out.println("En la posición 0 está el valor "+arr[0]);



        //System.out.println("En la posición 0 está el valor "+arr[5]); <--- Con esto nos daría error ArrayIndexOutOfBoundsException


        // ********************************************************* //

        //1º Declarar e inicializar a la vez
        //tipoDeDato[] identificador = { valores separados por coma};
        char[] cArr = {'d','%','5','t','x'};

        System.out.println("En la poisición 4 está el valor "+cArr[4]);


        System.out.println("El elemento "+ cArr[cArr.length - 1] +" está en la posición "+ (cArr.length - 1));
        //*********************************************************** //

        // Cómo acceder a un elemento
        // identificador[index]

        //Para saber la longitud de un array
        // identificador.length

        System.out.println("El tamaño del array cArr es: "+cArr.length+ " y el primer elemento del array es "+cArr[0]);

    }


}
