package com.vinc.domain;

import com.vinc.domain.enums.TransactionCategory;
import com.vinc.domain.enums.TransactionType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "transaction")


public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "transaction_date")
    private LocalDate transactionDate;

    @Column(name = "transaction_type")
    private TransactionType transactionType;

    @Column(name = "amount")
    private BigDecimal amount;

    @Column(name = "transaction_category")
    private TransactionCategory transactionCategory;

    @Column(name = "transaction_description")
    private String transactionDescription;


    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;

}
