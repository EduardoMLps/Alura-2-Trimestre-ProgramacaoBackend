public abstract class FuncionarioAutenticavel extends Funcionario{
    private int senha;

    public boolean autentifica(int senha) {
        if (senha == this.senha) {
            return true;
        } else {
            return false;
        }
    }
    public void setSenha(int senha) {
        this.senha = senha;
    }
    public int getSenha() {
        return senha;
    }
}
