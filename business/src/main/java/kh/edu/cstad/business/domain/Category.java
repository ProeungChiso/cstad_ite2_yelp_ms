package kh.edu.cstad.business.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "categories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true, nullable = false, length = 60)
    private String name;

    @Column(unique = true, nullable = false, length = 100)
    private String alias;

    @Column(columnDefinition = "TEXT")
    private String description;

    private String icon;

}
