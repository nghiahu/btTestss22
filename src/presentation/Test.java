package presentation;

import util.Validator;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("************************MENU TEST**********************");
            System.out.println("1. Kiểm tra kiểu số nguyên");
            System.out.println("2. Kiểm tra kiểu float");
            System.out.println("3. Kiểm tra kiểu double");
            System.out.println("4. Kiểm tra kiểu Bolean");
            System.out.println("5. Kiểm tra kiểu String");
            System.out.println("6. Kiểm tra email");
            System.out.println("7. Kiểm tra số điện thoại di động Việt Nam");
            System.out.println("8. Thoát");
            System.out.print("Lựa chọn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    try {
                        System.out.print("Nhập vào số nguyên: ");
                        System.out.println("Số nguyên vừa nhập: " + Validator.valueInt(scanner));
                        scanner.nextLine();
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        System.out.print("Nhập vào số thực float: ");
                        System.out.println("Số thực vừa nhập: " + Validator.valueFloat(scanner));
                        scanner.nextLine();
                    }catch (NumberFormatException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        System.out.print("Nhập vào số thực double: ");
                        System.out.println("Số thực vừa nhập: " + Validator.valueDouble(scanner));
                        scanner.nextLine();
                    }catch (NumberFormatException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    try {
                        System.out.print("Nhập vào giá trị bolean: ");
                        System.out.println("Giá trị vừa nhập: " + Validator.validateBolean(scanner));
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    try {
                        System.out.print("Nhập vào một chuỗi: ");
                        System.out.println("Chuỗi vừa nhập: " + Validator.validateString(scanner,10,100));
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 6:
                    try {
                        System.out.print("Nhập vào một email: ");
                        System.out.println("email vừa nhập: " + Validator.validateEmail(scanner));
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 7:
                    try {
                        System.out.print("Nhập vào một số điệ thoai: ");
                        System.out.println("Số điện thoại vừa nhập: " + Validator.validatePhone(scanner));
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 8:
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }
        }while (true);
    }
}
