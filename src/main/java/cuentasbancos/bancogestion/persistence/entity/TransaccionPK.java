package cuentasbancos.bancogestion.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class TransaccionPK  implements Serializable {
    @Column(name = "id_cliente")
    private Integer idCliente;
    @Column(name = "id_cuenta")
    private Integer idCuenta;

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Integer getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(Integer idCuenta) {
        this.idCuenta = idCuenta;
    }
}
