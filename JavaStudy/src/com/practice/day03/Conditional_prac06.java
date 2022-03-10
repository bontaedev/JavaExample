package com.practice.day03;

import java.util.Scanner;

public class Conditional_prac06 {
    public static void main(String[] args) {
        
        /* 사용자에게 관리자, 회원, 비회원 중 하나를 입력 받아 각 등급이 행할 수 있는 권한을 출력하세요.
         * 
         *  - 관리자 : 회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성
         *  - 회원 : 게시글 작성, 게시글 조회, 댓글 작성
         *  - 비회원 : 게시글 조회
         * 
         * */
        
        // Scanner 객체 생성
        Scanner sc = new Scanner(System.in);
        
        // 회원 등급 입력
        System.out.println("권한을 확인하고자 하는 회원 등급 : ");
        String role = sc.nextLine();
        
        // 회원 등급별 권한 출력
        if (role.equals("관리자")) System.out.println("회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성");
        else if (role.equals("회원")) System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
        else if (role.equals("비회원")) System.out.println("게시글 조회");
        else System.out.println("올바르지 않은 값입니다.");
        
    }
}
 
