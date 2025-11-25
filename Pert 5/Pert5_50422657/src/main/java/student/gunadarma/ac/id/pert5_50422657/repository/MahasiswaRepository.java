/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student.gunadarma.ac.id.pert5_50422657.repository;

/**
 *
 * @author harry
 */
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import student.gunadarma.ac.id.pert5_50422657.model.ModelMahasiswa;
@Repository
public interface MahasiswaRepository extends JpaRepository<ModelMahasiswa, Long> {

}
