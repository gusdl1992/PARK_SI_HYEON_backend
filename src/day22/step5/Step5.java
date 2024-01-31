package day22.step5;

public class Step5 {
    public static void main(String[] args) {

        // Applicant<T>
            // 왜 T ?? 응모자의 kind 타입을 여러개 할려고
            // 1. Object  2. 제네릭
        /*
            Applicant<Person> applicant1;
            applicant1{
                public Person kind = person1;
            }

         */


        // 1. 모든 사람이 신청 가능
            // 1. 사람 객체
        Person person = new Person();
            // 2. 사람 객체를 등록자1 에 대입.
        Applicant<Person> applicant1 = new Applicant<>(person);
        Course.registerCourse1(applicant1);
        Course.registerCourse1(new Applicant<Worker>(new Worker()) );
        Course.registerCourse1(new Applicant<Student>(new Student()) );
        Course.registerCourse1(new Applicant<HighStudent>(new HighStudent()) );
        Course.registerCourse1(new Applicant<MiddleStudent>(new MiddleStudent()) );

        // 2. 학생들만
        // Course.registerCourse2(applicant1);
        // Course.registerCourse2(new Applicant<Worker>(new Worker()) );
        Course.registerCourse2(new Applicant<Student>(new Student()) );
        Course.registerCourse2(new Applicant<HighStudent>(new HighStudent()) );
        Course.registerCourse2(new Applicant<MiddleStudent>(new MiddleStudent()) );

        // 3. 직장인 및 일반인
        try{
            Course.registerCourse3(applicant1);
            Course.registerCourse3(new Applicant<Worker>(new Worker()) );
             // Course.registerCourse3(new Applicant<Student>(new Student()) );
             // Course.registerCourse3(new Applicant<HighStudent>(new HighStudent()) );
             // Course.registerCourse3(new Applicant<MiddleStudent>(new MiddleStudent()) );
        }catch (Exception e){
            System.out.println(e);
        }
        
        // Integer.parseInt("유재석"); // 실행예외
        // Class.forName("java.spring");   // 일반예외
        
        // 예외 : 예외 클래스 라이브러리 지원 ( 라이브러리 에 없는 오류는 지원X )
            // 1. 일반예외 : 컴파일 전에 예외 검사
            // 2. 실행예외 : 컴파일 후에 예외 검사
        // if
            // 예외( try{}catch(){} ) vs if (흐름제어) : 검사.
            // 데이터 ( 경우의수가 특정하지 않을떄  ) , 미리 만들어진 라이브러리 vs 경우의수가 정해진 값/데이터에 따른 결과값 처리





    } // m e
} // c e
