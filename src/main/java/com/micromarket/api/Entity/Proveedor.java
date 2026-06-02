package com.micromarket.api.Entity;



import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;
import java.util.List;

@Data
@Entity
@Table(name = "proveedores")
public class Proveedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 150)
    private String nombre;

    // Una de las reglas se completa en esta linea el nit unico con unique = true
    @Column(nullable = false, unique = true, length = 20)
    private String nit;

    @Column(length = 20)
    private String telefono;

    @Column(length = 100)
    private String email;

    // Dueño de la relación ManyToMany — genera tabla producto_proveedor
    @ManyToMany
    @JoinTable(
        name = "producto_proveedor",
        joinColumns = @JoinColumn(name = "proveedor_id"),
        inverseJoinColumns = @JoinColumn(name = "producto_id")
    )
    @ToString.Exclude
    private List<Producto> productos;
}
