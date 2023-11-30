public class hallarAlturaMax {

    public static void main(String[] args) {
        String[] alumnos = {"Raquel", "Pablo", "Álvaro", "Óscar", "Rafael", "David", "Sebastián", "Jose"};

        String nombreLargo = "";
        String nombreCorto = alumnos[0];

        for (int i = 0; i <= alumnos.length - 1; i++) {
            if (nombreLargo.length() < alumnos[i].length()) {
                nombreLargo = alumnos[i];
            }
            if (nombreCorto.length() > alumnos[i].length()){
                nombreCorto = alumnos[i];
            }
        }

        System.out.println(nombreCorto);
        System.out.println(nombreLargo);
    }
}
