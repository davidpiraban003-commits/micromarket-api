package com.micromarket.api.dto;


import lombok.Data;

@Data
public class ProveedorResponseDTO {
    private Long id;
    private String nombre;
    private String nit;
    private String telefono;
    private String email;
}