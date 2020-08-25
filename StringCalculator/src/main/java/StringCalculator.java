import java.awt.image.AreaAveragingScaleFilter;

public class StringCalculator {

    String resultOrMessage = "";
    StringOfNumbersAnalizer stringOfNumbers;

    public String add(String numbers) {

        this.stringOfNumbers = new StringOfNumbersAnalizer(numbers);
        if (numbers.isBlank()) {
            resultOrMessage =  "0.0";
        }
        stringOfNumbers.analyzeString();
        checkNumbersStringForErrors ();

        if (resultOrMessage.isBlank()){ resultOrMessage = stringOfNumbers.getSumOfNumbers();}

        return resultOrMessage;
    }

    private void checkNumbersStringForErrors() {
        if (stringOfNumbers.isDoubledSeparators()){
            addToMessage("Number expected but '" + stringOfNumbers.getIllegalSeparator() + "' found at position " + stringOfNumbers.getIllegalSeparatorPosition() + ".");
        }
        if (stringOfNumbers.eofFoundInsteadOfNumber()){
            addToMessage( "Number expected but EOF found");
        }
        if (stringOfNumbers.foundNegativeNumbers()){
            addToMessage( "Negative not allowed :" + stringOfNumbers.getNegativeNumbersList());
        }
        if (stringOfNumbers.foundWrongCustomSeparator()){
            addToMessage( stringOfNumbers.getCustomSeparator() + " expected but '"+stringOfNumbers.getWrongSeparator()+"' found at position "+stringOfNumbers.getWrongSeparatorPosition()+".");
        }
    }

    private void addToMessage(String currentMessage){
        if (resultOrMessage.isBlank()){
            resultOrMessage = currentMessage;
        }else {
            resultOrMessage += "\n" + currentMessage;
        }
    }
}
