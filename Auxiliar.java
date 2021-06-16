/**
 * A classe Auxiliar possui 02 subprogramas. O primeiro distribui de forma ordenada os
 * pontos que podem ser escolhidos pelos jogadores dentro do tabuleiro.
 * O segundo defina as bordas do tabuleiro, através de uma matriz quadrada.
 * 
 * @author Igor Ivanoff(igorlbivanoff@gmail.com) 
 * @version 1.4(2021-06-16)
 */
class Auxiliar
{
    /**
     * Averigua se o jogador marcou um ponto já existente no tabuleiro
     * E, caso positivo, ordena uma nova jogada.
     */
    public static String[][] wrong()
    {
        boolean wrong;
        wrong = false;
        while (false)
        {
            if ([row][column].equals = player)
            {
            System.out.println("Jogada incorreta. Jogue novamente!");
            }
        }
        return done;
    }
    
    /**
     * Quando o jogador forma um quadrado, computa um ponto.
     * @return Um ponto.
     */
    public static String umponto(int irow, int jcolumn)
    {
        int irow;
        int jcolumn;
        int umponto;
        for (irow = [row + 1][column]; jcolumn = [row][column + 1]; um ponto = umponto + 1)
        {
            System.out.print("Formou um quadrado. Um ponto");
        }
    }

    /**
     * Cria os pontos ordenados no tabuleiro.
     * @param i e j definem a ordenação dos pontos que podem ser marcados pelos jogadores no tabuleiro.
     * @return matriz quadrada.
     */
    public static String[][] init()
    {
        int i;
        int j;
        String[][] board = new String[6][6];
        for(i = 0; i < 6 ; i = i + 1)
        {
            for(j = 0; j < 6; j = j + 1)
            {
                board[i][j] = " o ";
            }
        }
        return board;
    }

    /**
     * Cria uma matriz quadrada com as bordas do tabuleiro
     * @param i e j para definir as divisórias das seis linhas do tabuleiro.
     */
    public static void dump(String[][] board)
    {
        int i;
        int j;
        for(i = 0; i < 6 ; i = i + 1)
        {
            System.out.print("|");
            for(j = 0; j < 6; j = j + 1)
            {
                System.out.print(board[i][j]);
            }
            System.out.println("|");
        }
    }
}