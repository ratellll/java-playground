package org.extends1.access.child;

import org.extends1.access.parent.Parent;

public class Child extends Parent {

    public void call() {
        publicValue =1;
        protectedValue = 1; // 상속관계 or 같은 패키지에서 호출가능
        //defalutValue = 1; //다른 패키지에서 접근불가

        publicMethod();
        protectedMethod();

        printParent();

    }
}
