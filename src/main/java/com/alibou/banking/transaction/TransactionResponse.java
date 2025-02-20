package com.alibou.banking.transaction;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TransactionResponse {
        private String description;
        private BigDecimal amount;
        private LocalDateTime date;
        @Enumerated(EnumType.STRING)
        private TransactionStatus status;

    }
