package net.javaguides.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository {
    //JpaRepository already annotated with @Repository and @Transactional
    //all methods are default transactional

}
