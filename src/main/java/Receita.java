public class Receita
{
    private long codigo;
    private Consulta consulta;
    private String data;
    private String descritivo;

    public Receita() {}

    public Receita(Consulta consulta, String data, String descritivo) throws Exception {
        setCodigo(codigo);
        setConsulta(consulta);
        setData(data);
        setDescritivo(descritivo);
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

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDescritivo() {
        return descritivo;
    }

    public void setDescritivo(String descritivo) {
        this.descritivo = descritivo;
    }

    public void preescrever()
    {
        //TODO
    }

    public void consultar()
    {
        //TODO
    }

    public void mostrar()
    {
        System.out.println("Receita>>>>>>>>>>");
        System.out.println("codigo:"+ getCodigo());
        System.out.println("consulta:"+ getConsulta());
        System.out.println("data:"+ getData());
        System.out.println("descritivo:"+ getDescritivo());
    }
}
