import java.util.List;

public class Consulta extends Agenda
{
    private String motivo;
    private String historico;
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

    @Override
    public void acessar() {
        super.acessar();
        System.out.println("motivo da consulta: " + getMotivo());
        System.out.println("histórico do paciente: " + getHistorico());
        System.out.println("motivo da consulta: " + getMotivo());
        for (Receita rec: getReceitas()) {
             rec.mostrar();
        }
        for (Exame exam: getExames()) {
            exam.mostrar();
        }
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
        for (Receita rec: getReceitas()) {
            rec.mostrar();
        }
        for (Exame exam: getExames()) {
            exam.mostrar();
        }
    }
}
