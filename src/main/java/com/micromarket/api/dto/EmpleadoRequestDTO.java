package com.micromarket.api.dto;


import com.micromarket.api.enums.EnumCargo;
import jakarta.validation.constraints.*;
import lombok.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class EmpleadoRequestDTO {

    @NotBlank(message = "La cédula es obligatoria")
    @Size(max = 20)
    private String cedula;

    @NotBlank(message = "El nombre es obligatorio")
    @Size(max = 150)
    private String nombre;

    @NotNull(message = "El cargo es obligatorio")
    private EnumCargo cargo;

    @NotNull(message = "La fecha de ingreso es obligatoria")
    private LocalDate fechaIngreso;

    @NotNull(message = "El salario es obligatorio")
    @DecimalMin(value = "0.01", message = "El salario debe ser mayor a 0")
    private BigDecimal salario;
}

