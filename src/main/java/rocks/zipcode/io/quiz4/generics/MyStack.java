package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * @author leon on 11/12/2018.
 */
public class MyStack<SomeType> implements Iterable<SomeType>{

    List<SomeType> deck;

    public MyStack(){
        deck = new ArrayList<>();
    }

    public Boolean isEmpty() {
        return deck.isEmpty();

    }

    public void push(SomeType i) {
        deck.add(i);
    }

    public SomeType peek(){
       if(isEmpty()){
           return null;
       }
       return peek();
    }

    public SomeType pop() {
        return null;
    }

    @Override
    public Iterator<SomeType> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super SomeType> action) {

    }

    @Override
    public Spliterator<SomeType> spliterator() {
        return null;
    }
}
