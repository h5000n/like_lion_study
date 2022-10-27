class MyHash{
    private int size = 10000;
    private int table[] = new int[size];

    public MyHash() {
    }

    public MyHash(int size, int[] table) {
        this.size = size;
        this.table = new int[size];
    }
    public int hash(String key){
        int asciiSum = 0;
        for (int i = 0; i < key.length; i++){
            char c = key.charAt(i);
            int ascii = c;
            asciiSum += ascii;
        }
        return asciiSum % 90;
    }
}//
