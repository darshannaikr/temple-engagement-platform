package com.divyasphere.repository;

import com.divyasphere.entity.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TestEntitytRepository extends JpaRepository<TestEntity, UUID> {
}
