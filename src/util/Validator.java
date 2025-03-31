package util;

import java.util.Scanner;

public class Validator {
    public static int valueInt(Scanner scanner) throws NumberFormatException {
        if(scanner.hasNextInt()) {
            return scanner.nextInt();
        }else {
            throw new NumberFormatException("Dữ liệu nhập vào không phải số nguyên");
        }
    }
    public static float valueFloat(Scanner scanner) throws NumberFormatException {
        if(scanner.hasNextFloat()) {
            return scanner.nextFloat();
        }else {
            throw new NumberFormatException("Dữ liệu nhập vào không phải kiểu số thực float");
        }
    }
    public static double valueDouble(Scanner scanner) throws NumberFormatException {
        if(scanner.hasNextDouble()) {
            return scanner.nextDouble();
        }else {
            throw new NumberFormatException("Dữ liệu nhập vào không phải kiểu số thực double");
        }
    }
    public static Boolean validateBolean(Scanner scanner) throws Exception{
        String value = scanner.nextLine();
        if (value.equals("true") || value.equals("false")) {
            return Boolean.valueOf(value);
        }else {
             throw new Exception("Dữ liệu không hợp lệ");
        }
    }
    public static String validateString(Scanner scanner, int min, int max) throws Exception{
        String value = scanner.nextLine();
        value = value.trim();
        if(value.isEmpty()){
            throw new Exception("Dữ liệu không được để trống!");
        } else if (value.length() < min || value.length() > max) {
            throw new Exception("Độ dài dữ liệu không hợp lệ");
        }else {
            return value;
        }
    }
    public static String validateEmail(Scanner scanner) throws Exception{
        String value = scanner.nextLine();
        String regex = "\"^[a-zA-Z0-9._]+@[a-zA-Z.]+\\\\.[a-zA-Z]{2,6}$\"";
        if(value.matches(regex)) {
            return value;
        }else {
            throw new Exception("Email không đúng định dạng!");
        }
    }
    public static String validatePhone(Scanner scanner) throws Exception{
        String value = scanner.nextLine();
        String regex = "^[096|097|098|086]+\\d{7}$";
        if(value.matches(regex)) {
            return value;
        }else {
            throw new Exception("Số điện thoại không hợp lệ");
        }
    }
}
