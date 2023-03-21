import java.util.*;

public class DuplicadosNao {
    public static void main(String[] args) {
        List<String> array1 = new ArrayList<>(List.of("Morango", "Uva", "Acerola", "Manga", "Pitomba"));
        List<String> array2 = new ArrayList<>(List.of("Pera", "Caju", "Pitomba", "Morango", "Kiwi", "Cajá", "Morango"));

        List<String> result = new ArrayList<>();
        
        for (int i = 0; i < array1.size(); i++) {
            if (array2.contains(array1.get(i))) {
                result.add(array1.get(i));
            }
        }
        System.out.println(result);

    }
}
