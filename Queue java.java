/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue.tugas;

/**
 *
 * @author mifta
 */
public class QueueTugas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    private int maxsize;
    private Object[] queuearray;
    private int head;
    private int tail;
    private int count;

    public void createQueue(int size) {
        maxsize = 5;
        queuearray = new Object[maxsize];
        head = tail = -1;
    }

    public int isEmpty() {
        return head = tail = -1;
    }

    public int isFull() {
        return tail = queuearray.length - 1;
    }
    boolean isEmpty;
    boolean isFull;

    public void Enqueue(Object obj) {
        if (isEmpty) {
            tail = 0;
            queuearray[tail] = obj;
        } else {
            if (isFull) {
                tail++;
                queuearray[tail] = obj;
            } else {
                System.out.println("List overflow");
            }
        }
    }

    public Object Dequeue() {
        Object e;
        int i;
        if (isEmpty) {
            e = queuearray[0];
            for (i = 1; i <= count; i++) {
                queuearray[i - 1] = queuearray[i];
            }
            tail--;
            return e;
        } else {
            System.out.println("List underflow");
        }
        return 0;
    }

    public int clear() {
        head = tail = -1;
        System.out.println("Data Clear");
        return 0;
    }

    public void printQ() {
        System.out.print ("Isi Queue :  ");
    if (isEmpty){
        for (int i = head; i <= maxsize - 1; i++) {
            System.out.print(queuearray[i] + "");
        }
        System.out.println();
    } else{ 
    System.out.print ("Data Kosong");
    }
}
}
