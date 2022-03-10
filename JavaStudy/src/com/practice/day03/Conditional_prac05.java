package com.practice.day03;

import java.util.Scanner;

public class Conditional_prac05 {
    public static void main(String[] args) {
        
        // Scanner 객체 생성
        Scanner sc = new Scanner(System.in);
        
        // 회원정보 미리 등록
        String myId = "my12";
        String myPw = "password1234";
        
        // 아이디와 비밀번호 입력
        System.out.println("아이디 : ");
        String userId = sc.nextLine();
        System.out.println("비밀번호 : ");
        String userPw = sc.nextLine();
        
        // 미리 등록된 정보와 비교
        if (userId.equals(myId)) {
            if (userPw.equals(myPw)) System.out.println("로그인 성공");
            else System.out.println("비밀번호가 틀렸습니다.");
        } else System.out.println("아이디가 틀렸습니다.");
        
        sc.close();
    }
}
