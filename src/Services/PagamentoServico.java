package Services;

public class PagamentoServico implements ServicoDePagamentoOnline{

    @Override
    public Double taxa(Double valor) {
        return valor * 0.02;
    }

    @Override
    public Double Juros (Double valor, Integer mes) {
        return valor * mes * 0.01;

    }
}
