/**
 * Created by npavlenko on 07.09.16.
 */
 class IQDemo {
    public static void main(String[] args){
        FixedQueue q1 = new FixedQueue(10);
        DynQueue q2 = new DynQueue(5);

        ICharQ iQ;

        char ch;
        iQ = q1;

        for (int i = 0; i <10 ; i++)
            iQ.put((char)('A'+i));
        System.out.print("Содержимое фиксированной очереди: ");
        for (int i = 0; i <10 ; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();

        iQ = q2;
        for (int i = 0; i <10 ; i++)
            iQ.put((char)('Z'-i));
        System.out.print("Содержимое динамической очереди: ");
        for (int i = 0; i <10 ; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }


            

        
    }
}
