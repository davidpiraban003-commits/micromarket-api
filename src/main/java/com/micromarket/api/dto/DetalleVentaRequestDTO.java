package com.micromarket.api.dto;



import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class DetalleVentaRequestDTO {

    @NotNull(message = "El producto es obligatorio")
    private Long productoId;

    @NotNull(message = "La cantidad es obligatoria")
    @Min(value = 1, message = "La cantidad mínima es 1")
    private Integer cantidad;
}
