package git.fatihy101.currencyconverter.service;

import org.springframework.stereotype.Service;

@Service
public class ConverterService {
    private static final double USD_TO_TRY = 8.36;

    public String convertCurrency(String abbreviation, double number) {
        if(abbreviation.equals("TRY")) {
            double result = number / USD_TO_TRY;
            return number + " TRY = " + result + " USD";
        } else if ( abbreviation.equals("USD")) {
            double result = number * USD_TO_TRY;
            return number +  "USD = " + result + " TRY";
        } else {
            return "Invalid currency. Please source currency as TRY or USD!";
        }
    }
}
