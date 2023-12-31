/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tribboAdventure.demo.DTO.Response;


import com.tribboAdventure.demo.Entity.Viaje;
import com.tribboAdventure.demo.Enum.Categoria;
import java.time.LocalDate;


/**
 *
 * @author Admin
 */
public record ViajeResponseDTO(Long id, String destino, LocalDate salida, LocalDate llegada, String aerolinea, Double precio, String horaSalida, String horaLlegada,  Categoria categoria) {
    public ViajeResponseDTO(Viaje viaje){
        this(viaje.getId(), viaje.getDestino(), viaje.getSalida(), viaje.getLlegada(), viaje.getAerolinea(), viaje.getPrecio(), viaje.getHoraSalida(), viaje.getHoraLlegada(), viaje.getCategoria());
    }
}
