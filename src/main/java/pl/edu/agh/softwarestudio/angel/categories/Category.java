package pl.edu.agh.softwarestudio.angel.categories;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Category")
@Data
public class Category {
    @Id
//    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String name;
}
