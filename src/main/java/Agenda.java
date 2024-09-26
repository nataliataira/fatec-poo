public class Agenda
{
    private long codigo;
    private String data;
    private String hora;
    private Medico medico;
    private Paciente paciente;

    public Agenda() {}

    public Agenda(long codigo, String data, String hora, Medico medico, Paciente paciente) throws Exception   {
        setCodigo(codigo);
        setData(data);
        setHora(hora);
        setMedico(medico);
        setPaciente(paciente);
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) throws Exception{
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

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
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
        getMedico().mostrar();
        getPaciente().mostrar();
    }

    public void acessar()
    {
        System.out.println("Agenda da clinica");
        System.out.println("data: " + getData());
        System.out.println("hora: " + getHora());
        System.out.println("medico: " + getMedico());
        System.out.println("paciente: " + getPaciente());
    }
}
