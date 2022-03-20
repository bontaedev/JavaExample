package com.exam.day08_OOP01.jukebox;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class Run {
	public static void main(String[] args) throws JavaLayerException, IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println(" 🔅 쥬크박스 🔅 ");
		System.out.println("플레이 하고 싶은 음악을 선택해주세요.");
		System.out.println("1. 음악1");
		System.out.println("2. 음악2");
		System.out.println("3. 음악3");
		System.out.println("4. 프로그램 종료");
		System.out.print("음악 선택 >> ");
		int menu = Integer.parseInt(sc.nextLine());
		
		
		// 하드디스크에 존재하는 파일을 읽는 작업
		// 컴퓨터는 런타임 전까지 파일이 있는지 모름 (Exception)
		try {
			FileInputStream fis = null;
			if (menu == 1) {
				fis = new FileInputStream("/Users/aaronkoo/Desktop/Good News.mp3");
			} else if (menu == 2) {
				fis = new FileInputStream("/Users/aaronkoo/Desktop/Goodbyes.mp3");
			} else if (menu == 3) {
				fis = new FileInputStream("/Users/aaronkoo/Desktop/I MEAN I MEAN..mp3");
			} else if (menu == 4) {
				System.out.println("쥬크박스를 종료합니다.");
			}
			// 외부 라이브러리 사용
			Player playMP3 = new Player(fis);
			playMP3.play();
			
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("cannot find music :(");
		}
		
	}
}
