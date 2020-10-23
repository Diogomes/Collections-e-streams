import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploList {
    
    public static void main(String[] args){
        List<String> nomes = new ArrayList<>();
        //Método add adiciona um ítem na lista
            nomes.add("Diogo");
            nomes.add("Azael");
            nomes.add("Elaine");
            nomes.add("Fátima");
            nomes.add("Fabiana");
            nomes.add("Lunna");

            System.out.println(nomes);
            nomes.set(2, "Patricia"); // método set muda e atualiza a lista na posição pedida
            
            System.out.println(nomes);
            
            Collections.sort(nomes);
            
            System.out.println(nomes);
            //método set recebe um inteiro atualiza e ordena

            int tamanho = nomes.size();
            System.out.println(tamanho);

            boolean temDiogo = nomes.contains("Diogo"); // define
            System.out.println(temDiogo); // e faz a busca no ítem


    }
}