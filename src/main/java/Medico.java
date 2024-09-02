public class Medico
{
    private String nome;
    private String crm;
    private String telefone;
    private String senha;

    public Medico(String nome, String crm, String telefone, String senha) {
        setNome(nome);
        setCrm(crm);
        setTelefone(telefone);
        setSenha(senha);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void acessar()
    {
        //TODO
    }

    public void mostrar()
    {
        System.out.println("Medico>>>>>>>>>>");
        System.out.println("nome:"+ getNome());
        System.out.println("crm:"+ getCrm());
        System.out.println("telefone:"+ getTelefone());
        System.out.println("senha:"+ getSenha());
    }
}
