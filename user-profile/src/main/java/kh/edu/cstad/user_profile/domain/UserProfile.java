package kh.edu.cstad.user_profile.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import java.time.Instant;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "user_profiles")
public class UserProfile {

    @Id
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

    @CreatedDate
    private Instant createdAt;

}
