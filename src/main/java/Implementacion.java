import java.util.ArrayList;

public class Implementacion {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("hola");
        lista.add("como");
        lista.add("estas?");
        ArrayList<String> nuevaLista = new ArrayList<>();

        Convertir aMayusculas = (list) -> {
            for (String elemento : list) {
                elemento = elemento.toUpperCase();
                nuevaLista.add(elemento);
            }
          return nuevaLista;
        };

        System.out.println("Lista original");
        for (String elemento : lista) {
            System.out.println(elemento);
        }
        System.out.println();
        System.out.println("Lista convertida");
        for (String elemento: aMayusculas.convertir(lista)) {
            System.out.println(elemento);
        }
    }
}
