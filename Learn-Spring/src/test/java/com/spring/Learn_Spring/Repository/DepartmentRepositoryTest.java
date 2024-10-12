package com.spring.Learn_Spring.Repository;

import org.junit.jupiter.api.BeforeEach;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest  // this annotation for repository test class
class DepartmentRepositoryTest {

    @BeforeEach
    void setUp() {
    }
}