public class Camion implements Conducible, Cargable {
    @Override
    public void conducir() {
        System.out.println("Conduciendo el camión.");
    }

    @Override
    public void cargarMercancias() {
        System.out.println("Cargando mercancías en el camión.");
    }
}