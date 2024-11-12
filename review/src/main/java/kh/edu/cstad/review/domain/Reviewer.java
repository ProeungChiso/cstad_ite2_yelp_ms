package kh.edu.cstad.review.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "reviewer")
public class Reviewer {

    @Id
    private Integer id;

    @Column(nullable = false)
    private String profileUrl;

    private String imageUrl;

    @Column(nullable = false)
    private String username;
}
