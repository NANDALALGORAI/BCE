package com.company;

public class Student {
    String AdmissionId;
    String Name;
    String Fathers_Name;
    String Branch;
    char Sec;
    int Roll;
    String Address;
    String Hostel;
    float fees;
    int Mob;
    char Gender;
    boolean passout;

    public static String Name() {
        String name = "Nandalal Gorai";
        System.out.print("My Name is ");
        return name;
    }

    public static void main(String[] args) {
        System.out.println(Name());
    }

}