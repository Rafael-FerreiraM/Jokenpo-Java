
//Aluno:Rafael Ferreira Melo
//RGM: 30060222

import java.util.Scanner;

public class jokenpo {
    //Placar
    private static int placarJogador = 0;
    private static int placarComputador = 0;


    //Escolha dos jogadores
    private static int escolhaJogador;
    private static int escolhaComputador;



    //Principal
    public static void main(String[] args) {
        //Quantidade de rodadas
        int rodadas = 0;
        Scanner input1 = new Scanner(System.in);
        System.out.println(":::::::::::JOKENPÔ:::::::::");
        System.out.println("Olá jogador, quantas rodadas deseja jogar?");
        rodadas = input1.nextInt();//Input de rodadas

        //Reiniciar o jogo
        // 0,25
        Scanner continuar = new Scanner(System.in);
        int opcao = 0;
        do {
            for (int i = 1; i <= rodadas; ++i) {

                escolhaComputador = (int) (Math.random() * 3) + 1;
                rotuloEscolhaJogador();
                escolhaJogador = input1.nextInt(); // Reutilizando input
                verificaResultado(); //Método
            }
            exibePlacar();
            System.out.println("Deseja jogar novamente?");
            System.out.println("1- Sim");
            System.out.println("2- Não");
            opcao = continuar.nextInt();
        }while(opcao !=2);



}


    //Verificar Resultado
    public static void verificaResultado() {
        //Comparações,if,else,sysout, ++placarjogador e ++ placar computador
        // com base nas escolhas
        //0,25
        if(escolhaJogador == 1 && escolhaComputador ==1) {
            System.out.println("Escolheram o mesmo!");
        }

         else if(escolhaJogador == 2 && escolhaComputador ==2) {
            System.out.println("Escolheram o mesmo!");
        }

       else  if(escolhaJogador == 3 && escolhaComputador ==3) {
            System.out.println("Escolheram o mesmo!");
        }

        else if(escolhaJogador == 1 && escolhaComputador ==2) {
            placarComputador++;
            System.out.println("Pedra perde para papel!");
        }

        else if(escolhaJogador == 1 && escolhaComputador ==3) {
            placarJogador++;
            System.out.println("Pedra ganha de tesoura!");
        }

       else if(escolhaJogador == 2 && escolhaComputador ==1) {
            placarJogador++;
            System.out.println("Papel ganha de pedra!");
        }

        else if(escolhaJogador == 2 && escolhaComputador ==3) {
            placarComputador++;
            System.out.println("Papel perde para tesoura!");
        }

        else if(escolhaJogador == 3 && escolhaComputador ==1) {
            placarComputador++;
            System.out.println("Tesoura perde para pedra!");
        }

        else{
            placarJogador++;
            System.out.println("Tesoura ganha de papel!");

        }



    }

    //Exibir o placar
    public static void exibePlacar() {
        //If e else  com Sysout para chamar a variável do placar
        //para determinar se venceu ou perdeu
        //0,25
        if (placarJogador > placarComputador) {
            System.out.println("Parabéns você venceu de " + (placarJogador + "x" + placarComputador));

        }
        else{
            System.out.println("Que pena! computador venceu de " + (placarComputador + "x" + placarJogador));

        }

    }


    //Mostrar ao usuário as opções para que ele escolha uma
    //entre pedra, papel e tesoura
    public static void rotuloEscolhaJogador() {
        System.out.println("Digite sua opção!: ");
        System.out.println("1- Para pedra");
        System.out.println("2- Para papel");
        System.out.println("3- Para tesoura");

    }

}

