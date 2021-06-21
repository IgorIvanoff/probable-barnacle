// Direitos Autorais, PUCRS/Escola Politécnica
// 2021-06-11
import java.util.Scanner;
import java.io.IOException;
/**
 * A classe Main permite jogar o jogo do Pontinho entre 2 jogadores.
 * O jogo do pontinho consiste em formar quadrados. Cada quadrado formado é 1 ponto para o jogador.
 * Quadrados são formamos a partir de 04 pontos escolhidos pelo jogador, que devem ser ligados por traços.
 * Nesta versão do jogo, a assimilação dos quadrados é intuitiva em relação aos 4 pontos assinalados em proximidade.
 * Em cada jogada, um jogador representa um traço entre uma linha ou coluna, escolhidas por ele no tabuleiro.
 * Este traço é formado pela inserção de 02 pares de números.
 * As regras do jogo podem ser encontradas na wikipedia:
 * a<https://pt.wikipedia.org/wiki/Timbiriche_(jogo)>
 * 
 * @author Igor Ivanoff (igorlbivanoff@gmail.com)
 * @version 1.6 (2021-06-21)
 */
public class MainApp
{
    /**
     * Cria os laços de processamento do jogo, enquanto estiver rodando, e
     * de reconhecimento de valores de entrada válidos para cada número inserido.
     * Tem as condicionais que identificarão na matriz (classe auxiliar)
     * qual a jogada realizada por cada jogador.
     * Chama os subprogramas da classe auxiliar para identificarem o tabuleiro e os pontinhos marcáveis.
     * @param boolean; o valor lógico identifica se o jogo ainda está em aberto,
     * @param row permite inserir o valor de entrada atribuído para a linha
     * @param column permite inserir o valor de entrada para a coluna
     */

    public static void main(String[] args) throws IOException
    {
        String[][] board;
        String player1;
        String player2;
        boolean done;
        Auxiliar aux = new Auxiliar();
        int row;
        int column;
        Scanner teclado;
        teclado = new Scanner(System.in);
        board = Auxiliar.init();
        player1 = "1| ";
        player2 = "2| ";
        done = false;
        System.out.print("Jogo do Pontinho!\n");
        while (!done)
        {
            Auxiliar.dump(board);
            System.out.println("Jogada do player1");
            System.out.print("ATENÇÃO: informe dois números de uma coordenada cartográfica (4 valores) para formar um traço entre linhas ou colunas)");
            System.out.println("Digite a linha do primeiro ponto para formar o traço");
            row = teclado.nextInt();
            while (!(row >= 0 && row <= 18))
            {
                System.out.print("\tValor Inválido. Digite novamente o valor da linha");
                row = teclado.nextInt();
            }
            System.out.println("Digite a coluna do primeiro valor para formar o traço");
            column = teclado.nextInt();
            while (!(column >= 0 && column <= 18))
            {
                System.out.print("\tValor Inválido. Digite novamente o valor da coluna");
                column = teclado.nextInt();
            }
            if (board[row][column].equals("  "))
            {
                board[row][column] = player1;
                player1 = "1| ";
            }
            while (board[row][column].equals("2| "))
            {
                System.out.println("Ponto já assinalado previamente.");
                System.out.print("Informe outro valor para a linha");
                row = teclado.nextInt();
                while (!(row >= 0 && row <= 18))
                {
                    System.out.print("\tValor Inválido. Digite novamente o valor da linha");
                    row = teclado.nextInt();
                }
                System.out.print("Informe a coluna do segundo valor do traço");
                column = teclado.nextInt();
                while (!(column >= 0 && column <= 18))
                {
                    System.out.print("\tValor Inválido. Digite novamente outro valor para a coluna");
                    column = teclado.nextInt();
                }
            }
            board[row][column] = player1;
            Auxiliar.dump(board);
            System.out.println("Segunda jogada do player1");
            System.out.println("Digite a linha do segundo ponto para formar o traço");
            row = teclado.nextInt();
            while (!(row >= 0 && row <= 18))
            {
                System.out.print("\tValor Inválido. Digite novamente o valor da linha");
                row = teclado.nextInt();
            }
            System.out.println("Digite a coluna do primeiro valor para formar o traço");
            column = teclado.nextInt();
            while (!(column >= 0 && column <= 18))
            {
                System.out.print("\tValor Inválido. Digite novamente o valor da coluna");
                column = teclado.nextInt();
            }
            if (board[row][column].equals("   "))
            {
                board[row][column] = player1;
                player1 = " j1 ";
            }
            while (board[row][column].equals("2| "))
            {
                System.out.println("Ponto já assinalado previamente.");
                System.out.print("Informe outro valor para a linha");
                row = teclado.nextInt();
                while (!(row >= 0 && row <= 18))
                {
                    System.out.print("\tValor Inválido. Digite novamente o valor da linha");
                    row = teclado.nextInt();
                }
                System.out.print("Informe outro valor para a coluna (0,1,2,3,4,5)");
                column = teclado.nextInt();
                while (!(column >= 0 && column <= 18))
                {
                    System.out.print("\tValor Inválido. Digite novamente outro valor para a coluna");
                    column = teclado.nextInt();
                }
            }
            board[row][column] = player1;
            Auxiliar.dump(board);
            System.out.println("Jogada do player2");
            System.out.print("ATENÇÃO: informe dois pontos de uma coordenada cartográfica (4 valores) para formar um traço entre linhas ou colunas)");
            System.out.println("Digite a linha do primeiro ponto para formar o traço");
            row = teclado.nextInt();
            while (!(row >= 0 && row <= 18))
            {
                System.out.print("\tValor Inválido. Digite novamente o valor da linha");
                row = teclado.nextInt();
            }
            System.out.println("Digite a coluna do primeiro valor para formar o traço");
            column = teclado.nextInt();
            while (!(column >= 0 && column <= 18))
            {
                System.out.print("\tValor Inválido. Digite novamente o valor da coluna");
                column = teclado.nextInt();
            }
            if (board[row][column].equals("  "))
            {
                board[row][column] = player2;
                player1 = "2| ";
            }
            while (board[row][column].equals("1| "))
            {
                System.out.println("Ponto já assinalado previamente.");
                System.out.print("Informe outro valor para a linha");
                row = teclado.nextInt();
                while (!(row >= 0 && row <= 18))
                {
                    System.out.print("\tValor Inválido. Digite novamente o valor da linha");
                    row = teclado.nextInt();
                }
                System.out.print("Informe a coluna do primeiro valor do traço");
                column = teclado.nextInt();
                while (!(column >= 0 && column <= 18))
                {
                    System.out.print("\tValor Inválido. Digite novamente outro valor para a coluna");
                    column = teclado.nextInt();
                }
            }
            board[row][column] = player2;
            Auxiliar.dump(board);
            System.out.println("Segunda jogada do player2");
            System.out.println("Digite a linha do segundo ponto para formar o traço");
            row = teclado.nextInt();
            while (!(row >= 0 && row <= 18))
            {
                System.out.print("\tValor Inválido. Digite novamente o valor da linha");
                row = teclado.nextInt();
            }
            System.out.println("Digite a coluna do primeiro valor para formar o traço");
            column = teclado.nextInt();
            while (!(column >= 0 && column <= 18))
            {
                System.out.print("\tValor Inválido. Digite novamente o valor da coluna");
                column = teclado.nextInt();
            }
            if (board[row][column].equals("   "))
            {
                board[row][column] = player2;
                player1 = "2| ";
            }
            while (board[row][column].equals("1| "))
            {
                System.out.println("Ponto já assinalado previamente.");
                System.out.print("Informe outro valor para a linha");
                row = teclado.nextInt();
                while (!(row >= 0 && row <= 18))
                {
                    System.out.print("\tValor Inválido. Digite novamente o valor da linha");
                    row = teclado.nextInt();
                }
                System.out.print("Informe outro valor para a coluna (0,1,2,3,4,5)");
                column = teclado.nextInt();
                while (!(column >= 0 && column <= 18))
                {
                    System.out.print("\tValor Inválido. Digite novamente outro valor para a coluna");
                    column = teclado.nextInt();
                }
            }
            board[row][column] = player2;
            Auxiliar.dump(board);
        }
        teclado.close();
        System.out.print("**Fim de jogo**\n");
    }
}