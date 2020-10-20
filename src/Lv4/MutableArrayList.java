package Lv4;

public class MutableArrayList {
    private Object[] elementTypes;
    private int size = 10;

    public MutableArrayList() {
        elementTypes = new Object[size];
    }

    public MutableArrayList(Object[] elementTypes, int initialCapacity) {
        if(initialCapacity>0){
            size = initialCapacity;
            this.elementTypes = new Object[initialCapacity];
        }else if (initialCapacity==0){
            System.out.println("你输入的容量为0，请重新输入");
        }else {
            throw new IllegalArgumentException("你的输入有问题，请尝试重新输入");
        }
    }

    void add(Object obj){
        elementTypes[size-1] = obj;
    }

    void add(int index,Object obj){
        elementTypes[index] = obj;
    }

    Object get(int index){
        return this.elementTypes[index];
    }

    void remove(int index){

    }

    int size() {
        return size;
    }
}
