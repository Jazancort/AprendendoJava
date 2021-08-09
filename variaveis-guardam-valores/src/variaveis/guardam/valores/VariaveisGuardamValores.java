package variaveis.guardam.valores;

/**
 *
 * @author julio
 */
public class VariaveisGuardamValores {
    public static void main(String[] args) {
        int primeiro = 5;
        int segundo = 7;
        segundo = primeiro;
        primeiro = 10;
        
        //Quanto vale o segundo?
        System.out.println(segundo);
    }
    
}
