package com.alibou.banking.transaction;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TreansactionServiceimp implements Transactionservice {
    private final TransactionRepository transactionRepository;

    public TreansactionServiceimp(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    @Override
    public List<Transaction> getTransactions(Long accountId) {
        return List.of();
    }

    @Override
    public TransactionResponse withdraw(TransactionRequest transactionRequest) {
        return null;
    }

    @Override
    public TransactionResponse deposit(TransactionRequest transactionRequest) {
        return null;
    }

    @Override
    public TransactionResponse transfer(TransactionRequest transactionRequest, Long userId) {
        return null;
    }

    @Override
    public TransactionResponse validateTransaction(TransactionRequest transactionRequest) {
        return null;
    }
}
