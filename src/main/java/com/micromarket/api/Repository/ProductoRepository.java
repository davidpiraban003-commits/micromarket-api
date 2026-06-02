package com.micromarket.api.Repository;

import com.micromarket.api.Entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {

    // lee el nombre del método y genera el SQL solo
    
    Optional<Producto> findByCodigoBarras(String codigoBarras);

    // Comprueba si existe con el código de barras 
    boolean existsByCodigoBarras(String codigoBarras);
}