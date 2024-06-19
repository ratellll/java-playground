package org.exception.basic.unchecked;

public class Client {

    public void call() {
        throw new UnChecked("ex");
    }
}
