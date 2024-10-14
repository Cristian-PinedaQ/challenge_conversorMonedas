package com.codigodenovatos.modulos;

public class MenuOpciones {

    private String menu = """
                >>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<   
                    Bienvenid@ al conversor de moneda
                Digite el numero de la opcion a consultar:
                <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
                       1 - DOLAR >>> PESO COLOMBIANO
                       2 - PESO COLOMBIANO >>> DOLAR
                       3 - DOLAR >>> PESO ARGENTINO
                       4 - PESO ARGENTINO >>> DOLAR
                       5 - DOLAR >>> REAL BRASILEÑO
                       6 - REAL BRASILEÑO >>> DOLAR
                       7 - SALIR
                >>>>>>>>> ELIJA UNA OPCION VALIDA<<<<<<<<<       
                >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
                """;
    public String getMenu() {
        return menu;
    }
    public void printMenu(){
        System.out.println(getMenu());
    }
}
