package com.example.demoapi.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name ="j6_product")
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prod_id")
    private Long prodId;
    @Column(name = "prod_name")
    private String prodName;
    @Column(name = "prod_img")
    private String prodImg;
    @Column(name = "prod_number_of")
    private int prodNumber;
    @Column(name = "prod_price")
    private double prodPrice;
}
