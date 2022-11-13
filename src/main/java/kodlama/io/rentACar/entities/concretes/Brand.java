package kodlama.io.rentACar.entities.concretes;

import lombok.*;

import javax.persistence.*;

@Table(name = "brands")
@Entity

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Brand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;


}
