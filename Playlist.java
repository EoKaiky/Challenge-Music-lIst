import java.util.ArrayList;

public class Playlist {
  public static void main(String[] args) {
    ArrayList<String> listaParaIlhaDeserta = new ArrayList<>();
    
    // Adicionando músicas à lista
    listaParaIlhaDeserta.add("Preferida");
    listaParaIlhaDeserta.add("C'EST LA VIE");
    listaParaIlhaDeserta.add("Sementinha do Mal");
    listaParaIlhaDeserta.add("Slow Jam");
    listaParaIlhaDeserta.add("ENERGY");
    listaParaIlhaDeserta.add("Scarsito");
    
    // Imprimindo a lista completa
    System.out.println("Minha lista de músicas para a ilha deserta: " + listaParaIlhaDeserta);
    
    // Verificando o número de músicas na lista
    System.out.println("Número de músicas na lista: " + listaParaIlhaDeserta.size());
    
    // Removendo músicas para ter apenas cinco
    while (listaParaIlhaDeserta.size() > 5) {
      listaParaIlhaDeserta.remove(0);
    }
    
    // Imprimindo a lista com apenas cinco músicas
    System.out.println("Minha lista de músicas para a ilha deserta, reduzida: " + listaParaIlhaDeserta);
    
    // Trocando a posição de duas músicas
    int indiceA = listaParaIlhaDeserta.indexOf("Slow Jam");
    int indiceB = listaParaIlhaDeserta.indexOf("ENERGY");
    System.out.println("Índice de Slow Jam: " + indiceA);
    System.out.println("Índice de ENERGY: " + indiceB);
    
    String tempA = listaParaIlhaDeserta.get(indiceA);
    listaParaIlhaDeserta.set(indiceA, listaParaIlhaDeserta.get(indiceB));
    listaParaIlhaDeserta.set(indiceB, tempA);
    
    // Imprimindo a lista com as músicas trocadas
    System.out.println("Minha lista de músicas para a ilha deserta, com as músicas trocadas: " + listaParaIlhaDeserta);
  }
}