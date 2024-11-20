public class MantenimientoISP {
    public static void main(String[] args) {
        Reparacion tecnico = new Tecnico();
        tecnico.reparar(); 

        Limpieza personalLimpieza = new PersonalLimpieza();
        personalLimpieza.limpiar(); 
    }
}