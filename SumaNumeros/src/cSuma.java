public class cSuma {

    private int n1,n2,suma;

    public void setDatos(int n1, int n2){
        this.n1=n1;//encapsulamiento
        this.n2=n2;
    }

    private int suma(){
        suma=n1+n2;
        return suma;
    }

    public int getSuma(){
        return suma();
    }
}
