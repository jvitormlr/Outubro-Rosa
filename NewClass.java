import java.util.Scanner;

public class NewClass {
  public static void main(String[] args) {   

      Scanner entrada = new Scanner(System.in);
      
      int opcao;
      int resposta;
      
      System.out.println("--------------------------------");
      System.out.println("    ASSISTENTE OUTUBRO ROSA");
      System.out.println("--------------------------------");

      System.out.println("1 - Sinais de Alerta");
      System.out.println("2 - Prevenção e cuidados");
      System.out.println("3 - Quando procurar atendimento");
      System.out.println("4 - Mitos e verdades");
      System.out.println("5 - Quiz Outubro Rosa");
      System.out.println("6 - Sair");
      System.out.println("Escolha uma opção: ");
      
      opcao = entrada.nextInt();
           
      if (opcao == 1) {
          
      System.out.println("\nSINAIS DE ALERTA");
      System.out.println("- Caroço persistente na mama");
      System.out.println("- Alterações na pele");
      System.out.println("- Mudanças no mamilo");
      System.out.println("- Secreção espontânea");
      System.out.println("- Nem toda a alteração significa cancer");

      }else if (opcao == 2) {

      System.out.println("\nPREVENÇÃO E CUIDADOS");      
      System.out.println("Pratique atividade fisica.");
      System.out.println("Mantenha uma alimentação equilibrada.");
      System.out.println("Evite o tabagismo.");
      System.out.println("Siga as orientações de serviço de saúde.");
      
      }else if (opcao == 3) {
          
      System.out.println("\nQUANDO PROCURAR ATENDIMENTO");
      System.out.println("- Alteração persistente por mais de 2 semanas");
      System.out.println("- Nódulo endurecido, fixo e indolor");
      System.out.println("- Secreção com sangue pelo mamilo");
      System.out.println("- Pele com aspecto de casca de laranja");
      System.out.println("- Inversão ou retração súbita do mamilo");
      System.out.println("- Nódulo na axila sem causa aparente");
      System.out.println("- Procure um mastologista sem demora");   

      } else if (opcao == 4) {
          
      System.out.println("\n===== MITOS E VERDADES =====\n");

      System.out.println("1. Usar desodorante causa câncer de mama.");
      System.out.println("   -> MITO. Não há evidência científica que comprove.");

      System.out.println("\n2. Sutiã apertado causa câncer de mama.");
      System.out.println("   -> MITO. O tamanho ou o tipo de sutiã não influenciam.");

      System.out.println("\n3. Amamentar reduz o risco de câncer de mama.");
      System.out.println("   -> VERDADE. A amamentação diminui o risco em até 4%.");

      System.out.println("\n4. Homens também podem ter câncer de mama.");
      System.out.println("   -> VERDADE. Representa cerca de 1% dos casos.");

      System.out.println("\n5. Ter câncer na família garante que você vai ter.");
      System.out.println("   -> MITO. Aumenta o risco, mas não é certeza.");

      System.out.println("\n6. Mamas pequenas têm mais chance de ter câncer.");
      System.out.println("   -> MITO. O tamanho da mama não influencia o risco.");

      System.out.println("\n7. O autoexame substitui o exame clínico e a mamografia.");
      System.out.println("   -> MITO. O autoexame é complementar, não substituto.");

      }else if (opcao == 5) {   

      System.out.println("\nQUIZ OUTUBRO ROSA");
      
      System.out.println("1 - Usar desodorante antitranspirante causa câncer de mama?");
      System.out.println("1) SIM  2) NÃO");      
      
      resposta = entrada.nextInt();
      
      if (resposta == 2) {
      System.out.println("Resposta certa!");
      
      } else if (resposta == 1) {
      System.out.println("Resposta errada!");
      
      } else {
      System.out.println("Resposta invalida");
      
      }
      System.out.println("2 - Homens podem ter câncer de mama?");
      System.out.println("1) SIM  2) NÃO");
      resposta = entrada.nextInt();
      
      if (resposta == 1) {
      System.out.println("Resposta certa!");
      
    } else if (resposta == 2) {
      System.out.println("Resposta errada!");
      
    } else {
      System.out.println("Resposta inválida!");
    
    }
    
    System.out.println("3 - Todo caroço encontrado na mama é câncer?");
    System.out.println("1) SIM  2) NÃO");
    resposta = entrada.nextInt();
    
     if (resposta == 2) {
     System.out.println("Resposta certa!");
     
    } else if (resposta == 1) {
    System.out.println("Resposta errada!");
    
    } else {
    System.out.println("Resposta inválida!");
    }
    
    } else if (opcao == 6) {
    System.out.println("Até mais! Cuide-se. 🎀");
    
    } else {
    System.out.println("Opção inválida. Tente novamente.");
    
    
    }while (opcao != 6);
  
    entrada.close();
      
      }}

      