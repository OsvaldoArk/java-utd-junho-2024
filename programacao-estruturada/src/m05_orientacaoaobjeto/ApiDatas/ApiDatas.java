package m05_orientacaoaobjeto.ApiDatas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class ApiDatas {
    
    public static void main(String[] args) {
        LocalDateTime dataHorarioAgora = LocalDateTime.now();

        LocalDate dataAgora = LocalDate.now();

        LocalTime horarioAgora = LocalTime.now();

        DateTimeFormatter formatoBr = DateTimeFormatter.ofPattern("dd/MM/uuuu");

        System.out.println(dataHorarioAgora.getDayOfWeek());
        System.out.println(dataAgora.format(formatoBr));
        System.out.println(horarioAgora);
    }
}
