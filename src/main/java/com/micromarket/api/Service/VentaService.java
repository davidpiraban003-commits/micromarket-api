package com.micromarket.api.Service;



import com.micromarket.api.dto.VentaRequestDTO;
import com.micromarket.api.dto.VentaResponseDTO;
import java.util.List;

public interface VentaService {
    VentaResponseDTO procesarVenta(VentaRequestDTO dto);
    List<VentaResponseDTO> listarTodas();
    VentaResponseDTO obtenerPorId(Long id);
}
