public class VehiculoISP {
    public static void main(String[] args) {
        Conducible miCamion = new Camion();
        miCamion.conducir();
        
        Cargable miCamionCargable = new Camion();
        miCamionCargable.cargarMercancias();
        
        Conducible miAuto = new Auto();
        miAuto.conducir();
    }
}