package org.exception.basic.unchecked;


/*
  RunTimeException을 상속받은 예외는 언체크 예외가 된다
 */
public class UnChecked extends RuntimeException {
    public UnChecked(String message) {
        super(message);
    }
}
