package org.extends1.access.child;

import org.extends1.access.parent.Parent;

public class Child extends Parent {

    public void call() {
        publicInt = 1;
        proInt = 1; //상속관계 or 같은 패키지
        //디폴트는 다른패키지 접근불가
        // 프라이빗 불가

        publicMethod();
        protectedMethod();

        printParent();
    }
}
