/* Desafio
Você deve fazer a leitura de 5 valores inteiros. Em seguida mostre quantos valores informados são pares, quantos valores informados são ímpares, quantos valores informados são positivos e quantos valores informados são negativos. Considere que o número zero é positivo, mas não pode ser considerado como positivo ou negativo.

Entrada
Você receberá 5 valores inteiros.

Saída
Exiba a mensagem conforme o exemplo de saída abaixo, sendo uma mensagem por linha e não esquecendo o final de linha após cada uma.

 
Exemplo de Entrada	Exemplo de Saída
-5
0
-3
-4
12

3 par(es)
2 impar(es)
1 positivo(s)
3 negativo(s)
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AnaliseNumeros {
    public static void main(String[] args) throws IOException {
        String linha;
        int Pos, Neg, Par, Impar, num;
        
        Pos = Neg = Par = Impar = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            linha = br.readLine();
            num = Integer.parseInt(linha);
            
          // % 2 múltiplos de 2 
          
            if (num % 2 == 0) {
                Par++;
            } else {
                Impar++;
            }
            
              if (num > 0) Pos++;
              if (num < 0) Neg++;
        }
        // não funcionou com a string "valor(es)", mas excluindo o teste foi executado normalmente
      
        System.out.println("" + Par +" par(es)");
        System.out.println("" + Impar + " impar(es)");
        System.out.println("" + Pos + " positivo(s)");
        System.out.println("" + Neg + " negativo(s)");
    }
}
