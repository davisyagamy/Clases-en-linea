public class PruebaColeccion {
    private MiColeccion mc = new MiColeccion();

    public PruebaColeccion() {
        this.mc = new MiColeccion();
    }

    public void procesarInformacion() {

        //Anexar Datos a la coleccion
        mc.anexarEstudiante(new Estudiante("147","Mariana","Reyes"));
        mc.anexarEstudiante(new Estudiante("145","Juan","Cordoba"));
        mc.anexarEstudiante(new Estudiante("236","Ivan","Marin"));
        mc.anexarEstudiante(new Estudiante("124","Sandra","Morales"));
        mc.anexarEstudiante(new Estudiante("159","Mercy","Mejia"));


//imprimir datos de la coleccion
        mc.imprimirLista();

        //actualizar datos de la coleccion
        mc.actualizarDatosEstudiante(2, new Estudiante("236","Ivan Antonio","Marin Suarez"));
        mc.imprimirLista();

        //borrar datos de la coleccion
        mc.borrarEstudiante(1);
        mc.imprimirLista();


    }

    public static void main(String[] args) {
        PruebaColeccion app = new PruebaColeccion();
        app.procesarInformacion();
    }

}