package com.kaisikk.java.kaisikmtscourse.inner;

import com.kaisikk.java.kaisikmtscourse.nested.StaticNestedClassTest;

public class NestedClass {


    String color;

    int doorCount;

    Engine engine;

    public NestedClass(String color, int doorCount) {
        this.color = color;
        this.doorCount = doorCount;
//        this.engine = this.new Engine(horsePower);
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "My StaticNestedClassTest{" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    public class Engine {
        int horsePower;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }

}

class Test {
    public static void main(String[] args) {

        NestedClass nestedClass = new NestedClass("black", 4);

        NestedClass.Engine engine = nestedClass.new Engine(150);

        nestedClass.setEngine(engine);

        System.out.println(engine);
        System.out.println(nestedClass);


    }
}



