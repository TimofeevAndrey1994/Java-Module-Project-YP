public class Utils {

    public static String getRubleInRightCase(int numeric){
        //--- Остаток от деления на 100
        int remOnDiv100 = (numeric % 100);
        //--- от 10 до 20 всегда рублей
        if (remOnDiv100 >= 10 && remOnDiv100 <= 20) {
            return "рублей";
        }

        int remOnDiv10 = remOnDiv100 % 10;
        switch (remOnDiv10){
            case 1:
                return "рубль";
            case 2:
            case 3:
            case 4:
                return "рубля";
            default:
                return "рублей";
        }
    }

    public static boolean isCorrectPeopleCount(String value){
        try {
            Integer.parseInt(value);
        } catch (Exception e) {
            return false;
        }
        return !(Integer.parseInt(value) <= 1);
    }

    public static boolean isCorrectPrice(String value){
        try {
            Float.parseFloat(value);
        } catch (Exception e) {
            return false;
        }
        return !(Float.parseFloat(value) < 0);
    }

    public static boolean isCorrectTitle(String value){
        return !value.trim().equals("");
    }

}
