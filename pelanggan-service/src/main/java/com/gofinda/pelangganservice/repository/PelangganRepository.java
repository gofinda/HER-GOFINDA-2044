/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gofinda.pelangganservice.repository;

import com.gofinda.pelangganservice.repository.PelangganRepository.Pelanggan;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author User
 */
public interface PelangganRepository extends JpaRepository<Pelanggan, Long> {

    public Pelanggan findByPelangganKodeBarang(Long pelangganKodeBarang);

    public static class Pelanggan {

        public Pelanggan() {
        }
    }
}
