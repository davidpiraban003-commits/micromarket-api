package com.micromarket.api.dto;



import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class ProveedorRequestDTO {

    @NotBlank(message = "El nombre es obligatorio")
    @Size(max = 150)
    private String nombre;

    @NotBlank(message = "El NIT es obligatorio")
    @Size(max = 20, message = "NIT máximo 20 caracteres")
    private String nit;

    @Size(max = 20)
    private String telefono;

    @Email(message = "Email inválido")
    @Size(max = 100)
    private String email;
}