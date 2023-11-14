import java.util.ArrayList;
import java.util.stream.Collectors;

public class Actividad_2 {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("hola");
        lista.add("como");
        lista.add("estas?");

        DividirPalabras dividir = (list, num) ->{
            String palabra = "";
            palabra = list.stream().filter(word -> word.length() == num).collect(Collectors.joining(", "));
            return palabra;
        };

        System.out.println(dividir.palabras(lista, 4));

    }
}
