package test.main;
/*
 *  3. 비교연산자 테스트
 *     비교연산의 결과는 boolean type 을 리턴해준다. 
 *  ==, !=, >, >=, <, <= 
 */
public class MainClass03 {
   public static void main(String[] args) {
      
      boolean result1 = 10 == 10; //true
      boolean result2 = 10 != 10; //false
      boolean result3 = 10 > 100; //false;
      boolean result4 = 10 >= 10; //true
      boolean result5 = 10 < 100; //true
      boolean result6 = 10 <= 10; //true   
      
      // String type 변수 name 에 null 대입하기 
      String name=null;
      // int size=name.length(); 위치값이 안들어있어서 함수 못불러옴 에러
      // NullPointerException = 참조값 없음 , 문법적으로는 맞지만 실행하면 에러
      
      // null 인지 아닌지 비교가 가능하다 (즉 java 에서 null 값은 비교가 가능)
      boolean result7 = name == null; //true
      boolean result8 = name != null; //false
      
   }
}
