class MyHashMap {
    int[] data;
    public MyHashMap() {
        data = new int[1000001];  // up to 10^6 keys
        // initialize all elements to -1 (means "no value")
        for (int i = 0; i < data.length; i++) {
            data[i] = -1;
        }
    }
    
    public void put(int key, int value) {
        data[key] = value;
    }
    
    public int get(int key) {
        return data[key];
    }
    
    public void remove(int key) {
        data[key] = -1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */