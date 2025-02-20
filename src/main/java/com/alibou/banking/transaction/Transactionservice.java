package com.alibou.banking.transaction;

import java.util.List;
public interface Transactionservice {
    List<Transaction> getTransactions(Long accountId);
    TransactionResponse withdraw(TransactionRequest transactionRequest);
    TransactionResponse deposit(TransactionRequest transactionRequest);
    TransactionResponse transfer(TransactionRequest transactionRequest, Long userId);
    TransactionResponse validateTransaction(TransactionRequest transactionRequest);
}

