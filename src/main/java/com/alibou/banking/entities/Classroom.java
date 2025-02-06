package com.alibou.banking.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CLASSROOMS")
public class Classroom {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;

    @OneToMany(mappedBy = "classroom")
    private List<Student> students;

    @ManyToMany
    @JoinTable(
            name = "cr_sb",
            joinColumns = {
                    @JoinColumn(name = "classroom_id")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "subject_id")
            }
    )
    private List<Subject> subjects;
}
