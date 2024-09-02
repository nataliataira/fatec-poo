public class Consulta
{
    private String data;
    private String hora;
    private String medico;
    private String paciente;
    private String motivo;
    private String historico;

    public Consulta(String data, String hora, String medico, String paciente, String motivo, String historico) {
        setData(data);
        setHora(hora);
        setMedico(medico);
        setPaciente(paciente);
        setMotivo(motivo);
        setHistorico(historico);
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

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
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
        System.out.println("data:"+ getData());
        System.out.println("hora:"+ getHora());
        System.out.println("medico:"+ getMedico());
        System.out.println("paciente:"+ getPaciente());
        System.out.println("motivo:"+ getMotivo());
        System.out.println("historico:"+ getHistorico());
    }
}
