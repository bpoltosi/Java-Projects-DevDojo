package Formatação.teste;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocalTest01 {
    static void main(String[] args) {
        Locale localeItaly = new Locale("it", "IT");
        Locale localeItalianoSuiça = new Locale("it", "CH");
        Locale localeIndia = new Locale("hi", "IN");
        Locale localeJapao = new Locale("ja", "JP");
        Locale localeHolanda = new Locale("nl", "NL");

        Calendar calendar = Calendar.getInstance();

        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeItalianoSuiça);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localeJapao);
        DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL, localeHolanda);

        System.out.println(localeItaly.getDisplayCountry(localeItaly) + " | "+localeItaly.getDisplayCountry()+ "\n" + df1.format(calendar.getTime()));
        System.out.println("---------------------");
        System.out.println(localeItalianoSuiça.getDisplayCountry(localeItalianoSuiça) + " | "+localeItalianoSuiça.getDisplayCountry()+ "\n" + df2.format(calendar.getTime()));
        System.out.println("---------------------");
        System.out.println(localeIndia.getDisplayCountry(localeIndia) + " | "+localeIndia.getDisplayCountry()+ "\n" + df3.format(calendar.getTime()));
        System.out.println("---------------------");
        System.out.println(localeJapao.getDisplayCountry(localeJapao) + " | "+localeJapao.getDisplayCountry()+ "\n" + df4.format(calendar.getTime()));
        System.out.println("---------------------");
        System.out.println(localeHolanda.getDisplayCountry(localeHolanda)+ " | "+localeHolanda.getDisplayCountry()+ "\n" + df5.format(calendar.getTime()));
    }
}
