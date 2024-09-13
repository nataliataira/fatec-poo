public class Medico
{
    private long codigo;
    private String nome;
    private String crm;
    private String telefone;
    private String especialidade;
    private String senha;

    public Medico() {}

    public Medico(long codigo, String nome, String crm, String telefone, String especialidade, String senha) throws Exception {
        setCodigo(codigo);
        setNome(nome);
        setCrm(crm);
        setTelefone(telefone);
        setEspecialidade(especialidade);
        setSenha(senha);
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        if (nome.isEmpty()) {
            throw new Exception("O nome deve ser preenchido.");
        } else if (nome.length() > 100) {
            throw new Exception("Nome deve ter entre 1 e 100 caracteres.");
        } else {
            this.nome = nome;
        }
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

    public void setTelefone(String telefone) throws Exception {
        if (!telefone.matches("[0-9]+")) {
            throw new Exception("O telefone não deve conter letras.");
        } else {
            this.telefone = telefone;
        }
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getSenha() {
        return "*****";
    }

    public void setSenha(String senha) throws Exception{
        if (senha.length() < 5) {
            throw new Exception("Senha muito curta.");
        } else {
            this.senha = telefone;
        }
    }

    public void acessar()
    {
        //TODO
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
}
