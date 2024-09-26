public class Recepcionista extends Funcionario
{
    private String cpf;

    public Recepcionista() {}

    public Recepcionista(long codigo, String nome, String cpf, String telefone, String senha) throws Exception
    {
        setCodigo(codigo);
        setNome(nome);
        setCpf(cpf);
        setTelefone(telefone);
        setSenha(senha);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) throws Exception {
        if (cpf.length() != 11) {
            throw new Exception("O CPF deve conter 11 dígitos.");
        } else {
            this.cpf = cpf;
        }
    }

    public void mostrar(){
        System.out.println("RECEPCIONISTA>>>>>>>>>>>>>>>>");
        System.out.println("codigo:"+ getCodigo());
        System.out.println("nome:"+ getNome());
        System.out.println("cpf:"+ getCpf());
        System.out.println("telefone:"+ getTelefone());
        System.out.println("senha:"+ getSenha());
    }

    public  void acessar(){
        //todo
    }

    public void consultar() throws Exception {
        //todo
    }
}
