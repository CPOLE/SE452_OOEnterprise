package team5.ourstore.UserType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Customer {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customerid")
    private int customerid;

    @Column(name = "firstname")
    String firstName;

    @Column(name = "lastname")
    String lastName;

    @Column(name = "email")
    String email;

    @Column(name="password")
    String password;

}
