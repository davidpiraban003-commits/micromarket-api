package com.micromarket.api.Controller;

import com.micromarket.api.dto.*;
import com.micromarket.api.Service.ProveedorService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProveedorController {

    private final ProveedorService proveedorService;

    // ── CRUD Proveedores ─────────────────────────────────────────

    @PostMapping("/api/proveedores")
    public ResponseEntity<ProveedorResponseDTO> crear(@Valid @RequestBody ProveedorRequestDTO dto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(proveedorService.crear(dto));
    }

    @GetMapping("/api/proveedores")
    public ResponseEntity<List<ProveedorResponseDTO>> listar() {
        return ResponseEntity.ok(proveedorService.listarTodos());
    }

    @GetMapping("/api/proveedores/{id}")
    public ResponseEntity<ProveedorResponseDTO> obtener(@PathVariable Long id) {
        return ResponseEntity.ok(proveedorService.obtenerPorId(id));
    }

    @PutMapping("/api/proveedores/{id}")
    public ResponseEntity<ProveedorResponseDTO> actualizar(
            @PathVariable Long id,
            @Valid @RequestBody ProveedorRequestDTO dto) {
        return ResponseEntity.ok(proveedorService.actualizar(id, dto));
    }

    @DeleteMapping("/api/proveedores/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        proveedorService.eliminar(id);
        return ResponseEntity.noContent().build();
    }

    // ── Entrada de Almacén (Regla Módulo II) ─────────────────────

    @PostMapping("/api/almacen/entrada")
    public ResponseEntity<String> entradaAlmacen(@Valid @RequestBody EntradaAlmacenRequestDTO dto) {
        proveedorService.entradaAlmacen(dto);
        return ResponseEntity.ok("Stock actualizado correctamente");
    }
}