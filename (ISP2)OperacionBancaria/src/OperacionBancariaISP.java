public class OperacionBancariaISP {
    public static void main(String[] args) {
        Transferencia servicioTransferencia = new ServicioTransferencia();
        servicioTransferencia.transferir(); 

        Retiro servicioRetiro = new ServicioRetiro();
        servicioRetiro.retirar(); 

        PagoFactura servicioPagoFactura = new ServicioPagoFactura();
        servicioPagoFactura.pagarFactura(); 
    }
}