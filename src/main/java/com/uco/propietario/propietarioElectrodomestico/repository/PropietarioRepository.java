package com.uco.propietario.propietarioElectrodomestico.repository;

import com.uco.propietario.propietarioElectrodomestico.entity.PropietarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropietarioRepository extends JpaRepository<PropietarioEntity, Integer> {
}
