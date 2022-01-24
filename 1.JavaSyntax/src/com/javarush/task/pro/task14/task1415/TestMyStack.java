package com.javarush.task.pro.task14.task1415;

public class TestMyStack {

  public static void main(String[] args) {
    MyStack myStack = new MyStack();


    myStack.push("Mutny");
    System.out.println(myStack.pop());
    myStack.push("Hello All");
    myStack.push("Hellolka");
    System.out.println(myStack.peek());
    System.out.println(myStack.empty());
    System.out.println(myStack.search("Hellolka"));
    System.out.println(myStack.search("Hello All"));
    System.out.println(myStack.search("Hel"));

  }

}
