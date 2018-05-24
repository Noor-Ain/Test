public class Main {

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    int number;
    static String numberToString(int[] input) {
        StringBuffer output = new StringBuffer(" ");
        for (int value : input) {
            output.append(value);
        }
        return output.toString();
    }

    public static void main(String args[]) {
        int [] inputArray = {1,2,3,4,5};
        System.out.println(numberToString(inputArray));
    }
}


