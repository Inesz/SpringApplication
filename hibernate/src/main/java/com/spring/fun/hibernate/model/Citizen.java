package com.spring.fun.hibernate.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "citizens")
public class Citizen extends BaseEntity {
    @Column(name = "last_name")
    private String last_name;
    @Column(name = "first_name")
    private String firstName;

    @ManyToMany
    @JoinTable(name = "citizens_of_cities", joinColumns = @JoinColumn(name = "citizen_id"), inverseJoinColumns = @JoinColumn(name = "city_id"))
    private Set<City> cities;
}
