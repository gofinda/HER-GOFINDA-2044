/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gofinda.pelangganservice.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author User
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class pelanggan{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long pelangganKodeBarang;
    private String pelangganNamaBarang;
}
