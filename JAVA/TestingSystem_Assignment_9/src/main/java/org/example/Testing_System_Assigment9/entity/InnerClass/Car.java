package org.example.Testing_System_Assigment9.entity.InnerClass;

public class Car {
    private String name;
    private String type;
    private Engine engine;

    public Car(String name, String type, String engineType) {
        this.name = name;
        this.type = type;
        this.engine = new Engine(engineType);
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public Engine getEngine() {
        return engine;
    }

    //Tạo class engine
    public class Engine {
        private String engineType;

        public Engine(String engineType) {
            this.engineType = engineType;
        }

        public String getEngineType() {
            return engineType;
        }

        public void setEngineType(String engineType) {
            this.engineType = engineType;
        }
    }
}
