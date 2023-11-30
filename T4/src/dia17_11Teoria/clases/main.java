package dia17_11Teoria.clases;

public class main {

    public static void main(String[] args) {

        //Pokemon pikachu = new Pokemon("Pikachu", "Electrico", 123,15);

        Pokemon squirtle = new Pokemon("Squirtle", "agua", 100,50);
        Pokemon ponyta = new Pokemon("Ponyta", "fuego", 70,60);

        System.out.println("La vida de squirtle es: "+squirtle.vida);
        squirtle.recibirAtaque(ponyta);

        System.out.println("La vida de squirtle es: "+squirtle.vida);


        System.out.println("La vida de ponyta es: "+ponyta.vida);
        ponyta.recibirAtaque(squirtle);

        System.out.println("La vida de ponyta es: "+ponyta.vida);


    }
}
