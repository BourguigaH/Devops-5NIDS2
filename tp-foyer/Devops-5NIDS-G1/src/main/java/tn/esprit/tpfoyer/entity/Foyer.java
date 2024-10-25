package tn.esprit.tpfoyer.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Foyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long idFoyer ;
    private  String nomFoyer ;
    private  long capaciteFoyer ;

    @OneToOne(mappedBy = "foyer_u")
    private Universite universite ;

    @OneToMany(mappedBy = "foyer_b")
    private Set<bloc> blocs_F ;
}


