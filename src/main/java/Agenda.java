public class Agenda
{
    private long codigo;
    private String data;
    private String hora;
    private String medico;
    private String paciente;

    public Agenda() {}

    public Agenda(long codigo, String data, String hora, String medico, String paciente) {
        setCodigo(codigo);
        setData(data);
        setHora(hora);
        setMedico(medico);
        setPaciente(paciente);
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
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

    public void consultar()
    {
        //TODO
    }

    public void mostrar()
    {
        System.out.println("Agenda>>>>>>>>>>");
        System.out.println("codigo:"+ getCodigo());
        System.out.println("data:"+ getData());
        System.out.println("hora:"+ getHora());
        System.out.println("medico:"+ getMedico());
        System.out.println("paciente:"+ getPaciente());
    }
}
