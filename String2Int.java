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
            if(!(letter >= 'a' && letter <= 'z') && !(letter >= 'A' && letter <= 'Z')){
                answer += (letter - 48) * Math.pow(10, power);
                power += 1;
            }
        }

        return answer;
    }
}