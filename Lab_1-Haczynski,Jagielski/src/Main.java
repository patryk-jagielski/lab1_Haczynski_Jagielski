class Lab1_Haczynski_Jagielski {
    public static void main(String[] args){

        System.out.println(System.getProperty("java.version"));
        System.out.println(System.getProperty("java.specification.version"));

        Dev1 dev1 = new Dev1();
        Dev2 dev2 = new Dev2();

        System.out.println("Student 1: " + dev1.author);
        System.out.println("Student 2: " + dev2.author);
    }
}

