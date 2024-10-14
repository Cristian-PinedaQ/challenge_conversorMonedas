package com.codigodenovatos.modulos;

public record ConsultModel(String base_code, String target_code, double conversion_result, double conversion_rate) {

    public void printResult( double valoConvertido){
        System.out.println("El valor " + valoConvertido +" [" + base_code + "]" +
                " corresponde al valor final de >>>> " + conversion_result + " [" + target_code + "]");
    }
}
