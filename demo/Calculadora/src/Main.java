public class Main {
    private OperacionAritmetica operacion;

    public Main() {
        this.operacion = new OperacionAritmetica();
    }

    public void imprimirResultados() {
        double x = 15;
        double y = 3;
        System.out.println("Suma "+operacion.sumar(x,y));
        System.out.println("Resta "+operacion.restar(x,y));
        System.out.println("Multiplicacion "+operacion.multiplicar(x,y));
        System.out.println("Division "+operacion.dividir(x,y));
    }

    public static void main(String[] args) {
        Main app = new Main();
        app.imprimirResultados();

    }

}