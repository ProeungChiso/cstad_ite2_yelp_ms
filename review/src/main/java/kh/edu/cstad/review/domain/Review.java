package kh.edu.cstad.review.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import java.time.Instant;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "reviews")
public class Review {

    @Id
    private Long id;

    @Column(nullable = false)
    private String url;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String text;

    private Integer rating;

    @CreatedDate
    private Instant createdAt;

    @ManyToOne
    private Reviewer reviewer;
}
