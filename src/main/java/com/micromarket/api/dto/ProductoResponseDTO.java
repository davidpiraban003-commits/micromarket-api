package com.micromarket.api.dto;


import lombok.Data;
import java.math.BigDecimal;

@Data
public class ProductoResponseDTO {
    private Long id;
    private String nombre;
    private String codigoBarras;
    private BigDecimal precio;
    private Integer stock;
    private Boolean activo;
    private String categoriaNombre;
}