public class SistemaInterno {
    private int senha = 2222;

    public void autentica(FuncionarioAutenticavel f) {
        if (f.autentifica(this.senha)) {
            System.out.println("Pode entrar");
        } else {
            System.out.println("Não pode entrar");
        }
    }
}
