package org.exception.basic.unchecked;


/*
 UnChecked 예외는
 예외를 잡거나 던지지않아도 된다
 예외를 잡지 않으면 자동으로 밖으로던진다
 */
public class Service {

    Client client = new Client();


    /*
    필요한 경우 예외를 잡아서 처리할수있다
     */
    public void callCatch() {
        try {
            client.call();
        } catch (UnChecked unChecked) {
            //예외처리로직
            System.out.println("예외처리  =" + unChecked.getMessage());
        }
        System.out.println("정상로직");
    }

    /*
    예외를 잡지 않아도된다 자연스럽게 상위로넘어감
    체크예외와 다르게 throws 예외선은을 하지않아도된다
     */
    public void callThrow() {
        client.call();
    }
}
