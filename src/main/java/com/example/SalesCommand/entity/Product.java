package com.example.SalesCommand.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "products")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

     @Column(nullable = false)
    private String produit;

    @Column(nullable = false)
     private String unite;
     @Column(name = "qte_commandee", nullable = false)
    private Double qteCommandee;

     @Column(name = "qte_restante", nullable = false)
    private Double qteRestante;

    @Column(name = "prix_unitaire", nullable = false)
     private BigDecimal prixUnitaire;

    @Column(name = "prix_total", nullable = false)
    private BigDecimal prixTotal;

    @PrePersist
    @PreUpdate
    public void calculateTotalPrice() {
        if (qteCommandee != null && prixUnitaire != null) {
            prixTotal = prixUnitaire.multiply(BigDecimal.valueOf(qteCommandee));
        }
    }
}