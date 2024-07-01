package com.kaisikk.java.kaisikmtscourse.nested;

public class StaticNestedClassTest {


    String color;

    int doorCount;

    Engine engine;

    public StaticNestedClassTest(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
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

    public static class Engine {
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
        StaticNestedClassTest.Engine e = new StaticNestedClassTest.Engine(256);
        System.out.println(e);

        StaticNestedClassTest test = new StaticNestedClassTest("red", 2, e);

        System.out.println(test);
    }
}
