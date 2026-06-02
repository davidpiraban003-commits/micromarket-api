package com.micromarket.api.Service;
import com.micromarket.api.dto.CategoriaRequestDTO;
import com.micromarket.api.dto.CategoriaResponseDTO;
import java.util.List;

public interface CategoriaService {
    CategoriaResponseDTO crear(CategoriaRequestDTO dto);
    List<CategoriaResponseDTO> listarTodas();
    CategoriaResponseDTO obtenerPorId(Long id);
    CategoriaResponseDTO actualizar(Long id, CategoriaRequestDTO dto);
    void eliminar(Long id);
}
