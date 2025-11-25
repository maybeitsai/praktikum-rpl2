/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan6.repository;

/**
 *
 * @author joypu
 */
import com.mycompany.pertemuan6.model.ModelMahasiswa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MahasiswaRepository extends JpaRepository<ModelMahasiswa, Integer> {


}

