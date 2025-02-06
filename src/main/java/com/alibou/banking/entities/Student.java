package com.alibou.banking.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "STUDENTS")
public class Student {

    @Id
    @GeneratedValue
    private Integer id;
    @Column(name = "F_NAME")
    private String firstname;
    @Column(name = "L_NAME")
    private String lastname;
    @Column(unique = true, nullable = false, length = 100)
    private String email;
    private int age;

    @OneToOne
    // @JoinColumn(name = "id_adresse")
    private Address address;

    @ManyToOne
    @JoinColumn(name = "classroom_id") // optional if we want to customize the FK name
    private Classroom classroom;
}
