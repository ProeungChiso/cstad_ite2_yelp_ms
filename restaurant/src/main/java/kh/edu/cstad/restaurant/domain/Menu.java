package kh.edu.cstad.restaurant.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "menu")
public class Menu {

    @Id
    private Integer id;
    private String menuImage;
    private MenuType menuType;

    @ManyToOne
    private MenuItem menuItems;
}
