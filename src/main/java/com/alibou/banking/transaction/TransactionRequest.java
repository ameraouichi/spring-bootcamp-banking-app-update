package com.alibou.banking.transaction;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TransactionRequest {
    @NotNull //null
    private BigDecimal amount;
    @NotNull//null
    @NotEmpty(message = "IBAN should not be empty") //""
    @NotBlank(message = "IBAN should not be blank")// " "
    private String destinationIban;
    @NotNull//null
    @NotEmpty(message = "IBAN should not be empty") //""
    @NotBlank(message = "IBAN should not be blank")// " "
    private String sourceIban;

}