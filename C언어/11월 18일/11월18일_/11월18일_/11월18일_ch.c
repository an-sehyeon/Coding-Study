//
//[구조체]
//
//- 구조체(Structure)란 ?
//-다양한 데이터 타입을 묶어 하나의 새로운 데이터 타입을 만들 수 있도록 하는 '사용자 정의 데이터 타입' == 데이터 구조
//- 다양한 데이터 타입-- > 하나의 새로운 데이터 타입
//
//- 구조체 안의 각 변수들을 멤버(Member)라고 부름.
//- 구조체는 이러한 멤버들의 집합체로 이루어짐.
//
//
//
//## 구조체를 사용하는 이유 ##
//- 1. 데이터 그룹화
//- 2. 코드의 가독성 향상
//- 3. 모듈화 및 유지 보수
//
//
//======================================================================
//
//[01 구조체 정의 방법]
//
//- 구조체 정의
//
//struct Person {			// Person : 구조체 이름
//	char name[50];		// char자료형 구조체 멤버 변수
//	int age;			// int자료형 구조체 멤버 변수
//	float helght;		// float자료형 구조체 멤버 변수
//};
//
//// 구조체 변수 선언
//struct Person person1;		// person1 변수를 선언 ( Person 구조체 타입 )
//// person1은 구조체 멤버들을 포함하고 있음.
//
//// 데이터 저장
//strcpy(person1.name, "John");	// strcpy함수를 사용하여 문자열 저장
//person1.age = 25;
//person1.height = 175.5;
//
//
//// 데이터 출력
//printf("이름 : %s\n", person1.name);
//printf("나이 : %d\n", person1.age);
//printf("키 : %.1f\n", person1.height);
//
//
//======================================================================
//
//[### 온점(' . ') 연산자 ### ]
//
//- 구조체 변수의 멤버(Member)에 접근하는 연산자임.
//- 즉, 구조체 내부에 정의되어 있는 각 변수들에 접근할 때 사용.
//- 온점을 사용해 구조체 변수의 멤버에 값을 할당(데이터 저장) 혹은 값을 읽기(데이터 읽기)가 가능
//
//- 온점 사용 예제 )
//
//#include <stdio.h>
//struct Point {		// Point 구조체 생성
//	int x;		// Point 구조체 구성 요소
//	int y;
//};
//
//int main(void) {
//	// 구조체 변수 선언
//	struct Point p1; 	// Point 구조체 멤버를 담은 변수 p1 선언
//
//	p1.x = 10;
//	p1.y = 10;
//
//	printf("x의 값 : %d\n", p1.x);
//	printf("y의 값 : %d\n", p1.y);
//	return 0;
//}
//
//======================================================================
//
//[구조체 배열]
//
//
//#include <stdio.h>
//#include <string.h>
//#pragma warning(disable:4996)
//
//// 학생 정보를 담을 구조체 정의
//struct Student {
//	char name[50];
//	int age;
//	double gpa;			// gpa == Grade Point Average == 평균 학점
//};
//int main(void) {
//
//	방법1)
//
//	// 학생 구조체 변수 생성 (student1)
//		struct Student student1;
//
//
//	// 학생 정보 입력("An Se Hyeon", 20, 3.8)
//	strcpy(student1.name, "An Se Hyeon");		// 문자열이 내가 지정한 name배열의 크기보다 큰 경우
//	// 문자열이 내가 지정한 name배열의 크기와 같은  경우 == NULL추가 불가능
//	student1.age = 27;
//	student1.gpa = 3.80;
//
//
//	// 학생 정보 출력
//	printf("Student Information : \n Name : %s\n Age : %d\n GPA : %.2f\n", student1.name, student1.age, student1.gpa);
//
//	printf("\n");
//
//	방법2)
//
//	// 구조체 변수 선언과 동시에 초기화
//		struct Student student2 = { "Blue Bear", 15,5 };
//	printf("Bear 's name : %s\n", student2.name);
//	printf("Bear 's age : %d\n", student2.age);
//	printf("Bear 's gpa : %.2f\n", student2.gpa);
//
//
//
//
//	// 구조체 배열을 사용하여 여러 학생 정보 제공
//	struct Student students[3];
//
//	// 여러 학생 정보 입력
//	strcpy(students[0].name, "Alice");
//	students[0].age = 21;
//	students[0].gpa = 3.9;
//
//	strcpy(students[1].name, "Bob");
//	students[1].age = 22;
//	students[1].gpa = 3.7;
//
//	strcpy(students[2].name, "Charlie");
//	students[2].age = 20;
//	students[2].gpa = 2.1;
//
//	printf("\n");
//
//	printf("Students Information : \n");
//
//	for (int i = 0; i < 3; i++) {
//		printf("Student Information : \n");
//		printf("Name : %s\n", students[i].name);
//		printf("Age : %d\n", students[i].age);
//		printf("Gpa: %.2f\n", students[i].gpa);
//		printf("\n");
//	}
//	return 0;
//}
//
//======================================================================
//
//[Typedef와 구조체]
//
//- Typedef란 ? : 사용자 정의 자료형을 생성하는데 사용되는 키워드
//
//- Typedef의 기본 구문 : typedef + 기존 자료형 + 새로운 이름
//
//
//- EX) typedef int Newint;		// int라는 자료형과 Newint는 동의어
//-int a = 10;			// int형 변수 a를 10으로 초기화
//-Newint b = 10;			// int형 변수 b를 10으로 초기화
//
//-물론 포인터와 구조체, 함수 포인터에서도 사용이 가능함.
//
//
//
//## 포인터 ##
//- typedef int* IntPtr;
//IntPtr x, y;			// int* 형태의 포인터 변수 x,y
//
//
//
//## 함수 포인터 ##
//
//#include <stdio.h>
//typedef int(*Operation)(int, int);		// 함수 포인터
//
//Operation add, subtract;			// 함수 포인터 변수 add, subtrach
//
//int addFunction(int a, int b) {
//	return a + b;
//}
//
//int subtractFunction(int a, int b) {
//	return a - b;
//}
//
//int main(void) {
//
//	add = addFunction;
//	subtract = subtractFunction;
//
//	int result1 = add(5, 3);	// result1에는 8이 저장됨.
//	int result2 = subtract(5, 3); // result2에는 2가 저장됨.
//
//	printf("Result1 = %d\n", result1);
//	printf("Result2 = %d\n", result2);
//
//	return 0;
//}
//
//
//======================================================================
//
//[구조체]
//
//typedef struct {
//	int x;
//	int y;
//} Point;
//
//-사용 예시
//Point p1, p2;		// 구조체 변수 p1,p2
//
//
//
//-구조체와 typedef의 예제 01)
//
//#include <stdio.h>
//
//// 구조체 정의
//typedef struct {
//	int x;
//	int y;
//} Point;			// int형 x와y 멤버를 담고있는 Point 구조체 생성 
//
//int main(void) {
//	// typedef를 사용한 구조체 변수 선언
//	Point p1 = { 2,5 };
//	Point p2 = { 3,8 };
//
//	// 구조체 변수 사용
//	printf("p1 : (%d, %d) \n", p1.x, p1.y);
//	printf("p2 : (%d, %d) \n", p2.x, p2.y);
//	return 0;
//}
//
//
//======================================================================
//
//[구조체 문제 01]
//
//- 학생 정보를 저장하는 구조체를 활용하여 간단한 학생 정보 관리 프로그램을 작성하세요
//- 사용자로부터 입력받아 두 학생의 이름, 나이, 평균 학점을 저장하고 이를 구조체 변수에 저장하세요.
//- 그리고 두 학생의 정보를 출력하세요.
//
//#include <stdio.h>
//
//struct Student {
//
//	char name[50];
//	int age;
//	float gpa;
//
//
//
//};
//int main(void) {
//
//	struct Student st1, st2;
//
//	//학생1의 정보 저장
//	printf("학생의 이름을 입력하세요>>\n");
//	printf("Name : ");
//	scanf_s("%s", st1.name, sizeof(st1.name));		// st1.name은 배열형태이기 때문에 &연산자 사용x, 
//	sizeof(st1.name)사용해서 공간크기 설정
//		printf("Age : ");
//	scanf_s("%d", &st1.age);
//	printf("Gpa : ");
//	scanf_s("%f", &st1.gpa);
//
//	//학생2의 정보 저장
//	printf("\n\n학생의 이름을 입력하세요>>\n");
//	printf("Name : ");
//	scanf_s("%s", st2.name, sizeof(st2.name));
//	printf("Age : ");
//	scanf_s("%d", &st2.age);
//	printf("Gpa : ");
//	scanf_s("%f", &st2.gpa);
//
//	//학생1의 정보 출력
//	printf("\n\nst1의 학생의 정보 : \n");
//	printf("Name : %s\n", st1.name);
//	printf("Age : %d\n", st1.age);
//	printf("Gpa : %.2f\n", st1.gpa);
//
//	//학생2의 정보 출력
//	printf("\n\nst2의 학생의 정보 : \n");
//	printf("Name : %s\n", st2.name);
//	printf("Age : %d\n", st2.age);
//	printf("Gpa : %.2f\n", st2.gpa);
//
//	return 0;
//}
//
//======================================================================
//
//[구조체 문제 02]
//
//- 사각형 정보 저장
//- 다음과 같은 정보를 가지는 Rectangle 구조체를 정의하고, typedef를 사용하여 Rect로 별칭을 지으시오.
//
//- ## 조건 ##
//- 가로 길이(width)
//- 세로 길이(height)
//
//- 사용자로부터 두 개의 사각형 정보를 입력받고, 이 두 사각형의 넓이를 비교하여 큰 사각형의 정보를 출력하는 프로그램 작성
//
//
//#include <stdio.h>
//struct Rectangle {
//	double width;
//	double height;
//};
//typedef struct Rectangle Rect;
//
//double calculaterArea(Rect rect) {
//	return rect.width * rect.height;
//}
//
//
//
//int main(void) {
//	Rect rect1, rect2;
//
//	printf("첫번째 사각형 정보를 입력하세요>>>\n");
//	printf("가로 길이 :");
//	scanf_s("%lf", &rect1.width);
//	printf("세로 길이 :");
//	scanf_s("%lf", &rect1.height);
//
//	printf("\n\n두번째 사각형 정보를 입력하세요>>>\n");
//	printf("가로 길이 :");
//	scanf_s("%lf", &rect2.width);
//	printf("세로 길이 :");
//	scanf_s("%lf", &rect2.height);
//
//	double area1 = calculaterArea(rect1);
//	double area2 = calculaterArea(rect2);
//
//	printf("\n 두 사각형의 넓이 비교 결과");
//	if (area1 > area2) {
//		printf("area1의 사각형의 넓이가 더 큽니다>>>>\n");
//		printf("%.2lf", area1);
//	}
//	else if (area1 < area2) {
//		printf("area2의 사각형의 넓이가 더 큽니다>>>>\n");
//		printf("%.2lf", area2);
//	}
//	else {
//		printf("두 사각형의 크기가 같습니다.\n");
//		printf("%.2lf", area1);
//	}
//
//
//
//	return 0;
//}
//
//
//
//
//
//
