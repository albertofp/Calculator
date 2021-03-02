public class CalcFunctions(){

    static int Round(int n1){
        return (int) (Math.round(n1 * 100.0) / 100.0);
    }

    static int Add(int n1, int n2) {
        return (n1 + n2);
    }

    static int Subtract(int n1, int n2){
        return (n1 - n2);
    }

    static int Multiply(int n1, int n2){
        return (n1 * n2);
    }

    static int Divide(int n1, int n2){
        return Round((n1 / n2));
    }

    static int Convert(int conversionOption){


        System.out.println("Type in the value to be converted:");
        int conversionValue = input.nextInt();


        switch(conversionOption){
            case 1:
                int tempF = conversionValue * (9/5) + 32;
                return Round(tempF);
                break;

            case 2:
                int tempC = (conversionValue - 32) / 18;
                return Round(tempC);
                break;

            default:
                System.out.println("Error! Select options 1 or 2.");
        }
    }}