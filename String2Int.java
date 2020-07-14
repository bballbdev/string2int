public class String2Int {

    public static void main(String[] args) {
        //string2int("abc573");
        System.out.println(string2int("abc573"));
    }


    public static int string2int(String str){
        int power = 0;
        int answer = 0;
        for(int i = str.length()-1; i >= 0; i--){
            char letter = str.charAt(i);
            // check if a letter is a alphabet or not.
            if(!(letter >= 'a' && letter <= 'z') && !(letter >= 'A' && letter <= 'Z')){
                //letter - 48 --> do subtract ASCII value of number by 48 for real number value.
                answer += (letter - 48) * Math.pow(10, power);
                // increase exponent for multiple with next letter. 
                power += 1;
            }
        }

        return answer;
    }
}