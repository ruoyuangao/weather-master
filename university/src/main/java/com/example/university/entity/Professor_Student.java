package com.example.university.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="professor_student")
@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Professor_Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "s_id")
    private Student stu;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "p_id")
    private Professor pro;

    @Override
    public String toString() {
        return "Professor_Student{" +
                "id='" + id + '\'' +
                "stu='" + stu.toString() + '\'' +
                "pro='" + pro.toString() + '\'' +
                '}';
    }


}
