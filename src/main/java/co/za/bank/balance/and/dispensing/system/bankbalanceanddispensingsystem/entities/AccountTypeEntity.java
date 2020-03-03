package co.za.bank.balance.and.dispensing.system.bankbalanceanddispensingsystem.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name = "ACCOUNT_TYPE")
@Getter
@Setter
public class AccountTypeEntity implements Serializable {

    @Id
    @Column(name = "ACCOUNT_TYPE_CODE")
    private String accountTypeCode;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "TRANSACTIONAL")
    private byte transactional;



}
