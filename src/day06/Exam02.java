package day06;

public class Exam02 {

	public static void main(String[] args) {
		// 그림파일만 출력 => .jpg .png
		// 확장자가 jpg와 png인것 없으면 그림파일이 없습니다.
		
		int cnt = 0;

		
		String[] fileName = {
				"이것이자바다jpg.java","java의정석.java","array.txt",
				"array.java","String.txt", "StringMethod.jpg",
				"ArrayMethod.jpg", "method.png", "javaMethod.png"
		};
		
		for(int i=0; i<fileName.length; i++) {

			//System.out.println(fileName[i].lastIndexOf("."));
			if(fileName[i].substring(fileName[i].lastIndexOf(".")).equals(".jpg") 
					|| fileName[i].substring(fileName[i].lastIndexOf(".")).equals(".png")) {
				cnt++;
				System.out.println(fileName[i]);
			}
			
		}
		
		
		if(cnt == 0) {
			System.out.println("그림 파일이 없습니다");
		} else {
			System.out.println("검색결과 : " +cnt+"개");
		}

	}

}
