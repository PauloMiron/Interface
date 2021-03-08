import Entities.Contrato;
import Entities.Prestacao;
import Services.ContratoServico;
import Services.PagamentoServico;
import Services.ServicoDePagamentoOnline;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


        System.out.println("Dados do Contrato");
        System.out.print("Numero Contrato    ");
        Integer numeroContrato = scanner.nextInt();
        System.out.print("Data Contrato dd/mm/yyyy  ");
        Date dataContrato = sdf.parse(scanner.next());
        System.out.print("Valor Contrato  ");
        Double valorContrato = scanner.nextDouble();

        Contrato contrato = new Contrato(numeroContrato, dataContrato,valorContrato);

        System.out.println("Quantidade de Parcelas");
        int N = scanner.nextInt();

        ContratoServico contratoServico = new ContratoServico(new PagamentoServico());

        contratoServico.ProcessarContrato(contrato,N);

        System.out.println("Prestações");
        for (Prestacao prest : contrato.getDadosPrestacoes()){
            System.out.println(prest);
        }






    }
}
