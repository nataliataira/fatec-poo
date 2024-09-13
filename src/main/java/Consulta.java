import java.util.List;

public class Consulta
{
    private long codigo;
    private String data;
    private String hora;
    private Medico medico;
    private Paciente paciente;
    private String motivo;
    private String historico;
    private Agenda agenda;
    private List<Receita> receitas;
    private List<Exame> exames;

    public Consulta() {}


    public Consulta(long codigo, String data, String hora, Medico medico, Paciente paciente, String motivo, String historico) throws Exception {
        setCodigo(codigo);
        setData(data);
        setHora(hora);
        setMedico(medico);
        setPaciente(paciente);
        setMotivo(motivo);
        setHistorico(historico);
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) throws Exception {
        if (codigo <= 0) {
            throw new Exception("Código não pode ser menor ou igual a zero.");
        } else {
            this.codigo = codigo;
        }
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) throws Exception {
            this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public Agenda getAgenda() {
        return agenda;
    }

    public void setAgenda(Agenda agenda) {
        this.agenda = agenda;
    }

    public List<Receita> getReceitas() {
        return receitas;
    }

    public void setReceitas(List<Receita> receitas) {
        this.receitas = receitas;
    }

    public List<Exame> getExames() {
        return exames;
    }

    public void setExames(List<Exame> exames) {
        this.exames = exames;
    }

    public void marcar()
    {
        //TODO
    }

    public void cancelar()
    {
        //TODO
    }

    public void consultar()
    {
        //TODO
    }

    public void realizar()
    {
        //TODO
    }

    public void atualizar()
    {
        //TODO
    }

    public void mostrar()
    {
        System.out.println("Consulta>>>>>>>>>>");
        System.out.println("codigo:"+ getCodigo());
        System.out.println("data:"+ getData());
        System.out.println("hora:"+ getHora());
        getMedico().mostrar();
        getPaciente().mostrar();
        System.out.println("motivo:"+ getMotivo());
        System.out.println("historico:"+ getHistorico());
        System.out.println("histórico: "+getHistorico());
        for (Receita rec: getReceitas()) {
            rec.mostrar();
        }
        for (Exame exam: getExames()) {
            exam.mostrar();
        }
    }
}
