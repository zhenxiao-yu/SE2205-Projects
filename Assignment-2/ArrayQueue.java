public class ArrayQueue<E> {
    private E[]data;
    private int f = 0;
    private int size = 0;
    
    public ArrayQueue(){
    this(10);
    }
    public ArrayQueue(int capacity) {
        data = (E[]) new Object[capacity];
    }
    
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return (size==0);
    } 
    
    public E first(){
        if(isEmpty())return null;
        return data[f];
    }
    
    public void enqueue(E e)throws IllegalStateException{
        if(size == data.length) throw new IllegalStateException("Queue is full");
        int avail = (f + size)%data.length;
        data[avail] = e;
        size++;
    }
    public E dequeue(){
        if (isEmpty())return null;
        E answer = data[f];
        data[f] = null;
        f = (f+1)%data.length;
        size--;
        return answer;
    }
    
    public void print(){
        String s = "";
        for (int i = 0; i < data.length; i++){
            if (data[i] != null){
                    
                    s = s + data[i]+",";
                    
            }
    }
        System.out.print (s.substring(0,s.length()-1));
    }  
}
