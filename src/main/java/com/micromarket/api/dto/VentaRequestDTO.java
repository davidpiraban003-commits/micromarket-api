package com.micromarket.api.dto;




import jakarta.validation.constraints.*;
import lombok.Data;
import java.util.List;

@Data
public class VentaRequestDTO {

    @NotNull(message = "El empleado es obligatorio")
    private Long empleadoId;

    @NotEmpty(message = "La venta debe tener al menos un producto")
    private List<DetalleVentaRequestDTO> detalles;
}