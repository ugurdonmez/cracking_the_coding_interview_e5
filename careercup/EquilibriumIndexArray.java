/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package careercup;

/**
 *
 * @author ugurdonmez
 */
public class EquilibriumIndexArray {
    
    public static void main (String [] args) {
        
        int [] array = {-7,1,5,2,-4,3,0};
        
        System.out.println(balanceArray(array));
        
    }
    
    public static int balanceArray(int[] arr){

        int left = 0;
        int right = arr.length -1;
        int leftSum = 0;
        int rightSum = 0;

        while (right > left){

            if (rightSum >= leftSum){
                leftSum += arr[left];
                left++;
            } else {
                rightSum += arr[right];
                right--;
            }
        }
        return right;
    }
    
}
