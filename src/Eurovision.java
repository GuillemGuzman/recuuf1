import java.util.Scanner;

public class Eurovision {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final int MAX_PAISOS = 100;
        String [] llistaPaisos = new String[MAX_PAISOS];

        boolean test = true;
        boolean[] participant = new boolean[MAX_PAISOS];

        int[] puntuacions = new int[MAX_PAISOS];

        int comptadorPaisos = 0;
        boolean bucle1 = true;

        String nomPais;

        llistaPaisos[comptadorPaisos] = "France";
        participant[comptadorPaisos] = true;
        comptadorPaisos++;
        llistaPaisos[comptadorPaisos] = "Italy";
        participant[comptadorPaisos] = true;
        comptadorPaisos++;
        llistaPaisos[comptadorPaisos] = "Andorra";
        participant[comptadorPaisos] = false;
        comptadorPaisos++;
        llistaPaisos[comptadorPaisos] = "Sweden";
        participant[comptadorPaisos] = true;
        comptadorPaisos++;
        llistaPaisos[comptadorPaisos] = "Vaticano";
        participant[comptadorPaisos] = false;
        comptadorPaisos++;
        llistaPaisos[comptadorPaisos] = "Germany";
        participant[comptadorPaisos] = true;
        comptadorPaisos++;
        llistaPaisos[comptadorPaisos] = "Portugal";
        participant[comptadorPaisos] = true;
        comptadorPaisos++;
        llistaPaisos[comptadorPaisos] = "Norway";
        participant[comptadorPaisos] = true;
        comptadorPaisos++;

        while (bucle1){
            System.out.println("################");
            System.out.println("0 - Sortir");
            System.out.println("1 - Afegir Pais");
            System.out.println("2 - Mostrar Paisos");
            System.out.println("3 - Votacions");
            System.out.println("4 - Resultats");
            int opcio = sc.nextInt();
            sc.nextLine();
            switch (opcio){
                case 0:
                    bucle1 = false;
                    break;
                case 1:
                    System.out.println("Introdueix el nom del pais (0 per sortir)");
                    nomPais = sc.nextLine();
                    if (nomPais.equals("0")){
                        break;
                    }

                    System.out.println("EL pais actuarà?(S/N)");
                    String resposta = sc.nextLine();
                    if (resposta.equalsIgnoreCase("s")){
                        llistaPaisos[comptadorPaisos] = nomPais;
                        participant[comptadorPaisos] =true;
                        comptadorPaisos++;
                    }else if (resposta.equalsIgnoreCase("N")){
                        llistaPaisos[comptadorPaisos] = nomPais;
                        participant[comptadorPaisos]=false;
                        comptadorPaisos++;
                    }
                    break;
                case 2:
                    System.out.println("LLista de paisos participants: ");
                    for (int i= 0; i<comptadorPaisos; i++) {
                        if (participant[i] = true) {
                            System.out.println("#" + i + "-" + llistaPaisos[i] + " Actuació: si");
                        } else {
                            System.out.println("#" + i + "-" + llistaPaisos[i] + " Actuació: no");
                        }
                    }


            }
        }




    }
}
