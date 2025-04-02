package com.universidad.proyecto.services;

import java.util.List;

import com.universidad.proyecto.dto.EstudianteDTO;

public interface IEstudianteService {
    List<EstudianteDTO> obtenerTodosLosEstudiantes();

    EstudianteDTO obtenerEstudiantePorId(Long id);

    public void eliminarEstudiante(Long id);

    EstudianteDTO crearEstudiante(EstudianteDTO estudianteDTO);

    EstudianteDTO actualizarEstudiante(Long id, EstudianteDTO estudianteDTO);
}