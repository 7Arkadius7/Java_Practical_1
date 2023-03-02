public void printNums(){
    boolean isPr;
    for(int i = 1; i < 1000; i++){
        isPr = i == 1;
        for(int j = 2; j<1000; j++){
            if (i >= j && i % j == 0){
                if(j == i) {
                    isPr = true;
                }
                break;
            }
        }
        if (isPr) System.out.println (i);
    }
}