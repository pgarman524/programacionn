package dia28_11Teoria;

public class ClasePais {
    public String capital;
    public int habitantes;
    public String tClima;

    public static int nPaisesUE;

    public ClasePais (String  capital, String tClima, int habitantes){
        this.capital = capital;
        this.habitantes = habitantes;
        this.tClima = tClima;

    }

    public void darAltaPais (){
        this.nPaisesUE ++;
    }

    public void nNacimientos (){
        this.habitantes ++;
    }
}
