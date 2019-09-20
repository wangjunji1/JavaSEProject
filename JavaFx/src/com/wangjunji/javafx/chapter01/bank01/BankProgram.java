package com.wangjunji.javafx.chapter01.bank01;

import org.omg.CORBA.Current;

import java.util.HashMap;
import java.util.Scanner;

public class BankProgram {
    private HashMap<Integer,Integer> accounts = new HashMap<>();
    private double rate = 0.01;
    private int nextacct = 0;
    private int current = 0;
    private Scanner scanner;
    private boolean done = false;

    public static void main(String[] args) {
        BankProgram program = new BankProgram();
    }

    private void run(){
        scanner = new Scanner(System.in);
        while(!done){
            System.out.print("Enter command (0=quit,1=new,2=select,3=deposit,4=loan,5=show,6=interest):");
            int num = scanner.nextInt();

        }
    }

    private void processCommand(int cnum){
    }

    private void quit(){
        done = true;
        System.out.println("Goodbye!");
    }

    private void newAccount(){
        current = nextacct++;
        accounts.put(current,0);
        System.out.println("Your new account number is"+ current);
    }





}
