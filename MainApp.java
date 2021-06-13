// Direitos Autorais, PUCRS/Escola Politécnica
// 2021-06-04
import java.util.Scanner;
/**
 * A classe Main permite jogar jogo da velha entre 2 jogadores.
 * 
 * @author Igor Ivanoff (igorlbivanoff@gmail.com)
 * @version 1.1 (2021-06-07)
 */
public class MainApp
{
    /**
     * Cria uma matriz 3x3
     * @return matriz quadrada.
     */
    public static String[][] init()
    {
        int i;
        int j;
        String[][] board = new String[3][3];
        for(i = 0; i <3 ; i = i + 1) // i = 0, 1, 2
        {
            for(j = 0; j < 3; j = j + 1) // j = 0, 1, 2
            {
                board[i][j] = " ";
            }
        }
        return board;
    }

    /**
     * @param i e j para definir as divisórias das três linhas da tabela.
     */
    public static void dump(String[][] board)
    {
        int i;
        int j;
        for(i = 0; i < 3 ; i = i + 1) // i = 0, 1, 2
        {
            System.out.print("|");
            for(j = 0; j < 3; j = j + 1) // j = 0, 1, 2
            {
                System.out.print(board[i][j]);
            }
            System.out.println("|");
        }
    }

    public static boolean fimDeJogo(String[][] board)
    {
        // verificar vitória de x ou de y.
        return vitoria(board, "x") || vitoria(board, "o") || cheio(board);
    }

    public static boolean vitoria(String[][] board, String player)
    {
        int i;
        int j;
        for(i = 0; i < 3 ; i = i + 1)
        {
            //fechou linha de i!
            if (board[i][0].equals(player) &&
            board[i][1].equals(player) &&
            board[i][2].equals(player))
            {
                return true;
            }
            // fechou coluna de j!
            for(j = 0; j < 3 ; j = i + 1)
            {
                if (board[0][j].equals(player) &&
                board[1][j].equals(player) &&
                board[2][j].equals(player))
                {
                    return true;
                }
            }
        }
        // Diagonais
        if (board[0][0].equals(player) &&
        board[1][1].equals(player) &&
        board[2][2].equals(player))
        {
            return true;
        }
        if (board[0][2].equals(player) &&
        board[1][1].equals(player) &&
        board[2][0].equals(player))
        {
            return true;
        }
        return false;
    }

    public static boolean cheio(String[][] board)
    {
        boolean temEspaco;
        int i;
        int j;
        temEspaco = false;
        for(i = 0; i < 3 ; i = i + 1)
        {
            for(j = 0; j < 3 ; j = i + 1)
            {
                if (board[i][j].equals(""))
                {
                    temEspaco = true;
                }
            }
        }
        return !temEspaco;
    }

    /**
     * @param row, column.
     */
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        String[][] board;
        String player;
        int row;
        int column;
        player = "x";
        board = init();
        System.out.print("Jogo da Velha!n\n");
        while (!fimDeJogo(board)) //começa a primeira execução.
        {
            // jogo em formato matriz
            dump(board);
            System.out.printf("Jogada de: %s\n", player);
            System.out.print("Informe o valor da linha (0,1,2)");
            row = teclado.nextInt();
            while (!(row >= 0 && row <= 2))
            {
                //garanti de valor válido
                System.out.print("\tValor Inválido. Digite novamente");
                row = teclado.nextInt();
            }
            System.out.print("Informe o valor da coluna (0,1,2)");
            column = teclado.nextInt();
            while (!(column >= 0 && column <= 2))
            {
                //garanti de valor válido
                System.out.print("\tValor Inválido. Digite novamente");
                column = teclado.nextInt();
            }
            if (board[row][column].equals(""))
            {
                board[row][column] = player;
            }
            board[row][column] = player;
            if (player.equals("x"))
            {
                player = "o";
            }
            else
            {
                player = "x";
            }
        }
        teclado.close();
        dump(board);
        System.out.print("**Fim de jogo**\n");
    }
}