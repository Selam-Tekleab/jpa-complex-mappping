package miu.edu.complexmapping.models2;

import jakarta.persistence.*;

@Entity
@Table(name = "Address_Table")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Embedded
    private Address address;


}
