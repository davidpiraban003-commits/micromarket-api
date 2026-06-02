package com.micromarket.api.Service;


import com.micromarket.api.dto.EmpleadoRequestDTO;
import com.micromarket.api.dto.EmpleadoResponseDTO;
import com.micromarket.api.Entity.*;
import java.time.LocalDate;
import java.util.List;

public interface EmpleadoService {
    EmpleadoResponseDTO crear(EmpleadoRequestDTO dto);
    List<EmpleadoResponseDTO> listarTodos();
    EmpleadoResponseDTO obtenerPorId(Long id);
    EmpleadoResponseDTO actualizar(Long id, EmpleadoRequestDTO dto);
    void eliminar(Long id);
    // Regla módulo III — filtros
    List<EmpleadoResponseDTO> listarPorCargo(EnumCargo cargo);
    List<EmpleadoResponseDTO> listarPorRangoFecha(LocalDate desde, LocalDate hasta);
}