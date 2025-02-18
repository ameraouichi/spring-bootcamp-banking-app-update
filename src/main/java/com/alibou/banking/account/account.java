package com.alibou.banking.account;


import com.alibou.banking.common.AbstractEntity;
import com.alibou.banking.user.User;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.OneToOne;
import jakarta.persistence.JoinColumn;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Table(name = "ACCOUNTS")
public class Account extends AbstractEntity {

    private String iban;
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;




}
