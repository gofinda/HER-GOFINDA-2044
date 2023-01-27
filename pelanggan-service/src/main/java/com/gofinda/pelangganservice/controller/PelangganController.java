/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gofinda.pelangganservice.controller;

import com.gofinda.pelangganservice.repository.PelangganRepository.Pelanggan;
import com.gofinda.pelangganservice.service.PelangganService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author User
 */

@RestController
@RequestMapping("/pelanggan")
public class PelangganController {
    @Autowired
    private PelangganService pelangganService;
    
    @PostMapping("/")
    public Pelanggan savePelanggan(@RequestBody Pelanggan pelanggan){
        return pelangganService.savePelanggan(pelanggan);
    }
    @GetMapping("/{KodeBarang}")
    public Pelanggan findPelangganByKodeBarang(@PathVariable("KodeBarang") Long pelangganKodeBarang){
        return pelangganService.findPelangganByKodeBarang(pelangganKodeBarang);
    }
}
    
    

