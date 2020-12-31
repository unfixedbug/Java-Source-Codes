public class SelfException {
    public static void main(String[] args) {
        int i, j;
        i = 8;
        j = 9;

        try {
            int k = i / j;

            if (k == 0) {
                throw new DhirajException("this is a message");
                // throw new DhirajException(); """we can also only throw the exception and can
                // add a mesage to the exception nby the above line"""
            }
            System.out.println(k);
        } catch (Exception e) {
            System.out.println("error");
            System.out.println(e.getMessage());
        }
    }
}

// linked with "DhirajException"