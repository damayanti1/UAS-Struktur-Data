class  linearSearch {
    public static void main(String[] args) {
        String[] kata = {"DAMAY","SI CIN","KIWIL","DITYA","AMAR","DIDUN","IKIJAMET","NDES"};

        //System.out.println(linierSearch(intArray, -99));

        if(linearSearch(kata,"IKIJAMET") == -1){
            System.out.println("Data tidak ditemukan");
        } else{
            System.out.println("Data ditemukan pada index ke " + linearSearch(kata, "IKIJAMET"));
        }

    }

    public static int linearSearch(String[] input, String value){
        for(int i=0; i < input.length; i++){
            if(input[i] == value) {
                return i;
            }
        }
        return -1;
    }


    public static int linearSearch(int[] input, int value){
        for(int i=0; i < input.length; i++){
            if(input[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
