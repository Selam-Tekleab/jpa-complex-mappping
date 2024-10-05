package miu.edu.complexmapping.models2;

import jakarta.persistence.Embeddable;

@Embeddable
public class Address {
    private String street;
    private String zip;
    private String city;
}
