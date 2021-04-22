package vetores_e_listas;

public class DiarioDeClasse {
    public static void main(String args[]) {

        String[][] chamada = new String[3][5];

        chamada[0][0] = "Ausente";
        chamada[0][1] = "Presente";
        chamada[0][2] = "Presente";
        chamada[0][3] = "Presente";
        chamada[0][4] = "Ausente";

        chamada[1][0] = "Presente";
        chamada[1][1] = "Ausente";
        chamada[1][2] = "Presente";
        chamada[1][3] = "Ausente";
        chamada[1][4] = "Presente";

        chamada[2][0] = "Presente";
        chamada[2][1] = "Presente";
        chamada[2][2] = "Presente";
        chamada[2][3] = "Presente";
        chamada[2][4] = "Presente";

        System.out.println("Lista de chamada da semana :");

        for (int i = 0; i < chamada.length; i++) {
            for (int j = 0; j < chamada[i].length; j++) {
                System.out.print(chamada[i][j] + "-");
            }
            System.out.println();


        }
    }
}
