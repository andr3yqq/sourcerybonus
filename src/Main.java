public class Main {

    public static String decompress(String input)
    {
        String output = "";
        for (int i = 0; i < input.length(); i+=2) { // Every char at 'i' is character that will be repeated and every 'i+1' is number of times it repeats
            // Firstly I get the character that will be repeated
            String sub = input.charAt(i)+"";
            // Then I add this character to output string and repeat this operation for required number of times
            output += sub.repeat(Integer.parseInt(input.charAt(i+1)+""));
        }
        return output;
    }
    public static String compress(String input)
    {
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            // I need a variable that contains number of times this character appears
            int k = 1; // it appears at least once
            // I add this character to output
            output += input.charAt(i);
            // Then I compare this character to the next in input variable
            while (i < input.length() -1 && input.charAt(i)==input.charAt(i+1)){
                k++; // I increase number of times it appears
                i++; // and then I will check next one
            }
            // At the end I add the result to output string
            output += k;
        }
        return output;
    }

    public static void main(String[] args) {

        String input = "a3b2c1";
        String output = decompress(input);
        System.out.println(input);
        System.out.println(output);

        input = output;
        output = compress(input);
        System.out.println(input);
        System.out.println(output);


    }
}