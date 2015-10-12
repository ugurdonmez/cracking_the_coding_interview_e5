/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter_03;

/**
 *
 * @author ugurdonmez
 */
public class Solution_01 {
    
    public static void main(String [] args) {
        
        ThreeStack myStack = new ThreeStack();
        
        System.out.println(myStack);
        
        myStack.push(4, 1);
        myStack.push(5, 1);
        
        myStack.push(1, 2);
        myStack.push(2, 2);
        
        myStack.push(3, 3);
        myStack.push(7, 3);
        
        System.out.println(myStack);
        
        myStack.stack1.shift();
        System.out.println(myStack);
        
    }
    
}

class ThreeStack {
    
    int totalSize;
    StackData stack1;
    StackData stack2;
    StackData stack3;
    
    Data[] array;
    
    public ThreeStack() {
        
        int i;
        
        totalSize = 30;
        
        array = new Data[30];
        
        for (i = 0 ; i < 30 ; i++) {
            array[i] = new Data();
        }
        
        stack1 = new StackData(totalSize, 0, 0, 30, array);
        stack2 = new StackData(totalSize, 10, 10, 30, array);
        stack3 = new StackData(totalSize, 20, 20, 30, array);
    }
    
    public boolean isFreeSpace() {
        if ( totalSize > stack1.size + stack2.size + stack3.size ) {
            return true;
        } else {
            return false;
        }
    }
    
    public void push(int number, int stackNo) {
        if (stackNo == 1) {
            stack1.push(number);
        } else if (stackNo == 2) {
            stack2.push(number);
        } else if (stackNo == 3) {
            stack3.push(number);
        }
    }
    
    @Override
    public String toString() {
        
        StringBuilder buff = new StringBuilder();
        
        for(Data data:array) {
            buff.append(data).append("\n");
        }
        
        return buff.toString();
    }
    
}

class Data {
    int number;
    boolean valid;
    
    public Data() {
        number = -1;
        valid = true;
    }
    
    @Override
    public String toString() {
        if (this.valid == true) {
            return number + " true";
        } else {
            return number + " false";
        }
    }
}

class StackData {
    
    int size;
    int first;
    int last;
    
    int totalArraySize;
    
    Data[] array;

    public StackData(int size, int first, int last, int totalArraySize, Data[] array) {
        this.size = size;
        this.first = first;
        this.last = last;
        this.totalArraySize = totalArraySize;
        this.array = array;
    }
        
    public boolean isFreeForShift() {
        return array[(last+1) % totalArraySize].valid == true;
    }
    
    public boolean isFreeForPush() {
        return array[last].valid;
    }
    
    public void shift() {
        
        // TODO: change true false things
        
        if (first < last) {
            for (int i=last ; i >= first ; i--) {
                array[(i+1)%totalArraySize] = array[i];
            }
        } else {
            for(int i=last ; i >= 0 ; i--) {
                array[(i+1)%totalArraySize] = array[i];
            }
            array[totalArraySize-1] = array[0];
            for(int i=totalArraySize-2; i>= first ; i--) {
                array[(i+1)%totalArraySize] = array[i];
            }
        }
    }
    
    public void push(int number) {
        array[last].number = number;
        array[last].valid = false;
                
        last = (last + 1) % totalArraySize;
        size = size + 1;
    }
    
    public int pop() throws Exception {
        if (size == 0) {
            throw new Exception("Stack is empty.");
        } else if (last != 0) {
            last = last - 1;
            size = size - 1;
            array[last].valid = true;
            return array[last].number;
        } else {
            last = totalArraySize - 1;
            size = size - 1;
            array[last].valid = true;
            return array[last].number;
        }
    }
    
}
