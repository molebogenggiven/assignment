package co.za.bank.balance.and.dispensing.system.bankbalanceanddispensingsystem.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "CLIENT_SUB_TYPE")
@Getter
@Setter
public class ClientSubTypeEntity implements Serializable {

    @Id
    @Column(name = "CLIENT_SUB_TYPE_CODE")
    private String clientSubTypeCode;

    @Column(name = "DESCRIPTION")
    private String description;
}
