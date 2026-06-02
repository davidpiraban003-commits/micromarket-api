package com.micromarket.api.Service;



import com.micromarket.api.dto.EntradaAlmacenRequestDTO;
import com.micromarket.api.dto.ProveedorRequestDTO;
import com.micromarket.api.dto.ProveedorResponseDTO;
import java.util.List;

public interface ProveedorService {
    ProveedorResponseDTO crear(ProveedorRequestDTO dto);
    List<ProveedorResponseDTO> listarTodos();
    ProveedorResponseDTO obtenerPorId(Long id);
    ProveedorResponseDTO actualizar(Long id, ProveedorRequestDTO dto);
    void eliminar(Long id);
    void entradaAlmacen(EntradaAlmacenRequestDTO dto); // Regla módulo II
}