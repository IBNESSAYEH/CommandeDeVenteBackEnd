package com.example.SalesCommand.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {
    private Long id;
     private String produit;
    private String unite;
    private Double qteCommandee;
     private Double qteRestante;
    private BigDecimal prixUnitaire;
    private BigDecimal prixTotal;
}
