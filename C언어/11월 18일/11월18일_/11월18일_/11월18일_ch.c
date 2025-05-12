//
//[����ü]
//
//- ����ü(Structure)�� ?
//-�پ��� ������ Ÿ���� ���� �ϳ��� ���ο� ������ Ÿ���� ���� �� �ֵ��� �ϴ� '����� ���� ������ Ÿ��' == ������ ����
//- �پ��� ������ Ÿ��-- > �ϳ��� ���ο� ������ Ÿ��
//
//- ����ü ���� �� �������� ���(Member)��� �θ�.
//- ����ü�� �̷��� ������� ����ü�� �̷����.
//
//
//
//## ����ü�� ����ϴ� ���� ##
//- 1. ������ �׷�ȭ
//- 2. �ڵ��� ������ ���
//- 3. ���ȭ �� ���� ����
//
//
//======================================================================
//
//[01 ����ü ���� ���]
//
//- ����ü ����
//
//struct Person {			// Person : ����ü �̸�
//	char name[50];		// char�ڷ��� ����ü ��� ����
//	int age;			// int�ڷ��� ����ü ��� ����
//	float helght;		// float�ڷ��� ����ü ��� ����
//};
//
//// ����ü ���� ����
//struct Person person1;		// person1 ������ ���� ( Person ����ü Ÿ�� )
//// person1�� ����ü ������� �����ϰ� ����.
//
//// ������ ����
//strcpy(person1.name, "John");	// strcpy�Լ��� ����Ͽ� ���ڿ� ����
//person1.age = 25;
//person1.height = 175.5;
//
//
//// ������ ���
//printf("�̸� : %s\n", person1.name);
//printf("���� : %d\n", person1.age);
//printf("Ű : %.1f\n", person1.height);
//
//
//======================================================================
//
//[### ����(' . ') ������ ### ]
//
//- ����ü ������ ���(Member)�� �����ϴ� ��������.
//- ��, ����ü ���ο� ���ǵǾ� �ִ� �� �����鿡 ������ �� ���.
//- ������ ����� ����ü ������ ����� ���� �Ҵ�(������ ����) Ȥ�� ���� �б�(������ �б�)�� ����
//
//- ���� ��� ���� )
//
//#include <stdio.h>
//struct Point {		// Point ����ü ����
//	int x;		// Point ����ü ���� ���
//	int y;
//};
//
//int main(void) {
//	// ����ü ���� ����
//	struct Point p1; 	// Point ����ü ����� ���� ���� p1 ����
//
//	p1.x = 10;
//	p1.y = 10;
//
//	printf("x�� �� : %d\n", p1.x);
//	printf("y�� �� : %d\n", p1.y);
//	return 0;
//}
//
//======================================================================
//
//[����ü �迭]
//
//
//#include <stdio.h>
//#include <string.h>
//#pragma warning(disable:4996)
//
//// �л� ������ ���� ����ü ����
//struct Student {
//	char name[50];
//	int age;
//	double gpa;			// gpa == Grade Point Average == ��� ����
//};
//int main(void) {
//
//	���1)
//
//	// �л� ����ü ���� ���� (student1)
//		struct Student student1;
//
//
//	// �л� ���� �Է�("An Se Hyeon", 20, 3.8)
//	strcpy(student1.name, "An Se Hyeon");		// ���ڿ��� ���� ������ name�迭�� ũ�⺸�� ū ���
//	// ���ڿ��� ���� ������ name�迭�� ũ��� ����  ��� == NULL�߰� �Ұ���
//	student1.age = 27;
//	student1.gpa = 3.80;
//
//
//	// �л� ���� ���
//	printf("Student Information : \n Name : %s\n Age : %d\n GPA : %.2f\n", student1.name, student1.age, student1.gpa);
//
//	printf("\n");
//
//	���2)
//
//	// ����ü ���� ����� ���ÿ� �ʱ�ȭ
//		struct Student student2 = { "Blue Bear", 15,5 };
//	printf("Bear 's name : %s\n", student2.name);
//	printf("Bear 's age : %d\n", student2.age);
//	printf("Bear 's gpa : %.2f\n", student2.gpa);
//
//
//
//
//	// ����ü �迭�� ����Ͽ� ���� �л� ���� ����
//	struct Student students[3];
//
//	// ���� �л� ���� �Է�
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
//[Typedef�� ����ü]
//
//- Typedef�� ? : ����� ���� �ڷ����� �����ϴµ� ���Ǵ� Ű����
//
//- Typedef�� �⺻ ���� : typedef + ���� �ڷ��� + ���ο� �̸�
//
//
//- EX) typedef int Newint;		// int��� �ڷ����� Newint�� ���Ǿ�
//-int a = 10;			// int�� ���� a�� 10���� �ʱ�ȭ
//-Newint b = 10;			// int�� ���� b�� 10���� �ʱ�ȭ
//
//-���� �����Ϳ� ����ü, �Լ� �����Ϳ����� ����� ������.
//
//
//
//## ������ ##
//- typedef int* IntPtr;
//IntPtr x, y;			// int* ������ ������ ���� x,y
//
//
//
//## �Լ� ������ ##
//
//#include <stdio.h>
//typedef int(*Operation)(int, int);		// �Լ� ������
//
//Operation add, subtract;			// �Լ� ������ ���� add, subtrach
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
//	int result1 = add(5, 3);	// result1���� 8�� �����.
//	int result2 = subtract(5, 3); // result2���� 2�� �����.
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
//[����ü]
//
//typedef struct {
//	int x;
//	int y;
//} Point;
//
//-��� ����
//Point p1, p2;		// ����ü ���� p1,p2
//
//
//
//-����ü�� typedef�� ���� 01)
//
//#include <stdio.h>
//
//// ����ü ����
//typedef struct {
//	int x;
//	int y;
//} Point;			// int�� x��y ����� ����ִ� Point ����ü ���� 
//
//int main(void) {
//	// typedef�� ����� ����ü ���� ����
//	Point p1 = { 2,5 };
//	Point p2 = { 3,8 };
//
//	// ����ü ���� ���
//	printf("p1 : (%d, %d) \n", p1.x, p1.y);
//	printf("p2 : (%d, %d) \n", p2.x, p2.y);
//	return 0;
//}
//
//
//======================================================================
//
//[����ü ���� 01]
//
//- �л� ������ �����ϴ� ����ü�� Ȱ���Ͽ� ������ �л� ���� ���� ���α׷��� �ۼ��ϼ���
//- ����ڷκ��� �Է¹޾� �� �л��� �̸�, ����, ��� ������ �����ϰ� �̸� ����ü ������ �����ϼ���.
//- �׸��� �� �л��� ������ ����ϼ���.
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
//	//�л�1�� ���� ����
//	printf("�л��� �̸��� �Է��ϼ���>>\n");
//	printf("Name : ");
//	scanf_s("%s", st1.name, sizeof(st1.name));		// st1.name�� �迭�����̱� ������ &������ ���x, 
//	sizeof(st1.name)����ؼ� ����ũ�� ����
//		printf("Age : ");
//	scanf_s("%d", &st1.age);
//	printf("Gpa : ");
//	scanf_s("%f", &st1.gpa);
//
//	//�л�2�� ���� ����
//	printf("\n\n�л��� �̸��� �Է��ϼ���>>\n");
//	printf("Name : ");
//	scanf_s("%s", st2.name, sizeof(st2.name));
//	printf("Age : ");
//	scanf_s("%d", &st2.age);
//	printf("Gpa : ");
//	scanf_s("%f", &st2.gpa);
//
//	//�л�1�� ���� ���
//	printf("\n\nst1�� �л��� ���� : \n");
//	printf("Name : %s\n", st1.name);
//	printf("Age : %d\n", st1.age);
//	printf("Gpa : %.2f\n", st1.gpa);
//
//	//�л�2�� ���� ���
//	printf("\n\nst2�� �л��� ���� : \n");
//	printf("Name : %s\n", st2.name);
//	printf("Age : %d\n", st2.age);
//	printf("Gpa : %.2f\n", st2.gpa);
//
//	return 0;
//}
//
//======================================================================
//
//[����ü ���� 02]
//
//- �簢�� ���� ����
//- ������ ���� ������ ������ Rectangle ����ü�� �����ϰ�, typedef�� ����Ͽ� Rect�� ��Ī�� �����ÿ�.
//
//- ## ���� ##
//- ���� ����(width)
//- ���� ����(height)
//
//- ����ڷκ��� �� ���� �簢�� ������ �Է¹ް�, �� �� �簢���� ���̸� ���Ͽ� ū �簢���� ������ ����ϴ� ���α׷� �ۼ�
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
//	printf("ù��° �簢�� ������ �Է��ϼ���>>>\n");
//	printf("���� ���� :");
//	scanf_s("%lf", &rect1.width);
//	printf("���� ���� :");
//	scanf_s("%lf", &rect1.height);
//
//	printf("\n\n�ι�° �簢�� ������ �Է��ϼ���>>>\n");
//	printf("���� ���� :");
//	scanf_s("%lf", &rect2.width);
//	printf("���� ���� :");
//	scanf_s("%lf", &rect2.height);
//
//	double area1 = calculaterArea(rect1);
//	double area2 = calculaterArea(rect2);
//
//	printf("\n �� �簢���� ���� �� ���");
//	if (area1 > area2) {
//		printf("area1�� �簢���� ���̰� �� Ů�ϴ�>>>>\n");
//		printf("%.2lf", area1);
//	}
//	else if (area1 < area2) {
//		printf("area2�� �簢���� ���̰� �� Ů�ϴ�>>>>\n");
//		printf("%.2lf", area2);
//	}
//	else {
//		printf("�� �簢���� ũ�Ⱑ �����ϴ�.\n");
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
