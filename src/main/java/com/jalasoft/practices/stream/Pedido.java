package com.jalasoft.practices.stream;

import java.util.Date;

/**
 * @author ivoca
 * @version 1.1
 */
public class Pedido {
    private String codPedido;
    private String tipoPedido;
    private String cliente;
    private String fecha;

    public Pedido(String codPedido, String tipoPedido, String cliente, String fecha) {
        this.codPedido = codPedido;
        this.tipoPedido = tipoPedido;
        this.cliente = cliente;
        this.fecha = fecha;
    }

    public String getCodPedido() {
        return codPedido;
    }

    public void setCodPedido(String codPedido) {
        this.codPedido = codPedido;
    }

    public String getTipoPedido() {
        return tipoPedido;
    }

    public void setTipoPedido(String tipoPedido) {
        this.tipoPedido = tipoPedido;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        //return this.name + " - " + this.lastName + " - " + this.getAge();
        return codPedido
                + " - " + tipoPedido
                + " - " + cliente
                + " - " + fecha;
    }
}
