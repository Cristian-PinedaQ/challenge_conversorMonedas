package com.codigodenovatos.modulos;

public class ProcesarOpcionesMenu {

    public void recibirOpcionMenu(int option, double valorConvertir){

        switch (option) {

            case 1:
                ConetionApi option1 = new ConetionApi();
                ConsultModel result = option1.convertMoney(valorConvertir, "USD", "COP");
                result.printResult(valorConvertir);
                break;
            case 2:
                ConetionApi option2 = new ConetionApi();
                ConsultModel result2 = option2.convertMoney(valorConvertir, "COP", "USD");
                result2.printResult(valorConvertir);
                break;
            case 3:
                ConetionApi option3 = new ConetionApi();
                ConsultModel result3 = option3.convertMoney(valorConvertir, "USD", "ARS");
                result3.printResult(valorConvertir);
                break;
            case 4:
                ConetionApi option4 = new ConetionApi();
                ConsultModel result4 = option4.convertMoney(valorConvertir, "ARS", "USD");
                result4.printResult(valorConvertir);
                break;
            case 5:
                ConetionApi option5 = new ConetionApi();
                ConsultModel result5 = option5.convertMoney(valorConvertir, "USD", "BRL");
                result5.printResult(valorConvertir);
                break;
            case 6:
                ConetionApi option6 = new ConetionApi();
                ConsultModel result6 = option6.convertMoney(valorConvertir, "BRL", "USD");
                result6.printResult(valorConvertir);
                break;
            default:
                System.out.println("Opcion no valida, Digite una opcion del menu");
        }
    }
}
