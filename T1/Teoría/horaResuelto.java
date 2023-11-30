import java.util.Scanner;

public class horaResuelto {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        int hh, mm, ss;
        System.out.println("Introduzca la hora");
        hh = scan.nextInt();
        System.out.println("introduzca los min");
        mm  = scan.nextInt();
        System.out.println("introduzca los segundos");
        ss = scan.nextInt();


        if (ss == 59){
            ss = 0;
            mm = mm +1;

            if (mm == 60){
                mm = 0;
                hh = hh + 1;

                if (hh  == 24){
                    hh = 0;
                }
            }

        }

        System.out.println("son las  "+hh+":"+mm+":"+ss);
        System.out.format("Son las %02d:%02d:%02d", hh, mm, ss);
    }

}
