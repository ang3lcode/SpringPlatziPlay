package com.platzi.Play.persistence.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "platzi_play_peliculas")
public class MovieEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // nullable = false: El campo no puede ser nulo (es obligatorio).
    // length = 150: El texto puede tener un máximo de 150 caracteres.
    // unique = true: No puede haber dos películas con el mismo título en la tabla.
    @Column(nullable = false, length = 150, unique = true)
    private String title;
    // precision = 3: Indica que el número tendrá un total de 3 dígitos.
    // scale = 2: De esos 3 dígitos, 2 serán decimales (por ejemplo, 100 o 99.9).
    // nullable = false: Es obligatorio que tenga un valor.
    @Column(nullable = false, precision = 3, scale = 2)
    private Integer duracion;
    // nullable = false: Es obligatorio.
    // length = 40: Puede contener hasta 40 caracteres (para nombres de géneros).
    @Column(nullable = false, length = 40)
    private String genero;
    // name = "Fecha_estreno": Define el nombre exacto de la columna en la tabla
    // (case-sensitive).
    @Column(name = "Fecha_estreno")
    private LocalDate fechaEstreno;
    // precision = 3: Indica que el número tendrá un total de 3 dígitos.
    // scale = 2: De esos 3 dígitos, 2 serán decimales (por ejemplo, 100 o 99.9).
    @Column(precision = 3, scale = 2)
    private BigDecimal clasificacion;
    // nullable = false: Es obligatorio.
    // length = 1: Solo puede contener 1 carácter (probablemente 'S' o 'N').
    @Column(nullable = false, length = 1)
    private String estado;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public LocalDate getFechaEstreno() {
        return fechaEstreno;
    }

    public void setFechaEstreno(LocalDate fechaEstreno) {
        this.fechaEstreno = fechaEstreno;
    }

    public BigDecimal getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(BigDecimal clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
