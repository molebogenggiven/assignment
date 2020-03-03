package co.za.bank.balance.and.dispensing.system.bankbalanceanddispensingsystem.entities;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "CLIENT_TYPE")
@Getter
@Setter
public class ClientTypeEntity implements Serializable {

    @Id
    @Column(name = "CLIENT_TYPE_CODE")
    private String clientTypeCode;

    @Column(name = "DESCRIPTION")
    private String description;


    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.LAZY
    )
    @JoinColumn(name = "CLIENT_TYPE_CODE")
    private List<ClientSubTypeEntity> clientSubTypeEntities = new ArrayList<>();
}
