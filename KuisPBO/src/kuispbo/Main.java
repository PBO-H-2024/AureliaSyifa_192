//123220192_AureliaSyifarayaYumardi

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kuispbo;

import average.AverageScore;
import java.util.Scanner;
import view.GUI;
import view.GUI2;

/**
 *
 * @author Lenovo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double name, awe, act, ait, bwe, bct, bit;
        int id;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Final Score Calculation");
        System.out.println("");
        System.out.println("Please fill in the reqirements below: ");
        System.out.println("Name: ");
        name = scanner.nextDouble();
        System.out.println("ID: ");
        id = scanner.nextInt();
        System.out.println("");
        System.out.println("== Input Test Scores ==");
        System.out.println("");
        System.out.println("Android Developer");
        System.out.println("Writing Exam: ");
        awe = scanner.nextDouble();
        System.out.println("Coding test: ");
        act = scanner.nextDouble();
        System.out.println("Interview Test: ");
        ait = scanner.nextDouble();
        System.out.println("");
        System.out.println("Web Developer");
        System.out.println("Writing Exam: ");
        bwe = scanner.nextDouble();
        System.out.println("Coding test: ");
        bct = scanner.nextDouble();
        System.out.println("Interview Test: ");
        bit = scanner.nextDouble();
        AverageScore a = new AverageScore(awe, act, ait, bwe, bct, bit);
        System.out.println("");
        System.out.println("Average score: " + a.Rata());
        if(a.Rata()>=85){
            GUI gui = new GUI();
        }else{
            GUI2 gui2 = new GUI2();
        }
    }
    
}
