package Entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contrato {

    private Integer numeroContrato;
    private Date dataContrato;
    private Double valorTotal;



    List<Prestacao> dadosPrestacoes = new ArrayList<>();

    public Contrato(Integer numeroContrato, Date dataContrato, Double valorTotal) {
        this.numeroContrato = numeroContrato;
        this.dataContrato = dataContrato;
        this.valorTotal = valorTotal;
    }

    public Integer getNumeroContrato() {
        return numeroContrato;
    }

    public void setNumeroContrato(Integer numeroContrato) {
        this.numeroContrato = numeroContrato;
    }

    public Date getDataContrato() {
        return dataContrato;
    }

    public void setDataContrato(Date dataContrato) {
        this.dataContrato = dataContrato;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public List<Prestacao> getDadosPrestacoes() {
        return dadosPrestacoes;
    }

    public void adicionarListaPrestacoes(Prestacao dadosPrest){
        dadosPrestacoes.add(dadosPrest);
    }

    public void removerListaPrestacoes(Prestacao dadosPrest){
        dadosPrestacoes.remove(dadosPrest);
    }
}
