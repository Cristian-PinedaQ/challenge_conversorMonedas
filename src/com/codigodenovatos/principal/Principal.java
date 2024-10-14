package com.codigodenovatos.principal;
import com.codigodenovatos.modulos.MenuOpciones;
import com.codigodenovatos.modulos.ProcesarOpcionesMenu;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        ProcesarOpcionesMenu procesarOpcionesMenu = new ProcesarOpcionesMenu();
        MenuOpciones menuOpciones = new MenuOpciones();

        Scanner input = new Scanner(System.in);
        var option = 0;

        while (option != 7) {
            menuOpciones.printMenu();
            try {
                option = input.nextByte();
                if (option == 7) {
                    System.out.println("Vuelva pronto");
                    break;
                }
                System.out.println("Introdusca el valor a consultar");
            }catch (InputMismatchException | NumberFormatException e){
                System.out.println("No es un numero o no es valido "+ e.getMessage());
            }

            try {

                String valorIngresado= input.next().replace(",", ".");
                double valorConvertir = Double.parseDouble(valorIngresado);
                procesarOpcionesMenu.recibirOpcionMenu(option, valorConvertir);

            }catch (NumberFormatException e){
                System.out.println("No es un numero o no es valido "+ e.getMessage());
            }

        }
        input.close();

    }

}
