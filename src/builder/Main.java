package builder;


public class Main {

    public static void main(String[] args) {

        final Data data = new Data().newBuilder()
                              .name("Vadim")
                              .surname("Lipakov")
                              .age(19)
                              .build();

        System.out.println(data.getName());

    }

}
