package com.alura.carlosfernandez.topico;

import com.alura.carlosfernandez.autor.DatosRegistroAutor;
import com.alura.carlosfernandez.curso.DatosRegistroCurso;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosRegistroTopico(@NotBlank String titulo, @NotBlank String mensaje, @NotNull DatosRegistroAutor autor, @NotNull DatosRegistroCurso curso) {
	 
}
