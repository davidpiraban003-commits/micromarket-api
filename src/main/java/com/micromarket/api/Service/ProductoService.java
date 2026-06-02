package com.micromarket.api.Service;


import com.micromarket.api.dto.ProductoRequestDTO;
import com.micromarket.api.dto.ProductoResponseDTO;
import java.util.List;

public interface ProductoService {
    ProductoResponseDTO crear(ProductoRequestDTO dto);
    List<ProductoResponseDTO> listarTodos();
    ProductoResponseDTO obtenerPorId(Long id);
    ProductoResponseDTO actualizar(Long id, ProductoRequestDTO dto);
    void eliminar(Long id); // soft delete
}