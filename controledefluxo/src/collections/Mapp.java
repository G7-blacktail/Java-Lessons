package collections;

import java.util.HashMap;
import java.util.Map;

public class Mapp {

  public static void main(String[] args) {
    Map<String, Integer> campeoesMudialFifa = new HashMap<>();

    // adicionar os campeões mundias fifa no mapa
    campeoesMudialFifa.put("Brasil", 5);
    campeoesMudialFifa.put("Alemanha", 4);
    campeoesMudialFifa.put("Itália", 4);
    campeoesMudialFifa.put("Uruguai", 2);
    campeoesMudialFifa.put("Argentina", 2);
    campeoesMudialFifa.put("França", 2);
    campeoesMudialFifa.put("Inglaterra", 1);
    campeoesMudialFifa.put("Espanha", 1);

    System.out.println(campeoesMudialFifa);

    // atualizar o valor para a chave Brasil
    campeoesMudialFifa.put("Brasil", 6);

    System.out.println(campeoesMudialFifa);

    // Retorna a Argentina
    System.out.println(campeoesMudialFifa.get("Argentina"));

    // Retorna se existe ou não um campeão França (Boolean)
    System.out.println(campeoesMudialFifa.containsKey("França"));

  }

}
