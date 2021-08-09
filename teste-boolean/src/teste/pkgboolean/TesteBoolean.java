package teste.pkgboolean;

/**
 *
 * @author julio
 */
public class TesteBoolean {
    public static void main(String[] args) {
        System.out.println("Testando condicionais");
        int idade = 14;
        boolean acompanhado = true;
        
        if (idade >= 18 || acompanhado) {
            System.out.println("Bem vindo!");
        } else {
            System.out.println("Infelizmente, voce não pode entrar");
        }
    }
    
}
