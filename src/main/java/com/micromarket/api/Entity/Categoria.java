package com.micromarket.api.Entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;


@Data
@Entity
@Table(name = "productos")
public class Producto {
    @Id                                    
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
    private Long id;

    @Column(nullable = false, length = 100)  //  máximo 100 caracteres
    private String nombre;

    @Column(length = 255)
    private String descripcion;
    
      @OneToMany(mappedBy = "categoria", fetch = FetchType.LAZY)
    private List<Producto> productos;
}
