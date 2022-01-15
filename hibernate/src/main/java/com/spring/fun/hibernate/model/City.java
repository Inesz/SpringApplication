package com.spring.fun.hibernate.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "cities")
public class City extends BaseEntity {
    private String name;

    @ManyToMany(mappedBy = "cities", fetch = FetchType.LAZY)
    private Set<Citizen> citizens;
}
