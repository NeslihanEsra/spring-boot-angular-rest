package com.nea.entity;

import lombok.Data;

import javax.persistence.*;

@Table(name = "kisi")
@Entity
@Data
public class Kisi {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "ad")
    private String ad;

    @Column(name = "soyad")
    private String soyad;

    @Column(name = "adres")
    private String adres;

}
