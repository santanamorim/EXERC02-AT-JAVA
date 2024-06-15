abstract class Colaborador {
    protected int id;
    protected String nome;
    protected String telefone;
    protected double salario;

    public Colaborador(int id, String nome, String telefone, double salario) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public abstract double calcularSalario();

    public void exibirInformacoes() {
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + telefone);
        System.out.println("Salário Base: " + salario);
    }
}

class Funcionario extends Colaborador {
    public Funcionario(int id, String nome, String telefone, double salario) {
        super(id, nome, telefone, salario);
    }

    @Override
    public double calcularSalario() {
        return salario;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Salário Calculado: " + calcularSalario());
    }
}

class Vendedor extends Colaborador {
    private double comissao;

    public Vendedor(int id, String nome, String telefone, double salario, double comissao) {
        super(id, nome, telefone, salario);
        this.comissao = comissao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        return salario + comissao;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Comissão: " + comissao);
        System.out.println("Salário Calculado: " + calcularSalario());
    }
}

class Gerente extends Colaborador {
    private double bonus;

    public Gerente(int id, String nome, String telefone, double salario, double bonus) {
        super(id, nome, telefone, salario);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario() {
        return salario + bonus;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Bônus: " + bonus);
        System.out.println("Salário Calculado: " + calcularSalario());
    }
}

public class Main {
    public static void main(String[] args) {
        Colaborador[] colaboradores = new Colaborador[3];

        colaboradores[0] = new Funcionario(1, "Alice", "1111-1111", 3000.00);
        colaboradores[1] = new Vendedor(2, "Bob", "2222-2222", 2500.00, 500.00);
        colaboradores[2] = new Gerente(3, "Carlos", "3333-3333", 4000.00, 1000.00);

        for (Colaborador colaborador : colaboradores) {
            colaborador.exibirInformacoes();
            System.out.println();
        }
    }
}
