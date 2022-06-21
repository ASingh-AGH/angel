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
    @SequenceGenerator(name="category_id_seq",
            sequenceName="category_id_seq",
            allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator="category_id_seq")
    @Column(name = "id", updatable=false)
    private Integer id;
    private String name;
}
