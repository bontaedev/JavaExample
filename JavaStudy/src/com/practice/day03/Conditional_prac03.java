package com.practice.day03;

import java.util.Scanner;

public class Conditional_prac03 {
    public static void main(String[] args) {
 
        // Scanner 객체 생성
        Scanner sc = new Scanner(System.in);
        
        // 점수 입력 부분
        System.out.print("국어점수 : ");
        int korScore = Integer.parseInt(sc.nextLine());
        System.out.print("수학점수 : ");
        int mathScore = Integer.parseInt(sc.nextLine());
        System.out.print("영어점수 : ");
        int engScore = Integer.parseInt(sc.nextLine());
        
        // 점수 계산
        int totalScore = korScore + mathScore + engScore;
        double avgScore = totalScore / 3; // 과목 평균
        
        // 조건식
        boolean isPass = (korScore >= 40) && 
                        (mathScore >= 40) && 
                        (engScore >=40) && 
                        (avgScore >= 60);
        
        // 제어문
        if (isPass) {
            System.out.println("국어점수 : " + korScore + " 수학점수 : " + mathScore + " 영어점수 : " + engScore);
            System.out.println("합계 : " + totalScore);
            System.out.println("평균 : " + avgScore);
            System.out.println("축하합니다. 합격입니다!");
        } else {
            System.out.println("불합격입니다.");
        }
        
        sc.close();
    }
}
 

