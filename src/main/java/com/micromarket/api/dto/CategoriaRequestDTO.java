package com.micromarket.api.dto;


import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class CategoriaRequestDTO {

    @NotBlank(message = "El nombre es obligatorio")
    @Size(max = 100, message = "Máximo 100 caracteres")
    private String nombre;

    @Size(max = 255, message = "Máximo 255 caracteres")
    private String descripcion;
}
