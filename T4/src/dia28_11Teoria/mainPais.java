package dia28_11Teoria;

public class mainPais {


    public static void main(String[] args) {
        ClasePais hispania = new ClasePais("Madrid","Mediterráneo", 38000000);
        ClasePais ukrania = new ClasePais("Kiev", "Cont.Templado", 40000000);

        System.out.println(hispania.capital);
        System.out.println(ukrania.capital);

        System.out.println(hispania.habitantes);
        System.out.println(ukrania.habitantes);

        hispania.darAltaPais();

        System.out.println(hispania.nPaisesUE);

        ukrania.darAltaPais();
        System.out.println(ukrania.nPaisesUE);



    }
}
