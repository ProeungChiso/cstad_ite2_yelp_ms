package kh.edu.cstad.identify.domain;

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
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, unique = true)
    private String firstName;

    @Column(nullable = false, unique = true)
    private String lastName;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    private String gender;
    private String headline; // Taco Tuesday Aficionado, The Globetrotting Reviewer
    private String findMeIn; // ISTAD
    private String iLove; // Comma separated phrases (e.g. sushi, puppies)
    private String myTown; // SiemReap
    private String url; // Link (blog or website)
    private String readMyReviews; // They’re useful, funny, and cool
    private String secondFavoriteWebsite; // www.wikipedia.com
    private String lastBook; // The Joy Of Cooking
    private String firstConcert; // Beyoncé, Run DMC
    private String favouriteMovie; // Spider man...
    private String lastMeal; // Soup
    private String doNotTell; // I don’t like cilantro, I’m afraid of hamsters
    private String recentDiscovery; // Coconut oil in coffee is actually amazing
    private String currentCrush; // Angelin

    private String location;

    @CreatedDate
    private Instant createdAt;

    @Convert(converter = Language.LanguageConverter.class)
    private Language primaryLanguage;

    @Column(columnDefinition = "BOOLEAN DEFAULT TRUE")
    private Boolean accountNonExpired;

    @Column(columnDefinition = "BOOLEAN DEFAULT TRUE")
    private Boolean accountNonLocked;

    @Column(columnDefinition = "BOOLEAN DEFAULT TRUE")
    private Boolean credentialsNonExpired;

    @Column(columnDefinition = "BOOLEAN DEFAULT FALSE")
    private Boolean isEnabled;

    @Column(columnDefinition = "BOOLEAN DEFAULT FALSE")
    private Boolean emailVerified;
}
