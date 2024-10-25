package tn.esprit.tpfoyer.entity;




import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long IdBloc ;
    private String nomBloc ;
    private long capaciteBloc ;
    @ManyToOne
    private  Foyer foyer_b ;

    @OneToMany(mappedBy = "bloc_c")
    private Set<Chambre> chambres_b ;
}

