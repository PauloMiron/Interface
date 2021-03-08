package Services;

import Entities.Contrato;
import Entities.Prestacao;

import java.util.Calendar;
import java.util.Date;

public class ContratoServico {

    private ServicoDePagamentoOnline servicoDePagamentoOnline;

    public ContratoServico(ServicoDePagamentoOnline servicoDePagamentoOnline) {
        this.servicoDePagamentoOnline = servicoDePagamentoOnline;
    }

    public void ProcessarContrato(Contrato contrato, Integer mes){
        double parcelaNormal = contrato.getValorTotal() / mes;
        for (int i = 1; i <= mes; i++){
            Date date = addMes(contrato.getDataContrato(),i);
            double parcelaComjuros = parcelaNormal + servicoDePagamentoOnline.Juros(parcelaNormal,i);
            double parcelaTotal = parcelaComjuros + servicoDePagamentoOnline.taxa(parcelaComjuros);
            contrato.adicionarListaPrestacoes(new Prestacao(date,parcelaTotal));

        }

    }

    private Date addMes(Date data, int N){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(data);
        calendar.add(Calendar.MONTH, N);
        return calendar.getTime();

    }
}
