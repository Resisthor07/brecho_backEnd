package org.example;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Venda {


    private BigDecimal total;

    private boolean validacaoPagamento;

    //private Pagamento formaPagamento;

    private LocalDateTime dataDaEntrega;

    private LocalDateTime dataDaVenda;

    private boolean confirmacaoDaVenda;

    private boolean confirmcacaoDaEntrega;


    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public boolean isValidacaoPagamento() {
        return validacaoPagamento;
    }

    public void setValidacaoPagamento(boolean validacaoPagamento) {
        this.validacaoPagamento = validacaoPagamento;
    }

    public LocalDateTime getDataDaEntrega() {
        return dataDaEntrega;
    }

    public void setDataDaEntrega(LocalDateTime dataDaEntrega) {
        this.dataDaEntrega = dataDaEntrega;
    }

    public LocalDateTime getDataDaVenda() {
        return dataDaVenda;
    }

    public void setDataDaVenda(LocalDateTime dataDaVenda) {
        this.dataDaVenda = dataDaVenda;
    }

    public boolean isConfirmacaoDaVenda() {
        return confirmacaoDaVenda;
    }

    public void setConfirmacaoDaVenda(boolean confirmacaoDaVenda) {
        this.confirmacaoDaVenda = confirmacaoDaVenda;
    }

    public boolean isConfirmcacaoDaEntrega() {
        return confirmcacaoDaEntrega;
    }

    public void setConfirmcacaoDaEntrega(boolean confirmcacaoDaEntrega) {
        this.confirmcacaoDaEntrega = confirmcacaoDaEntrega;
    }
}
