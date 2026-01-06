class CountVowelsandConsonants{
    public static void main(String[] args){
        String val = "apple";
        int vowelCount = 0;
        int nonVowelCount = 0;
        
        // For changing to lowercase - Character.toLowerCase("A");

        for(int i=0;i<val.length();i++){
            if(val.charAt(i) == 'a' || val.charAt(i) == 'e' || val.charAt(i) == 'i' || val.charAt(i) == 'o' || val.charAt(i) == 'u'){
                vowelCount++;
            }else{
                nonVowelCount++;
            }
        }
        System.out.print("Vowel Counts : " + vowelCount + "\nConsonants Counts : " + nonVowelCount);
    }
}