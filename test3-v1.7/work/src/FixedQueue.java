/**
 * Created by npavlenko on 07.09.16.
 */
 class FixedQueue implements ICharQ {
    private char q[];
    private int putloc, getloc; //индексы вставляемых и извлекаемых элементов

    public FixedQueue(int size){
        q = new char[size+1]; //выделение памяти для очереди
        putloc=getloc=0;
    }

    //поместить символ в очередеь
    public void put(char ch) {
        if (putloc==q.length-1| ((putloc==q.length-1) & (getloc==0))){
            System.out.println(" - Очередь заполнена.");
            return;
        }
        putloc++;
        if(putloc==q.length) putloc = 0;
        q[putloc] = ch;
    }

    public char get() {
        if(getloc==putloc ){
            System.out.println(" - Очередь пуста.");
            return (char) 0;
        }
       getloc++;
        if(getloc==q.length) getloc = 0;
        return q[getloc];
    }
}
