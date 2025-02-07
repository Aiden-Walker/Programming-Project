package ud2EjClase3;
import utilities.UtilitiesEN;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {

            Scanner keyboard = new Scanner(System.in);
            int throw_sum = 0;
            int current_throw;
            int numThrows;
            int throwings;
            Dice diceX;
            Game mygame;
            UtilitiesEN utilities = new UtilitiesEN();
            String playerName;
            String player2Name;
            try {
                playerName = utilities.readString("Player 1, Introduce your name ");
                player2Name = utilities.readString("Player 2, Introduce your name ");


                numThrows = utilities.readInteger(playerName+" and "+player2Name+" Enter the number of faces of the thrown dice: ");
                diceX = new Dice(numThrows);

                throwings = utilities.readInteger(playerName + " and "+player2Name + " Introduce how many times will the dice be thrown: ");
                mygame = new Game(diceX);
                for (int i = 1; i <= throwings; i++) {
                    current_throw = mygame.play();
                    //throw_sum += current_throw;
                    if (i % 2 != 0){
                        System.out.println(playerName+" Your throw resulted in:");
                    }
                    else {System.out.println(player2Name+" Your throw resulted in:");}
                    System.out.println("Throw " + i + ": " + current_throw);
                }
        /*
        for (int i = 1; i <= lanzamientos; i++) {
            tirada_actual = mygame.jugar();
            System.out.println("Lanzamiento " + i + ": " + tirada_actual);
            throw_sum += tirada_actual;
        }
        */
                //throw_sum = throwMultipleTimes(mygame, numThrows);
                //System.out.println("\nSum of Throws: " + throw_sum);
            } catch (IOException ioe) {
                System.out.println("Error in the intake of data");
            } catch (InputMismatchException ime) {
                System.out.println("Error, data type not supported.");
            } finally {
                System.out.println("End of program.");
            }

        }
        /*
        public static int throwMultipleTimes(Game myGame, int throwings) {
            int throw_sum = 0;
            int current_throw;
            for (int i = 1; i <= throwings; i++) {
                current_throw = myGame.play();
                System.out.println("Throw " + i + ": " + current_throw);
                throw_sum += current_throw;
                if (i % 2 != 0){
                    System.out.println(playerName+" Your throw resulted in");
                }
            }
            return throw_sum;
        }*/

    }
