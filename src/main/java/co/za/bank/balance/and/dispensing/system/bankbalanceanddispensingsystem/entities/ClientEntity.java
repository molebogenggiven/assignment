package co.za.bank.balance.and.dispensing.system.bankbalanceanddispensingsystem.entities;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "CLIENT")
@Getter
@Setter
public class ClientEntity {

    @Id
    @Column(name = "CLIENT_ID")
    private int clientId;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "NAME")
    private String name;

    @Column(name = "SURNAME")
    private String surname;

    @Column(name = "DOB")
    private Date dateOfBirth;




}
