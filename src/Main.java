import java.util.*;

public class Main {
    public static void main(String ... args){
        // ArrayList es mejor para almacenar y ver datos.
        // Notación de la Big O: O(1)
        // Utilizamos ArrayList SI contiene valores duplicados y su tarea principal no es buscar elementos.
        System.out.println("ARRAYLIST:");
        ArrayList<String> frutasEnArrayList = new ArrayList<String>(2);
        frutasEnArrayList.add("Sandía");
        frutasEnArrayList.add("Melón");
        frutasEnArrayList.add("Pitaya");
        frutasEnArrayList.add("Naranja");
        frutasEnArrayList.add("Naranja");
        frutasEnArrayList.add("Aguacate");

        System.out.println("Las frutas son: " + frutasEnArrayList);
        System.out.println("Reemplazamos a la fruta en la posición 0 con Mandarina: " + frutasEnArrayList.set(0, "Mandarina"));
        System.out.println("Y quitaremos la que está en la posición 1: " + frutasEnArrayList.remove(1));
        System.out.println("La lista actual de frutas es: ");
        for (String fruta:
                frutasEnArrayList) {
            System.out.println(fruta);
        }
        System.out.println();
        System.out.println("Ordenadas alfabéticamente: ");
        Collections.sort(frutasEnArrayList);
        for (int i = 0; i < frutasEnArrayList.size(); i++) {
            System.out.println(frutasEnArrayList.get(i));
        }

        System.out.println();

        // Utilizamos HashSet cuando la tarea principal es buscar elementos, el orden no es importante
        // y NO tiene elementos duplicados
        // HashSet almacena element utilizando el mecanismo de Hashing.
        // Solo contiene elementos únicos.
        // Permite valores nulos.
        // No es una clase sincronizada.
        // No mantiene el orden de inserción. Los elementos son insertados en base a su HASHCODE.
        // ES LA MEJOR OPCIÓN PARA LAS OPERACIONES DE BÚSQUEDA.
        // La capacidad por defecto de HashSet es 16, factor de carga de 0.75
        System.out.println("HASHSET:");
        HashSet<String> frutasEnHashSet = new HashSet<>(2);
        frutasEnHashSet.add("Sandía");
        frutasEnHashSet.add("Melón");
        frutasEnHashSet.add("Pitaya");
        frutasEnHashSet.add("Naranja");
        frutasEnHashSet.add("Naranja");
        frutasEnHashSet.add("Aguacate");

        System.out.println("Las frutas son: " + frutasEnHashSet);
        System.out.println("Y quitaremos la Sandía: " + frutasEnHashSet.remove("Sandía"));
        System.out.println("La lista actual de frutas es: ");
        Iterator<String> iterator = frutasEnHashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println();

        // Utilizamos LinkHashSet cuando NO necesitamos valores duplicados,
        // la tarea principal es buscar elementos, el orden es importante en base a la INSERCIÓN.
        System.out.println("LINKEDHASHSET:");
        LinkedHashSet<String> frutasEnLinkedHashSet = new LinkedHashSet<>(2);
        frutasEnLinkedHashSet.add("Sandía");
        frutasEnLinkedHashSet.add("Melón");
        frutasEnLinkedHashSet.add("Pitaya");
        frutasEnLinkedHashSet.add("Naranja");
        frutasEnLinkedHashSet.add("Naranja");
        frutasEnLinkedHashSet.add("Aguacate");

        System.out.println("Las frutas son: " + frutasEnLinkedHashSet);
        System.out.println("Y quitaremos la Sandía: " + frutasEnLinkedHashSet.remove("Sandía"));
        System.out.println("La lista actual de frutas es: ");
        for (String fruta:
                frutasEnLinkedHashSet) {
            System.out.println(fruta);
        }
        System.out.println();

        // Utilizamos TreeSet cuando NO necesitamos valores duplicados,
        // la tarea principal es buscar elementos, el orden es importante en base a la ORDENACIÓN.
        System.out.println("TREESET:");
        TreeSet<String> frutasEnTreeSet = new TreeSet<>();
        frutasEnTreeSet.add("Sandía");
        frutasEnTreeSet.add("Melón");
        frutasEnTreeSet.add("Pitaya");
        frutasEnTreeSet.add("Naranja");
        frutasEnTreeSet.add("Naranja");
        frutasEnTreeSet.add("Aguacate");

        System.out.println("Las frutas son: " + frutasEnTreeSet);
        System.out.println("Y quitaremos la Sandía: " + frutasEnTreeSet.remove("Sandía"));
        System.out.println("La lista actual de frutas es: ");
        iterator = frutasEnTreeSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
