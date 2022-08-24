import java.util.ArrayList;
import java.util.List;

public class MiColeccion {
    private List <Estudiante> coleccionEstudiante;

    public MiColeccion() {
        this.coleccionEstudiante = new ArrayList<>();
    }
    public void anexarEstudiante(Estudiante unEstudiante) {
        this.coleccionEstudiante.add(unEstudiante);
    }

    public void imprimirLista() {
        System.out.println(coleccionEstudiante);
    }

    public void actualizarDatosEstudiante(int idx, Estudiante unEstudiante) {
        coleccionEstudiante.set(idx,unEstudiante);
    }

    public void borrarEstudiante(int id) {
        coleccionEstudiante.remove(id);
    }

}
