/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gofinda.pelangganservice.service;

import com.gofinda.pelangganservice.repository.PelangganRepository.Pelanggan;
import com.gofinda.pelangganservice.repository.PelangganRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author User
 */
public class PelangganService {
    @Autowired
    private PelangganRepository pelangganRepository;
    private Long pelangganKodeBarang;

    public Pelanggan savePelanggan(Pelanggan pelanggan){
        return pelangganRepository.save(pelanggan);
    }

    public Pelanggan findPelangganByKodeBarang(Long pelangganKodeBarang){
        return pelangganRepository.findByPelangganKodeBarang(pelangganKodeBarang);
    }
}