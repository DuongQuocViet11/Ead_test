package com.example.eadtest.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "sales")
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long saleNo;
    private long salesManId;
    @ManyToOne
    @JoinColumn(name = "prodId", referencedColumnName = "prodId")
    private Product prodId;
    private String salesManName;
    private String DOS;
}
