package miu.edu.complexmapping.models2;

import jakarta.persistence.*;

@Entity
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String appdate;
    @Embedded
    private Payment payment;

    @ManyToOne
    private Doctor doctor;

}
