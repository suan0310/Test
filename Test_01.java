package Test;

public class Test_01 {

	public static void main(String[] args) {
		/*문제 국어 영어 수학 과학 점수를 이용하여 
		 * 합계와 평균을 콘솔에 출력하시오 */
		int kor = 100 , eng = 95, math = 80, sci = 70;
		System.out.println("합계 : "+(kor + eng + math + sci));
		System.out.println("평균 : "+(kor + eng + math + sci)/4.0);
		
		int sum = kor+ eng+math+sci;
		double avg;
		avg= sum/4.0;
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+avg);
	}

}
