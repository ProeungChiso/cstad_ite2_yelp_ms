package kh.edu.cstad.business.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "business")
public class Business {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String alias;

    @Column(nullable = false)
    private String username;

    @Column(unique = true, nullable = false)
    private String brand;

    @Column(unique = true, nullable = false)
    private String customBrand;

    private String logo;
    private String cover;
    private String thumbnail;

    @Column(columnDefinition = "TEXT")
    private String about;

    @Column(unique = true, nullable = false, length = 30)
    private String phoneNumber;

    @Column(columnDefinition = "TEXT")
    private String address1;

    @Column(columnDefinition = "TEXT")
    private String address2;

    @Column(columnDefinition = "TEXT")
    private String address3;

    private String stateOrProvince;

    @Column(length = 32)
    private String zipCode;

    private Boolean isOpening24Hours;

    @Column(unique = true, length = 150)
    private String website;

    @Column(unique = true, nullable = false, length = 100)
    private String email;

    private Boolean isClaimed;
    private Boolean isClosed;
    private Boolean isApproved;
    private Boolean isSearchable;

    private Double latitude;
    private Double longitude;

    private String price;

    @ManyToOne
    private Country country;

    @ManyToOne
    private City city;

    @JdbcTypeCode(SqlTypes.JSON)
    private List<OpeningHour> openingHours;

    @ManyToMany
    @JoinTable(name = "businesses_categories",
            joinColumns = @JoinColumn(name = "business_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "category_id", referencedColumnName = "id")
    )
    private List<Category> categories;

    @ManyToMany
    @JoinTable(name = "businesses_tranctions",
            joinColumns = @JoinColumn(name = "business_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "transaction_id", referencedColumnName = "id")
    )
    private List<Transaction> transactions;


}
