package ex08;

class Student {
// 공유 (static)영역 할당 : 클래스 변수
    static int count =0;

//힙 영역 (non-static) 영역할당: 인스턴스 변수
    int id;
    String name;


Student(int id, String name){
            count++;
            this.id = id;
            this.name = name;
        }

}