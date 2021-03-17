# Sort Algorithm 

0. 정렬알고리즘이란 무엇인가


    1. 정렬방식에 따른 알고리즘
    2. 실행방법 및 정렬장소에 따라 분류할 수 있음
        - 비교식과 분산식 , 내부정렬과 외부정렬




1. 종류 


    1. Selection Sort
    2. Bubble Sort 
    3. Quick Sort
    4. Insertion Sort
    5. Shell Sort
    6. Merge Sort
    7. Heap Sort
    8. Radix Sort
    9. Tree Sort
        ...


2. 분류


    1. 실행방법에 따른 분류
    2. 정렬장소에 따른 분류
    

3. 시간복잡도(성능)
    - 일반적으로는 Quick Sort가 제일 빠르다고 알려져 있다. 
    

    1. O(N<sup>2</sup>) : Bubble Sort, Selection Sort, Insertion Sort, Shell Sort, Quick Sort
    2. O(N log N) : Heap Sort, Merge Sort, Tree Sort, Quick Sort
    3. O(KN) : Radix Sort
        * Quick Sort의 경우 최악의 경우에 O(N<sup>2</sup>)의 시간복잡도를 갖는다. 



4. 정리 
    1. Selection Sort : 처음부터 쭉 훑어서 제일 작은 숫자를 앞으로 보내는 정렬 방식을 선택하고 있다. <br/>
    이 방식은 Bubble Sort 방식보다 더욱 속도가 빠르며, Min-Selection Sort (오름차순), Max-Selection Sort (내림차순) 방식이 있다. 
    2. Bubble Sort : 1,2를 비교 한 후, 2,3을 비교, 3,4를 비교.. 이런식으로 마지막까지 갔다가 다시 처음으로 돌아가서 n-2번째와 n-1번째까지 <br/>
    끝까지 돌아가는 정렬 방식으로 만들기가 쉽고 직관적일 뿐, 알고리즘적 관점에서는 사용하면 안되는 방식이다. 
    3. Quick Sort :  이름에서 느껴지는 빠름빠름 빠름의 정렬방식으로, 적절한 기준점을 잡을 경우 매우 빠르게 정렬이 된다.<br/>
    하지만 잘못된 기준점을 잡을 경우 최악의 시간복잡도를 갖게 되는데, 그 때는 피벗값은 '최소값' 혹은 '최대값'으로 정했을 때 이다. 
    4. Insertion Sort : 이미 어느정도 정렬되어 있는 상태에서는 사용하기 좋지만, 그게 아닐때는 주어진 값에 따라 최악이 되기도 할 수 있는 방식으로, <br/>
    사람이 무의식적으로 사용하는 대표적인 알고리즘이다. 배열의 크기가 작을 경우에 상당히 효율적이다. 
    5. Shell Sort : Insertion Sort의 특성을 반영한 정렬방식으로, 실제 성능은 힙 정렬에 버금갈 정도로 빠른 알고리즘. 