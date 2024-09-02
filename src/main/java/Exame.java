public class Exame
{
    private long codigo;
    private String consulta;
    private String data;
    private String descritivo;

    public Exame() {}

    public Exame(String consulta, String data, String descritivo) {
        setCodigo(codigo);
        setConsulta(consulta);
        setData(data);
        setDescritivo(descritivo);
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getConsulta() {
        return consulta;
    }

    public void setConsulta(String consulta) {
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

    public void solicitar()
    {
        //TODO
    }

    public void consultar()
    {
        //TODO
    }

    public void mostrar()
    {
        System.out.println("Exame>>>>>>>>>>");
        System.out.println("codigo:"+ getCodigo());
        System.out.println("consulta:"+ getConsulta());
        System.out.println("data:"+ getData());
        System.out.println("descritivo:"+ getDescritivo());
    }
}
