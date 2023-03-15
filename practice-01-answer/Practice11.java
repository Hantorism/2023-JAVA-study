public class Practice11 {

	public static void main(String[] args) {
		String str1 = "휴 강";
		System.out.println(str1);

		String str2 = "의에 늦었네요. 수업 시작하겠습니다.";
		str1 += str2; // str1에는 str1과 str2의 내용을 합친 문자열이 새롭게 할당된다.

		System.out.println(str1);
	}
}
/*
출력결과
휴 강
휴 강의에 늦었네요. 수업 시작하겠습니다.
*/