package m05_orientacaoaobjeto.ApiDatas;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DiferecaEntreDatas {
    
    public static void main(String[] args) {

        LocalDate hoje = LocalDate.now();

        DateTimeFormatter formatoBr = DateTimeFormatter.ofPattern("dd/MM/uuuu");

        System.out.println(hoje.plusDays(10).format(formatoBr));

        LocalDate diaDoPagamento = LocalDate.of(2024, Month.AUGUST, 7);

        System.out.println(hoje.until(diaDoPagamento, ChronoUnit.DAYS));

    }
}
