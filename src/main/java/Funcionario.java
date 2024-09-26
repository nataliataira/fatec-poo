public abstract class Funcionario
{
    private long codigo;
    private String nome;
    private String telefone;
    private String senha;

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
}
