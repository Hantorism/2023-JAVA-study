package Practice05_ArrayList3;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Stack<T> {
    // TODO : <T> 타입을 담는 ArrayList elements 선언
    private ArrayList<T> elements;

    public Stack() {
        this.elements = new ArrayList<>();
    }

    // TODO : push 메소드 구현 (T 타입 element를 받아서 ArrayList에 add)
    public void push(T element) {
        this.elements.add(element);
    }

    // TODO : pop 메소드 구현 (ArrayList의 마지막 element를 제거하고 리턴)
    public T pop() {
        if (this.elements.isEmpty()) {
            throw new NoSuchElementException("Stack is empty.");
        }
        // TODO : ArrayList의 마지막 element를 제거하고 리턴
        return this.elements.remove(this.elements.size() - 1);
    }

    // TODO : isEmpty 메소드 구현 (ArrayList가 비어있는지 확인)
    public boolean isEmpty() {
        return this.elements.isEmpty();
    }
}
