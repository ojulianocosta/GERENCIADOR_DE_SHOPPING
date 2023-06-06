package entities;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        if (ano <= 0 || mes < 1 || mes > 12) {
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
            System.out.println("Data inválida. Data setada para 01/01/2000.");
            return;
        }

        // Verifica se o dia é válido para o mês e ano em questão
        int maxDia = 31;
        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            maxDia = 30;
        } else if (mes == 2) {
            if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
                maxDia = 29;
            } else {
                maxDia = 28;
            }
        }

        if (dia < 1 || dia > maxDia) {
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
            System.out.println("Data inválida. Data setada para 01/01/2000.");
            return;
        }
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    public boolean verificaAnoBissexto() {
        if (ano % 4 == 0) {
            if (ano % 100 == 0) {
                if (ano % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }


    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String toString(){
        return + dia + " / " + mes + " / "  + ano;

    }


}
