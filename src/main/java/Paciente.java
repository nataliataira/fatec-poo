public class Paciente
{
    private long codigo;
    private String nome;
    private String cpf;
    private String telefone;
    private String genero;
    private int idade;

    public Paciente() {}

    public Paciente(long codigo, String nome, String cpf, String telefone, String genero, int idade) throws Exception{
        setCodigo(codigo);
        setNome(nome);
        setCpf(cpf);
        setTelefone(telefone);
        setGenero(genero);
        setIdade(idade);
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) throws Exception
    {
        if (codigo <= 0) {
            throw new Exception("Código não pode ser menor ou igual a zero.");
        } else {
            this.codigo = codigo;
        }
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome) throws Exception
    {
        if (nome.isEmpty()) {
            throw new Exception("O nome deve ser preenchido.");
        } else if (nome.length() > 100) {
            throw new Exception("Nome deve ter entre 1 e 100 caracteres.");
        } else {
            this.nome = nome;
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) throws Exception {
        if (cpf.isEmpty() || cpf.length() < 11) {
            throw new Exception("O CPF deve conter 11 dígitos.");
        } else {
            this.cpf = cpf;
        }
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) throws Exception {
        if (idade < 9 || idade > 110) {
            throw new Exception("Idade inválida");
        } else {
            this.idade = idade;
        }
    }

    public void cadastrar()
    {
        //TODO
    }

    public void consultar()
    {
        //TODO
    }

    public void mostrar()
    {
        System.out.println("Paciente>>>>>>>>>>");
        System.out.println("codigo:"+ getCodigo());
        System.out.println("nome:"+ getNome());
        System.out.println("cpf:"+ getCpf());
        System.out.println("telefone:"+ getTelefone());
        System.out.println("genero:"+ getGenero());
        System.out.println("idade:"+ getIdade());
    }
}
