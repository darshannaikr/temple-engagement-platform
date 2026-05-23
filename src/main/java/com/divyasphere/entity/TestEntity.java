package com.divyasphere.entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class TestEntity extends BaseEntity {

    private String name;
}
