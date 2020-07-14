/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Danniel
 */
public class Door {

    static int fechada = 0;
    static int aberta = 1;
    static int trancada = 2;
    static int state = fechada;

    public static void abrir() throws InterruptedException {
        if (state == fechada) {
            for (int t = 3; t > 0; t--) {
                System.out.println("A porta está abrindo em " + t + "s...");
                Thread.sleep(1000);
            }
            state = aberta;
            System.out.println("A porta agora está ABERTA.");
        } else if (state == aberta) {
            System.out.println("A porta já está ABERTA.");
        } else if (state == trancada) {
            System.out.println("A porta está TRANCADA e não pode ser ABERTA.");
        }
    }

    public static void fechar() throws InterruptedException {
        if (state == aberta) {
            for (int t = 3; t > 0; t--) {
                System.out.println("A porta está fechando em " + t + "s...");
                Thread.sleep(1000);
            }
            state = fechada;
            System.out.println("A porta agora está FECHADA.");
        } else {
            System.out.println("A porta já está FECHADA.");
        }
    }

    public static void trancar() {
        if (state == fechada) {
            state = trancada;
            System.out.println("A porta agora está TRANCADA.");
        } else if (state == trancada) {
            System.out.println("A porta já está TRANCADA.");
        } else {
            System.out.println("A porta precisa estar FECHADA para ser TRANCADA.");
        }
    }

    public static void destrancar() {
        if (state == trancada) {
            state = trancada;
            System.out.println("A porta agora está DESTRANCADA.");
        } else if (state == fechada) {
            System.out.println("A porta já está DESTRANCADA.");
        } else {
            System.out.println("A porta precisa estar TRANCADA para ser DESTRANCADA.");
        }
    }

    public static void estado() {
        switch (state) {
            case 0:
                System.out.println("A porta está FECHADA.");
                break;
            case 1:
                System.out.println("A porta está ABERTA.");
                break;
            case 2:
                System.out.println("A porta está TRANCADA.");
                break;
        }
    }
}
