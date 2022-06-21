package pl.edu.agh.softwarestudio.angel.categories;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "Category")
public class Category {
    @Id
//    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String name;
}
