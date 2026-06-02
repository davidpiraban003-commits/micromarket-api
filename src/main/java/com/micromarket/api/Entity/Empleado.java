package com.micromarket.api.Entity;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;


@Data
@Entity
@Table(name = "empleados")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Regla: cédula única
    @Column(nullable = false, unique = true, length = 20)
    private String cedula;

    @Column(nullable = false, length = 150)
    private String nombre;

    // solo ADMINISTRADOR, CAJERO, AUXILIAR
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private EnumCargo cargo;

    @Column(name = "fecha_ingreso", nullable = false)
    private LocalDate fechaIngreso;

    @Column(nullable = false, precision = 12, scale = 2)
    private BigDecimal salario;

    // Un empleado puede hacer muchas ventas
    @OneToMany(mappedBy = "empleado", fetch = FetchType.LAZY)
    private List<Venta> ventas;
}


enum EnumCargo {
    ADMINISTRADOR,
    CAJERO,
    AUXILIAR
}