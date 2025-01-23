package com.alura.carlosfernandez.topico;

import com.alura.carlosfernandez.autor.Autor;
import com.alura.carlosfernandez.autor.DatosRegistroAutor;

public record DatosListarTopico(Long id, String titulo, String mensaje, String fecha_creacion, String estatus, String nombreAutor, 
		                        String email, String nombreCurso, String categoria) {

	public DatosListarTopico(Topico topico) {
		this(topico.getId(),topico.getTitulo(),topico.getMensaje(),topico.getFecha_creacion().toString(),topico.getEstatus().toString(),
			 topico.getAutor().getNombreAutor(),topico.getAutor().getEmail(),topico.getCurso().getNombreCurso(),topico.getCurso().getCategoria()); 
	}
}
