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
        int respostapts = 0;
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

        puntuacions[0] = 2;
        puntuacions[1]= 15;
        puntuacions[2]= 1;
        puntuacions[3]= 2;
        puntuacions[4]= 15;
        puntuacions[5]= 5;
        puntuacions[6]= 1;
        puntuacions[7]= 6;
        puntuacions[8]= 7;


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
                        if (participant[i]) {
                            System.out.println("#" + i + "-" + llistaPaisos[i] + " Actuació: si");
                        } else if (!participant[i]){
                            System.out.println("#" + i + "-" + llistaPaisos[i] + " Actuació: no");
                        }
                    }
                    break;
                case 3:
                    int fila = 0;

                    System.out.println("Votacion, mínim 1 punt, màxim 2 punts. ");
                    System.out.println("Llistat de paisos que han actuat:");
                    for (int i =0; i<comptadorPaisos; i++){
                        if (participant[i]){
                            System.out.println("#" + i + "-" + llistaPaisos[i]);
                        }
                    }

                    System.out.println("Ara vota el pais: "+ llistaPaisos[fila]);
                    System.out.println("A quin pais vols votar?");
                    System.out.println("Punts -> "+ puntuacions[fila] +" Al pais ->");
                    respostapts=sc.nextInt();
                    sc.nextLine();
                    if (respostapts == puntuacions[fila]){
                        System.out.println("Error al vot! o t'estas votant a tu mateix o a un pais no participant");
                    }else {

                    }
                case 4:
                    for (int i =0; i<comptadorPaisos; i++){
                        if (participant[i]) {
                            System.out.println("Ranking paisos");
                            System.out.println("posicio " + i + "pais"+ llistaPaisos[i] +"punts"+ puntuacions[i]);

                        }
                    }

            }
        }




    }
}
