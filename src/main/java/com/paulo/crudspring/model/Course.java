package com.paulo.crudspring.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
//@Table(name = "courses") Se a entidade for o mesmo nome da  tabele, nao é necessário essa annotation;
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "name", length = 200, nullable = false)
    private String name;
    @Column(name = "category", length = 200, nullable = false)
    private String category;
}
