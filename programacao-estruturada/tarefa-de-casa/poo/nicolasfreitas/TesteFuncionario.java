import java.math.BigDecimal;
import java.time.LocalDate;

public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario01 = new Funcionario();
        Funcionario funcionario02 = new Funcionario("Fernando Silva", LocalDate.of(1999, 05, 22), new BigDecimal(4000),
                "Desenvolvedor Frontend Pleno", LocalDate.of(2020, 10, 15));

        funcionario01.setNome("Lucas dos Santos");
        funcionario01.setDataNascimento(LocalDate.of(1996, 11, 21));
        funcionario01.setSalario(new BigDecimal(3200));
        funcionario01.setCargo("Jornalista");
        funcionario01.setDataAdmissao(LocalDate.of(2022, 03, 17));

        System.out.println(funcionario01);
        System.out.println(funcionario02);
    }
}
