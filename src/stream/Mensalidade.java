package stream;

import java.time.LocalDate;

import enums.FormaPagamento;
import enums.MensalidadeStatus;

public class Mensalidade {

    private Long codMensalidade;

    private Long valor;

    private LocalDate dataFechamento;

    private LocalDate dataVencimento;

    private MensalidadeStatus status;

    private FormaPagamento tipoPagamento;
    
    private Cliente cliente;
   
    private Produto produto;

    public Long getCodMensalidade() {
        return codMensalidade;
    }

    public void setCodMensalidade(Long codMensalidade) {
        this.codMensalidade = codMensalidade;
    }

    public Long getValor() {
        return valor;
    }

    public void setValor(Long valor) {
        this.valor = valor;
    }

    public LocalDate getDataFechamento() {
        return dataFechamento;
    }

    public void setDataFechamento(LocalDate dataFechamento) {
        this.dataFechamento = dataFechamento;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public MensalidadeStatus getStatus() {
        return status;
    }

    public void setStatus(MensalidadeStatus status) {
        this.status = status;
    }

    public FormaPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(FormaPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
}
