package com.turkcell.crm.account_service.entities.concretes;

import com.turkcell.crm.account_service.core.entities.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "accounts")
public class Account extends BaseEntity<Integer> {
    // TODO: videoya bakalım
    @Column(name = "status")
    private String status;

    @Column(name = "name")
    private String name;

    @Column(name = "number")
    private String number;

    @Column(name = "customer_id")
    private int customerId;

    @ManyToOne()
    @JoinColumn(name = "type_id")
    private AccountType type;

    public Account(int id) {
        setId(id);
    }
}