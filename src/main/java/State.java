/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Danniel
 */
import java.util.Scanner;

public class State {

    public static void main(String[] args) throws InterruptedException {
        boolean running = true;
        System.out.println("Aguardando input...");
        while (running) {
            Scanner input = new Scanner(System.in);
            String userInput = input.nextLine();
            
            
            //Relação de comandos a serem usados como input:
            if (userInput.contains("abrir")) {
                Door.abrir();
            } else if (userInput.contains("fechar")) {
                Door.fechar();
            } else if (userInput.contains("trancar")) {
                Door.trancar();
            }else if (userInput.contains("destravar")) {
                Door.destrancar();
            } else if (userInput.contains("estado")) {
                Door.estado();
            } else if (userInput.contains("parar")) {
                running = false;
            }
        }
    }
}
