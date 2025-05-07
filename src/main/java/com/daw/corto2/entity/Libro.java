package com.daw.corto2.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "libros")
public class Libro {
    @Id
    @Column(name = "libro_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long libroID;

    @Column(name = "titulo", nullable = false, length = 100)
    private String titulo;

    @Column(name = "isbn", nullable = false, length = 20, unique = true)
    private String isbn;

    @Column(name = "fecha_publicacion")
    private LocalDateTime fechaPublicacion;

    @Column(name = "precio", precision = 10, scale = 2)
    private BigDecimal precio;

    @Column(name = "stock")
    private Integer stock;

    @ManyToOne
    @JoinColumn(name = "autor_id", referencedColumnName = "autor_id", nullable = false)
    private Autor autor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "categoria_id", referencedColumnName = "categoria_id", nullable = false)
    private Categoria categoria;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "editorial_id", referencedColumnName = "editorial_id", nullable = false)
    private Editorial editorial;
}