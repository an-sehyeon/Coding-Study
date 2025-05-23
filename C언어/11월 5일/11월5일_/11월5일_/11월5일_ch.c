//
//[01 더블 포인터(Double Pointer]
//
//	- 포인터 변수를 가리키는 또 다른 포인터 변수이고 이중 포인터라고도 함.
//	- 포인터 변수 또한 메모리 공간에 대한 주소값을 가지는 변수이기 때문에 이를 가리키는게 가능
//
//
//
//
//	==============================================================================
//
//	[더블 포인터의 예제 01]
//
//
//#include <stdio.h>
//	int main() {
//
//	int value = 42;				// int 형 변수 value를 42로 초기화
//	int* ptr = &value;				// int 형 포인터 선언 및 초기화 (value의 메모리 주소값)
//	int** doubleptr = &ptr;			// int 형 더블 포인터 선언 및 초기화 (ptr의 메모리 주소값)
//
//	// 값에 접근
//	printf("Value (using single pointer) : %d\n", *ptr);
//	printf("Value (using single pointer) : %d\n", **doubleptr);
//
//	// doubleptr : doubleptrdl이 가리키는 ptr의 메모리 주소
//	// *doubleptr : doubleptr이 가리키는 ptr의 메모리 주소 안에 있는 그 값 ==> vlaue의 메모리 주소값 
//	// **doubleptr : doubleptr가 가리키는 ptr의 공간안에 있는 그 값이 가리키는 메모리 공간 내의 데이터의 값 => value의 값	
//
//
//	// 주소에 접근
//	printf("Address of value (using single pointer) : %p\n", (void*)ptr);
//	printf("Address of value (using single pointer) : %p\n", (void*)*doubleptr);
//
//
//	// 값 변경
//	**doubleptr = 100;
//
//
//	// 변경된 값 확인
//	printf("Modified value : %d\n", **doubleptr);
//	printf("Value (using single pointer) : %d\n", *ptr);
//	printf("%d", value);
//
//	return 0;
//}
//
//
//
//==============================================================================
//
//
//[더블 포인터 예제 02]
//
//
//#include <stdio.h>
//int main() {
//
//	int value = 42;
//	int* ptr = &value;
//	int** doubleptr = &ptr;
//	int* ptr2;
//
//	// 더블 포인터로 두번째 포인터 초기화
//	ptr2 = *doubleptr;
//
//	// 초기 상태 출력
//	printf("Initial vlaue : %d\n", value);
//	printf("Initial vlaue : %d\n", *ptr);
//	printf("Initial vlaue : %d\n", *ptr2);
//	printf("Initial vlaue : %d\n", **doubleptr);
//
//	printf("\n");
//
//	// 두번째 포인터를 통해 값 변경
//	*ptr2 = 100;
//
//	// 변경된 값 확인
//	printf("Modified vlaue : %d\n", value);
//	printf("Modified vlaue : %d\n", *ptr);
//	printf("Modified vlaue : %d\n", *ptr2);
//	printf("Modified vlaue : %d\n", **doubleptr);
//
//	return 0;
//}
//
//
//
//==============================================================================
//
//
//[더블 포인터 연산자와 배열 예제]
//
//- 주의 : 일반 배열은 int* 로 처리함.
//- arrp[i]와 * (*arr + i)는 다른 표기법으로 같은 메모리 위치를 가리킴
//- arr[i] : arr 배열에서 i번째 요소를 직접 참조
//- *(*arr + i) : arr의 포인터를 먼저 역참조(*arr)하고 그 포인터의 위치를 i만큼 증가, 그리고 역참조(*)하는 표기법
//
//
//- 역참조(Dereference)란 ?
//-포인터 변수를 통해 해당 포인터가 가리키는 메모리의 주소값을 읽거나 수정하는 과정
//- 다시 말해 포인터가 가리키고 있는 주소값이나 값을 읽는걸 역참조라 함.
//- 포인터에 주소값을 연결하는걸 참조, 그 반대는 역참조.
//
//
//
//==============================================================================
//
//
//[포인터의 특성]
//
//- 포인터는 다중 간접성(Multi - Level Indirection)을 허용하는데, 더블 포인터는 더 많은 간접성을 가짐.
//- 즉, 간접성을 가진다 == 간접적으로 접근할 수 있음 == 포인터의 개념
//- 더 많은 간접성을 가진다 == 더 많이 간접적으로 접근할 수 있음 == 더블포인터의 개념
//
//- 결과적으로 더블 포인터는 포인터에 대한 포인터로, 포인터의 간접성이 더 넓은 범위를 의미함.
//
//- 더블 포인터는 다음 상황들에서 사용됨.
//
//- 1. 이중 참조(다중 간접성)
//- 원본 데이터에 대한 포인터의 포인터, 데이터 간접적으로 참조하는데 사용
//
//
//
//==============================================================================
//
//
//[]
//
//
//
//
//
//==============================================================================
//
//
//[]
//
//
//
//
//


#include <stdio.h>
int main(void) {
	int A, B;
	scanf("%d %d", &A, &B);
	printf("%d", A + B);
	return 0;
}