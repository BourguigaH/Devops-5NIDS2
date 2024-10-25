package tn.esprit.tpfoyer.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Reservation {
    @Id
    private  String idReservation ;
    private Date anneeUniversitaire ;
    private  Boolean estValide;

    @ManyToMany
    private Set<Etudiant> etudiants_r ;
}
