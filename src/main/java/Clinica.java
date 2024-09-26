public class Clinica
{
    public static void main(String[] args)
    {
        try {
            Paciente pac = new Paciente(12, "Carlos Silva", "125846998-74", "1122223333", "M", 22);
            pac.mostrar();

            Medico med = new Medico(23, "Jorge Pereira", "1174254-4", "119852564", "cardiologista","lsilva@330");
            med.mostrar();

            Recepcionista recep = new Recepcionista(22, "Claudio Medeiros", "125774985-66", "11988579684", "claudio7866");
            recep.mostrar();

            Agenda hoje = new Agenda(34, "26/09/2024", "21:09", med, pac);
            hoje.mostrar();

            Consulta cons = new Consulta(11, "26/09/2024","08:30",med, pac,"dor de cabeça", "enxaqueca crônica");
            cons.mostrar();

            Exame hemograma = new Exame(101 , cons,  "26/09/2024", "Baixa contagem de hemácias: anemia");
            hemograma.mostrar();

            Receita r1 = new Receita(13, cons, "26/09/2024", "Tomar dramin b6 e suplemento de Ferro 100mg");
            r1.mostrar();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
