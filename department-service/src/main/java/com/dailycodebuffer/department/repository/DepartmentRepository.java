package com.dailycodebuffer.department.repository;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.dailycodebuffer.department.entity.Department;
@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long>{

	Department findByDepartmentId(Long id);

	

}
