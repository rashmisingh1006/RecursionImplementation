/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursionimplementation;

/**
 *
 * @author rashmi
 */
public class Recursion {
    int fact(int n) {
        if (n >= 1)
        {
         return n * fact(n - 1);
        }
        else
        {
         return 1;
        }
        
    }
    
}
