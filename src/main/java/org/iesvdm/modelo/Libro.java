package org.iesvdm.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Libro {

    private int id;
    private String titulo;
    private String autor;
    private String editorial;

    public Libro(String titulo, String autor, String editorial) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
    }
}
