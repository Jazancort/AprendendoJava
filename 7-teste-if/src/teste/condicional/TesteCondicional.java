package teste.condicional;

/**
 *
 * @author julio
 */
public class TesteCondicional {

    public static void main(String[] args) {
        System.out.println("Testando condicionais");
        int idade = 17;
        int quantidadedePessoas = 3;
        
        if(idade >= 18){
            System.out.println("Você é maior de idade");
            System.out.println("Bem vindo!");
        } else {
            if (quantidadedePessoas >= 2) {
                System.out.println("Você não tem 18, mas pode entrar, pois esta acompanhado");
            } else {
            System.out.println("Infelizmente você não pode entrar, devido a sua idade!");
            }
        }
        
    }
    
}
