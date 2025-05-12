//
//[문자 입출력 라이브러리]
//
//- int getchar(void) : 하나의 문자를 읽어서 반환
//- void putchar(int c) : 변수 c에 저장된 문자를 출력
//- scanf("%c", &c) : 하나의 문자를 읽어 변수 c에 저장
//- printf("%c", c) : 변수 c에 저장된 문자를 출력
//
//
//==============================================================================
//
//[문자 입출력 예시]
//
//#include <stdio.h>
//int main() {
//
//	int ch;
//
//	while (1) {				// while문 조건 : true라면
//		ch = getchar();		// 사용자로부터 하나의 문자를 입력받고 ch에 저장
//		if (ch == 'q') {		// 입력받은 문자가 q라면
//			break;		// while문 탈출
//		}
//		putchar(ch);		// 변수 ch에 저장된 값 출력
//
//	}
//
//	return 0;
//}
//
//
//
//==============================================================================
//
//
//[문자열 단위 입출력 함수]
//
//
//#include <stdio.h>
//int main() {
//
//	char str[10];
//	printf("문자열을 입력하세요>>>");
//
//	fgets(str, 10, stdin);			// fgets() 함수를 사용하여 문자열을 입력받음
//	// stdin : 표준 입력 스트림, 즉 키보드
//	// 최대 9개의 문자를 입력가능
//	// why? 마지막 NUL문자를 고려
//
//	puts(str);				// puts() 함수를 사용하여 입력받은 문자열을 출력
//	// 자동 줄바꿈 (개행문자\n)을 가짐.
//	return 0;
//}
//
//
//
//==============================================================================
//
//
//[문자열 처리 함수]
//
//- 1. < string.h > : C언어 표준 라이브러리의 헤더 파일 중 하나
//- 예) strcpy, strcat, strlen, strcmp, strstr 등과 같은 문자열 함수들은 이 헤더 피일에 정의
//
//
//(-1 - 1. strlen(str) : str문자열에서 NUL문자 제외 나머지 문자열 길이 반환)
//
//#include <stdio.h>
//#include <string.h>
//int main(void) {
//
//	char str[] = "Hello, World";		// 문자형 str배열에 Hello, World 값 저장
//	int length = strlen(str);		// 정수형 length변수에 str변수값의 길이 반환 저장
//	printf("%d\n", length);		// str 값의 길이 출력
//
//
//	return 0;
//}
//
//
//
//(-1 - 2. strcpy(str1, str2) : str 2 == 복사 ==> str1)
//
//
//#include <stdio.h>
//#include <string.h>
//#pragma warning(disable:4996)		
//int main(void) {
//
//	char source[] = "Hello!";		// source 배열 변수에 Hello World! 값 저장
//	char destination[] = "HAHAHAHAHA";	// destination [20]크기 배열 변수 생성
//
//	strcpy(destination, source);		// strcpy 복사 함수 사용해서 source값을 복사해서 
//	// destination 앞에 붙여넣기
//
//	destination[13] = 'H';		// EX*)
//
//	printf("%s\n", destination);
//
//
//	return 0;
//}
//
//********strcpy 함수는 str1 문자열 크기를 검사 x***********
//******** str2 문자열 크기가 str1보다 클 경우***********
//******** 버펴(buffer) 오버플로우(Over Flow)***********
//
//EX*)
//********* 붙여넣기할 str2보다 str1이 크기가 클경우 str1의 값도 이어서 출력하려면************
//********* 문자열 끝 인덱스에 자동으로 \o이 붙으므로 \o이 붙는 위치에************
//********* 나타낼 문자로 바꿔줘야됨************
//
//
//
//(-1 - 3. strncpy(str1, str2, count) : count 개수만큼 str2 == 복사 ==> str1)
//
//
//#include <stdio.h>
//#include <string.h>
//#pragma warning(disable:4996)
//int main(void) {
//
//	char source[] = "Hello, World!";
//	char destination[20];
//
//	strncpy(destination, source, 5);		// source에서 최대 5개의 문자를 복사
//
//	destination[5] = '\0';			// 복사가 끝난 뒤, destination 문자열을 종료하는
//	// 널 문자('\0')를 수동으로 추가
//
//	printf("%s\n", destination);			// "Hello"를 출력
//
//	return 0;
//}
//
//
//
//-번외) 왜 strcpy와 strncpy는 안전하지 않은 함수일까 ?
//
//-이는 함수의 동작 방식 때문인데 예를 들면
//- 복사할 문자열의 길이가 지정된 길이보다 짧은 경우, 즉 str1이 str2보다 길이가 짧은 경우, 혹은 그 반대의 경우
//- ==> 이는 \0(nul 문자)가 채워지지 않거나 \o을 추가로 채워야하는 경우
//
//
//
//
//(-1 - 4. strcat(str1, str2) : str1에 str2를 연결)
//
//
//#include <stdio.h>
//#include <string.h>
//#pragma warning(disable:4996)
//int main(void) {
//
//	char str1[20] = "Hello , ";		// char형 str1배열에 Hello , 문자열값 저장
//	char str2[] = "World!";		// char형 str2배열에 World! 문자열값 저장
//
//	strcat(str1, str2);			// str1의 값에 str2의 값을 연결
//	printf("%s\n", strcat(str1, str2));
//
//
//	return 0;
//}
//
//
//
//
//
//(-1 - 5. strncat(str1, str2, count) : count개수만큼만 str1에 str2를 연결)
//
//- 번외) 왜 strcat은 안전하지 않은 함수일까 ?
//
//-1. 버퍼오버플로우 가능성 0
//- str1의 끝에서 str2의 문자열 복사가 이루어짐.이때 str1의 버퍼 크기가 작다면 버퍼오버플로우 발생
//- 이로 인해 메모리 오염, 보안 문제 초래 0
//
//- 2. 널 종료 문자 누락
//- 두번째 문자열이 첫번째 문자열 뒤에 복사한 후 \o(nul문자)를 추가하지 않아서!(수동 추가 필요)
//
//
//
//
//
//(-1 - 6. strcmp(str1, str2) : 문자열 비교)
//- 두 문자열이 동일하면 0을 반환
//- str1 > str2보다 사전적으로 앞에 나오면 음수 반환
//- str1 < str2보다 사전적으로 뒤에 나오면 양수 반환
//
//
//
//
//(-1 - 7. strcmps(str1, str2.count) : 각 문자열의 앞에서부터 원하는 개수만큼만 비교)
//
//#include <stdio.h>
//#include <string.h>
//int main(void) {
//
//	char str1[] = "apple";
//	char str2[] = "banana";
//
//	int result = strcmp(str1, str2);
//	printf("%d\n", result);		// -1
//	// "apple"이 "basnsn"보다 사전적으로 앞에 있음 
//
//
//	return 0;
//}
//
//
//(-1 - 8. strstr(str, target) : 문자열 검색, str에서 target을 검색
//
//
//#include <stdio.h>
//#include <string.h>
//	int main(void) {
//
//	char str[] = "This is a test string";
//	char target[] = "test";
//
//	char* result = strstr(str, target);
//
//	printf("%c\n", *result);		// 문자 't'
//	printf("%s\n", result);		// 문자열 "test string"
//
//
//	return 0;
//}
//
//
//
//
//(-1 - 9. strcspn(str1, str2) : str1에서 str2에 있는 문자들 중 처음으로 나타내는 것을 찾고 이에대한 인덱스 반환)
//
//
//
//#include <stdio.h>
//#include <string.h>
//int main(void) {
//
//	char str[] = "Hello, World!";		// str에 Hello, World! 문자 저장
//	char chars[] = " ,!?";			// chars에 ,!? 특수기호 저장
//
//	size_t index = strcspn(str, chars);	// str저장된 문자 중 chars에 저장된 문자들 중 처음으로
//	// 나타내는 인덱스 출력
//
//	printf("%d\n", index);
//
//
//	return 0;
//}
//
//- size_t : 정수 데이터 형식 중 하나
//- 주로 배열의 크기나 문자열의 길이, 인덱스를 나타내는데 사용
//- 부호없는 정수형
//- 시스템에 따라 크기가 다를 수 있지만 보통 포인터와 관련된 크기와 일치
//
//==============================================================================
//
//[#pragma warning(disable:4996)]
//
//- 프로그램에서 컴파일러 경고를 무시하도록 지시하는 프리프로세서 지시문
//- 4996 : 컴파일러가 발생시키는 특정 경고 메세지 번호
//
//- 이는 "안전하지 않은" 함수 호출에 대한 경고
//- 버퍼 오버런과 같은 보안 문제가 발생할 수 있고, 이에 대한 경고가 발생할 때
//- 즉 해당 경고를 무시 및 컴파일 진행할 수 있음을 뜻함.하지만 주의!!!
//- 잠재적인 문제 발생 가능성 0
//
//
//==============================================================================
//
//
//[문제]
//
//- 사용자로부터 문자열을 입력받아
//- 두 문자열이 같은지 비교하는 프로그램을 작성
//
//- <입력>
//-첫 번째 문자열 입력 : hello
//- 두 번째 문자열 입력 : Hello
//- <출력>
//-두 문자열은 다릅니다. or 같을시 두 문자열은 같습니다.
//
//
//
//1. 두 문자열을 담을 두개의 배열 선언
//#include <stdio.h>
//#include <string.h>
//int main(void) {
//
//	char str1[100];
//	char str2[200];
//
//
//	2. console에 띄울 문구 작성
//
//		printf("첫번째 문자열을 입력하세요 : ");
//
//	3. str1에 저장할 문자열을 입력받음
//
//		fgets(str1, sizeof(str1), stdin);
//
//	4. 개행문자를 제거하는 과정
//
//		str1[strcspn(str1, "\n")] = 0
//
//		5. Console에 띄울 문구 작성
//
//		printf("두번째 문자열을 입력하세요 : ");
//
//	6. str2에 저장할 문자열을 입력받음
//
//		fgets(str2, sizeof(str2), stdin);
//
//
//	7. 개행문자를 제거하는 과정
//
//		str2[strcspn(str2, "\n")] = 0;
//
//	8. if문을 통해서 str1과 str2를 비교 ==> 같으면 같습니다. or 다르면 다릅니다.출력
//
//		if (strcmp(str1, str2) == 0) {
//			printf("두 문자열은 같습니다.");
//		}
//		else {
//			printf("두 문자열은 다릅니다.");
//		}
//
//
//	return 0;
//}
//
//
//------------------------------------------------------------------------------------------------
//
//
//[함수 요약]
//
//
//변수명 = getchar();		사용자로부터 하나의 문자를 입력받고 변수에 저장
//
//
//putchar(str);		변수명에 저장된 값 출력
//
//
//fgets(str, 입력받은문자의크기, stdin)	fgets함수를 통해 문자열을 입력받음
//자동 줄바꿀(개행문자\n)을 가짐
//
//
//strlen(str)		문자열에서 nul문자 제외 나머지 문자열 길이 반환
//
//
//strcpy(str1, str2);	두번째 변수의 값을 복사해 첫번째 변수앞에 붙여넣기
//
//
//strncpy(str1, str2, count);					count숫자만큼 복사해 붙여넣음
//변수명[문자열이 끝나는 인덱스 번호] = '\0';		복사가 끝난 뒤, 변수 문자열을 종료하는
//												널 문자('\0')를 수동으로 추가
//
//
//strcat(str1, str2);		str1에 str2를 연결
//
//
//strcmp(str1, str2);		문자열 비교 str1 > str2보다 사전적으로 앞에 나오면 음수 반환
//str1 < str2보다 사전적으로 뒤에 나오면 양수 반환
//
//
//strstr(str, target);		문자열 검색
//
//
//strcspn(str1, str2); 		str1에서 str2에 있는 문자드 중 처음으로 나타내는 것을 찾아 인덱스 반환
//
//
//
