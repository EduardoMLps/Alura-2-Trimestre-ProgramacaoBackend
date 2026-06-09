public class Gerente extends FuncionarioAutenticavel {

    public double getBonificacao() {
        return 100 + super.getSalario();
    }

    
}
