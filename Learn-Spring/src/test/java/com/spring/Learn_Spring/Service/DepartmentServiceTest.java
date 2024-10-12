package com.spring.Learn_Spring.Service;

import com.spring.Learn_Spring.Entity.Department;
import com.spring.Learn_Spring.Repository.DepartmentRepository; // Ensure this import
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

// Import for assertions
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DepartmentServiceTest {

    @Autowired
    private DepartmentService departmentService;

    private Department savedDepartment;

    @MockBean
    private DepartmentRepository departmentRepository;

    @BeforeEach
    void setUp() {
        Department department = Department.builder()
                .departmentId(1l)
                .departmentAddress("salem")
                .departmentCode("CSE")
                .departmentName("Computer")
                .build();

        Mockito.when(departmentRepository.findById(1l))
                .thenReturn(Optional.ofNullable(department));
    }

    @Test
    @DisplayName("Get data based id")
    // @Disabled this will make disable this test while executing multiple test method
    public void getDeptNameByLeadId(){
        Long id = 1l;
        String expectedDeptCode = "CSE";

        // Fetch the department using the service
        Department department = departmentService.getById(id);

        // Assert that the department code matches
        assertEquals(expectedDeptCode, department.getDepartmentCode());
    }
}
