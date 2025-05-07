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
@Table(name = "clientes")
public class Cliente {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cliente_id", nullable = false)
    private Long clienteID;
    
    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;
    
    @Column(name = "apellido", nullable = false, length = 50)
    private String apellido;
    
    @Column(name = "email", nullable = false, length = 100, unique = true)
    private String email;
    
    @OneToMany(mappedBy = "cliente", fetch = FetchType.LAZY)
    private List<Venta> ventas = new ArrayList<>();
}