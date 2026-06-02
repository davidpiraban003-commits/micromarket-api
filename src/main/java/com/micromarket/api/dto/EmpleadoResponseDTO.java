package com.micromarket.api.dto;

import com.micromarket.api.Entity.*;
import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class EmpleadoResponseDTO {
    private Long id;
    private String cedula;
    private String nombre;
    private EnumCargo cargo;
    private LocalDate fechaIngreso;
    private BigDecimal salario;
}