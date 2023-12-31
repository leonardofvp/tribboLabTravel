/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tribboAdventure.demo.Repository;


import com.tribboAdventure.demo.Entity.Habitacion;
import com.tribboAdventure.demo.Enum.TipoHabitacion;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Admin
 */
@Repository
public interface HabitacionRepository extends JpaRepository<Habitacion, Long>{
    Habitacion findBytipoHabitacion(TipoHabitacion tipo);
    

    Optional<Habitacion> findById(Long id);
}
