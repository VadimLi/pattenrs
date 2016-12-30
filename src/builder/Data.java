package builder;

public class Data {

    private String name;

    private String surname;

    private int age;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public DataBuilder newBuilder() {
        return new DataBuilder();
    }

    public class DataBuilder {

        public DataBuilder name(final String name) {
            Data.this.name = name;
            return this;
        }

        public DataBuilder surname(final String surname) {
            Data.this.surname = surname;
            return this;
        }

        public DataBuilder age(final int age) {
            Data.this.age = age;
            return this;
        }

        public Data build() {
            return Data.this;
        }

    }


}
