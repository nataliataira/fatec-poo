public class Medico extends Funcionario
{
    private String crm;
    private String especialidade;

    public Medico() {}

    public Medico(long codigo, String nome, String crm, String telefone, String especialidade, String senha) throws Exception {
        setCodigo(codigo);
        setNome(nome);
        setCrm(crm);
        setTelefone(telefone);
        setEspecialidade(especialidade);
        setSenha(senha);
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void mostrar()
    {
        System.out.println("Medico>>>>>>>>>>");
        System.out.println("codigo:"+ getCodigo());
        System.out.println("nome:"+ getNome());
        System.out.println("crm:"+ getCrm());
        System.out.println("telefone:"+ getTelefone());
        System.out.println("especialidade:"+ getEspecialidade());
        System.out.println("senha:"+ getSenha());
    }

    @Override
    public void acessar() {
        super.acessar();
        System.out.println("crm: " + getCrm());
        System.out.println("especialidade: " + getEspecialidade());
    }
}
