package com.company;

public class NumericalSystem {
    int baseSystem;

    public NumericalSystem(int baseSystem) {
        this.baseSystem = baseSystem;
    }

    public String convertToBaseSystem(int num) {
        return Integer.toString(Integer.parseInt(num +"",10),baseSystem).toUpperCase();
    }

    public int convertToDecimal(String stringValue) {
        stringValue = stringValue.toUpperCase();

        if (stringValue.length() == 0) {
            System.out.println("Ничего не введено");
            return -1;
        }

        int len = stringValue.length();
        int power = 1;
        int num = 0;
        int i;

        for (i = len - 1; i >= 0; i--) {
            num += useSymbolsToTranslateNumbers(stringValue.charAt(i)) * power;
            power = power * baseSystem;
        }

        return num;
    }

    static int useSymbolsToTranslateNumbers(char symbolsOfValue) {
        if (symbolsOfValue >= '0' && symbolsOfValue <= '9')
            return (int)symbolsOfValue - '0';
        else
            return (int)symbolsOfValue - 'A' + 10;
    }
}
