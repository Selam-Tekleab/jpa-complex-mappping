package waa_lab3_complex_mapping.models;

import jakarta.persistence.Entity;
import miu.edu.complexmapping.models.Product;

@Entity
public class Book extends Product {
    private String title;
}
