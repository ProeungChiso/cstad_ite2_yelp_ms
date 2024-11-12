package kh.edu.cstad.restaurant.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "menuItem")
public class MenuItem {

    @Id
    private Integer id;
    private String name;
    private String description;
    private String price;
    private String image;
}
