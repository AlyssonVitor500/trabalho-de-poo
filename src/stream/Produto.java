package stream;

import java.util.ArrayList;
import java.util.List;

import enums.TipoProdutoEnum;

public class Produto {
    private Long codigoProduto;
    private String nomeDoProduto;
    private Diretor diretor;
    private Long anoDePublicacao;
    private TipoProdutoEnum tipoDoProduto;
    private List<Genero> generosDoProduto = new ArrayList<Genero>();
    private List<Atores> elenco = new ArrayList<Atores>();

    public Long getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(Long codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public String getNomeDoProduto() {
        return nomeDoProduto;
    }

    public void setNomeDoProduto(String nomeDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
    }

    public TipoProdutoEnum getTipoDoProduto() {
        return tipoDoProduto;
    }

    public void setTipoDoProduto(TipoProdutoEnum tipoDoProduto) {
        this.tipoDoProduto = tipoDoProduto;
    }

    public Long getAnoDePublicacao() {
        return anoDePublicacao;
    }

    public void setAnoDePublicacao(Long anoDePublicacao) {
        this.anoDePublicacao = anoDePublicacao;
    }

    public List<Genero> getGenerosDoProduto() {
        return generosDoProduto;
    }

    public void adicionarGenerosDoProduto(Genero generoDoProduto) {
        this.generosDoProduto.add(generoDoProduto);
    }

    public List<Atores> getElenco() {
        return elenco;
    }

    public void adicionarAtor(Atores ator) {
        this.elenco.add(ator);
    }

    public Diretor getDiretor() {
        return diretor;
    }

    public void setDiretor(Diretor diretor) {
        this.diretor = diretor;
    }
}
