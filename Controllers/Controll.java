/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.HangHoa;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Controll {
    ArrayList<HangHoa> lst = new ArrayList<>();
    //in hàng
    public void inHang(ArrayList<HangHoa> lst){
        for (HangHoa hangHoa : lst) {
            System.out.println(hangHoa.toString());
        }
    }
    // in có stt, ghi chu
    public void inAll(){
        for (int i = 0; i < lst.size(); i++) {
            System.out.println(i+1+ "  " + lst.get(i).toString() + "ghichu");
        }
    }
    public void taohang(){
//        ArrayList lst = new ArrayList<>();
        lst.add(new HangHoa("m1", "hang1", 1, 10));
        lst.add(new HangHoa("m2", "hang145", 1, 10));
        lst.add(new HangHoa("m3", "hang142", 1, 160));
        lst.add(new HangHoa("m4", "hang175", 1, 10));
        lst.add(new HangHoa("m5", "hang12", 14, 140));
        lst.add(new HangHoa("m6", "hang136", 1, 10));
        lst.add(new HangHoa("m7", "hang116", 14, 120));
        lst.add(new HangHoa("m8", "hang115", 1, 102));
        lst.add(new HangHoa("m9", "hang1135", 14, 10));
        lst.add(new HangHoa("m10", "hang111", 1, 102));
        
    }
    // nhập hàng
    public HangHoa nhapHang() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập mã của mặt hàng");
        String maHang = sc.nextLine();
        System.out.println("Mời nhập tên của mặt hàng");
        String tenHang = sc.nextLine();
        System.out.println("Mời nhập số lượng của mặt hàng");
        int soLuong = Integer.valueOf(sc.nextLine());
        System.out.println("Mời nhập đơn giá của mặt hàng");
        int donGia = Integer.valueOf(sc.nextLine());
        HangHoa hangHoa = new HangHoa(maHang, tenHang, soLuong, donGia);
        return hangHoa;
    }

    // tìm hàng theo tên
    public void timHangTheoTen(ArrayList<HangHoa> lst) {
        System.out.println("Mời nhập tên của mặt hàng cần tìm");
        Scanner sc = new Scanner(System.in);
        String tenMatHang = sc.nextLine();
        boolean check = false;
        for (int i = 0; i < lst.size(); i++) {
            if (tenMatHang.equalsIgnoreCase(lst.get(i).getTenHang())) {
                System.out.println("Đã tìm thấy mặt hàng");
                System.out.println(lst.get(i).toString());
                check = true; // nếu tìm thấy gán = true
                break;
            }
        }
        if (!check) { // nếu không tìm thấy 
            System.out.println("Không tìm thấy hàng hóa nào có tên" + tenMatHang);
        }
    }

    // tìm hàng theo tên
    public void timHangTheoMa(ArrayList<HangHoa> lst) {
        System.out.println("Mời nhập mã của mặt hàng cần tìm");
        Scanner sc = new Scanner(System.in);
        String maMatHang = sc.nextLine();
        boolean check = false;
        for (int i = 0; i < lst.size(); i++) {
            if (maMatHang.equalsIgnoreCase(lst.get(i).getMaHang())) {
                System.out.println("Đã tìm thấy mặt hàng");
                System.out.println(lst.get(i).toString());
                check = true; // nếu tìm thấy gán = true
                break;
            }
        }
        if (!check) { // nếu không tìm thấy 
            System.out.println("Không tìm thấy hàng hóa nào có tên" + maMatHang);
        }
    }

    

}
