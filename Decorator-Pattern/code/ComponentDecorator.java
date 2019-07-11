package com.decorator;

/**
 *构件装饰器：抽象装饰器
 */
public class ComponentDecorator extends Component{

    private Component component;

    //注入抽象构件类型的对象
    public ComponentDecorator(Component component) {
        this.component = component;
    }

    @Override
    public void display() {
        component.display();
    }
}
