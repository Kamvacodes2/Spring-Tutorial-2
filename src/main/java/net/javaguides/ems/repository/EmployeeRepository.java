package net.javaguides.ems.repository;

import net.javaguides.ems.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    //JpaRepository already annotated with @Repository and @Transactional
    //all methods are default transactional
    // once this extends the EmployeeRepo will get CRUD methods to perform
    // CRUD based operations on Database

}
