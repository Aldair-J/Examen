
package CapaNegocio;

/**
 *
 * @author Usuario
 */
public class comprobante {
    private String id ;
    private String tipoPago;
    private String montoPagar;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public String getMontoPagar() {
        return montoPagar;
    }

    public void setMontoPagar(String montoPagar) {
        this.montoPagar = montoPagar;
    }
}
