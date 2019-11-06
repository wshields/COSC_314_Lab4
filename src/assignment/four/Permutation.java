package assignment.four;

public class Permutation {
    private int[] initialArray;
    private int pointer1 , pointer2;

    public Permutation(int x){
        initialArray = new int[x];
        int num = 1;
        for(int i = 0; i < initialArray.length; i++){
            initialArray[i] = num;
            num++;
        }
        pointer1 = 1;
        pointer2 = pointer1;
    }

    public int[] getInitialArray() {
        return initialArray;
    }

    //Implementation of the Fischer-Krause algorithm goes right to left across the array to generate the next permutation
    public int[] makePermutation() {
        if(!this.hasMorePermutations()){
            return null;
        }

        int[] retArray = initialArray.clone();

        pointer1 = initialArray.length - 1;

        while(pointer1 > 0 && initialArray[pointer1 - 1] > initialArray[pointer1]){
            --pointer1;
        }

        if(pointer1 > 0){
            pointer2 = pointer1;
            for(int i = pointer1; i< initialArray.length - 1; i++){
                this.swapArrayElements(initialArray, i , initialArray.length - 1 + pointer1 - i);
            }

            while(initialArray[pointer1 - 1] > initialArray[pointer2]){
                ++pointer2;
            }

            for(int i = pointer1 - 1; i < pointer2; i++){
                this.swapArrayElements(initialArray, i , pointer2 - i  + pointer1 - 1);
            }
        }
        return retArray;
    }

    public boolean hasMorePermutations(){
        if(pointer1 > 0){
            return true;
        }else{
            return false;
        }
    }

    //Used to avoid lots of code re-writing
    private void swapArrayElements(int[] array, int a, int b) {
        int temp  = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

}
