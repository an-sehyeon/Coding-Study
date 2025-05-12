00 �ڷᱸ��
�ڷᱸ���� ?
�����͸� ȿ�������� �����ϰ� ����(�˻�)�ϱ� ���� ������ �ǹ�

�ڷᱸ�� ����)
�迭(Array), ����ü(Struct), ���� ����Ʈ(Linked List), ����(Stack), ť(Queue), Ʈ��(Tree), �ؽ� ���̺�(Hash Table) ���� ����.

### '->' ������ ##
'->'�� ����ü �������� ����� �����ϴ� ������
������ �������, ����ü �����͸� ����Ͽ� ����ü�� ����� ������ �� ���

��뿹�� 01)
#define MAX_SIZE 100
typedef struct {
    int arr[MAX_SIZE];
    int top;
} Stack;

Stack myStack;
Stack* stackPointer = &myStack;

// myStack.top�� �����ϴ� ���
int value1 = myStack.top;

// �Ǵ�
int value2 = stackPointer->top;

// stackPointer->top�� (*stackPointer).top�� �����ϰ� �۵�.


��뿹�� 02)
struct Point {
    int x;
    int y;
};

struct Point myPoint;
struct Point* pointerToMyPoint = &myPoint;

// ����ü ������ ����
myPoint.x = 10;
myPoint.y = 10;

// ����ü �����͸� ����Ͽ� ����� ����
pointerToMyPoint->x = 30;
pointerToMyPoint->y = 40;



01 �迭(Array)
������ ������ Ÿ���� ���ҵ��� �޸𸮿� ���������� ����� �ڷᱸ��
�� ���Ҵ� �ε����� ����Ͽ� ������ �� ����.

int numbers[5] = { 1, 2, 3, 4, 5 };

02 ����ü(Struct)
���� �ٸ� ������ Ÿ���� ���� �������� ���� �ϳ��� �ڷᱸ���� ����.
��� �������� ���� �̸��� �����Ǿ� ����.

struct Point {
    int x;
    int y;
};



03 ���� ����Ʈ(Linked List)
C ���� �ſ� �߿��� �ڷᱸ�� �� �ϳ���.

���� ����Ʈ�� �޸𸮿��� ���������� �Ҵ���� ���� ������ �����ͷ� ����� ������ ���� ����, �� ������ ����� ����.

�� ���� ������(Data)�� ���� ��带 ����Ű�� ������(Pointer)�� �̷���� ����.

���� ����Ʈ�� �������� �޸𸮸� �Ҵ��ϹǷ� ũ�⸦ �������� ������ �� ���� == ���� �޸� �Ҵ��� �����.

// Data
Address---- > Data
Address---- > Data
Address----->Data
Address----->NULL
Head							Tail

## ����� ����ü ##

struct node {
    int data;          // ����� ������
    struct node* next;  // ���� ��带 ����Ű�� ������
};


1. ��� �߰�(Insertion)
����Ʈ�� ó���̳� �߰��� ���ο� ��带 �߰��� �� ����.

����Ʈ�� ���� �κп� ��� �߰�

void insertAtBeginning(struct Node** head, int newData) {

    // ù ��° �Ű������� struct Node** head�� ����Ʈ�� ��� �����͸� ��Ÿ��.
  // �� ��° �Ű������� int newData�� ���ο� ��忡 ����� ��������.


    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    // ���ο� ��带 �������� �Ҵ�



    newNode->data = newData;
    // newNode�� data���� �Էµ� newData�� ����




    newNode->next = *head;
    // next���� ���� ����Ʈ�� ��带 ����Ű�� �����͸� ����											
    // ���� head�� ����Ű�� ��带 ����.




    *head = newNode;
    // ����Ʈ�� ��� �����͸� ���� �߰��� ���� ������Ʈ						
    // head�� ��� �������� �ּҰ�, *head�� ��� �����Ͱ� ����Ű�� ��						
    // �� head�� ����Ű�� ���� newNode�� �ּҷ� ����										
    // �̴� ��������� head�� ���� �߰��� ��带 ����Ŵ	
    // ��� ���ο� ��带 ����Ʈ�� �� �տ� �߰��� �� ����.
}


// Ư�� ��� �ڿ� ���ο� ��� �߰�

void insertAfter(struct Node* prevNode, int newData) {
    // ù ��° �Ű������� struct Node* prevNode�� ���ο� ��尡 �߰��� ��ġ ������ ��带 ����Ŵ.
  // �� ��° �Ű������� int newData�� ���ο� ��忡 ����� ��������.

    if (prevNode == NULL) {						// ���� ��� prevNode�� ��ȿ����(NULL�� �ƴ���) Ȯ��
        printf("Previous node cannot be NULL.");
        return;
    }

    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    // ���ο� ��带 �������� �Ҵ�

    newNode->data = newData;
    // ���ο� ����� data���� �Էµ� newData�� ����

    newNode->next = prevNode->next;
    // ���ο� ����� next���� ���� ��尡 ����Ű�� ���� ��带 ����Ű���� ����

    prevNode->next = newNode;
    // ���� ��� prevNode�� next�� ���� �߰��� ���� ������Ʈ		
    // �̷ν�, ���ο� ��尡 ���� ����Ʈ�� ���Ե�.
}


��뿹��)

struct Node* A = NULL;  // �� ����Ʈ ����

insertAtBeginning(&head, 10);  // ����Ʈ�� ���� �κп� 10 �߰�
insertAtBeginning(&head, 20);  // ����Ʈ�� ���� �κп� 20 �߰�

// ���� ����Ʈ ����: 20 -> 10 -> NULL

struct Node* nodeToInsertAfter = head->next;  // �� ��° ��带 ����
insertAfter(nodeToInsertAfter, 30);  // ������ ��� �ڿ� 30 �߰�

// ���� ����Ʈ ����: 20 -> 10 -> 30 -> NULL



+-- + +-- - ++-- - +
| 1 | -> | 2 | -> | 3 |
+-- + +-- - ++-- - +
^ ^
|         |
head   head->next


2. ��� ����(Deletion);
����Ʈ���� Ư�� ��带 ������ �� ����.


����Ʈ�� ���� �κ��� ��� ����
void deleteAtBeginning(struct Node** head) {
    // �Ű������� ����Ʈ�� ��� �����͸� ��Ÿ��.


    if (*head == NULL) {
        printf("List is already empty.");
        return;
    }


    struct Node* temp = *head;
    // temp��� �ӽ� �����͸� ����Ͽ� ��尡 ����Ű�� ��带 ����Ű���� ��.

    *head = (*head)->next;
    // ��带 ���� ���� �̵�, �̷ν� ��尡 ���� ù ��° ��带 ����Ŵ
    free(temp);
}


// Ư�� ��� ���� ��� ����
void deleteAfter(struct Node* prevNode) {
    // �Ű������� �����Ϸ��� ����� ���� ��带 ��Ÿ��.

    if (prevNode == NULL || prevNode->next == NULL) {
        printf("Cannot delete. Previous node is NULL or the node to delete is NULL.");
        return;
    }

    struct Node* temp = prevNode->next;
    // temp��� �ӽ� �����͸� ����Ͽ� �����Ϸ��� ��带 ����Ű���� ��.

    prevNode->next = temp->next;
    // prevNode�� next�� temp->next�� �����Ͽ� ���� ��尡 �����Ǵ� ��带 �ǳʶٰ� ��.
    free(temp);
}



struct Node* head = NULL;

insertAtBeginning(&head, 10);  // 10 -> NULL
insertAtBeginning(&head, 20);  // 20 -> 10 -> NULL

// ���� ����Ʈ ����: 20 -> 10 -> NULL

deleteAtBeginning(&head);

// ���� ����Ʈ ����: 10 -> NULL

struct Node* nodeToDeleteAfter = head;  // ù ��° ��带 ����
deleteAfter(nodeToDeleteAfter);

// ���� ����Ʈ ����: 10 -> NULL


3. ��ü ����Ʈ ���
void printList(struct Node* head) {
    struct Node* current = head;
    while (current != NULL) {
        printf("%d -> ", current->data);
        current = current->next;
    }
    printf("NULL\n");
}

4. �޸� ����
����Ʈ�� ����� �Ŀ� �޸� �����ؾ� ��.

void freeList(struct Node** head) {
    struct Node* current = *head;
    struct Node* next;
    while (current != NULL) {
        next = current->next;
        free(current);
        current = next;
    }
    *head = NULL;  // ����Ʈ�� ������Ƿ� ��带 NULL�� ����
}




04 ����(Stack)
�����͸� ������ �׾Ƴ��� �ڷᱸ��
���Լ���(LIFO, Last In First Out)�� ��Ģ�� ���� == �ֱٿ� ���Ե� �����Ͱ� ���� ���� ���ŵǴ� ����
Ex) �����۽� ����

#include <stdio.h>
#include <stdlib.h>

#define MAX_SIZE 100

typedef struct {
    int arr[MAX_SIZE];
    int top;
} Stack;

// ���� �ʱ�ȭ
void initializeStack(Stack* stack) {
    stack->top = -1;
}

// ������ ����ִ��� Ȯ��
int isEmpty(Stack* stack) {
    return stack->top == -1;
}

// ������ ���� á���� Ȯ��
int isFull(Stack* stack) {
    return stack->top == MAX_SIZE - 1;              // ���̸� 1, �����̸� 0 ��ȯ
}

// ���ÿ� ������ ���� (Push)
void push(Stack* stack, int data) {
    if (isFull(stack)) {
        printf("Stack overflow! Cannot push %d\n", data);
        return;
    }
    stack->arr[++(stack->top)] = data;
}

// ���ÿ��� ������ ���� (Pop)
int pop(Stack* stack) {
    if (isEmpty(stack)) {
        printf("Stack underflow! Cannot pop from an empty stack.\n");
        exit(EXIT_FAILURE);
    }
    return stack->arr[(stack->top)--];
}

// ������ �� �� ������ Ȯ�� (Top)
int peek(Stack* stack) {
    if (isEmpty(stack)) {
        printf("Stack is empty.\n");
        exit(EXIT_FAILURE);
    }
    return stack->arr[stack->top];
}

// ���� ���
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

    printStack(&myStack);  // ���: Stack: 10 20 30

    printf("Top element: %d\n", peek(&myStack));  // ���: Top element: 30

    pop(&myStack);

    printStack(&myStack);  // ���: Stack: 10 20

    return 0;
}



05 ť(Queue)
�����͸� �����ϴ� �ڷᱸ�� �� �ϳ�
���� �Էµ� �����Ͱ� ���� ��µǴ� ���Լ���(FIFO, First In First Out)�� ��Ģ�� ����.
�ַ� �������� ������ �����ϸ鼭 ���ο� �����͸� �߰��ϰų� ���� �����͸� ������ �� ���

ť�� ���� ��� : �迭�� ����ϰų� ���� ����Ʈ�� �̿��Ͽ� �������� ť�� ���� O
ť�� ũ�Ⱑ ���ѵǾ� �ֱ� ������, �����δ� �������� �޸𸮸� �Ҵ��Ͽ� ť�� �����ϴ� ���� �� �Ϲ�����.

���� ť ����)

#include <stdio.h>
#include <stdlib.h>

#define MAX_SIZE 100

typedef struct {
    int arr[MAX_SIZE];
    int front, rear;
} Queue;

// ť �ʱ�ȭ
void initializeQueue(Queue* queue) {
    queue->front = -1;
    queue->rear = -1;
}

// ť�� ����ִ��� Ȯ��
int isEmpty(Queue* queue) {
    return queue->front == -1;
}

// ť�� ���� á���� Ȯ��
int isFull(Queue* queue) {
    return (queue->rear + 1) % MAX_SIZE == queue->front;
}

// isFull() ���� ����)
// MAX_SIZE�� 5�� ��, ť�� ä�� ����
// front = 0, rear = 4
// (queue->rear + 1) % MAX_SIZE = (4 + 1) % 5 = 0


// ť�� ������ �߰� (Enqueue)
void enqueue(Queue* queue, int data) {
    if (isFull(queue)) {
        printf("Queue overflow! Cannot enqueue %d\n", data);
        return;
    }
    if (isEmpty(queue)) {
        queue->front = 0;  // ť�� ����ִٸ� front�� 0���� �ʱ�ȭ
    }
    queue->rear = (queue->rear + 1) % MAX_SIZE;
    queue->arr[queue->rear] = data;
}

// ť���� ������ ���� (Dequeue)
int dequeue(Queue* queue) {
    if (isEmpty(queue)) {
        printf("Queue underflow! Cannot dequeue from an empty queue.\n");
        exit(EXIT_FAILURE);
    }
    int data = queue->arr[queue->front];
    if (queue->front == queue->rear) {
        // ť�� �ϳ��� ��Ҹ� �����ִٸ� ť�� ����.
        initializeQueue(queue);
    }
    else {
        queue->front = (queue->front + 1) % MAX_SIZE;
    }
    return data;
}

// ť�� �� �� ������ Ȯ�� (Front)
int front(Queue* queue) {
    if (isEmpty(queue)) {
        printf("Queue is empty.\n");
        exit(EXIT_FAILURE);
    }
    return queue->arr[queue->front];
}

// ť ���
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

    printQueue(&myQueue);  // ���: Queue: 10 20 30

    printf("Front element: %d\n", front(&myQueue));  // ���: Front element: 10

    dequeue(&myQueue);

    printQueue(&myQueue);  // ���: Queue: 20 30

    return 0;
}


06 Ʈ��(Tree)
�������� �ڷᱸ�� == ���(Node)���� ����(Edge)���� ����Ǿ� �ִ� ����
Ʈ���� �׷����� �� ����, ����Ŭ�� ���� ����� �κ� �׷���(Connected Acyclic Graph)
���� ������ ��Ÿ���ų� �˻� �˰��� � Ȱ��.

## Ʈ���� �ֿ� ���� ��� ##

1. ���(Node) : Ʈ���� �⺻ ��ҷ�, �����͸� �����ϰ� �ٸ� ����� ����Ǿ� ����.
�� ���� �θ� ���� �ڽ� ���� �����ϴ�.

2. ����(Edge) : ��带 �����ϴ� ������, �θ� ���� �ڽ� ��带 ������.
������ ������ ����� �������� �ϳ� �۽��ϴ�.

3. ��Ʈ ���(Root Node) : Ʈ���� �ֻ��� ����, �ٸ� ��� ���� �� ��Ʈ ��忡�� ��� ��θ� ���� ������ �� ����.

4. �θ� ���(Parent Node) : � ����� �ٷ� ���� ����� ��带 ����.

5. �ڽ� ���(Child Node) : � ����� �ٷ� �Ʒ��� ����� ��带 ����.

6. ���� ���(Leaf Node) : �ڽ��� ���� ����, ��, �� �̻� �Ʒ��� ����� ��尡 ���� ��带 ����.


## Ʈ���� ���� ##

1. ���� Ʈ��(Binary Tree) : �� ��尡 �ִ� �� ���� �ڽ��� ������ Ʈ��
���� Ʈ���� �¿�� �� ���� ���� Ʈ���� ���� �� ����.

2. ���� Ž�� Ʈ��(Binary Search Tree) : ���� Ʈ���� �� ������, ���� ���� Ʈ������ ��Ʈ ��庸�� ���� ���� ������,
������ ���� Ʈ������ ��Ʈ ��庸�� ū ���� ������ ��ġ�ϵ��� ���ǵ� Ʈ��

3. �� Ʈ��(Heap Tree) : ���� Ʈ���� �� ������, �ִ��̳� �ּڰ��� ������ ã�� ���� ����.
�ִ� ���� �� ����� ���� �� �ڽ� ����� ������ ũ�ų� ����, �ּ� ���� �� ����� ���� �� �ڽ� ����� ������ �۰ų� ���� Ư���� ������ ����.
�켱���� ť(Priority Queue)�� �����ϴµ� �־� �ٽ����� ����
�켱���� ť�� ť�� �����ϰ� ���� �տ� �ִ� ���� ���� �� �ִ� �ڷᱸ�� == �켱������ ���� ����(���������� ��� ���� ���� ��)�� ���� ������ ��


4. AVL Ʈ�� : ���� ���� ���� Ž�� Ʈ����, �� ����� ���� ���̰� 1 ������ Ʈ��. ==> Ž�� �ð��� �����ϱ� ���� ����.