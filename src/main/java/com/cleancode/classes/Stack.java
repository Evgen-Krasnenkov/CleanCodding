package com.cleancode.classes;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Stack<T> {
    private int topOfStack = 0;
    List<T> elements = new LinkedList<T>();
    public int size() { return topOfStack;}
    public void push(T element) {
        topOfStack++;
        elements.add(element);
    }

    public T pop() throws PoppedWhenEmpty {
        if (topOfStack == 0)
        throw new PoppedWhenEmpty("Empty Stack");
        T element = elements.get(--topOfStack);
        elements.remove(topOfStack);
        return element;
    }
    public List<T> convertArrayToList(T[] array){
        return Arrays.stream(array).collect(Collectors.toList());
    }
    Function<T[], List<T>> converter = (t) -> Arrays.stream(t).collect(Collectors.toList());
}