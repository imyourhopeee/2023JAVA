package bookManagement;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class GradeBook {
	private ArrayList<student> list;
	
	public GradeBook() {
		this.list=new ArrayList<>();
	}
	//학생을 등록하는 메소드
	public void saveStudent(student student) {
		list.add(student);
		System.out.println(student.name+"학생이 저장되었습니다.");
		System.out.println("이름: "+student.getName());
		System.out.println("학번: "+student.getNumber());
		System.out.println("성적: "+student.getGrade());
	}
	//전체 평군을 구하는 메소드
	public double averageGrade() {
		double sum=0;
		double avg=1.0;
		
		for (student student :list) {
			sum+= student.getGrade();
		}
		avg=sum/list.size(); //배열의 크기**
		return avg;
	}
	//특정 학번을 가진 학생읭 정보를 검색
	public void searchStudent(String number) {
		for (student student: list) {
			if (student.getNumber().equals(number)) {
			System.out.println("학번이"+number+"인 학생을 찾았습니다. ");
			System.out.println("이름: "+student.getName());
			System.out.println("학번: "+student.getNumber());
			System.out.println("성적: "+student.getGrade());
			return; // **
		}
	}System.out.println("학번이 "+number+"인 학생을 찾을 수 없습니다. ");
}// 학생정보를 화면에 출력
	public void showAllStu() {
		System.out.println("전체 학생은 총"+ list.size()+"명이고, 학생들의 전체 평균 점수는 "+ averageGrade()+"점입니다.");
		for (student student:list) {
			System.out.println(student);
		}
		System.out.println();
	}
	//학생정보를 파일에 출력
	public void printAllStu() {
		try (PrintWriter writer =new PrintWriter(new FileWriter("stu_out.txt"))){
			writer.println("전체 학생은 총: "+list.size()+"명이고, 학생들의 전체 평균 점수는 "+ averageGrade()+"점입니다.");
			for (student student:list) {
				writer.println(student);
			}
			System.out.println("학생 정보가 파일에 저장되었습니다. ");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
