public abstract class Procedimento {
    private long codigo;
    private String data;
    protected String descritivo;

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

    public String getDescritivo() {
        return descritivo;
    }

    public void setDescritivo(String descritivo) {
        this.descritivo = descritivo;
    }

    public void consultar()
    {
        System.out.println("data: " + getData());
        System.out.println("descritivo: " + getDescritivo());
    }
}
