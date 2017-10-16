package edu.luc.cs271.linkedstack;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class LinkedStack<E> implements IStack<E> {

  /** The topmost node of this stack. The stack gets pushed down from here. */
  private Node<E> top;

  private int size = 0;

  // TODO why don't we need an explicit constructor?

  @Override
  public E push(final E obj) {
    // TODO
    Node<E> temp = top;
    top = new Node(obj);
    // top.obj = obj;
    top.next = temp;
    size++;

    return obj;
  }

  @Override
  public E peek() {
    // TODO
    if (isEmpty()) {
      throw new NoSuchElementException();
    } else {
      return top.data;
    }
    // return null;
  }

  @Override
  public E pop() {
    // TODO
    if (isEmpty()) {
      throw new NoSuchElementException();
    } else {
      E result = top.data;
      top = top.next;
      size -= 1;
      return result;
    }

    // return null;
  }

  @Override
  public boolean isEmpty() {
    // TODO
    if (top != null) {
      return false;
    }
    return true;
  }

  @Override
  public List<E> asList() {
    // TODO implement using an ArrayList preallocated with the right size
    // TODO add any instance variable(s) required to support this
    final ArrayList<E> list = new ArrayList<>(size);
    Node<E> curr = top;
    while (curr != null) {
      list.add(curr.data);
      curr = curr.next;
    }
    return list;
  }
  // return null;

}
