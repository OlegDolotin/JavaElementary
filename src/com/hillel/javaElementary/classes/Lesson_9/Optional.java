package com.hillel.javaElementary.classes.Lesson_9;

import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;


public class Optional<T>{
    private T data;

    private Optional(T data) {
        this.data = data;
    }

    public boolean isPresent(){
        return data != null ? true : false;
    }

    public T get() throws NoSuchElementException {
        if (data != null){
            return data;
        }else {
            throw new NoSuchElementException();
        }
    }

    public static <T> Optional<T> empty(){
        return new Optional<>(null);
    }

    public static <T> Optional<T> of(T value) throws NullPointerException{
        if (value == null){
            throw new NullPointerException();
        }
        return new Optional<>(value);
    }

    public static <T> Optional<T> ofNullable(T value){
        if (value == null){
            return new Optional<>(value);
        }else {
            return empty();
        }
    }

    public T orElse(T other){
        if (isPresent()){
            return data;
        }else {
            return other;
        }
    }

    public void ifPresent​(Consumer<? super T> action) throws NullPointerException{
        if (action == null){
            throw  new NullPointerException();
        }
        if (isPresent()){
            action.accept(data);
        }
    }

    public T orElseGet​(Supplier<? extends T> supplier) throws NullPointerException{
        if (!(isPresent()) && supplier == null){

            throw new NullPointerException();

        }else if (isPresent()){
            return data;
        }else{
            return supplier.get();
        }
    }

    public T orElseThrow() throws NoSuchElementException{
        if (isPresent()){
            return data;
        }else {
            throw new NoSuchElementException();
        }
    }

    public Optional<T> filter​(Predicate<? super T> predicate) throws NullPointerException{
        if (predicate == null){
            throw new NullPointerException();
        }

        if (isPresent() && predicate.test(data)){
            return new Optional<>(data);
        }else {
            return empty();
        }
    }

    public <U> Optional<U> map​(Function<? super T, ? extends U> mapper) throws NullPointerException{
        if (mapper == null){
            throw new NullPointerException();
        }
        if (isPresent()){
            return ofNullable(mapper.apply(data));
        }else {
            return empty();
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this){
            return true;
        }

        if (!(obj instanceof Optional)){
            return false;
        }

        if (!isPresent() && !((Optional) obj).isPresent()){
            return true;
        }

        if (this.data.equals(((Optional) obj).data)){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        if (isPresent()){
            return Objects.hash(data);
        }else {
            return 0;
        }
    }
}
