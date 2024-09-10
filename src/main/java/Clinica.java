public class Clinica
{
    public static void main(String[] args)
    {
        try {
            Paciente pNovo = new Paciente(1, "Toninho Sauro", "125846998-74", "1122223333", "M", 22);
            pNovo.mostrar();

            Medico med1 = new Medico(113, "Luke Silva", "1174254-4", "119852564", "cardiologista","lsilva@330");
            med1.mostrar();

            Recepcionista recep1 = new Recepcionista(115, "Claudio Sauro", "125774985-66", "11988579684", "claudio7866");
            recep1.mostrar();

            Agenda hoje = new Agenda(502, "15/08/2024", "21:09", med1, pNovo);
            hoje.mostrar();

            Consulta c1 = new Consulta(656, "16/08/2024","08:30",med1, pNovo,"dor de cabeça", "enxaqueca crônica");
            c1.mostrar();

            Exame hemograma = new Exame(c1, "16/08/2024", "Baixa contagem de hemácias: anemia");
            hemograma.mostrar();

            Receita r1 = new Receita(c1, "16/08/2024", "Tomar dramin b6 e suplemento de Ferro 100mg");
            r1.mostrar();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
