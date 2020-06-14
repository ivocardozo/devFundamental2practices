package com.jalasoft.practices.stream;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ivoca
 * @version 1.1
 */
public class PracticeImplementation {
    private List<Pedido> pedidos;
    private List<Detalle> detalles;
    public void init() {
        loadCollections();
        System.out.println("......................");
        firstExercise();
        System.out.println("......................");
        secondExercise();
        System.out.println("......................");
        thirdExercise();
        System.out.println("......................");
        fourthExercise();
        System.out.println("......................");
        fifthExercise();
    }

    private void loadCollections() {
        Detalle detalle1 = new Detalle("code1", "cocina", 2, 1000, 10, 10, "ped1");
        Detalle detalle2 = new Detalle("code2", "lavadora", 1, 2500, 0, 0, "ped1");
        Detalle detalle3 = new Detalle("code3", "plancha", 5, 300, 50, 50, "ped1");
        Detalle detalle4 = new Detalle("code4", "mesa", 2, 700, 30, 30, "ped2");
        Detalle detalle5 = new Detalle("code5", "muebles", 1, 3500, 0, 0, "ped2");
        Detalle detalle6 = new Detalle("code6", "comoda", 3, 800, 100, 100, "ped2");
        Detalle detalle7 = new Detalle("code7", "camisa", 10, 100, 100, 100, "ped3");
        Detalle detalle8 = new Detalle("code8", "polera", 20, 80, 0, 0, "ped3");
        Detalle detalle9 = new Detalle("code9", "zapatos", 8, 400, 200, 200, "ped3");

        detalles = new ArrayList<>();
        detalles.add(detalle1);
        detalles.add(detalle2);
        detalles.add(detalle3);
        detalles.add(detalle4);
        detalles.add(detalle5);
        detalles.add(detalle6);
        detalles.add(detalle7);
        detalles.add(detalle8);
        detalles.add(detalle9);

        Pedido pedido1 = new Pedido("ped1", "normal", "Juan Perez", "2020-05-05");
        Pedido pedido2 = new Pedido("ped2", "programado", "Maria Guaman", "2020-05-03");
        Pedido pedido3 = new Pedido("ped1", "normal", "Juan Perez", "2020-05-10");

        pedidos = new ArrayList<>();
        pedidos.add(pedido1);
        pedidos.add(pedido2);
        pedidos.add(pedido3);
    }

    //Select cliente from Pedido
    private void firstExercise() {
        pedidos.stream()
                .map(pedido -> pedido.getCliente())
                .forEach(value -> System.out.println(value));
    }

    //Select cliente from Pedido where tipoPedido = "normal"
    private void secondExercise() {
        pedidos.stream()
                .filter(pedido -> pedido.getTipoPedido() == "normal")
                .forEach(value -> System.out.println(value.toString()));
    }

    //Select codPedido from Pedido where fecha = "2020-05-05"
    private void thirdExercise() {
        pedidos.stream()
                .filter(pedido -> pedido.getFecha() == "2020-05-05")
                .map(pedido -> pedido.getCodPedido())
                .forEach(value -> System.out.println(value));
    }

    //Select producto from Detalle, pedido where Pedido.codPedido = detalle.codPedido and
    //Pedido.codPedido = "ped1"
    private void fourthExercise() {
        detalles.stream()
                .filter(detalle -> pedidos.stream()
                        .anyMatch(pedido -> pedido.getCodPedido() == detalle.getCodPedido() &&
                                pedido.getCodPedido() == "ped1"
                        ))
                .map(detalle -> detalle.getProducto())
                .forEach(value -> System.out.println(value));
    }

    //Select Detalle.producto from Detalle, Pedido where
    //Pedido.codPedido = Detalle.codPedido and Detalle.cantidad > 8
    private void fifthExercise() {
        detalles.stream()
                .filter(detalle -> pedidos.stream()
                        .anyMatch(pedido -> pedido.getCodPedido() == detalle.getCodPedido()
                        && detalle.getCantidad() > 8)
                ).map(detalle -> detalle.getProducto())
                .forEach(value -> System.out.println(value));
    }
}
