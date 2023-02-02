package Searching;

public class Linear {
    public int LinearSearchFn(int[] arrayInput,int searchNum){
        for(int i=0; i<arrayInput.length; i++){
            if(searchNum == arrayInput[i]){
                return i;
            }
        }
        return  -1;
    }
}
