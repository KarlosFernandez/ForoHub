package com.alura.carlosfernandez.autor;

import jakarta.validation.constraints.NotBlank;

public record DatosRegistroAutor(@NotBlank String nombreAutor,@NotBlank String email) { 

}
