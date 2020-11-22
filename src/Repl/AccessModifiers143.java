package Repl;

public class AccessModifiers143 {
    private static String maxLength(String[] array){
        int index = 0;
        int elementLength = array[0].length();
        for (int i=1; i<array.length; i++){
            if(array[i].length() > elementLength) {
                index = i; elementLength = array[i].length();
            }
        }
        return array[index];
    }
    public static void main(String[] args) {
        String[] arr = {"hey","yolo","hi","this is long"};
        System.out.println(maxLength(arr));
        //should print "this is long"
    }
}
