package ClasseCalendar;

import java.util.Calendar;

public class Cumprimenta {
    Calendar dataAtual = Calendar.getInstance();

    public String geraMensagem() {
        // Se o valor das horas se encontra após ao meio dia (Calendar.PM==1)
        // a este valor será somado 12 horas
        int h = (dataAtual.get(Calendar.HOUR) + ((Calendar.PM==1)?12:0));

        int m = dataAtual.get(Calendar.MINUTE);
        int s = dataAtual.get(Calendar.SECOND);

        String msg = "";

        if (h >= 6  && h < 12) {
            msg = "Boa noite";
        } else if (h >= 12 && h < 18) {
            msg = "Boa tarde!";
        } else {
            msg = "Boa noite!";
        }

        return msg += " São exatamente " + h + " horas e " + m + " minutos.";
    }

}


/*
Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("Brazil/East"));
int ano = calendar.get(Calendar.YEAR);
int mes = calendar.get(Calendar.MONTH); // O mês vai de 0 a 11.
int semana = calendar.get(Calendar.WEEK_OF_MONTH);
int dia = calendar.get(Calendar.DAY_OF_MONTH);
int hora = calendar.get(Calendar.HOUR_OF_DAY);
int minuto = calendar.get(Calendar.MINUTE);
int segundo = calendar.get(Calendar.SECOND);
 */