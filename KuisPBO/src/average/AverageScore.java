/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package average;

/**
 *
 * @author Lenovo
 */
public class AverageScore{
    public double awritingexam, acodingtest, ainterviewtest,
            bwritingexam, bcodingtest, binterviewtest;
    public AverageScore(double awescore, double actscore, double aitscore,
            double bwescore, double bctscore, double bitscore){
        this.awritingexam = awescore;
        this.acodingtest = actscore;
        this.ainterviewtest = aitscore;
        this.bwritingexam = bwescore;
        this.bcodingtest = bctscore;
        this.binterviewtest = bitscore;
    }
    
    public double Rata(){
        return ((awritingexam*0.2)+(acodingtest*0.5)+(ainterviewtest*0.3)+
                (bwritingexam*0.4)+(bcodingtest*0.35)+(binterviewtest*0.25))2;
    }

}

