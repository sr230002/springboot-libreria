package com.daw.corto2.entity;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
@Table(name = "categorias")
public class Categoria {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "categoria_id", nullable = false)
    private Long categoriaID;

    @Column(name = "nombre", nullable = false, length = 50, unique = true)
    private String nombre;
    
    @Column(name = "descripcion", length = 200)
    private String descripcion;
    
    @OneToMany(mappedBy = "categoria", fetch = FetchType.LAZY)
    private List<Libro> libros = new ArrayList<>();
}