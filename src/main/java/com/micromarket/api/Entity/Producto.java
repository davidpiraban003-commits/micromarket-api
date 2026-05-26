package com.micromarket.api.Entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;
import java.math.BigDecimal;
import com.micromarket.api.Entity.Proveedor;


@Data
@Entity
@Table(name = "productos")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 150)
    private String nombre;

     @Column(name = "codigo_barras", nullable = false, unique = true, length = 50)
    private String codigoBarras; 
     // Aca generamos  que el codigo de barras no se repita que sea unico 
     // con el parametro unique = true 


    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal precio;

    @Column(nullable = false)
    private Integer stock;

    @Column(nullable = true)
    private Boolean activo= true;
       
        // muchos productos pueden pertenecer a una categoria 
        @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "categoria_id", nullable = false) // 
    private Categoria categoria;


    @ManyToMany(mappedBy = "productos")
    private List<Proveedor> provedores;



}
