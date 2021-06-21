// Direitos Autorais, PUCRS/Escola Politécnica
// 2021-06-11
/**
 * A classe Auxiliar possui 02 subprogramas. O primeiro define a ordem de aparição dos
 * pontos que podem ser escolhidos pelos jogadores dentro do tabuleiro.
 * O segundo define as bordas do tabuleiro, através de uma matriz quadrada,
 * e imprime os pontos em seu interior.
 * 
 * @author Igor Ivanoff(igorlbivanoff@gmail.com) 
 * @version 1.6(2021-06-21)
 */
class Auxiliar
{
    /**
     * Cria os pontos ordenados no tabuleiro.
     * @param i e j definem a ordenação dos pontos que podem ser marcados pelos jogadores no tabuleiro, dentro da matriz.
     * @return pontos marcáveis no tabuleiro board.
     */
    public static String[][] init()
    {
        int i;
        int j;
        String[][] board = new String[18][18];
        for(i = 0; i < 18 ; i = i + 1)
        {
            for(j = 0; j < 18; j = j + 1)
            {
                board[i][j] = " . ";
            }
        }
        return board;
    }

    /**
     * Cria uma matriz quadrada de 18x18, com as bordas laterais do tabuleiro, uma identificação acima com o termo "colunas".
     * @param i e j para definir as divisórias das dezoito linhas e colunas do tabuleiro.
     */
    public static void dump(String[][] board)
    {
        int i;
        int j;
        System.out.println("       colunas de 0 a 17");
        for(i = 0; i < 18 ; i = i + 1)
        {
            System.out.print("linha {");
            for(j = 0; j < 18; j = j + 1)
            {
                System.out.print(board[i][j]);
            }
            System.out.println("}");
        }
    }
}