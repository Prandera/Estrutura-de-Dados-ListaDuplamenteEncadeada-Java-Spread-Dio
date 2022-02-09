package one.digitalinnovation;

public class main {
    public static void main(String[] args) {

        ListaDuplamenteEncadeada<String> minhaLista = new ListaDuplamenteEncadeada<>();

        minhaLista.add("Teste1");
        minhaLista.add("Teste2");
        minhaLista.add("Teste3");
        minhaLista.add("Teste4");
        minhaLista.add("Teste5");
        minhaLista.add("Teste6");
        minhaLista.add("Teste7");

        System.out.println(minhaLista);

        minhaLista.remove(3); //Teste4 será removido.
        minhaLista.add(3,"Teste99");

        System.out.println(minhaLista);
        System.out.println(minhaLista.get(3));
    }
}
