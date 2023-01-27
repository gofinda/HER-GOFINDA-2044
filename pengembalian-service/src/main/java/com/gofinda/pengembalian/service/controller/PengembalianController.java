/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gofinda.pengembalian.service.controller;

import com.gofinda.pengembalian.service.entity.Pengembalian;
import com.gofinda.pengembalian.service.service.PengembalianService;
import com.gofinda.pengembalian.service.vo.ResponseTemplateVO;
import java.text.ParseException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author User
 */
@RestController
@RequestMapping("/pengembalian")
public class PengembalianController {

    @Autowired
    private PengembalianService pengembalianService;

//        @Autowired
//    private PeminjamanService peminjamanService;
    @PostMapping("/")
    public Pengembalian savePengembalian(@RequestBody Pengembalian pengembalian) throws Exception {
        return pengembalianService.savePengembalian(pengembalian);
    }

    
    
    @GetMapping("/{id}")
    public ResponseTemplateVO getPengembalian(@PathVariable("id") Long pengembalianId) {
        return pengembalianService.getPengembalian(pengembalianId);
    }

    @PutMapping("/")
    public Pengembalian updatePengembalian(@RequestBody Pengembalian pengembalian) {
        return pengembalianService.updatePengembalian(pengembalian);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Long pengembalianId) {
        pengembalianService.deletePengembalian(pengembalianId);
    }

    @GetMapping("/")
    public List<Pengembalian> getAllPengembalian() {
        return pengembalianService.getAllPengembalian();
    }
  
}
