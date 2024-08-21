/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathutil;

/**
 *
 * @author ADMIN
 */
public class MathUtil {
    /*
        n! = 1.2.3.4.5...n
        Quy ước: 0! = 1! = 1
        Ko tính giai thừa cho số âm
        20! là vừa khớp kiểu long, kiểu long tối đa 18 con số 0
        21! lố kiểu long 
        nếu đưa vào âm, 21 giai thừa, ta éo tính, ta đập vào mặt ai xài hàm một cái ngoại lệ, chửi éo tính được
    */
    public static long getFactorial(int n){
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid argument. n must be between 0 ... 20");
        }
        
        if (n == 0 || n == 1) {
            return 1;
        }//dừng ngay khi n đặc biệt
        
        //xuống đến đây, n = 2...20 
        long product = 1;
        for (int i = 2; i <= n; i++) {
            product *= i;
        }
        
        return product;
    }
}
