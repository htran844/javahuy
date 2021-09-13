/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Controllers.Controll;
import Models.HangHoa;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class MainHangHoa {

    public static void main(String[] args) {
        // tao class contoll và chạy hàm tạo
        Controll cn = new Controll();
        cn.taohang();
        // in ra
        cn.inAll();
    }
}
