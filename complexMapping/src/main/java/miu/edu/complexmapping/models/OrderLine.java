package miu.edu.complexmapping.models;

import jakarta.persistence.*;

@Entity
public class OrderLine {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;
    private String quantity;
    @ManyToOne
    private Product product;


}
