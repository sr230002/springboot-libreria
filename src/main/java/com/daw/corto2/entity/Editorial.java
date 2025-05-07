package com.daw.corto2.entity;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "editoriales")
public class Editorial {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "editorial_id", nullable = false)
    private Long editorialID;
    
    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pais_id", referencedColumnName = "pais_id", nullable = false)
    private Pais pais;
    
    @OneToMany(mappedBy = "editorial", fetch = FetchType.LAZY)
    private List<Libro> libros = new ArrayList<>();
}