00 자료구조
자료구조란 ?
데이터를 효율적으로 저장하고 조작(검색)하기 위한 구조를 의미

자료구조 예시)
배열(Array), 구조체(Struct), 연결 리스트(Linked List), 스택(Stack), 큐(Queue), 트리(Tree), 해시 테이블(Hash Table) 등이 있음.

### '->' 연산자 ##
'->'는 구조체 포인터의 멤버에 접근하는 연산자
간편한 방식으로, 구조체 포인터를 사용하여 구조체의 멤버에 접근할 때 사용

사용예시 01)
#define MAX_SIZE 100
typedef struct {
    int arr[MAX_SIZE];
    int top;
} Stack;

Stack myStack;
Stack* stackPointer = &myStack;

// myStack.top에 접근하는 방법
int value1 = myStack.top;

// 또는
int value2 = stackPointer->top;

// stackPointer->top과 (*stackPointer).top은 동일하게 작동.


사용예시 02)
struct Point {
    int x;
    int y;
};

struct Point myPoint;
struct Point* pointerToMyPoint = &myPoint;

// 구조체 변수에 접근
myPoint.x = 10;
myPoint.y = 10;

// 구조체 포인터를 사용하여 멤버에 접근
pointerToMyPoint->x = 30;
pointerToMyPoint->y = 40;



01 배열(Array)
동일한 데이터 타입의 원소들이 메모리에 연속적으로 저장된 자료구조
각 원소는 인덱스를 사용하여 접근할 수 있음.

int numbers[5] = { 1, 2, 3, 4, 5 };

02 구조체(Struct)
서로 다른 데이터 타입의 여러 변수들을 묶어 하나의 자료구조로 만듦.
멤버 변수에는 각각 이름이 지정되어 있음.

struct Point {
    int x;
    int y;
};



03 연결 리스트(Linked List)
C 언어에서 매우 중요한 자료구조 중 하나임.

연결 리스트는 메모리에서 연속적으로 할당되지 않은 노드들이 포인터로 연결된 구조를 갖고 있음, 즉 노드들이 연결된 구성.

각 노드는 데이터(Data)와 다음 노드를 가리키는 포인터(Pointer)로 이루어져 있음.

연결 리스트는 동적으로 메모리를 할당하므로 크기를 동적으로 조절할 수 있음 == 동적 메모리 할당을 사용함.

// Data
Address---- > Data
Address---- > Data
Address----->Data
Address----->NULL
Head							Tail

## 노드의 구조체 ##

struct node {
    int data;          // 노드의 데이터
    struct node* next;  // 다음 노드를 가리키는 포인터
};


1. 노드 추가(Insertion)
리스트의 처음이나 중간에 새로운 노드를 추가할 수 있음.

리스트의 시작 부분에 노드 추가

void insertAtBeginning(struct Node** head, int newData) {

    // 첫 번째 매개변수인 struct Node** head는 리스트의 헤드 포인터를 나타냄.
  // 두 번째 매개변수인 int newData는 새로운 노드에 저장될 데이터임.


    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    // 새로운 노드를 동적으로 할당



    newNode->data = newData;
    // newNode의 data에는 입력된 newData를 저장




    newNode->next = *head;
    // next에는 현재 리스트의 헤드를 가리키는 포인터를 설정											
    // 현재 head가 가리키는 노드를 말함.




    *head = newNode;
    // 리스트의 헤드 포인터를 새로 추가된 노드로 업데이트						
    // head는 헤드 포인터의 주소값, *head는 헤드 포인터가 가리키는 값						
    // 즉 head가 가리키는 값이 newNode의 주소로 변경										
    // 이는 결과적으로 head가 새로 추가된 노드를 가리킴	
    // 고로 새로운 노드를 리스트의 맨 앞에 추가할 수 있음.
}


// 특정 노드 뒤에 새로운 노드 추가

void insertAfter(struct Node* prevNode, int newData) {
    // 첫 번째 매개변수인 struct Node* prevNode는 새로운 노드가 추가될 위치 이전의 노드를 가리킴.
  // 두 번째 매개변수인 int newData는 새로운 노드에 저장될 데이터임.

    if (prevNode == NULL) {						// 이전 노드 prevNode가 유효한지(NULL이 아닌지) 확인
        printf("Previous node cannot be NULL.");
        return;
    }

    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    // 새로운 노드를 동적으로 할당

    newNode->data = newData;
    // 새로운 노드의 data에는 입력된 newData를 저장

    newNode->next = prevNode->next;
    // 새로운 노드의 next에는 이전 노드가 가리키던 다음 노드를 가리키도록 설정

    prevNode->next = newNode;
    // 이전 노드 prevNode의 next를 새로 추가된 노드로 업데이트		
    // 이로써, 새로운 노드가 연결 리스트에 삽입됨.
}


사용예시)

struct Node* A = NULL;  // 빈 리스트 생성

insertAtBeginning(&head, 10);  // 리스트의 시작 부분에 10 추가
insertAtBeginning(&head, 20);  // 리스트의 시작 부분에 20 추가

// 현재 리스트 상태: 20 -> 10 -> NULL

struct Node* nodeToInsertAfter = head->next;  // 두 번째 노드를 선택
insertAfter(nodeToInsertAfter, 30);  // 선택한 노드 뒤에 30 추가

// 현재 리스트 상태: 20 -> 10 -> 30 -> NULL



+-- + +-- - ++-- - +
| 1 | -> | 2 | -> | 3 |
+-- + +-- - ++-- - +
^ ^
|         |
head   head->next


2. 노드 삭제(Deletion);
리스트에서 특정 노드를 삭제할 수 있음.


리스트의 시작 부분의 노드 삭제
void deleteAtBeginning(struct Node** head) {
    // 매개변수는 리스트의 헤드 포인터를 나타냄.


    if (*head == NULL) {
        printf("List is already empty.");
        return;
    }


    struct Node* temp = *head;
    // temp라는 임시 포인터를 사용하여 헤드가 가리키는 노드를 가리키도록 함.

    *head = (*head)->next;
    // 헤드를 다음 노드로 이동, 이로써 헤드가 현재 첫 번째 노드를 가리킴
    free(temp);
}


// 특정 노드 뒤의 노드 삭제
void deleteAfter(struct Node* prevNode) {
    // 매개변수는 삭제하려는 노드의 이전 노드를 나타냄.

    if (prevNode == NULL || prevNode->next == NULL) {
        printf("Cannot delete. Previous node is NULL or the node to delete is NULL.");
        return;
    }

    struct Node* temp = prevNode->next;
    // temp라는 임시 포인터를 사용하여 삭제하려는 노드를 가리키도록 함.

    prevNode->next = temp->next;
    // prevNode의 next를 temp->next로 설정하여 이전 노드가 삭제되는 노드를 건너뛰게 함.
    free(temp);
}



struct Node* head = NULL;

insertAtBeginning(&head, 10);  // 10 -> NULL
insertAtBeginning(&head, 20);  // 20 -> 10 -> NULL

// 현재 리스트 상태: 20 -> 10 -> NULL

deleteAtBeginning(&head);

// 현재 리스트 상태: 10 -> NULL

struct Node* nodeToDeleteAfter = head;  // 첫 번째 노드를 선택
deleteAfter(nodeToDeleteAfter);

// 현재 리스트 상태: 10 -> NULL


3. 전체 리스트 출력
void printList(struct Node* head) {
    struct Node* current = head;
    while (current != NULL) {
        printf("%d -> ", current->data);
        current = current->next;
    }
    printf("NULL\n");
}

4. 메모리 해제
리스트를 사용한 후에 메모리 해제해야 함.

void freeList(struct Node** head) {
    struct Node* current = *head;
    struct Node* next;
    while (current != NULL) {
        next = current->next;
        free(current);
        current = next;
    }
    *head = NULL;  // 리스트를 비웠으므로 헤드를 NULL로 설정
}




04 스택(Stack)
데이터를 나란히 쌓아놓은 자료구조
후입선출(LIFO, Last In First Out)의 원칙을 따름 == 최근에 삽입된 데이터가 가장 먼저 제거되는 구조
Ex) 프링글스 과자

#include <stdio.h>
#include <stdlib.h>

#define MAX_SIZE 100

typedef struct {
    int arr[MAX_SIZE];
    int top;
} Stack;

// 스택 초기화
void initializeStack(Stack* stack) {
    stack->top = -1;
}

// 스택이 비어있는지 확인
int isEmpty(Stack* stack) {
    return stack->top == -1;
}

// 스택이 가득 찼는지 확인
int isFull(Stack* stack) {
    return stack->top == MAX_SIZE - 1;              // 참이면 1, 거짓이면 0 반환
}

// 스택에 데이터 삽입 (Push)
void push(Stack* stack, int data) {
    if (isFull(stack)) {
        printf("Stack overflow! Cannot push %d\n", data);
        return;
    }
    stack->arr[++(stack->top)] = data;
}

// 스택에서 데이터 제거 (Pop)
int pop(Stack* stack) {
    if (isEmpty(stack)) {
        printf("Stack underflow! Cannot pop from an empty stack.\n");
        exit(EXIT_FAILURE);
    }
    return stack->arr[(stack->top)--];
}

// 스택의 맨 위 데이터 확인 (Top)
int peek(Stack* stack) {
    if (isEmpty(stack)) {
        printf("Stack is empty.\n");
        exit(EXIT_FAILURE);
    }
    return stack->arr[stack->top];
}

// 스택 출력
void printStack(Stack* stack) {
    if (isEmpty(stack)) {
        printf("Stack is empty.\n");
        return;
    }
    printf("Stack: ");
    for (int i = 0; i <= stack->top; ++i) {
        printf("%d ", stack->arr[i]);
    }
    printf("\n");
}

int main() {
    Stack myStack;
    initializeStack(&myStack);

    push(&myStack, 10);
    push(&myStack, 20);
    push(&myStack, 30);

    printStack(&myStack);  // 출력: Stack: 10 20 30

    printf("Top element: %d\n", peek(&myStack));  // 출력: Top element: 30

    pop(&myStack);

    printStack(&myStack);  // 출력: Stack: 10 20

    return 0;
}



05 큐(Queue)
데이터를 저장하는 자료구조 중 하나
먼저 입력된 데이터가 먼저 출력되는 선입선출(FIFO, First In First Out)의 원칙을 따름.
주로 데이터의 순서를 유지하면서 새로운 데이터를 추가하거나 기존 데이터를 제거할 때 사용

큐의 구현 방법 : 배열을 사용하거나 연결 리스트를 이용하여 동적으로 큐를 구현 O
큐의 크기가 제한되어 있기 때문에, 실제로는 동적으로 메모리를 할당하여 큐를 구현하는 것이 더 일반적임.

원형 큐 예제)

#include <stdio.h>
#include <stdlib.h>

#define MAX_SIZE 100

typedef struct {
    int arr[MAX_SIZE];
    int front, rear;
} Queue;

// 큐 초기화
void initializeQueue(Queue* queue) {
    queue->front = -1;
    queue->rear = -1;
}

// 큐가 비어있는지 확인
int isEmpty(Queue* queue) {
    return queue->front == -1;
}

// 큐가 가득 찼는지 확인
int isFull(Queue* queue) {
    return (queue->rear + 1) % MAX_SIZE == queue->front;
}

// isFull() 이해 예제)
// MAX_SIZE가 5일 때, 큐를 채운 상태
// front = 0, rear = 4
// (queue->rear + 1) % MAX_SIZE = (4 + 1) % 5 = 0


// 큐에 데이터 추가 (Enqueue)
void enqueue(Queue* queue, int data) {
    if (isFull(queue)) {
        printf("Queue overflow! Cannot enqueue %d\n", data);
        return;
    }
    if (isEmpty(queue)) {
        queue->front = 0;  // 큐가 비어있다면 front를 0으로 초기화
    }
    queue->rear = (queue->rear + 1) % MAX_SIZE;
    queue->arr[queue->rear] = data;
}

// 큐에서 데이터 제거 (Dequeue)
int dequeue(Queue* queue) {
    if (isEmpty(queue)) {
        printf("Queue underflow! Cannot dequeue from an empty queue.\n");
        exit(EXIT_FAILURE);
    }
    int data = queue->arr[queue->front];
    if (queue->front == queue->rear) {
        // 큐에 하나의 요소만 남아있다면 큐를 비운다.
        initializeQueue(queue);
    }
    else {
        queue->front = (queue->front + 1) % MAX_SIZE;
    }
    return data;
}

// 큐의 맨 앞 데이터 확인 (Front)
int front(Queue* queue) {
    if (isEmpty(queue)) {
        printf("Queue is empty.\n");
        exit(EXIT_FAILURE);
    }
    return queue->arr[queue->front];
}

// 큐 출력
void printQueue(Queue* queue) {
    if (isEmpty(queue)) {
        printf("Queue is empty.\n");
        return;
    }
    printf("Queue: ");
    int i = queue->front;
    do {
        printf("%d ", queue->arr[i]);
        i = (i + 1) % MAX_SIZE;
    } while (i != (queue->rear + 1) % MAX_SIZE);
    printf("\n");
}

int main() {
    Queue myQueue;
    initializeQueue(&myQueue);

    enqueue(&myQueue, 10);
    enqueue(&myQueue, 20);
    enqueue(&myQueue, 30);

    printQueue(&myQueue);  // 출력: Queue: 10 20 30

    printf("Front element: %d\n", front(&myQueue));  // 출력: Front element: 10

    dequeue(&myQueue);

    printQueue(&myQueue);  // 출력: Queue: 20 30

    return 0;
}


06 트리(Tree)
계층적인 자료구조 == 노드(Node)들이 간선(Edge)으로 연결되어 있는 구조
트리는 그래프의 한 종류, 사이클이 없고 연결된 부분 그래프(Connected Acyclic Graph)
계층 구조를 나타내거나 검색 알고리즘 등에 활용.

## 트리의 주요 구성 요소 ##

1. 노드(Node) : 트리의 기본 요소로, 데이터를 저장하고 다른 노드들과 연결되어 있음.
각 노드는 부모 노드와 자식 노드로 나뉩니다.

2. 간선(Edge) : 노드를 연결하는 선으로, 부모 노드와 자식 노드를 연결함.
간선의 개수는 노드의 개수보다 하나 작습니다.

3. 루트 노드(Root Node) : 트리의 최상위 노드로, 다른 모든 노드는 이 루트 노드에서 어떠한 경로를 통해 접근할 수 있음.

4. 부모 노드(Parent Node) : 어떤 노드의 바로 위에 연결된 노드를 말함.

5. 자식 노드(Child Node) : 어떤 노드의 바로 아래에 연결된 노드를 말함.

6. 리프 노드(Leaf Node) : 자식이 없는 노드로, 즉, 더 이상 아래로 연결된 노드가 없는 노드를 말함.


## 트리의 종류 ##

1. 이진 트리(Binary Tree) : 각 노드가 최대 두 개의 자식을 가지는 트리
이진 트리는 좌우로 두 개의 서브 트리를 가질 수 있음.

2. 이진 탐색 트리(Binary Search Tree) : 이진 트리의 한 종류로, 왼쪽 서브 트리에는 루트 노드보다 작은 값의 노드들이,
오른쪽 서브 트리에는 루트 노드보다 큰 값의 노드들이 위치하도록 정의된 트리

3. 힙 트리(Heap Tree) : 이진 트리의 한 종류로, 최댓값이나 최솟값을 빠르게 찾기 위해 사용됨.
최대 힙은 각 노드의 값이 그 자식 노드의 값보다 크거나 같고, 최소 힙은 각 노드의 값이 그 자식 노드의 값보다 작거나 같은 특성을 가지고 있음.
우선순위 큐(Priority Queue)를 구현하는데 있어 핵심적인 개념
우선순위 큐는 큐와 동일하게 가장 앞에 있는 것을 빼올 수 있는 자료구조 == 우선순위가 가장 높은(오름차순의 경우 가장 작은 수)를 먼저 빼오는 것


4. AVL 트리 : 균형 잡힌 이진 탐색 트리로, 각 노드의 높이 차이가 1 이하인 트리. ==> 탐색 시간을 보장하기 위해 사용됨.