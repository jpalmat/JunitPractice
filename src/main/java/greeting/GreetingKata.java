package greeting;

import java.util.regex.Pattern;

public class GreetingKata {
    private String initialGreeting = "Hello, ";

    public String name(String... nameParameter) {
        if(nameParameter==null) return initialGreeting+"my friend";
        if(nameParameter.length==2){
            return initialGreeting+nameParameter[0]+" and "+nameParameter[1];
        }
        if(nameParameter.length>2){
            return greetingMultipleNames(nameParameter);
        }
        if(isUppercase(nameParameter[0])) return "HELLO "+nameParameter[0];
        return initialGreeting+nameParameter[0];
    }

    private String greetingMultipleNames(String[] nameParameter) {
        StringBuilder sbUppercase = new StringBuilder(initialGreeting);
        StringBuilder sbLowercase = new StringBuilder("HELLO ");

        for(int i = 0; i < nameParameter.length; i++){
            if(i==nameParameter.length-1){
                sbUppercase.append("and ").append(nameParameter[i]);
            } else {
                sbUppercase.append(nameParameter[i]).append(", ");
            }
        }
        return sbUppercase.toString();
    }

    private boolean isUppercase(String nameParameter) {
        return nameParameter.chars().noneMatch(Character::isLowerCase);
    }
}
