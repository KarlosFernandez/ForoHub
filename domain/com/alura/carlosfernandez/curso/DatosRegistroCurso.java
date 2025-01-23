package com.alura.carlosfernandez.curso;

import jakarta.validation.constraints.NotNull;

public record DatosRegistroCurso( @NotNull String nombreCurso, @NotNull String categoria) { 

}
