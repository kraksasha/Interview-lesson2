package example;

public class ArrayListOverride<T> {
    private int count = 0;
    private T[] array;

    public ArrayListOverride() {
        array = (T[]) new Object[count+1];
    }


    public void add(T item) {
        if(count == array.length)
        resize(array.length*2);
        array[count] = item;
        count++;
    }
    private void resize(int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, count);
        array = (T[]) newArray;
    }

    public Object get(int index){
        return array[index];
    }

    public int size(){
        return array.length;
    }

    public void remove(int index){
        Object[] newArray = new Object[array.length - 1];
        for (int i = 0, j = 0; i < array.length && j < newArray.length; i++, j++){
            if (array[i] == array[index]){
                newArray[j] = array[i + 1];
                i++;
            } else {
                newArray[j] = array[i];
            }
        }
        array = (T[]) newArray;
    }
}
