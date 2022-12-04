public class main {
    main() {

    }
    public static void main(String[] args) throws Exception {
        database obj = new database();
        try {
            obj.table();
        } catch (Exception e) {
            System.out.println("Error");
            obj.table();
        }
    }
}
