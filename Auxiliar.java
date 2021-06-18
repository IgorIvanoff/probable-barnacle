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
                board[i][j] = " . ";
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
        System.out.println("       colunas de 0 a 5");
        for(i = 0; i < 6 ; i = i + 1)
        {
            System.out.print("linha |");
            for(j = 0; j < 6; j = j + 1)
            {
                System.out.print(board[i][j]);
            }
            System.out.println("|");
        }
    }
    
}