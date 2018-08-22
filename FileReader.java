package day5_180822_ArrayStudy;

// java FileReader [읽고자 하는 파일명1] [읽고자 하는 파일명2]
public class FileReader {

	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("Usage : java FileReader [읽고자하는 파일명1] [읽고자하는 파일명2]");
			return;
		} 
	String fileName1 = args[0];
	String fileName2 = args[1];

	System.out.println(fileName1);
	System.out.println(fileName2);
		
	}

}

// 실행하려면 Run as - Run Configuration에서 Arguments - Program Argument에 값을 넣어주면 된다.